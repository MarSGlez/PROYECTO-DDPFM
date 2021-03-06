package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	
	@Autowired
	private SalesDAO dao;
	@Autowired
	private DomicilioDAO Domdao;
	@Autowired
	private organizacionDAO Orgdao;
	@Autowired
	private personaDAO perdao;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Sale> listSale = dao.list();
		List<Domicilio> listDomicilio = Domdao.listDom();
		model.addAttribute("listSale", listSale);
		model.addAttribute("listDomicilio", listDomicilio);
		
	    return "index";
	}
	
	@RequestMapping("/domicilio")
	public String viewDomicilioPage(Model model) {
		List<Domicilio> listDomicilio = Domdao.listDom();
		model.addAttribute("listDomicilio", listDomicilio);
		
	    return "domicilio";
	}
	
	@RequestMapping("/new")
	public String showNewForm(Model model) {
	    List<organizacion> listOrganizacion = Orgdao.listOrg();
	    List<persona> listPersona = perdao.listPer();
	    //List<Domicilio> listDomicilio = Domdao.listDom();
		model.addAttribute("listOrganizacion", listOrganizacion);
		model.addAttribute("listPersona", listPersona);
	     
	    return "new_form";
	}
	
	@RequestMapping("/search")
	public String showSearch(Model model) {
	    Sale sale = new Sale();
	    model.addAttribute("sale", sale);
	     
	    return "search";
	}
	
	@RequestMapping(value = "/buqueda", method = RequestMethod.POST)
	public String buqueda(@ModelAttribute("txtbusca") String query) {
	    dao.search(query);
	     
	    return "search";
	}
	

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("sale") Sale sale) {
		System.out.println(sale.getTIPO_DE_PERSONA());
		if(sale.getTIPO_DE_PERSONA().equals("Moral")) {
			 dao.save(sale);
			 return "redirect:/";
			  
		}else {
			 dao.savePF(sale);
			 return "redirect:/";
		}
	     
	    
	}
	
	@RequestMapping("/edit/{ID}")
	public ModelAndView showEditForm(@PathVariable(name = "ID") int id) {
	    ModelAndView mav = new ModelAndView("edit_form");
	    Sale sale = dao.get(id);
	    mav.addObject("sale", sale);
	     
	    return mav;
	}
	
	@RequestMapping("/new-moral/{ID}/{NOMBRE}")
	public ModelAndView showNewMForm(@PathVariable(name = "ID") int id, @PathVariable(name = "NOMBRE") String name) {
	    ModelAndView mav = new ModelAndView("new_registro");
	    Sale sale = new Sale();
	    mav.addObject("sale", sale);
	    List<Domicilio> listDomicilio = Domdao.listDom();
		mav.addObject("listDomicilio", listDomicilio);
	    mav.addObject("id", id);
	    mav.addObject("nombre", name);
	     
	    return mav;
	}
	
	@RequestMapping("/details/{ID}")
	public ModelAndView showDetailsForm(@PathVariable(name = "ID") int id) {
	    ModelAndView mav = new ModelAndView("details");
	    Sale sale = dao.getDetail(id);
	    mav.addObject("sale", sale);
	     
	    return mav;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@ModelAttribute("sale") Sale sale) {
	    dao.update(sale);
	     
	    return "redirect:/";
	}
	
	@RequestMapping("/delete/{ID}")
	public String delete(@PathVariable(name = "ID") int id) {
	    dao.delete(id);
	    return "redirect:/";       
	}	
}

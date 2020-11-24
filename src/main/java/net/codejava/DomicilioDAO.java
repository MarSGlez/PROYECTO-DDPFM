package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class DomicilioDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Domicilio> listDom() {
		String sql = "SELECT * FROM DOMICILIO";

		List<Domicilio> listDomicilio = jdbcTemplate.query(sql, 
				BeanPropertyRowMapper.newInstance(Domicilio.class));

		return listDomicilio;
	}
	
	public void save(Domicilio domicilio) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("DDPFM").usingColumns("ID", "TIPO_DE_PERSONA", "ID_DE_PERSONA", "ID_DE_DOMICILIO", "TIPO_DE_DOMICILIO", "FECHA_DE_INICIO", "FECHA_DE_FIN");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(domicilio);
		
		insertActor.execute(param);		
	}
	
	public Domicilio get(int id) {
		String sql = "SELECT * FROM DDPFM WHERE ID = ?";
		Object[] args = {id};
		Domicilio domicilio = jdbcTemplate.queryForObject(sql, args, BeanPropertyRowMapper.newInstance(Domicilio.class));
		return domicilio;
	}
	
	public void update(Domicilio domicilio) {
		String sql = "UPDATE DDPFM SET ID=:ID, TIPO_DE_PERSONA=:TIPO_DE_PERSONA, ID_DE_PERSONA=:ID_DE_PERSONA, ID_DE_DOMICILIO=:ID_DE_DOMICILIO, TIPO_DE_DOMICILIO=:TIPO_DE_DOMICILIO, FECHA_DE_INICIO=:FECHA_DE_INICIO, FECHA_DE_FIN=:FECHA_DE_FIN WHERE ID=:ID";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(domicilio);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
		template.update(sql, param);		
	}
	
	public void delete(int id) {
		String sql = "DELETE FROM DDPFM WHERE ID = ?";
		jdbcTemplate.update(sql, id);
	}

}

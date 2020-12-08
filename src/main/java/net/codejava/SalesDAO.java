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
public class SalesDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Sale> list() {
		String sql = "SELECT d.ID, d.TIPO_DE_PERSONA, d.ID_DE_PERSONA, do.CALLE, d.FECHA_DE_INICIO, d.FECHA_DE_FIN FROM DDPFM d LEFT JOIN DOMICILIO do ON d.ID_DE_DOMICILIO =  do.ID";

		List<Sale> listSale = jdbcTemplate.query(sql, 
				BeanPropertyRowMapper.newInstance(Sale.class));
		
		return listSale;
	}
	
	public void save(Sale sale) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("DDPFM").usingColumns("ID", "TIPO_DE_PERSONA", "ID_DE_PERSONA", "ID_DE_DOMICILIO", "TIPO_DE_DOMICILIO", "FECHA_DE_INICIO", "FECHA_DE_FIN");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(sale);
		
		insertActor.execute(param);		
	}
	
	public Sale get(int id) {
		String sql = "SELECT * FROM DDPFM WHERE ID = ?";
		Object[] args = {id};
		Sale sale = jdbcTemplate.queryForObject(sql, args, BeanPropertyRowMapper.newInstance(Sale.class));
		return sale;
	}
	
	public void update(Sale sale) {
		String sql = "UPDATE DDPFM SET ID=:ID, TIPO_DE_PERSONA=:TIPO_DE_PERSONA, ID_DE_PERSONA=:ID_DE_PERSONA, ID_DE_DOMICILIO=:ID_DE_DOMICILIO, TIPO_DE_DOMICILIO=:TIPO_DE_DOMICILIO, FECHA_DE_INICIO=:FECHA_DE_INICIO, FECHA_DE_FIN=:FECHA_DE_FIN WHERE ID=:ID";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(sale);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
		template.update(sql, param);		
	}
	
	public void delete(int id) {
		String sql = "DELETE FROM DDPFM WHERE ID = ?";
		jdbcTemplate.update(sql, id);
	}
}

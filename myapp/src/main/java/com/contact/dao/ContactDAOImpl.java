package com.contact.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.contact.model.Contact;

@Repository
public class ContactDAOImpl implements ContactDAO {
	@Autowired
	private JdbcTemplate template;
	@Override
	public void insertContact(Contact contact) {
		String sql="insert into contacts(name,email,number) values(?,?,?)";
		template.update(sql, contact.getName(),contact.getEmail(),contact.getNumber());
	}
	@Override
	public List<Contact> getContacts() {
		String sql="select * from contacts";
		return template.query(sql,new ContactMapper());
		
	}
	
	private class ContactMapper implements RowMapper<Contact>{

		@Override
		public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			return new Contact(rs.getInt("id"),rs.getString("name"),rs.getString("email"),rs.getString("number"));
		}
		
	}

	@Override
	public int removeContact(int id) {
		String sql="delete from contacts where id="+id+"";
		return template.update(sql);
	}

}

package com.hcl.swipe.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.hcl.swipe.model.Employee;

@Repository
public class EmployeeRepoImpl implements EmployeeRepo {


	 @Autowired
	 JdbcTemplate jdbcTemplate;
	 
	@Override
	public List<Employee> findAll() {
		return jdbcTemplate.query("select * from employee", new EmployeeRowMapper());
	}

	@Override
	public int save(Employee employee) {
		return jdbcTemplate.update("insert into employee ( name, onboardloc, designation,onboarddate,role) " + "values(?,?,?,?)",
	            new Object[] { employee.getName(), employee.getOnboardloc(), employee.getDesignation(),
	                employee.getOnboarddate(),employee.getRole()});
	}

	@Override
	public int update(Employee employee) {
		 return jdbcTemplate.update("update employee " + " set name = ?,onboardloc = ?, designation = ?,role=?  " + " where eid = ?",
		            new Object[] {
		                employee.getName(),  employee.getOnboardloc(),employee.getDesignation(),employee.getRole(), employee.getEid()
		                });
	}
	
	 class EmployeeRowMapper implements RowMapper < Employee > {
	        @Override
	        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
	            Employee employee = new Employee();
	            employee.setEid(rs.getLong("eid"));
	            employee.setName(rs.getString("name"));
	            employee.setOnboardloc(rs.getString("onboardloc"));
	            employee.setOnboarddate((Date)rs.getDate("onboarddate"));
	            employee.setDesignation(rs.getString("designation"));
	            employee.setRole(rs.getString("role"));
	            return employee;
	        }
	    }
	 

}

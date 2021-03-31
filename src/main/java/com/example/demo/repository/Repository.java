package com.example.demo.repository;

import com.example.demo.model.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface Repository {
    @Select("select * from employees")
    public List<Employee> findAll();

    @Select("select * from employees WHERE id = #{id}")
    public Employee findById(long id);

    @Insert("INSERT INTO employees(first_name, last_name,email_address) VALUES (#{first_name}, #{last_name}, #{email_address})")
    public int insert(Employee employee);

    @Delete("DELETE FROM employees WHERE id = #{id}")
    public int delete(long id);

    @Update("UPDATE employees set first_name=#{first_name}, last_name=#{last_name}, email_address=#{email_address} WHERE id=#{id}")
    public int update(Employee employee);
}

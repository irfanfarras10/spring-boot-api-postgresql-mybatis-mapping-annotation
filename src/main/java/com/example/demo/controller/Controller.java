package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.repository.Repository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@Api(description = "API untuk employee")
public class Controller {

    @Autowired
    private Repository repository;

    @GetMapping("/employees")
    @ApiOperation("Mendapatkan semua data employee")
    public List<Employee> all(){
        return repository.findAll();
    }

    @GetMapping("/employee/{id}")
    @ApiOperation("Mencari data employee berdasarkan id")
    public Employee findById(@PathVariable long id){
        return repository.findById(id);
    }

    @PostMapping("/employee/insert")
    @ApiOperation("Memasukkan data employee")
    public String insert(@RequestBody Employee employee){
        Employee insertEmployee = new Employee();
        insertEmployee.setFirst_name(employee.getFirst_name());
        insertEmployee.setLast_name(employee.getLast_name());
        insertEmployee.setEmail_address(employee.getEmail_address());
        return "Insert Successfully!";
    }

    @DeleteMapping("/employee/{id}/delete")
    @ApiOperation("Menghapus data employee berdasarkan id")
    public String delete(@PathVariable long id) {
        repository.delete(id);
        return "Delete Successfully";
    }

    @PutMapping("/employee/{id}/update")
    @ApiOperation("Mengupdate data employee berdasarkan id")
    public String update(@RequestBody Employee employee, @PathVariable long id){
        Employee updateEmployee = new Employee();
        updateEmployee.setId(id);
        updateEmployee.setFirst_name(employee.getFirst_name());
        updateEmployee.setLast_name(employee.getLast_name());
        updateEmployee.setEmail_address(employee.getEmail_address());
        repository.update(updateEmployee);
        return "Update Successfully";
    }

}

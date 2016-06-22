package com.iic.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sivakrishna on 6/22/2016.
 */

@RestController
@RequestMapping("/employees")
public class EmployeeRestController
{
    @Autowired EmployeeRepositry emr;
    @RequestMapping("")
   public List<Employee> listEmp()
   {
        return emr.findAll();
   }
}

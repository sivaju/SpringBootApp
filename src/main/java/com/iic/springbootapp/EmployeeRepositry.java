package com.iic.springbootapp;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sivakrishna on 6/22/2016.
 */
public interface EmployeeRepositry extends JpaRepository<Employee,Integer>
{

}

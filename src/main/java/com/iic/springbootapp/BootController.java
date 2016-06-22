package com.iic.springbootapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sivakrishna on 6/22/2016.
 */

@RestController
public class BootController
{
   @RequestMapping("/req")
    public String sample()
   {
       return "Spring Boot App";
   }
}

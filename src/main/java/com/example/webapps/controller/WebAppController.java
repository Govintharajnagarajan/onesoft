package com.example.webapps.controller;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.webapps.employee.Employee;
import com.example.webapps.employee.Shirt;

@RestController
public class WebAppController {
	@GetMapping(value="/employee")
	public List<Employee> details() {
	Employee e1=new Employee("govind",26,45000,"javadeveloper");
	Employee e2=new Employee("anandh",27,35000,".netdeveloper");
	Employee e3=new Employee("akil",28,65000,"sqldeveloper");
	Employee e4=new Employee("shajin",29,55000,"pythondeveloper");
	
	List<Employee> emps=Arrays.asList(e1,e2,e3,e4);
	
	return  emps.stream().collect(Collectors.toList());
	
	
	
	
	}
	@GetMapping(value="/getshirt")
	public Shirt getDetails(@RequestBody Shirt s) {
		return s;
	}
	@GetMapping(value="/getfab")
	public String getFabric(@RequestBody Shirt s) {
		return s.getFabric().toUpperCase();
	
}
	@GetMapping(value="/getprice")
	public Shirt getprice(@RequestBody Shirt s)  {
		if(s.getIsChecked()==true) {
			s.setPrice( s.getPrice()-s.getPrice()*10/100);
		}
		else {
			s.setPrice( s.getPrice()+s.getPrice()*10/100);
		}
		return s;
	
}
	@GetMapping(value="/getbrand")
	public Shirt getlist(@RequestBody List<Shirt> s)  {
		return s.get(1);
		
		
	}
	@GetMapping(value="/getsort")
	public List<String> getsort(@RequestBody List<Shirt> s)  {
	return  s.stream().map(x->x.getBrand()).sorted().collect(Collectors.toList());
		
		
	}
	@GetMapping(value="/getmax")
	public int getmax(@RequestBody List<Shirt> s)  {
		return s.stream().map(x->x.getPrice()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		
	}
	@GetMapping(value="/get")
public String getword()  {
		return "HELLOWORLD";
	
	}
	@GetMapping(value="/add")
	public int add() {
		return  (2+3);
	}
	@GetMapping(value="/sub")
	public int sub(int a,int b)  {
		return a-b;
	}
	@GetMapping(value="/getName/{name}")
	public String getword(@PathVariable String name) {
		return name;
	}
	@GetMapping(value="/max/{a}/{b}")
	public int getmax(@PathVariable int a,@PathVariable int b) {
		  if(a>b) {
			  return a ;
		  }
			  else {
				  return b;
			  
			  }
			
		}
	@GetMapping(value="/prime/{a}/{b}")
	public int prime(@PathVariable int a,@PathVariable int b) {
		int count=0;
		
		for(int i=a;i<=b;i++)  {
			boolean isPrime=true;
			for(int j=a;j<i;j++)  {
				if(i%j==0)  {
					isPrime=false;
				}
			}
		
			if(isPrime==true)  {
			count=count+1;
			}
		}
		return count;
	}
}

				
		
	

		
	
		
	


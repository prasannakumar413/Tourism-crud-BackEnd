package com.example.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.ProjectEntity;
import com.example.demo.Service.ProjectService;

@CrossOrigin

@RestController
public class ProjectController {
	@Autowired
	ProjectService stuService;
	
	@GetMapping("/get")
	public List<ProjectEntity> fetchDetails(){
	return stuService.getDetails(); 
	}
	
	@PostMapping("/add")
	public String addId(@RequestBody ProjectEntity st)
	{
		stuService.add(st);
		return "Added "+st.getBookingId();
		
	}
	
	
	
	@PutMapping("/updateDetails")
	public ProjectEntity updateInfo (@RequestBody ProjectEntity st1 ) {
	return stuService.updateDetails(st1);
	}

	@DeleteMapping("/deleteDetails/{sid}")
	public String deleteInfo(@PathVariable("sid") int sid) {
	stuService.deleteDetails(sid);
	return "Details deleted success";
	}
	
	
	
	@GetMapping("/place/{field}")
	public List<ProjectEntity> getWithSort(@PathVariable String field) {
	return stuService.getSorted(field);
	}
	
	
	@GetMapping("/place/{offset}/{pageSize}")
	public List<ProjectEntity> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
	return stuService.getWithPagination(offset, pageSize);
	}
	
	
	
	
}
	
	
	
	
	
	
package com.example.demo.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Repository.ProjectRepository;

import com.example.demo.Entity.ProjectEntity;



@Service
public class ProjectService {
	@Autowired
	ProjectRepository stRepo;
	
	public String add(ProjectEntity m) {
		 stRepo.save(m);
		 return "Added";
		}
	
	
	public List<ProjectEntity> getDetails(){

		return stRepo.findAll();

		}
	public ProjectEntity updateDetails (ProjectEntity m) {
		return stRepo.saveAndFlush(m);
		}

		public void deleteDetails(int Id) {
		stRepo.deleteById(Id);
		}
			
		public List<ProjectEntity> getSorted(String field) {
		return stRepo.findAll(Sort.by(Sort.Direction.ASC,field));
		}
		public List<ProjectEntity> getWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
		Page<ProjectEntity> page =stRepo.findAll(PageRequest.of(offset, pageSize));
		return page.getContent();
		}
		
		
		
		
		
		
		public void saveDetails(ProjectEntity st) {
			
		}
}








		
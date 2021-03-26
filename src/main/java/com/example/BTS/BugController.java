package com.example.BTS;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.BTS.entity.Bug;
import com.example.BTS.service.BugService;

    @RestController
	public class BugController {
    @Autowired
    BugService bugService;
	@PostMapping("/bug")
	@ResponseStatus(code = HttpStatus.CREATED)
	String createBug(@RequestBody @Valid Bug bug, BindingResult bindingResult) {
		validateModel(bindingResult);
		System.out.println(bug);
		return bugService.createBug(bug); 
	}
	@GetMapping("/bug")
	List<Bug> getBugs(){
		return bugService.getBugs();
	}
	@GetMapping("/bug/{id}")
	Optional<Bug> getBug(@PathVariable("id")String bugId) {
		return bugService.getBug(bugId);
	}
	private void validateModel(Errors bindingResult) {
		if(bindingResult.hasErrors()) {
			throw new IllegalArgumentException("Something went wrong. Plesae retry");
		}
	}
	@PutMapping("/bug/{id}")
	void updateBug(@RequestBody @Valid Bug bug,BindingResult bindingResult,@PathVariable("id")String bugId) {
		validateModel(bindingResult);
		System.out.println(bugId);
		bug.setId(bugId);
		bugService.updateBug(bug);

	}
	@DeleteMapping("/bug/{id}")
	void deleteBug(@PathVariable("id")String deleteId) {
		System.out.println(deleteId);
	    bugService.deleteBug(deleteId);
	}
	}



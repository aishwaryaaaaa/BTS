package com.example.BTS.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.BTS.entity.Bug;
import com.example.BTS.repo.BugRepository;

    @Service
public class BugService { 
	@Autowired
	BugRepository bugRepository;
	public String createBug(Bug bug) {
		Bug savedBug = bugRepository.save(bug);
		return savedBug.getId();
	}

	public List<Bug> getBugs() {
	     return bugRepository.findAll();
	}
	
	public void updateBug(Bug bug) {
	     bugRepository.save(bug);

    }
	public void deleteBug(String deleteId) {
		bugRepository.deleteById(deleteId);
	}

	public Optional<Bug> getBug(String bugId) {	
		return bugRepository.findById(bugId);
	}

}

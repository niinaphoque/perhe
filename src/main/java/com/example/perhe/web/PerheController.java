package com.example.perhe.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.perhe.domain.Event;
import com.example.perhe.domain.EventRepository;
import com.example.perhe.domain.Perhe;
import com.example.perhe.domain.PerheRepository;

@Controller
public class PerheController {
	@Autowired
	private PerheRepository repository;
	
	@Autowired
	private EventRepository Erepository;
	
	//show all members
	@RequestMapping(value = { "/", "/perhelist" })
	public String perhelist(Model model) {
		model.addAttribute("members", repository.findAll());
		return "perhelist";
	}
	
	// RESTful service to get all members
	@RequestMapping(value="/members", method = RequestMethod.GET)
	public @ResponseBody List<Perhe> perheListRest() {
		return (List<Perhe>) repository.findAll();
	}
	
	// RESTful service to get members by id
    @RequestMapping(value="/members/{id}", method = RequestMethod.GET)
    public @ResponseBody Optional<Perhe> findPerheRest(@PathVariable("id") Long perheId) {	
    	return repository.findById(perheId);
    } 
	
	@RequestMapping(value = { "/add" })
	public String addEvent(Model model) {
		model.addAttribute("event", new Event());
		model.addAttribute("members", repository.findAll());
	}
	
	@RequestMapping(value= "/save/{eventid}", method = RequestMethod.POST)
	public String save(Event event) {
		repository.save(event);
		return "redirect:eventlist";
	}
	@RequestMapping(value= "/delete/{eventid}", method = RequestMethod.GET)
	public String deleteEvent(@PathVariable("eventid") Long eventid, Model model) {
		Erepository.deleteById(eventid);
		return "redirect:../eventlist";
	}

}

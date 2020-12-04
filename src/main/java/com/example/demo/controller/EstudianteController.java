package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dao.IEstudianteDAO;
import com.example.demo.dao.IEstudioDAO;
import com.example.demo.entity.Estudiante;

@Controller
public class EstudianteController {

	@Autowired
	private IEstudianteDAO estudianteDAO;

	@Autowired
	private IEstudioDAO estudioDAO;

	@GetMapping("/")
	private String form(Model model) {
		model.addAttribute("estudiante", new Estudiante());
		model.addAttribute("estudios", estudioDAO.findAll());
		return "form";
	}

	@PostMapping("/")
	public String save(Estudiante estudiante) {
		estudianteDAO.save(estudiante);
		return "redirect:/";
	}

	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("estudiantes", estudianteDAO.findAll());
		return "list";
	}
}

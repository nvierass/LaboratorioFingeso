package GrupoFingeso.ProyectoFingeso.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrincipalController {


	@RequestMapping(value = "/testRoute")
	public String mundo() {
		return "hola mundo";
	}
}

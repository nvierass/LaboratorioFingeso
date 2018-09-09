package GrupoFingeso.ProyectoFingeso.Controllers;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import GrupoFingeso.ProyectoFingeso.Models.*;

@Controller
public class PublicationController {

	@GetMapping("/getIdea")
	public void getIdea(int idIdea) {
		Idea result = new Idea(idIdea);

	}
}

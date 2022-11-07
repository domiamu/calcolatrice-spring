package it.domenico.Calcolatrice;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalcolatriceController {

	
	
	
	   @RequestMapping("/valori")
		public String form(@ModelAttribute Operazione operazione) {
	
		   
		   
		   return "NewCalcolatrice";
		   }
		
			 @RequestMapping(value="FormCalcolo", method=RequestMethod.POST)
			public String formPost(@ModelAttribute Operazione operazione, Model model) {
				 
				 System.out.println(operazione);
				 model.addAttribute("model", operazione);
				 
				 
				 
				return "FormCalcolo";
				 
			 }
	   }

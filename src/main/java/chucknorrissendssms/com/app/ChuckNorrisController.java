package chucknorrissendssms.com.app;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller 
public class ChuckNorrisController {

	public String relativePath = Constant.RELATIVE_PATH;
	public int jokeCounter = 551;
	
	@RequestMapping("/")
	public String displayGreeting(HttpSession session, Model modelholder) {
		session.setAttribute("relativePath", relativePath);
		session.setAttribute("jokeCounter", jokeCounter);
		if(!modelholder.containsAttribute("sms")) {
			modelholder.addAttribute("sms", new SMS());
		}
		return "sendASMS";
	}

	@RequestMapping(path="/SMS-sent",method=RequestMethod.POST)
	public String smsSent(@Valid @ModelAttribute("sms") SMS sms, BindingResult result, RedirectAttributes flashScope) {
		if(result.hasErrors()) {
			flashScope.addFlashAttribute("sms", sms);
			flashScope.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "sms", result);
			return "redirect:/";
		}
		if(sms.isFemale()) {
			System.out.println("He is a SHE!");
		}
		else {
			System.out.println("he is he");
		}
		if(sms.isExplicit()) {
			System.out.println("This joke might be explicit!");
		}
		else {
			System.out.println("NOT explicit!");
		}
		if(sms.isNerdy()) {
			System.out.println("Nerdy joke!");
		}
		else {
			System.out.println("NOT nerdy!");
		}
				
		String joke = SMSAPI.sendASMS(sms);
		flashScope.addFlashAttribute("joke", joke);
		flashScope.addFlashAttribute("fromName", sms.getFromName());
		flashScope.addFlashAttribute("toName", sms.getToName());
		jokeCounter++;
		return "redirect:/thankYou";	
	}


	@RequestMapping("/thankYou")
	public String thankYou(HttpSession session) {
		session.setAttribute("jokeCounter", jokeCounter);
		return "thankYou";
	}

	@RequestMapping("/about")
	public String displayAbout() {
		return "about";
	}
	

}

package com.artcources.artistica.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

  @GetMapping("/users/login")
  public String login() {
    return "auth-login";
  }


//  // NOTE: This should be post mapping!
//  @PostMapping("/users/login-error")
//  public String onFailedLogin(
//      @ModelAttribute(UsernamePasswordAuthenticationFilter.SPRING_SECURITY_FORM_USERNAME_KEY) String userName,
//      RedirectAttributes redirectAttributes) {
//
//    redirectAttributes.addFlashAttribute(UsernamePasswordAuthenticationFilter.SPRING_SECURITY_FORM_USERNAME_KEY, userName);
//    redirectAttributes.addFlashAttribute("bad_credentials",
//        true);
//
//    return "redirect:/users/login";
//  }

}

package com.artcources.artistica.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesControllers {

  @GetMapping("/pages/all")
  public String all() {
    return "all";
  }

  @GetMapping("/pages/moderators")
  public String moderators() {
    return "moderators";
  }

  @GetMapping("/pages/admins")
  public String admins() {
    return "admins";
  }

  @GetMapping("/mentor")
  public String mentor() {
    return "mentor";
  }

  @GetMapping("/contacts")
  public String contacts() {
    return "contact";
  }

  @GetMapping("/about")
  public String about() {
    return "about";
  }

  @GetMapping("/users/user")
  public String user() {
    return "user";
  }


}

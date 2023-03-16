package com.hommfan.controller;

import com.hommfan.model.Resources;
import com.hommfan.service.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

  private ResourcesService resourcesService;

  @Autowired
  public HelloController(ResourcesService resourcesService) {

    this.resourcesService = resourcesService;

  }

  @GetMapping("/")
  public String index(Model model) {

    model.addAttribute("title", "Main page");

    return "index";

  }

  @GetMapping("/artifacts")
  public String artifacts(Model model) {

    model.addAttribute("title", "Artifacts");

    return "artifacts";

  }

  @GetMapping("/buildings")
  public String buildings() {

    return "buildings";

  }

  @GetMapping("/factions")
  public String factions() {

    return "factions";

  }

  @GetMapping("/resources")
  public String resources(Model model) {

    Iterable<Resources> resourcesList = resourcesService.getAll();
    model.addAttribute("title", "Resources");
    model.addAttribute("resources", resourcesList);

    return "resources";

  }

  @GetMapping("/heroes")
  public String heroes() {

    return "heroes";

  }

  @GetMapping("/skills")
  public String skills() {

    return "skills";

  }

  @GetMapping("/specialties")
  public String specialties() {

    return "specialties";

  }

  @GetMapping("/spells")
  public String spells() {

    return "spells";

  }

  @GetMapping("/about")
  public String about() {

    return "about";

  }

}

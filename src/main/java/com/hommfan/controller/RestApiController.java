package com.hommfan.controller;

import com.hommfan.model.Resources;
import com.hommfan.service.ResourcesService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

  private ResourcesService resourcesService;

  @Autowired
  public RestApiController(ResourcesService resourcesService) {

    this.resourcesService = resourcesService;

  }

  @GetMapping("/get_resources")
  public List<Resources> resources() {

    List<Resources> resourcesList = new ArrayList<>();
    resourcesService.getAll().forEach(resourcesList::add);

    return resourcesList;
//    return new Resources(1L, "Gold", "images/resources/gold.gif", "Gold is one of the seven resources, and one of three basic resources. It is arguably the most important resource because it is needed basically for everything. The largest expenditure is troops, and another is town structures. However, gold is also needed to hire heroes, in several Adventure Map locations and to buy artifacts.");

  }

}

package com.hommfan.service.impl;

import com.hommfan.model.Resources;
import com.hommfan.repository.ResourcesRepository;
import com.hommfan.service.ResourcesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourcesServiceImpl implements ResourcesService {

  private ResourcesRepository resourcesRepository;

  @Autowired
  public ResourcesServiceImpl(ResourcesRepository resourcesRepository) {

    this.resourcesRepository = resourcesRepository;

  }

  @Override
  public Iterable<Resources> getAll() {

    return resourcesRepository.findAll();

  }

}

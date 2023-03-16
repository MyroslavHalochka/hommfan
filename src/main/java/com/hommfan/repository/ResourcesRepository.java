package com.hommfan.repository;

import com.gamepedia.civilopedia.model.UniqueUnit;
import org.springframework.data.repository.CrudRepository;

public interface UnitRepository extends CrudRepository<UniqueUnit, Long> {

}

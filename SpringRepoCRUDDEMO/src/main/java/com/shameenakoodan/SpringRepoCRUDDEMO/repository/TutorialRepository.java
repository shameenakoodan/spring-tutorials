package com.shameenakoodan.SpringRepoCRUDDEMO.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shameenakoodan.SpringRepoCRUDDEMO.model.Tutorial;

import java.util.List;
@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long>
     // Tutorial → Entity type and Long --> primary key
{
     //   findByPublished is a custom method()
    List<Tutorial> findByPublished(boolean published);
}

package org.sid.service.dao;

import org.sid.service.entities.Batch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@CrossOrigin("*")
@RepositoryRestResource
public interface BatchRepository extends JpaRepository<Batch,Long> {
    @RestResource(path = "/byDesignation")
    public default List<Batch> findByDesignationContains(@Param("mc") String des) {
        return null;
    }
}


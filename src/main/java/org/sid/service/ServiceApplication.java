package org.sid.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.sid.service.dao.BatchRepository;
import org.sid.service.entities.Batch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.text.DateFormat;
import java.util.Date;

@SpringBootApplication
public class ServiceApplication implements CommandLineRunner {
    @Autowired
    private BatchRepository BatchRepository;
    @Autowired
    private RepositoryRestConfiguration restConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }

    @Override
    @Deprecated
    public void run(String... args) throws Exception {
        restConfiguration.exposeIdsFor(Batch.class);
        BatchRepository.save(new Batch(null,"Wafa ASSURANCE Maroc",160,"09019", new Date(2021,11,12),null,"C:\\Users\\hp 840\\IdeaProjects"));
        BatchRepository.findAll().forEach(p->{
            System.out.println(p.toString());

        });

    }
}

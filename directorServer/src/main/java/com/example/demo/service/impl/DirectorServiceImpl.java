package com.example.demo.service.impl;

import com.example.demo.service.DirectorClass.Director;
import com.example.demo.service.DirectorService;
import com.example.demo.service.repository.DirectorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DirectorServiceImpl implements DirectorService {

    private final DirectorRepo repo;

    @Autowired
    DirectorServiceImpl(DirectorRepo repo)
    {
        this.repo=repo;
    }

    @Override
    public Director createDirector(int woodAmount, int balance)
    {
        Director director = new Director("Konrad", woodAmount, balance);
        repo.save(director);
        return director;
    }

    @Override
    public Director getDirectorByName()
    {
        return repo.getDirectorByName("Konrad");
    }

    @Override
    public String DirectorReport()
    {
        Director director = repo.getDirectorByName("Konrad");
        String report = director.toString();
        //System.out.println(director.getName());
        return report;
    }
}

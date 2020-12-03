package com.example.demo.service;

import com.example.demo.service.DirectorClass.Director;

public interface DirectorService {
    Director createDirector(int woodAmount, int balance);

    Director getDirectorByName();

    String DirectorReport();
}

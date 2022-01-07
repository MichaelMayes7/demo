package com.example.demo.Service;

import com.example.demo.Model.Console;
import com.example.demo.Repository.ConsoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsoleService {

    @Autowired
    private ConsoleRepository consoleRepository;

    public List<Console> findAllConsoles() {
        return consoleRepository.findAll();
    }

    public void addConsole(Console console) {
       consoleRepository.save(console);
    }
}

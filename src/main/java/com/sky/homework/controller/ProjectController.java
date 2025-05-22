package com.sky.homework.controller;

import com.sky.homework.service.ProjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/projects")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(final ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public ResponseEntity<?> getProjects() {
        return ResponseEntity.ok().body(new Object());
    }

    @PostMapping
    public ResponseEntity<?> createProject() {
        return ResponseEntity.ok().body(new Object());
    }

}

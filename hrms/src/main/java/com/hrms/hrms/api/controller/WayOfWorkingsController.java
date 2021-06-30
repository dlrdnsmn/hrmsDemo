package com.hrms.hrms.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hrms.hrms.business.abstracts.WayOfWorkingService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.entities.concretes.WayOfWorking;

import java.util.List;

@RestController
@RequestMapping("/api/wayofworkings")
@Api("Way Of Workings Controller")
@CrossOrigin
public class WayOfWorkingsController {
    private WayOfWorkingService wayOfWorkingService;
    @Autowired
    public WayOfWorkingsController(WayOfWorkingService wayOfWorkingService) {
        this.wayOfWorkingService = wayOfWorkingService;
    }

    @PostMapping("/add")
    @ApiOperation("Add Way Of Work")
    DataResult<WayOfWorking> add(@RequestBody WayOfWorking wayOfWorking) {
        return wayOfWorkingService.add(wayOfWorking);

    }

    @GetMapping("/getbyid")
    @ApiOperation("GetById WayOfWorking")
    DataResult<WayOfWorking> getById(@RequestParam("id") int id) {
        return wayOfWorkingService.getById(id);

    }

    @GetMapping("/getall")
    @ApiOperation("GetAll WayOfWorking")
    DataResult<List<WayOfWorking>> getAll() {
        return wayOfWorkingService.getAll();

    }
}
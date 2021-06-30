package com.hrms.hrms.api.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hrms.hrms.business.abstracts.WorkingTimeService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.entities.concretes.WorkingTime;

import java.util.List;

@RestController
@RequestMapping("api/workingstime")
@CrossOrigin
public class WorkingsTimeController {
    private WorkingTimeService workingTimeService;
    @Autowired
    public WorkingsTimeController(WorkingTimeService workingTimeService) {
        this.workingTimeService = workingTimeService;
    }

    @PostMapping("/add")
    @ApiOperation("Add Working Time")
    DataResult<WorkingTime> add(@RequestBody WorkingTime workingTime) {
        return workingTimeService.add(workingTime);

    }

    @GetMapping("/getbyid")
    @ApiOperation("GetById Working Time")
    DataResult<WorkingTime> getById(@RequestParam("id") int id) {
        return workingTimeService.getById(id);

    }

    @GetMapping("/getall")
    @ApiOperation("GetAll WayOfWorking")
    DataResult<List<WorkingTime>> getAll() {
        return workingTimeService.getAll();

    }
}
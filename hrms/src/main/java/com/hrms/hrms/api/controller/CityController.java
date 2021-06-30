package com.hrms.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.hrms.business.abstracts.CityService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.entities.concretes.Cities;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("api/cities")
@CrossOrigin
public class CityController {
    private CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/getall")
    @ApiOperation("GetAll City")
    DataResult<List<Cities>> getAll() {
        return cityService.getAll();
}
    }
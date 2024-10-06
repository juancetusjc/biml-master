package com.biml.master.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.biml.master.app.dto.MasterDataDTO;
import com.biml.master.app.service.MasterDataService;

import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/v1")
public class MasterDataController 
{
    @Autowired
    private MasterDataService service;

    @GetMapping("/list")
    public List<MasterDataDTO> getAll(String idMasteString) {

        return service.getAllMasterData(idMasteString);
    }

    @PostMapping("/create")
    public MasterDataDTO create(@RequestBody MasterDataDTO masterData) {
        return service.createMasterData(masterData);
    }

}
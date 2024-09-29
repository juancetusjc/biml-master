
package com.biml.master.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biml.master.app.dto.MasterDataDTO;
import com.biml.master.domain.model.MasterData;
import com.biml.master.ports.out.MasterDataRepository;
import com.biml.master.utils.ParsingUtil;

@Service
public class MasterDataService {
    @Autowired
    private MasterDataRepository repository;

    public List<MasterDataDTO> getAllMasterData(String idMaster) {
        
        List<MasterData> list=repository.findByMasterId(idMaster);
        List<MasterDataDTO> result=ParsingUtil.parsingListEntityToDtoList(list);
        return result;
    }

    public MasterDataDTO createMasterData(MasterDataDTO masterData) {
        MasterData entity= new MasterData();
        entity.setDescription(masterData.getDescription());
        entity.setId(masterData.getId());
        entity.setName(masterData.getName());
        entity=repository.save(entity);
        return masterData;
    }

}


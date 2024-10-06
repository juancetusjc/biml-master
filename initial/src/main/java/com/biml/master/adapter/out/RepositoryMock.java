package com.biml.master.adapter.out;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.biml.master.domain.model.MasterData;
import com.biml.master.ports.out.MasterDataRepository;

@Service
public class RepositoryMock implements MasterDataRepository{

    private List<MasterData> list=new ArrayList<>();

    @Override
    public MasterData save(MasterData cData) {
        list.add(cData);
        return cData;
    }

    @Override
    public List<MasterData> findByMasterId(String idMaster) {
        List<MasterData> subList= new ArrayList<>();
        for (MasterData masterData : subList) {
            if (masterData.getIdMaster().equals(idMaster)) {
                subList.add(masterData);
            }
        }
        return subList;
    }
    
}

package com.biml.master.ports.out;

import java.util.List;

import com.biml.master.domain.model.MasterData;

public interface MasterDataRepository{
public MasterData save(MasterData cData);
public List<MasterData> findByMasterId(String idMaster);
}

 
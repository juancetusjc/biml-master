package com.biml.master.utils;

import com.biml.master.app.dto.MasterDataDTO;
import com.biml.master.domain.model.MasterData;
import java.util.List;
import java.util.ArrayList;

public  class  ParsingUtil {
    
public static MasterData parsigDTOToEntityData(MasterDataDTO dto){
    MasterData entity= new MasterData();
    entity.setDescription(dto.getDescription());
    entity.setId(dto.getId());
    entity.setIdMaster(dto.getIdMaster());
    entity.setName(dto.getName());
    return entity;
}

public static MasterDataDTO parsigEntityToDTO(MasterData entity){
    MasterDataDTO dto= new MasterDataDTO();
    dto.setDescription(entity.getDescription());
    dto.setId(entity.getId());
    dto.setIdMaster(entity.getIdMaster());
    dto.setName(entity.getName());
    return dto;
}

public static List<MasterData> parsingListDtoToEntity(List<MasterDataDTO> listDto){
    List<MasterData> listEntity=new ArrayList<MasterData>();
    for (MasterDataDTO it : listDto) {
        listEntity.add(parsigDTOToEntityData(it));
    }
    return listEntity;
}
public static List<MasterDataDTO> parsingListEntityToDtoList(List<MasterData> listEntity){
    List<MasterDataDTO> listDTO=new ArrayList<MasterDataDTO>();
    for (MasterData it : listEntity) {
        listDTO.add(parsigEntityToDTO(it));
    }
    return listDTO;
}

}

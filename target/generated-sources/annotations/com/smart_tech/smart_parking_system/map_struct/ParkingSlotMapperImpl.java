package com.smart_tech.smart_parking_system.map_struct;

import com.smart_tech.smart_parking_system.dto.ParkingSlotRequestDTO;
import com.smart_tech.smart_parking_system.dto.ParkingSlotResponseDTO;
import com.smart_tech.smart_parking_system.entity.ParkingSlot;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-12T15:48:49+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.0.v20260407-0427, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class ParkingSlotMapperImpl implements ParkingSlotMapper {

    @Override
    public ParkingSlot toParkingSlot(ParkingSlotRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParkingSlot parkingSlot = new ParkingSlot();

        parkingSlot.setSlotNumber( dto.getSlotNumber() );
        parkingSlot.setSlotType( dto.getSlotType() );

        return parkingSlot;
    }

    @Override
    public ParkingSlotResponseDTO toParkingSlotResponseDTO(ParkingSlot entity) {
        if ( entity == null ) {
            return null;
        }

        ParkingSlotResponseDTO parkingSlotResponseDTO = new ParkingSlotResponseDTO();

        parkingSlotResponseDTO.setId( entity.getId() );
        parkingSlotResponseDTO.setSlotNumber( entity.getSlotNumber() );
        parkingSlotResponseDTO.setSlotType( entity.getSlotType() );
        parkingSlotResponseDTO.setStatus( entity.getStatus() );

        return parkingSlotResponseDTO;
    }
}

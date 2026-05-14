package com.smart_tech.smart_parking_system.map_struct;

import com.smart_tech.smart_parking_system.dto.VehicleRequestDTO;
import com.smart_tech.smart_parking_system.dto.VehicleResponseDTO;
import com.smart_tech.smart_parking_system.entity.User;
import com.smart_tech.smart_parking_system.entity.Vehicle;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-14T21:38:32+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.0.v20260407-0427, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class VehicleMapperImpl implements VehicleMapper {

    @Override
    public Vehicle toVehicle(VehicleRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Vehicle vehicle = new Vehicle();

        vehicle.setVehicleNumber( dto.getVehicleNumber() );
        vehicle.setVehicleType( dto.getVehicleType() );
        vehicle.setBrand( dto.getBrand() );
        vehicle.setColor( dto.getColor() );

        return vehicle;
    }

    @Override
    public VehicleResponseDTO toVehicleResponseDTO(Vehicle vehicle) {
        if ( vehicle == null ) {
            return null;
        }

        VehicleResponseDTO vehicleResponseDTO = new VehicleResponseDTO();

        vehicleResponseDTO.setUserId( vehicleUserId( vehicle ) );
        vehicleResponseDTO.setUserName( vehicleUserName( vehicle ) );
        vehicleResponseDTO.setUserEmail( vehicleUserEmail( vehicle ) );
        vehicleResponseDTO.setBrand( vehicle.getBrand() );
        vehicleResponseDTO.setColor( vehicle.getColor() );
        vehicleResponseDTO.setId( vehicle.getId() );
        vehicleResponseDTO.setVehicleNumber( vehicle.getVehicleNumber() );
        vehicleResponseDTO.setVehicleType( vehicle.getVehicleType() );

        return vehicleResponseDTO;
    }

    private Long vehicleUserId(Vehicle vehicle) {
        if ( vehicle == null ) {
            return null;
        }
        User user = vehicle.getUser();
        if ( user == null ) {
            return null;
        }
        Long id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String vehicleUserName(Vehicle vehicle) {
        if ( vehicle == null ) {
            return null;
        }
        User user = vehicle.getUser();
        if ( user == null ) {
            return null;
        }
        String name = user.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String vehicleUserEmail(Vehicle vehicle) {
        if ( vehicle == null ) {
            return null;
        }
        User user = vehicle.getUser();
        if ( user == null ) {
            return null;
        }
        String email = user.getEmail();
        if ( email == null ) {
            return null;
        }
        return email;
    }
}

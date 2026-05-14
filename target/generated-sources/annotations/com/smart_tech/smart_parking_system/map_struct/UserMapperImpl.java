package com.smart_tech.smart_parking_system.map_struct;

import com.smart_tech.smart_parking_system.dto.UserRequestDTO;
import com.smart_tech.smart_parking_system.dto.UserResponseDTO;
import com.smart_tech.smart_parking_system.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-14T21:38:32+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.0.v20260407-0427, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toUser(UserRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setRole( map( dto.getRoleId() ) );
        user.setEmail( dto.getEmail() );
        user.setName( dto.getName() );
        user.setPassword( dto.getPassword() );
        user.setPhone( dto.getPhone() );

        return user;
    }

    @Override
    public UserResponseDTO toUserResponseDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponseDTO userResponseDTO = new UserResponseDTO();

        userResponseDTO.setRole( map( user.getRole() ) );
        userResponseDTO.setEmail( user.getEmail() );
        userResponseDTO.setId( user.getId() );
        userResponseDTO.setName( user.getName() );
        userResponseDTO.setPhone( user.getPhone() );

        return userResponseDTO;
    }
}

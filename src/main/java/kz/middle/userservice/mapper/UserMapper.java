package kz.middle.userservice.mapper;

import kz.middle.userservice.dto.UserDto;
import kz.middle.userservice.model.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto (User user);
    User toEntity (UserDto userDto);

    List<UserDto> toDtoList(List<User> user);
}

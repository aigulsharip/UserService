package kz.middle.userservice.service;

import kz.middle.userservice.dto.UserDto;
import kz.middle.userservice.mapper.UserMapper;
import kz.middle.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public List<UserDto> getUsers(){
        return userMapper.toDtoList(userRepository.findAll());
    }

    public UserDto getUser(Long id){
        return userMapper.toDto(userRepository.findById(id).orElse(null));
    }

    public UserDto addUser(UserDto userDTO){
        return userMapper.toDto(userRepository.save(userMapper.toEntity(userDTO)));
    }

    public UserDto updateUser(UserDto userDTO){
        return userMapper.toDto(userRepository.save(userMapper.toEntity(userDTO)));
    }

    public void deleteUser(Long id){
        userRepository.findById(id).ifPresent(userRepository::delete);
    }


}

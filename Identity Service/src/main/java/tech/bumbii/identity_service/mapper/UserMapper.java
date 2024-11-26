package tech.bumbii.identity_service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import tech.bumbii.identity_service.dto.request.UserCreationRequest;
import tech.bumbii.identity_service.dto.request.UserUpdateRequest;
import tech.bumbii.identity_service.dto.response.UserResponse;
import tech.bumbii.identity_service.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}

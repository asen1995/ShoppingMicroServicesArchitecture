package org.shopping.front.web.mapper;

import org.mapstruct.Mapper;


@Mapper
public interface UserServiceMapper {

    com.user.management.model.User toUserManagementModel(org.shopping.front.web.model.User user);

}

package com.ticket.service.impl;

import com.ticket.payload.UserDTO;
import org.springframework.core.io.InputStreamResource;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

public interface UserService {

    public UserDTO createUser(UserDTO userDTO);
    public Page<UserDTO> getUsers(int page, int size, String sortBy, String
            sortOrder);

    public void deleteUser(Long id);

    public UserDTO updateUser(Long id, UserDTO userDTO);

    InputStreamResource getUserAsExcel();

    InputStreamResource getUserAsPdf() throws Exception;

    InputStreamResource getUserCsv();


}




package com.sonika.InventoryMgtSystem.services;

import com.sonika.InventoryMgtSystem.dtos.LoginRequest;
import com.sonika.InventoryMgtSystem.dtos.RegisterRequest;
import com.sonika.InventoryMgtSystem.dtos.Response;
import com.sonika.InventoryMgtSystem.dtos.UserDTO;
import com.sonika.InventoryMgtSystem.models.User;

public interface UserService {
    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);
}

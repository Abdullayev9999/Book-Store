package com.example.bookproject.service;

import com.example.bookproject.dto.UsersBooksDto;
import com.example.bookproject.dto.converter.UsersBooksConverter;
import com.example.bookproject.dto.request.UsersBooksRequest;
import com.example.bookproject.entities.UsersBooks;
import com.example.bookproject.repository.UsersBooksRepository;
import org.springframework.stereotype.Service;

@Service
public class UsersBooksService {

    private final UsersBooksRepository usersBooksRepository;
    private final UsersBooksConverter usersBooksConverter;

    public UsersBooksService(UsersBooksRepository usersBooksRepository, UsersBooksConverter usersBooksConverter) {
        this.usersBooksRepository = usersBooksRepository;
        this.usersBooksConverter = usersBooksConverter;
    }

    public UsersBooksDto addNewUsersBooks(UsersBooksRequest request) {
        UsersBooks usersBooks = new UsersBooks(request.getUserId(), request.getBookId());
        return usersBooksConverter.convert(usersBooksRepository.save(usersBooks));
    }
}
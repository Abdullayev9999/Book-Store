package com.example.bookproject.dto.converter;

import com.example.bookproject.dto.UsersBooksDto;
import com.example.bookproject.entities.UsersBooks;
import org.springframework.stereotype.Component;

@Component
public class UsersBooksConverter {
    public UsersBooksDto convert(UsersBooks from){
        return new UsersBooksDto(
        from.getId(),
        from.getUserId(),
        from.getBookId()
        );
    }
}

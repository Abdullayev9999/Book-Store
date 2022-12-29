package com.example.bookproject.dto.converter;

import com.example.bookproject.dto.AdviceDto;
import com.example.bookproject.entities.Advice;
import org.springframework.stereotype.Component;

@Component
public class AdviceConverter {
    public AdviceDto convert(Advice from){
        return new AdviceDto(
                from.getBookName(),
                from.getAutorName(),
                from.getUserThoughts()
        );
    }
}

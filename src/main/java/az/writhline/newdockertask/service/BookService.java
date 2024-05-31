package az.writhline.newdockertask.service;

import az.writhline.newdockertask.dto.BookRequestDto;
import az.writhline.newdockertask.dto.BookResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    List<BookResponseDto> list(Integer from ,Integer to);
    BookResponseDto get(Long id);
    BookResponseDto create(BookRequestDto bookDto);
    BookResponseDto update(Long id, BookRequestDto bookDto);
    void delete(Long id);

}

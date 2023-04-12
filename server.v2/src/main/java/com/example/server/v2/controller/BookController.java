package com.example.server.v2.controller;

import com.example.server.v2.entity.BookEntity;
import com.example.server.v2.response.BaseResponse;
import com.example.server.v2.response.BookListResponse;
import com.example.server.v2.servise.BookServise;
import com.example.server.v2.utils.BookValidationUtuls;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/book")
public class BookController {

private final BookServise servise;
public BookController(BookServise servise) {this.servise = servise;}

    @PostMapping("/add")
    public ResponseEntity<BaseResponse> add(@RequestBody BookEntity data){
    try {
        BookValidationUtuls.bookValidationUtils(data);
        servise.save(data);
        return ResponseEntity.ok(new BaseResponse(true,"Книга добавленна"));
    } catch (Exception e){
        return ResponseEntity. badRequest().body(new BaseResponse(false,e.getMessage()));
    }
    }
    @PostMapping("/update")
    public ResponseEntity <BaseResponse> update(@RequestBody BookEntity data){
    try {
        BookValidationUtuls.bookValidationUtils(data);
        servise.save(data);
        return ResponseEntity.ok(new BaseResponse(true,"книга изменена"));
    } catch (Exception e) {
        return ResponseEntity.badRequest().body(new BaseResponse(false, e.getMessage()));
    }
    }

    @DeleteMapping("/delete")
    public ResponseEntity <BaseResponse> delete(@RequestParam Long id){
    try {
        servise.delete(id);
        return ResponseEntity.ok(new BaseResponse(true,"книга Удалена"));
    } catch (Exception e) {
        return ResponseEntity.badRequest().body(new BaseResponse(false, e.getMessage()));
    }
    }
    @GetMapping("/all")
    public ResponseEntity<BaseResponse> getAll(){return ResponseEntity.ok(new BookListResponse(servise.getAll())); }

    @GetMapping()
    public ResponseEntity<BaseResponse> getPublisher(@RequestParam String publishing){
        return ResponseEntity.ok(new BookListResponse(servise.getPublisher(publishing)));
    }


}

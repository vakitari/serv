package com.example.server.v2.controller;

import com.example.server.v2.entity.AuthorEntity;
import com.example.server.v2.entity.PublisherEntity;
import com.example.server.v2.response.BaseResponse;
import com.example.server.v2.response.BookListResponse;
import com.example.server.v2.response.PublisherListResponse;
import com.example.server.v2.servise.BookServise;
import com.example.server.v2.servise.PublisherServise;
import com.example.server.v2.utils.PublisherValidationUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.spec.ECField;

@RestController
@RequestMapping("api/v1/publisher")
public class PublisherController {

    private final PublisherServise servise;
    public PublisherController(PublisherServise servise) {this.servise = servise;}

    @PostMapping("/add")
    public ResponseEntity<BaseResponse> add(@RequestBody PublisherEntity data){
        try {
            PublisherValidationUtils.validationPublisher(data);
            servise.save(data);
            return ResponseEntity.ok(new BaseResponse(true, "Издательство добавленна") );
        }catch (Exception e){
            return ResponseEntity.badRequest().body(new BaseResponse(false, e.getMessage()));
        }
    }

    @PostMapping("/update")
    public ResponseEntity <BaseResponse> update(@RequestBody PublisherEntity data){
        try {
            PublisherValidationUtils.validationPublisher(data);
            servise.save(data);
            return ResponseEntity.ok(new BaseResponse(true, "Издательство добавленно"));
        } catch (Exception e){
            return ResponseEntity.badRequest().body(new BaseResponse(false, e.getMessage()));
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity <BaseResponse> delete(@RequestParam Long id){
        try {
            servise.delete(id);
            return ResponseEntity.ok(new BaseResponse(true,"Издательство Удалено"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new BaseResponse(false, e.getMessage()));
        }
    }

    @GetMapping("/all")
    public ResponseEntity<BaseResponse> getAll(){return ResponseEntity.ok(new PublisherListResponse(servise.getAll())); }



}

package com.example.demo.controller;

import com.example.demo.Entity.HistoryEntity;
import com.example.demo.Response.BaseResponse;
import com.example.demo.Response.HistoryResponse;
import com.example.demo.Service.HistorySerivce;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/history")
public class HistoryController {
    private final HistorySerivce serivce;
    private HistoryController(HistorySerivce serivce){this.serivce = serivce;}

@PostMapping("/add")
    public ResponseEntity<BaseResponse> addHistory(@RequestBody HistoryEntity data){
        serivce.save(data);
      return ResponseEntity.ok(new BaseResponse(true, "История  сохранена"));
    }
    @GetMapping("/all")
    public ResponseEntity<BaseResponse> allHis(){return ResponseEntity.ok(new HistoryResponse(serivce.getAll()));}

    @DeleteMapping("/del")
    public ResponseEntity<BaseResponse> del(@RequestParam Long  id){
        serivce.del(id);
        return ResponseEntity.ok(new BaseResponse(true,"удалено"));}
}

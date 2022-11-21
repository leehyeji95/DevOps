package com.k8s.sample.controller;

import com.k8s.sample.entity.TbUser;
import com.k8s.sample.repository.TbUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("tbuser")
public class TestController {
    @Autowired
    TbUserRepository tbUserRepository;

    @GetMapping(value="list")
    public ResponseEntity<List<TbUser>> getUserList() {
        List<TbUser> userList = tbUserRepository.findAll();
        if(userList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(userList, HttpStatus.OK);
        }
    }
}

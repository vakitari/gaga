package com.example.demo.Response;

import com.example.demo.Entity.HistoryEntity;
import com.example.demo.Entity.UserEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserResponse extends BaseResponse {
    public UserResponse(Iterable<UserEntity> data)  {
        super(true, "История операций");
        this.data = data;
    }

    private Iterable<UserEntity> data;
}

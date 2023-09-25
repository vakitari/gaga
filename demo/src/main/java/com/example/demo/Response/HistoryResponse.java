package com.example.demo.Response;

import com.example.demo.Entity.HistoryEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class HistoryResponse extends BaseResponse {
    public HistoryResponse(Iterable<HistoryEntity> data)  {
        super(true, "История операций");
        this.data = data;
    }

    private Iterable<HistoryEntity> data;
}

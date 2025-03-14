package com.order.order.common;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.order.order.dto.OrderDTO;
import lombok.Getter;

@Getter
public class SucessOrderRespnse implements OrderResponse{
    @JsonUnwrapped
    private final OrderDTO order;

    public SucessOrderRespnse(OrderDTO order) {
        this.order = order;
    }
}

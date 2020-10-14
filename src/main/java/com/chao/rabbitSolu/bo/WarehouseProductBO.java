package com.chao.rabbitSolu.bo;

import lombok.*;

/**
 * @ClassName WarehouseProductBO
 * @Author chao
 * @Time 2020/10/13 22:53
 * @Version 0.1
 **/
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WarehouseProductBO {
    /**
     * 是否还有库存
     */
    private boolean isStock;
    /**
     *
     */
    private Long selectedWId;
}

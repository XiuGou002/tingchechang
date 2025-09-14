package com.shanzhu.parking.controller;


import com.shanzhu.parking.common.R;
import com.shanzhu.parking.entity.po.StallType;
import com.shanzhu.parking.service.StallTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 车位类型 控制层
 *
 * @author: ShanZhu
 * @date: 2023-12-02
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/stallType")
public class StallTypeController {

    private final StallTypeService stallTypeService;

    /**
     * 查询车位类型
     *
     * @return 车位类型
     */
    @GetMapping("/list")
    public R<List<StallType>> getList() {
        return R.success(stallTypeService.list());
    }

}


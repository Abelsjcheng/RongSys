package com.ruoyi.api.controller.broad;

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.broad.service.IMaintainService;
import com.ruoyi.broad.service.IManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张超 teavamc
 * @Description:应急广播设备的统一RESTful API出入口
 * @ClassName Device
 * @date 2019/1/25 19:36
 **/
@RestController
@RequestMapping("/api/device")
@CrossOrigin
public class Device {

    @Autowired
    private IMaintainService maintainService;
    @Autowired
    private IManagementService managementService;
    /**
        * 返回按照创建时间倒序的十条带有经纬度的维修设备记录
        * @author 张超 teavamc
        * @date 2019/1/25
        * @param []
        * @return com.ruoyi.api.domain.RongApiRes
        */
    @CrossOrigin
    @GetMapping("/mlal")
    public RongApiRes maintianx(){
        return RongApiService.get_list(maintainService.selectlal());
    }

    /**
        * :按照终端地址进行运行状态的分组统计
        * @author 张超 teavamc
        * @date 2019/1/25
        * @param []
        * @return com.ruoyi.api.domain.RongApiRes
        */
    @CrossOrigin
    @GetMapping("/tersga")
    public RongApiRes Tersga(){
        return RongApiService.get_list(managementService.selecttersga());
    }
}

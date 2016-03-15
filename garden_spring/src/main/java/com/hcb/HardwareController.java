package com.hcb;

import com.hcb.Repo.BaseRepo;
import com.hcb.bean.Device;
import com.hcb.mapper.DeviceMapper;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.mvc.condition.ParamsRequestCondition;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fanzhengchen on 3/14/16.
 */
@RestController
public class HardwareController {

    private Logger Log = LoggerFactory.getLogger(HardwareController.class);
    private final static boolean CONNECTED = true;
    private final static boolean DISCONNECTED = false;
    private final static int SECTION = 0;
    private final static int ARM = 1;
    private final static int CONTROLLER = 2;
    private final static int SENSOR = 3;
    private DeviceMapper mapper = GardenApplication.getContext().getBean(DeviceMapper.class);

    @RequestMapping(value = "/connected_devices", method = RequestMethod.GET)
    public List<Device> getConnectedDevicesList() {
        ArrayList<Device> list = new ArrayList<Device>();
        Device section = new Device("connected", true, SECTION);
        Device arm = new Device("arm", true, ARM);
        list.add(section);
        list.add(arm);
        return list;
    }

    @RequestMapping(value = "/disconnected_devices", method = RequestMethod.GET)
    public List<Device> getDisconnectedDevicesList() {
        ArrayList<Device> list = new ArrayList<Device>();
        Device section = new Device("disconnected", true, SECTION);
        list.add(section);
        return list;
    }

    @RequestMapping(value = "/new_device",
            method = RequestMethod.POST,
            consumes = "application/json ")
    public BaseRepo insert(@RequestBody Device device, HttpServletRequest request) {
        if (device == null) {
            throw new NullPointerException("device is null");
        }

        Log.debug("device {}", device);
        System.out.printf("device");
//        mapper.insertDevice(device);
        return new BaseRepo("0", "add");
    }

}

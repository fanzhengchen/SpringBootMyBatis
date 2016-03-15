package com.hcb.mapper;

import com.hcb.bean.Device;
import org.apache.ibatis.annotations.Insert;

/**
 * Created by fanzhengchen on 3/15/16.
 */
public interface DeviceMapper {

    @Insert("INSERT INTO Devices(id,name,connected,type) " +
            "VALUES(#{id},#{name},#{connected},#{type})")
    public void insertDevice(Device device);
}

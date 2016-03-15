package com.hcb.bean;

import java.util.UUID;

/**
 * Created by fanzhengchen on 3/14/16.
 */
public class Device {
    private int id;
    private String name;
    private boolean connected;
    private int type;

    public Device(){

    }

    public Device(String name, boolean connected, int type) {
        this.name = name;
        this.connected = connected;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}

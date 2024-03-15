package com.example.bean;

/**
 * @author lei
 * @date 2024/3/15$
 */
public class Device {
    int deviceId;
    String deviceName;
    String deviceDate;

    public Device(int deviceId, String deviceName, String deviceDate) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.deviceDate = deviceDate;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceDate() {
        return deviceDate;
    }

    public void setDeviceDate(String deviceDate) {
        this.deviceDate = deviceDate;
    }

    @Override
    public String toString() {
        return "Device{" +
                "deviceId=" + deviceId +
                ", deviceName='" + deviceName + '\'' +
                ", deviceDate='" + deviceDate + '\'' +
                '}';
    }
}

package com.example.dao;

import com.example.bean.Device;

import java.util.*;

/**
 * @author lei
 * @date 2024/3/15$
 */
public class DeviceDao {
    private int intVal;
    private String stringVal;
    private Device device;
    private int[] array;
    private ArrayList<Integer> arrayList;
    private HashMap<Integer, String> hashMap;
    private HashSet<Integer> hashSet;


    public DeviceDao(int intVal, String stringVal, Device device, int[] array, ArrayList<Integer> arrayList, HashMap<Integer, String> hashMap, HashSet<Integer> hashSet) {
        this.intVal = intVal;
        this.stringVal = stringVal;
        this.device = device;
        this.array = array;
        this.arrayList = arrayList;
        this.hashMap = hashMap;
        this.hashSet = hashSet;
    }

    public int getIntVal() {
        return intVal;
    }

    public void setIntVal(int intVal) {
        this.intVal = intVal;
    }

    public String getStringVal() {
        return stringVal;
    }

    public void setStringVal(String stringVal) {
        this.stringVal = stringVal;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public HashMap<Integer, String> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<Integer, String> hashMap) {
        this.hashMap = hashMap;
    }

    public HashSet<Integer> getHashSet() {
        return hashSet;
    }

    public void setHashSet(HashSet<Integer> hashSet) {
        this.hashSet = hashSet;
    }

    @Override
    public String toString() {
        return "DeviceDao{" +
                "intVal=" + intVal +
                ", stringVal='" + stringVal + '\'' +
                ", device=" + device +
                ", array=" + Arrays.toString(array) +
                ", arrayList=" + arrayList +
                ", hashMap=" + hashMap +
                ", hashSet=" + hashSet +
                '}';
    }
}

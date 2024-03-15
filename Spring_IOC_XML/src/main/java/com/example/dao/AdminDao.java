package com.example.dao;

import com.example.bean.Admin;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author lei
 * @date 2024/3/15$
 */
public class AdminDao {
    private Admin admin;
    private List<Integer> integerList;
    private Map<Integer, String> integerStringMap;
    private Set<Integer> integerSet;
    private Properties properties;

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<Integer> integerList) {
        this.integerList = integerList;
    }

    public Map<Integer, String> getIntegerStringMap() {
        return integerStringMap;
    }

    public void setIntegerStringMap(Map<Integer, String> integerStringMap) {
        this.integerStringMap = integerStringMap;
    }

    public Set<Integer> getIntegerSet() {
        return integerSet;
    }

    public void setIntegerSet(Set<Integer> integerSet) {
        this.integerSet = integerSet;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "AdminDao{" +
                "admin=" + admin +
                ", integerList=" + integerList +
                ", integerStringMap=" + integerStringMap +
                ", integerSet=" + integerSet +
                ", properties=" + properties +
                '}';
    }
}

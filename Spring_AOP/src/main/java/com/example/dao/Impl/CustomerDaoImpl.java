package com.example.dao.Impl;

import com.example.dao.CustomerDao;

/**
 * @author lei
 * @date 2024/3/16$
 */
public class CustomerDaoImpl implements CustomerDao {
    /**
     * 增加
     */
    @Override
    public void add() {
        System.out.println("添加客户");
    }

    /**
     * 更新
     */
    @Override
    public void update() {
        System.out.println("更新客户");
    }

    /**
     * 删除
     */
    @Override
    public void delete() {
        System.out.println("删除客户");
    }

    /**
     * 查找
     */
    @Override
    public void find() {
        System.out.println("查找客户");
    }
}

package com.GDUF.service.impl;

import com.GDUF.base.BaseDao;
import com.GDUF.base.BaseServiceImpl;
import com.GDUF.mapper.ItemMapper;
import com.GDUF.po.Item;
import com.GDUF.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl extends BaseServiceImpl<Item> implements ItemService {

    @Autowired
    private ItemMapper itemMapper;
    @Override
    public BaseDao<Item> getBaseDao() {
        return itemMapper;
    }
}

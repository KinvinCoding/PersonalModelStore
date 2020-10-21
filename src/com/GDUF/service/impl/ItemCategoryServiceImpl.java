package com.GDUF.service.impl;

import com.GDUF.base.BaseDao;
import com.GDUF.base.BaseServiceImpl;
import com.GDUF.mapper.ItemCategoryMapper;
import com.GDUF.po.ItemCategory;
import com.GDUF.service.ItemCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemCategoryServiceImpl extends BaseServiceImpl<ItemCategory> implements ItemCategoryService {
    @Autowired
    ItemCategoryMapper itemCategoryMapper;

    @Override
    public BaseDao<ItemCategory> getBaseDao() {
        return itemCategoryMapper;
    }
}

package com.GDUF.service.impl;

import com.GDUF.base.BaseDao;
import com.GDUF.base.BaseServiceImpl;
import com.GDUF.mapper.ManageMapper;
import com.GDUF.po.Manage;
import com.GDUF.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManageServiceImpl extends BaseServiceImpl<Manage> implements ManageService {
    @Autowired
    ManageMapper manageMapper;

    @Override
    public BaseDao<Manage> getBaseDao() {
        return manageMapper;
    }
}

package com.GDUF.service.impl;

import com.GDUF.base.BaseDao;
import com.GDUF.base.BaseServiceImpl;
import com.GDUF.mapper.MessageMapper;
import com.GDUF.po.Message;
import com.GDUF.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl extends BaseServiceImpl<Message> implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Override
    public BaseDao<Message> getBaseDao() {
        return messageMapper;
    }
}

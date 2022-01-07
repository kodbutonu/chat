package com.kaankubat.chatapp.service;

import java.util.List;

import com.kaankubat.chatapp.entity.MessageRecorderEntity;

public interface MessageRecorderServiceInterface {

    void save(String sender, String receiver, String messageContent);

    List<MessageRecorderEntity> findAllByReceiverName(String receiverName);
}
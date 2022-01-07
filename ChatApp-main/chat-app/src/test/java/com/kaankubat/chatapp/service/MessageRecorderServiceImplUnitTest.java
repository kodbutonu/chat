package com.kaankubat.chatapp.service;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.kaankubat.chatapp.entity.MessageRecorderEntity;
import com.kaankubat.chatapp.repository.MessageRecorderRepository;

class MessageRecorderServiceImplUnitTest {

    MessageRecorderServiceImpl service;
    MessageRecorderRepository messageRecorderRepo;

    @Before
    public void setUp() {
        messageRecorderRepo = createMock(MessageRecorderRepository.class);
        service = new MessageRecorderServiceImpl(messageRecorderRepo);
    }

    @Test
    void testSave() {
        String sender = "a";
        String receiver = "b";
        String messageContent = "message";
        MessageRecorderEntity messageEntity = new MessageRecorderEntity();
        messageEntity.setSenderName(sender);
        messageEntity.setReceiverName(receiver);
        messageEntity.setMessageContent(messageContent);
        //Mockito.when(messageRecorderRepo.save(messageEntity)).thenReturn(messageEntity);

    }

    public static <T> T createMock(Class<T> classToMock) {
        return Mockito.mock(classToMock);
    }

}
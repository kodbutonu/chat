package com.kaankubat.chatapp.api;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.kaankubat.chatapp.entity.MessageRecorderEntity;
import com.kaankubat.chatapp.entity.User;
import com.kaankubat.chatapp.service.MessageRecorderServiceInterface;
import com.kaankubat.chatapp.service.UserServiceInterface;

class MessageControllerTest {

    @Mock
    private UserServiceInterface userServiceInterface;
    @Mock
    private MessageRecorderServiceInterface messageRecorder;

    @InjectMocks
    private MessageController controller;

    @Before
    void setUp() {
    }

    @Test
    void testGetMyMessages() throws Exception {

    }

}
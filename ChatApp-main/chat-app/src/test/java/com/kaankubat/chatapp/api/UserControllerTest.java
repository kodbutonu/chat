package com.kaankubat.chatapp.api;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.kaankubat.chatapp.repository.ActivityLogEntityRepo;
import com.kaankubat.chatapp.service.UserServiceInterface;

class UserControllerTest {
    UserServiceInterface userServiceInterface;
    ActivityLogEntityRepo activityLogEntityRepo;
    UserController controller;

    @Before
    void setUp() {
        userServiceInterface = createMock(UserServiceInterface.class);
        activityLogEntityRepo = createMock(ActivityLogEntityRepo.class);
        controller = new UserController(userServiceInterface, activityLogEntityRepo);
    }

    @Test
    void test() {
    }

    public static <T> T createMock(Class<T> classToMock) {
        return Mockito.mock(classToMock);
    }
}
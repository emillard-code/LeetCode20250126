package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void maximumEmployeesToBeInvitedToAMeetingTest() {

        int[] favorite1 = new int[]{2,2,1,2};
        assertEquals(3, LeetCodeAttempt.maximumEmployeesToBeInvitedToAMeeting(favorite1));

        int[] favorite2 = new int[]{1,2,0};
        assertEquals(3, LeetCodeAttempt.maximumEmployeesToBeInvitedToAMeeting(favorite2));

        int[] favorite3 = new int[]{3,0,1,4,1};
        assertEquals(4, LeetCodeAttempt.maximumEmployeesToBeInvitedToAMeeting(favorite3));

    }

}

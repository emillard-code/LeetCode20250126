package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void maximumEmployeesToBeInvitedToAMeetingTest() {

        int[] favorite1 = new int[]{2,2,1,2};
        assertEquals(3, LeetCodeSolution.maximumInvitations(favorite1));

        int[] favorite2 = new int[]{1,2,0};
        assertEquals(3, LeetCodeSolution.maximumInvitations(favorite2));

        int[] favorite3 = new int[]{3,0,1,4,1};
        assertEquals(4, LeetCodeSolution.maximumInvitations(favorite3));

    }

}

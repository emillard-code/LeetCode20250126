package com.project.attempt;

import java.util.LinkedList;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[] favorite1 = new int[]{2,2,1,2};
        System.out.println(maximumEmployeesToBeInvitedToAMeeting(favorite1));

        int[] favorite2 = new int[]{1,2,0};
        System.out.println(maximumEmployeesToBeInvitedToAMeeting(favorite2));

        int[] favorite3 = new int[]{3,0,1,4,1};
        System.out.println(maximumEmployeesToBeInvitedToAMeeting(favorite3));

    }

    public static int maximumEmployeesToBeInvitedToAMeeting(int[] favorite) {

        int people = 0;

        for (int i = 0; i < favorite.length; i++) {

            int nextPerson = i;
            LinkedList<Integer> seated = new LinkedList<>();

            while (true) {

                seated.add(nextPerson);

                if (!seated.contains(favorite[nextPerson])) {

                    nextPerson = favorite[nextPerson];

                } else {

                    if (favorite[nextPerson] != seated.get(0) &&
                            favorite[nextPerson] != seated.get(seated.size() - 2))  {
                        seated = new LinkedList<>();
                    }

                    break;

                }

            }

            if (seated.size() > people) { people = seated.size(); }

        }

        return people;

    }

}

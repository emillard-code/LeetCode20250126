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

    // This method returns the maximum number of employees that can be invited to a meeting.
    public static int maximumEmployeesToBeInvitedToAMeeting(int[] favorite) {

        // int people will hold the maximum number of employees that can be invited.
        int people = 0;

        // For each employee that exists, we will follow the chain of favorite people
        // that exists for as far as we can. As each person only has one favorite person,
        // following the chain of favorite people is relatively simple. If we test each
        // employee as a starting point, we should have basically tested all possible
        // combinations and eventually find the maximum number of people that can be invited.
        for (int i = 0; i < favorite.length; i++) {

            // For each int i, we test the person at index i as the start point.
            // For each int i, we will have a LinkedList seated that will store the
            // chain of favourite people that starts with the person at index i.
            int nextPerson = i;
            LinkedList<Integer> seated = new LinkedList<>();

            while (true) {

                // We'll first add the current person to the LinkedList.
                seated.add(nextPerson);

                // Then we check if the current person's favorite person already
                // exists in the LinkedList or not. If not, we set nextPerson to
                // the index of the favorite person. Otherwise, we break from the
                // while loop here to indicate that the chain of favorite people
                // has been broken here as it can't be followed anymore. (Since
                // everyone must be next to their favorite person, if the
                // favorite person already exists then that means they exist in
                // a position that we can't change anymore and possibly can't be
                // placed next to the current person in this iteration of index i.)
                if (!seated.contains(favorite[nextPerson])) {

                    nextPerson = favorite[nextPerson];

                } else {

                    // Before completely breaking from the loop, we check if the current
                    // person's favorite is at index i (the 'next' position) or the position
                    // behind them. If either turns out true, then this chain is valid as
                    // everyone is next to their favorite person. If neither is true, then
                    // this chain is invalid as it means the final person is unable to sit
                    // next to their favorite person. So we empty out the LinkedList in that
                    // case to not interfere with later logic.
                    if (favorite[nextPerson] != seated.get(0) &&
                            favorite[nextPerson] != seated.get(seated.size() - 2))  {
                        seated = new LinkedList<>();
                    }

                    break;

                }

            }

            // At the end of the while loop, if we got a valid chain of favorite people,
            // and the number of employees in the current chain of favorite people is
            // higher than the current size of int people, we overwrite the value of
            // int people with the size of the current LinkedList. This will eventually
            // leave us with the largest value attainable from a valid chain of favorite
            // people.
            if (seated.size() > people) { people = seated.size(); }

        }

        // Once all the loops have been done, we return the value of int people
        // which should indicate the maximum number of employees that can sit
        // at the table.
        return people;

    }

}

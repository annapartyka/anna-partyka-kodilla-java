package com.kodilla.steam.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theListOfUsers = new ArrayList<>();

    public Forum(){
        theListOfUsers.add(new ForumUser(1,"user1",'M', 1993,02,12,1));
        theListOfUsers.add(new ForumUser(2,"user2",'F', 1997,02,01,8));
        theListOfUsers.add(new ForumUser(3,"user3",'M', 1977,04,30,120));
        theListOfUsers.add(new ForumUser(4,"user4",'M', 1979,12,27,327));
    }
        public List<ForumUser> getUserList(){
        return new ArrayList<>(theListOfUsers);
        }
}

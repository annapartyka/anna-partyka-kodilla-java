package com.kodilla.steam.forum;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public final class ForumUser {
    private final String username;
    private final String realName;
    private final String location;
    private final Set<ForumUser>friends = new HashSet<>();

    public ForumUser(String username, String realName, String location) {
        this.username = username;
        this.realName = realName;
        this.location = location;
    }
    public void addFriend(ForumUser user){
        friends.add(user);
    }
    public boolean removeFriend(ForumUser user) {
        return friends.remove(user);
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public String getLocation() {
        return location;
    }

    public Set<ForumUser> getFriends() {
        return friends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return Objects.equals(username, forumUser.username);
    }

    @Override
    public int hashCode() {

        return Objects.hash(username);
    }
    public Set<String> getLocationOfFriends(){
        return friends.stream()
                .map(friends -> friends.getLocation())
                .collect(Collectors.toSet());
    }
}

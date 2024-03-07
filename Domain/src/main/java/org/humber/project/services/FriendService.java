package org.humber.project.services;

import org.humber.project.domain.Friend;

import java.util.List;

public interface FriendService {
    Friend addFriend(Friend friend);

    void deleteFriend(Long friendId);

    List<Friend> getAllFriends();
}

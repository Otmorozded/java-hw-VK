package ru.netology.domain;

public class CommentsInfo {

    int count;//количество комментариев
    boolean canPost;//информация о том, может ли текущий пользователь комментировать запись
    boolean groupsCanPost;//информация о том, могут ли сообщества комментировать запись

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public boolean isGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }
}

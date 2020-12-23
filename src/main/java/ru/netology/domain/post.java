package ru.netology.domain;

public class Post {

    String text;// Текст поста//
    int postId;// Идентификатор самого поста
    int ownerId;// Идентификаторпространства где размещен пост (паблик, стена)
    int userId;  // Идентификатор автора поста
    LikesInfo likesInfo;//Количество лайков
    ViewInfo viewInfo;//Количество просмотров записи
    RepostsInfo repostsInfo;// Информация о репостах

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public ViewInfo getViewInfo() {
        return viewInfo;
    }

    public void setViewInfo(ViewInfo viewInfo) {
        this.viewInfo = viewInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }
}








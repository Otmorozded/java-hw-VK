package ru.netology.domain;

public class Post {

    String text;// Текст поста//
    int postId;// Идентификатор самого поста
    int ownerId;// Идентификатор пространства где размещен пост (паблик, стена)
    int userId;// Идентификатор автора поста
    int createdBy;//идентификатор администратора, который опубликовал запись
    int date;// Дата публикации записи
    int replyOwnerId;// идентификатор владельца записи, в ответ на которую была оставлена текущая
    int replyPostId;// идентификатор записи, в ответ на которую была оставлена текущая
    int signerId;// идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;
    boolean canPin;//информация о том, может ли текущий пользователь закрепить запись
    boolean canDelete;// информация о том, может ли текущий пользователь удалить запись
    boolean canEdit;//информация о том, может ли текущий пользователь редактировать запись
    boolean isPinned;//информация о том, что запись закреплена
    LikesInfo likesInfo;//Количество лайков
    ViewInfo viewInfo;//Количество просмотров записи
    RepostsInfo repostsInfo;// Информация о репостах
    CommentsInfo commentsInfo;//информация о комментариях к записи

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }






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








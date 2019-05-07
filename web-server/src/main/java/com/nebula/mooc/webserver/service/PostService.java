package com.nebula.mooc.webserver.service;


import com.nebula.mooc.core.entity.Page;
import com.nebula.mooc.core.entity.Post;
import com.nebula.mooc.core.entity.Reply;

import java.util.List;

/**
 * Created by 15722 on 2019/4/18.
 */

public interface PostService {


    Post showPost(Post post);

    List<Post> showPostList(Page page);

    /**
     * 新建贴子
     *
     * @param post
     * @return 返回是否新建成功
     */
    boolean newPost(Post post);

    /**
     * 删除贴子
     *
     * @param post
     * @return 返回是否删除成功
     */
    boolean delPost(Post post);

    boolean commit(Reply reply);

    boolean delCommit(Reply reply);

    boolean replyCommit(Reply reply);

    boolean delReplyCommit(Reply reply);

    List<Reply> getCommit(Page page);

    List<Reply> getReply(Reply reply);

    /**
     * 收藏贴子
     *
     * @param post
     * @return 返回是否收藏成功
     */
    boolean postLike(Post post);

    /**
     * 取消收藏
     *
     * @param post
     * @return 返回是否取消收藏成功
     */
    boolean delLike(Post post);

    boolean ifStar(Reply reply);

    boolean replyStar(Reply reply);

    boolean delReplyStar(Reply reply);

    int lastReplyId();

    int postTotal();

    int commitTotal(Page page);

}
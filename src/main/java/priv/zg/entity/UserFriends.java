package priv.zg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 用户好友表
 * </p>
 *
 * @author xm
 * @since 2022-02-17
 */
@TableName("user_friends")
public class UserFriends implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标识ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 好友ID
     */
    private Long userFriendsId;

    /**
     * 好友备注
     */
    private String userNote;

    /**
     * 好友状态
     */
    private String userStatus;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserFriendsId() {
        return userFriendsId;
    }

    public void setUserFriendsId(Long userFriendsId) {
        this.userFriendsId = userFriendsId;
    }

    public String getUserNote() {
        return userNote;
    }

    public void setUserNote(String userNote) {
        this.userNote = userNote;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public String toString() {
        return "UserFriends{" +
        "id=" + id +
        ", userId=" + userId +
        ", userFriendsId=" + userFriendsId +
        ", userNote=" + userNote +
        ", userStatus=" + userStatus +
        "}";
    }
}

package priv.zg.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;

/**
 * 用户好友表
 *
 * @TableName user_friends
 */
@TableName(value = "user_friends")
@Data
public class UserFriends implements Serializable {
    /**
     * 标识ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户ID
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 好友ID
     */
    @TableField(value = "user_friends_id")
    private Long userFriendsId;

    /**
     * 好友备注
     */
    @TableField(value = "user_note")
    private String userNote;

    /**
     * 好友状态
     */
    @TableField(value = "user_status")
    private String userStatus;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserFriends other = (UserFriends) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
                && (this.getUserFriendsId() == null ? other.getUserFriendsId() == null : this.getUserFriendsId().equals(other.getUserFriendsId()))
                && (this.getUserNote() == null ? other.getUserNote() == null : this.getUserNote().equals(other.getUserNote()))
                && (this.getUserStatus() == null ? other.getUserStatus() == null : this.getUserStatus().equals(other.getUserStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserFriendsId() == null) ? 0 : getUserFriendsId().hashCode());
        result = prime * result + ((getUserNote() == null) ? 0 : getUserNote().hashCode());
        result = prime * result + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", userFriendsId=").append(userFriendsId);
        sb.append(", userNote=").append(userNote);
        sb.append(", userStatus=").append(userStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package cc.openkit.kitChat.rongcloud.rong.messages;

import cc.openkit.kitChat.rongcloud.rong.util.GsonUtil;

/**
 *
 * 自定义消息
 *
 */
public class CustomTxtMessage extends BaseMessage {
	private String content = "";
	private transient static final String TYPE = "RC:TxtMsg";
	
	public CustomTxtMessage(String content) {
		this.content = content;
	}
	
	public String getType() {
		return TYPE;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}  
	
	@Override
	public String toString() {
		return GsonUtil.toJson(this, CustomTxtMessage.class);
	}
}
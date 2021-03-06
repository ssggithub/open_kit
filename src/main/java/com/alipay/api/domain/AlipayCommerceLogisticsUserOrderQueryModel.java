package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户业务订单查询
 *
 * @author auto create
 * @since 1.0, 2017-10-17 15:40:16
 */
public class AlipayCommerceLogisticsUserOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2851157398691117941L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 扩展参数 , json 格式。
可选还是必选取决于biz_type参数 . 
对于 CABINET_FACE_TAKE 自提柜刷脸开柜业务需要传字段 cabinet_no ( 柜子编号 ) .
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 物流体系里合作商户的编码
	 */
	@ApiField("merchant_code")
	private String merchantCode;

	/**
	 * 当前支持支付宝登录号
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 目前只支持登录号,后续可扩展
	 */
	@ApiField("target_id_type")
	private String targetIdType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getMerchantCode() {
		return this.merchantCode;
	}
	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetIdType() {
		return this.targetIdType;
	}
	public void setTargetIdType(String targetIdType) {
		this.targetIdType = targetIdType;
	}

}

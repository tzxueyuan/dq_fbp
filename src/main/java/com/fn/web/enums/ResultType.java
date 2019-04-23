package com.fn.web.enums;

import com.fn.utils.string.BeanUtil;

/**
 * 微信接口返回码
 * @author user
 *
 */
public enum ResultType {
	
	  /**
     * 系统繁忙
     */
    SYSTEM_BUSY("-1","系统繁忙"),

    /**
     * 微信请求成功
     */
    SUCCESS("0","请求成功"),
    
    /**
     * 获取access_token时AppSecret错误，或者access_token无效
     */
    APP_SECRET_ERROR("40001","获取access_token时AppSecret错误，或者access_token无效"),

    /**
     * 不合法的凭证类型
     */
    ILLEGAL_TOKEN_TYPE("40002","不合法的凭证类型"),

    /**
     * 不合法的OpenID
     */
    ILLEGAL_OPEN_ID("40003","不合法的OpenID"),

    /**
     * 不合法的媒体文件类型
     */
    ILLEGAL_MEDIA_TYPE("40004","不合法的媒体文件类型"),

    /**
     * 不合法的文件类型
     */
    ILLEGAL_FILE_TYPE("40005","不合法的文件类型"),

    /**
     * 不合法的文件大小
     */
    ILLEGAL_FILE_SIZE("40006","不合法的文件大小"),

    /**
     * 不合法的媒体文件id
     */
    ILLEGAL_MEDIA_ID("40007","不合法的媒体文件id"),

    /**
     * 不合法的消息类型
     */
    ILLEGAL_MESSAGE_TYPE("40008","不合法的消息类型"),

    /**
     * 不合法的图片文件大小
     */
    ILLEGAL_PICTURE_SIZE("40009","不合法的图片文件大小"),

    /**
     * 不合法的语音文件大小
     */
    ILLEGAL_VOICE_SIZE("40010","不合法的语音文件大小"),

    /**
     * 不合法的视频文件大小
     */
    ILLEGAL_VIDEO_SIZE("40011","不合法的视频文件大小"),

    /**
     * 不合法的缩略图文件大小
     */
    ILLEGAL_THUMBNAIL_SIZE("40012","不合法的缩略图文件大小"),

    /**
     * 不合法的APPID
     */
    ILLEGAL_APP_ID("40013","不合法的APPID"),

    /**
     * 不合法的access_token
     */
    ILLEGAL_ACCESS_TOKEN("40014","不合法的access_token"),

    /**
     * 不合法的菜单类型
     */
    ILLEGAL_MENU_TYPE("40015","不合法的菜单类型"),

    /**
     * 不合法的按钮个数
     */
    ILLEGAL_MENU_NUMBER("40016","不合法的按钮个数"),

    /**
     * 不合法的按钮名字长度
     */
    ILLEGAL_BUTTON_NAME_LENTH("40018","不合法的按钮名字长度"),

    /**
     * 不合法的按钮KEY长度
     */
    ILLEGAL_BUTTON_KEY_LENTH("40019","不合法的按钮KEY长度"),

    /**
     * 不合法的按钮URL长度
     */
    ILLEGAL_BUTTON_URL_LENTH("40020","不合法的按钮URL长度"),

    /**
     * 不合法的菜单版本号
     */
    ILLEGAL_MENU_VERSION("40021","不合法的菜单版本号"),

    /**
     * 不合法的子菜单级数
     */
    ILLEGAL_SUB_MENU_LEVEL("40022","不合法的子菜单级数"),

    /**
     * 不合法的子菜单按钮个数
     */
    ILLEGAL_SUB_MENU_NUMBER("0023","不合法的子菜单按钮个数"),

    /**
     * 不合法的子菜单按钮类型
     */
    ILLEGAL_SUB_MENU_TYPE("0024","不合法的子菜单按钮类型"),

    /**
     * 不合法的子菜单按钮名字长度
     */
    ILLEGAL_SUB_MENU_LENTH("0025","不合法的子菜单按钮名字长度"),

    /**
     * 不合法的子菜单按钮KEY长度
     */
    ILLEGAL_SUB_MENU_KEY_LENTH("0026","不合法的子菜单按钮KEY长度"),

    /**
     * 不合法的子菜单按钮URL长度
     */
    ILLEGAL_SUB_MENU_URL_LENTH("0027","不合法的子菜单按钮URL长度"),

    /**
     * 不合法的自定义菜单使用用户
     */
    ILLEGAL_MENU_USER("0028","不合法的自定义菜单使用用户"),

    /**
     * 不合法的oauth_code
     */
    ILLEGAL_OAUTH_CODE("0029","不合法的oauth_code"),

    /**
     * 不合法的refresh_token
     */
    ILLEGAL_REFRESH_TOKEN("0030","不合法的refresh_token"),

    /**
     * 不合法的openid列表
     */
    ILLEGAL_OPENID_LIST("0031","不合法的openid列表"),

    /**
     * 不合法的openid列表长度
     */
    ILLEGAL_OPENID_LIST_LENTH("0032","不合法的openid列表长度"),

    /**
     * 不合法的请求字符
     */
    ILLEGAL_REQUEST_STRING("0033","不合法的请求字符"),

    /**
     * 不合法的参数
     */
    ILLEGAL_PARAM("0035","不合法的参数"),

    /**
     * 不合法的请求格式
     */
    ILLEGAL_REQUEST_TYPE("0038","不合法的请求格式"),

    /**
     * 不合法的URL长度
     */
    ILLEGAL_URL_LENTH("0039","不合法的URL长度"),

    /**
     * 不合法的分组id
     */
    ILLEGAL_GROUP_ID("0050","不合法的分组id"),

    /**
     * 分组名字不合法
     */
    ILLEGAL_GROUP_NAME("0051","分组名字不合法"),

    /**
     * 缺少access_token参数
     */
    NO_ACCESS_TOKEN("1001","缺少access_token参数"),

    /**
     * 缺少appid参数
     */
    NO_APPID("1002","缺少appid参数"),

    /**
     * 缺少refresh_token参数
     */
    NO_REFRESH_TOKEN("1003","缺少refresh_token参数"),

    /**
     * 缺少secret参数
     */
    NO_SECRET("1004","缺少secret参数"),

    /**
     * 缺少多媒体文件数据
     */
    NO_MEDIA_DATA("1005","缺少多媒体文件数据"),

    /**
     * 缺少media_id参数
     */
    NO_MEDIA_ID("1006","缺少media_id参数"),

    /**
     * 缺少子菜单数据
     */
    NO_SUB_MENU_DATA("1007","缺少子菜单数据"),

    /**
     * 缺少oauth code
     */
    NO_OAUTH_CODE("1008","缺少oauth code"),

    /**
     * 缺少openid
     */
    NO_OPEN_ID("1009","缺少openid"),

    /**
     * access_token超时
     */
    ACCESS_TOKEN_TIMEOUT("2001","access_token超时"),

    /**
     * refresh_token超时
     */
    REFRESH_TOKEN_TIMEOUT("2002","refresh_token超时"),

    /**
     * oauth_code超时
     */
    OAUTH_CODE_TIMEOUT("2003","oauth_code超时"),

    /**
     * 需要GET请求
     */
    NEED_REQUEST_GET("3001","需要GET请求"),

    /**
     * 需要POST请求
     */
    NEED_REQUEST_POST("3002","需要POST请求"),

    /**
     * 需要HTTPS请求
     */
    NEED_REQUEST_HTTPS("3003","需要HTTPS请求"),

    /**
     * 需要接收者关注
     */
    NEED_USER_FOLLOW("3004","需要接收者关注"),

    /**
     * 需要好友关系
     */
    NEED_FRIEND("3005","需要好友关系"),

    /**
     * 多媒体文件为空
     */
    MEDIA_FILE_IS_NULL("4001","多媒体文件为空"),

    /**
     * POST的数据包为空
     */
    POST_DATA_IS_NULL("4002","POST的数据包为空"),

    /**
     * 图文消息内容为空
     */
    NEWS_MESSAGE_IS_NULL("4003","图文消息内容为空"),

    /**
     * 文本消息内容为空
     */
    TEXT_MESSAGE_IS_NULL("4004","文本消息内容为空"),

    /**
     * 多媒体文件大小超过限制
     */
    MEDIA_DATA_OVER_LIMIT("5001","多媒体文件大小超过限制"),

    /**
     * 消息内容超过限制
     */
    MESSAGE_CONTENT_OVER_LIMIT("5002","消息内容超过限制"),

    /**
     * 标题字段超过限制
     */
    TITLE_OVER_LIMIT("5003","标题字段超过限制"),

    /**
     * 描述字段超过限制
     */
    DESCRIPTION_OVER_LIMIT("5004","描述字段超过限制"),

    /**
     * 链接字段超过限制
     */
    LINK_OVER_LIMIT("5005","链接字段超过限制"),

    /**
     * 图片链接字段超过限制
     */
    PICTURE_LINK_OVER_LIMIT("5006","图片链接字段超过限制"),

    /**
     * 语音播放时间超过限制
     */
    VOICE_TIME_OVER_LIMIT("5007","语音播放时间超过限制"),

    /**
     * 图文消息超过限制
     */
    NEWS_MESSAGE_OVER_LIMIT("5008","图文消息超过限制"),

    /**
     * 接口调用超过限制
     */
    INTERFACE_OVER_LIMIT("5009","接口调用超过限制"),

    /**
     * 创建菜单个数超过限制
     */
    MENU_OVER_LIMIT("5010","创建菜单个数超过限制"),

    /**
     * 回复时间超过限制
     */
    REVIEW_TIME_OVER_LIMIT("5015","回复时间超过限制"),

    /**
     * 系统分组，不允许修改
     */
    NO_MODIFY_SYSTEM_GROUP("5016","系统分组，不允许修改"),

    /**
     * 分组名字过长
     */
    GROUP_NAME_TOO_LONG("5017","分组名字过长"),

    /**
     * 分组数量超过上限
     */
    GROUP_COUNT_TOO_MANY("5018","分组数量超过上限"),

    /**
     * 不存在媒体数据
     */
    NOT_EXIST_MEDIA_DATA("6001","不存在媒体数据"),

    /**
     * 不存在的菜单版本
     */
    NOT_EXIST_MENU_VERSION("6002","不存在的菜单版本"),

    /**
     * 不存在的菜单数据
     */
    NOT_EXIST_MENU_DATA("6003","不存在的菜单数据"),

    /**
     * 不存在的用户
     */
    NOT_EXIST_USER("6004","不存在的用户"),

    /**
     * 解析JSON/XML内容错误
     */
    JSON_OR_XML_ERROR("7001","解析JSON/XML内容错误"),

    /**
     * api功能未授权
     */
    API_NOT_ALLOW_CALL("8001","api功能未授权"),

    /**
     * 用户未授权该api
     */
    USER_NOT_ALLOW_API("50001","用户未授权该api"),

    /**
     * 无效的参数
     */
    INVALID_PARAM("61451","无效的参数"),

    /**
     * 无效的参数
     */
    OTHER_ERROR("99999","其他错误"),
   //-----------------富友返回类型--------------------
    /**
     * 接口请求成功
     */
    REQ_SUCCESS("0000","请求成功"),

    /**
     * 与绑定IP不符
     */
    IP_ERROR_MSG("1902","与绑定IP不符"),
    
    /**
     * 系统异常
     */
    NOTICE_EX("1903","通知失败"),
    
    /**
     * 请求信息有误
     */
    PARAM_EX("1906","请求信息有误"),
    
    /**
     * 签名失败
     */
    TOKEN_FAIL("1006","签名失败"),
    
    /**
     * http异常
     */
    HTTP_EX("1999","http异常"),
    
    /**
     * 系统异常
     */
    SYSTEM_EX("1099","系统异常");
    
    
     
	 String code;
	
	 String msg;
	
	ResultType(String code,String msg){
		this.code = code;
		this.msg = msg;
	}
	/**
     * 通过code得到返回结果对象
     *
     * @param code 结果码
     * @return 结果枚举对象
     */
    public static ResultType get(String code) {
        BeanUtil.requireNonNull(code, "code is null");
        ResultType[] list = values();
        for (ResultType resultType : list) {
            if (code.equals(resultType.getCode().toString())) {
                return resultType;
            }
        }
        return null;
    }
	public String getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
	
	@Override
    public String toString() {
        return "ResultType{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}

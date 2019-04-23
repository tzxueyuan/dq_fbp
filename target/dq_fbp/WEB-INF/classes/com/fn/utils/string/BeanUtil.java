package com.fn.utils.string;


import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * 对象常用方法工具类
 *
 * @author peiyu
 */
public final class BeanUtil {

    /**
     * 此类不需要实例化
     */
    private BeanUtil() {
    }

    /**
     * 判断对象是否为null
     *
     * @param object 需要判断的对象
     * @return 是否为null
     */
    public static boolean isNull(Object object) {
        return null == object;
    }

    /**
     * 判断对象是否不为null
     *
     * @param object 需要判断的对象
     * @return 是否不为null
     */
    public static boolean nonNull(Object object) {
        return null != object;
    }

    /**
     * 判断对象是否为空，如果为空，直接抛出异常
     *
     * @param object       需要检查的对象
     * @param errorMessage 异常信息
     * @return 非空的对象
     */
    public static Object requireNonNull(Object object, String errorMessage) {
        if (null == object) {
            throw new NullPointerException(errorMessage);
        }
        return object;
    }
    
    public static <T> T toBean(String jsonStr, Class<T> beanClass) {
		if (StringUtils.isBlank(jsonStr)) {
			return null;
		}
		JSONObject jo = JSON.parseObject(jsonStr);
		
        jo.put(JSON.DEFAULT_TYPE_KEY, beanClass.getName());
        return JSON.parseObject(jo.toJSONString(), beanClass);
	}
}

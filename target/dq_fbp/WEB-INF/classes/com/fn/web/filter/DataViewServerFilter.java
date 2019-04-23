package com.fn.web.filter;

import java.io.IOException;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringEscapeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DataViewServerFilter implements Filter {
	
	private static final Logger log = LoggerFactory.getLogger(DataViewServerFilter.class);
	
	/**
	 * Default constructor.
	 */
	public DataViewServerFilter() {
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) arg0;

		// 打印请求url和请求参数
		Map<String, String[]> map = request.getParameterMap();
		log.info("url=" + request.getRequestURI());
		for (Map.Entry<String, String[]> entry : map.entrySet()) {
			for (String str : entry.getValue()) {
				str = new String(str.getBytes("iso-8859-1"), "utf-8");
				log.info("====================" + entry.getKey() + ":"
						+ str + "====================");
				str = StringEscapeUtils.escapeHtml4(str);
			}
		}
		chain.doFilter(arg0, arg1);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
	}

}

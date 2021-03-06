package com.fixedassetms.biz;

import com.fixedassetms.entity.Manager;

/**
 * 固定资产领用与归还接口
 * @author zhaohui
 *	create on 2016-7-15
 */
public interface LendOrReturn {
	/**
	 * 固定资产领用方法
	 * @param manager 记录领用操作的管理员
	 */
	void aLend(Manager manager);
	/**
	 * 打印固定资产领用情况
	 */
	void sLend();
	/**
	 * 固定资产归还方法
	 * @param manager 记录领用操作的管理员
	 */
	void aRet(Manager manager);
	/**
	 * 打印固定资产归还情况
	 */
	void sRet();
}

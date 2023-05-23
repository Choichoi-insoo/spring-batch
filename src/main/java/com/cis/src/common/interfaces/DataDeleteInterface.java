package com.cis.src.common.interfaces;
/**
 * 
 * 데이터베이스 Delete 추상화 객체
 * @author PC-1
 *
 */
public interface DataDeleteInterface <T>{

	void delete(T t);
	
}

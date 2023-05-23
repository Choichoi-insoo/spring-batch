package com.cis.src.common.interfaces;
/**
 * 
 * 데이터 베이스 업데이트 추상화 객체 interface 
 * 
 * @author PC-1
 *
 * @param <T>
 */
public interface DataUpdateInterface <T>{
	
	void update(T t); 

}

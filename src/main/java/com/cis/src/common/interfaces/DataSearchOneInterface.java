package com.cis.src.common.interfaces;

/**
 * 
 * 검색에 대한 추상화 
 * 1개의 객체를 리턴하여 처리 하는 클레스 
 * 
 * @author PC-1
 *
 */
public interface DataSearchOneInterface <T>{
	T selectOne (T t);
}

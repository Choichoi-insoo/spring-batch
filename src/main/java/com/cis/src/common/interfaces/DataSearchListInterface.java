package com.cis.src.common.interfaces;

import java.util.List;

/**
 * 
 * 검색에 대한 추상화 
 * 여러개의 객체를 리턴하여 처리 하는 클레스 
 * 
 * @author PC-1
 *
 */
public interface DataSearchListInterface <T>{
	List<T> selectList (T t);
}

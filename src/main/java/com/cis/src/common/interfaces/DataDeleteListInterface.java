package com.cis.src.common.interfaces;

import java.util.List;

/**
 * 
 * 데이터 베이스 delete 추상화 List 객체를 받아 여러 아이템을 한번에 처리 하기 위한 추상화 객체
 * @author PC-1
 *
 * @param <T>
 */
public interface DataDeleteListInterface <T> {
	void deleteList(List<T> list);
}

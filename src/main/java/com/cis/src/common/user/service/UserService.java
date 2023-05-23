package com.cis.src.common.user.service;

import com.cis.src.common.interfaces.DataInsertionInterface;
import com.cis.src.common.interfaces.DataSearchOneInterface;
import com.cis.src.common.user.vo.UserVO;

public interface UserService extends DataInsertionInterface<UserVO>, DataSearchOneInterface<UserVO>{

}

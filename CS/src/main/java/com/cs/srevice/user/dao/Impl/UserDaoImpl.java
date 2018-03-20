package com.cs.srevice.user.dao.Impl;

import com.alibaba.fastjson.JSONObject;
import com.cs.srevice.user.dao.UserDao;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public String userLogin(String userName, Long password) {
        Map map=new HashMap();
        map.put("a","成功");
        map.put("b","成功");
        map.put("c","成功");
        JSONObject jsons = new JSONObject();
        return jsons.toJSONString(map);
    }
}

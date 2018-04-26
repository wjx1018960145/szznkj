package com.szzn.server;

import javax.servlet.http.HttpServletRequest;

import com.szzn.mode.RollList;
public abstract interface RollService {
public void add(RollList list) throws Exception;

public String queryAll()throws Exception;

public String findAll()throws Exception;

public String add(HttpServletRequest request)throws Exception;

public String update(HttpServletRequest request)throws Exception;

public String delete(HttpServletRequest request)throws Exception;
}

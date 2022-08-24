package com.programmers.java.chap1.item6.object_poll;

import java.util.ArrayList;
import java.util.List;

public class SampleObjectPool<T> {

    private List<T> pools = new ArrayList<>();
    private Class<T> classObj;
    private int maxPoolSize;

    public SampleObjectPool(Class<T> classObj, int maxPoolSize) {
        this.classObj = classObj;
        this.maxPoolSize = maxPoolSize;
    }


    //객체 생성
    public T borrowObject() throws InstantiationException, IllegalAccessException {

        //풀사이즈 초과
        if (pools.size() > maxPoolSize) {
            throw new PoolSizeOutException("PoolSizeOutException");
        }

        T newInstance = classObj.newInstance();
        pools.add(newInstance);
        return newInstance;
    }


    //객체 반환
    public boolean returnObject(T obj) {
        return pools.remove(obj);
    }


    //객체 유효성 검사 (풀에 있는 객체인지)
    public boolean isValidateObject(T obj) {
        for (T data : pools) {
            if (data != null && data.equals(obj)) {
                return true;
            }
        }
        return false;
    }


    public T getObject() {

        if (pools.size() < 1) {
            return null;
        }

        //Top Pop
        T instance = pools.get(pools.size() - 1);
        returnObject(instance);

        return instance;
    }


    static class PoolSizeOutException extends RuntimeException {

        public PoolSizeOutException(String message) {
            super(message);
        }

    }

}

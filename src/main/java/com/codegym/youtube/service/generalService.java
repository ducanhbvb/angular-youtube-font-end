package com.codegym.youtube.service;

import java.util.List;

public interface generalService <T>{
    List<T> findAllHaveBusiness();

    T findByIdHaveBusiness(Long id);

    void saveHaveBusiness(T t);

    void removeHaveBusiness(Long id);
}

package com.acheron.service.mapper;

public interface Mapper<F,T>{

    T mapTo(F object);
    F mapFrom(T object);



}

package com.foodList.foodList.Service;

import java.util.List;

public interface BaseService<T> {

    List<T> getAll();

    T add(T data);
}

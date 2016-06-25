package com.otms.newcomer.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T, PK extends Serializable>{

    public T load(PK id);

    public T get(PK id);

    public List<T> findAll();

    public void persist(T entity);

    public PK save(T entity);

    public void saveOrUpdate(T entity);

    public void delete(PK id);

    public void flush();

}
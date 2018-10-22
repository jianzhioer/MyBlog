package com.lxf.blog.dao.base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * @ClassName: BaseDao
 * @Description: TODO
 * @Author: sx-9530
 * @CreateDate: 18-10-22
 * @Version: 1.0
 */
@Repository
public class BaseDao<T,PK extends Serializable> {

    @Resource
    private SessionFactory sessionFactory;

    private Class<T> clazz;

    public BaseDao() {
    }

    public BaseDao(Class<T> clazz) {
        this.clazz = clazz;
    }
    public Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }
    @SuppressWarnings("unchecked")
    public T load(Long id) {
        return (T) getCurrentSession().load(clazz,id);
    }
    @SuppressWarnings("unchecked")
    public T get(Long id) {
        return (T) getCurrentSession().get(clazz,id);
    }

    public List<T> findAll() {
        return null;
    }

    public void persist(T object) {
        getCurrentSession().persist(object);
    }

    public Long save(T object) {
        return (Long)getCurrentSession().save(object);
    }

    public void saveOrUpdate(T object) {
        getCurrentSession().saveOrUpdate(object);

    }

    public void delete(Long id) {
        T object = load(id);
        getCurrentSession().delete(object);
    }

    public void flush() {
        getCurrentSession().flush();

    }
}

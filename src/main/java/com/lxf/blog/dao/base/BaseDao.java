package com.lxf.blog.dao.base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
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
    @PersistenceContext(unitName = "entityManagerFactory")
    public EntityManager em;
    private Class<T> clazz;

    public BaseDao() {
    }

    public BaseDao(Class<T> clazz) {
        this.clazz = clazz;
    }

    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }

    public T create(T object) {
        em.persist(object);
        em.flush();
        return object;
    }

    public void removeById(PK id) {
        T obj = get(id);
        if (null != obj) {
            remove(obj);
        }
    }

    public void remove(T object) {
        em.remove(em.merge(object));
    }

    public T createOrUpdate(T object) {
        em.merge(object);
        em.flush();
        return object;
    }

    public T get(PK id) {
        return em.find(clazz, id);
    }

    public List<T> getAll() {
        CriteriaQuery<T> query = em.getCriteriaBuilder().createQuery(clazz);
        return em.createQuery(query.select(query.from(clazz))).getResultList();
    }

    public void removeAll() {
        List<T> entities = getAll();
        for (T entity : entities) {
            remove(entity);
        }
    }

    public void update(T object) {
        em.merge(object);
        em.flush();
    }

    @SuppressWarnings("unchecked")
    protected T getSingleResult(Query query) {
        List<T> resultList =  query.getResultList();
        T result = null;
        if (!resultList.isEmpty()) {
            result = resultList.get(0);
        }

        return result;
    }

}

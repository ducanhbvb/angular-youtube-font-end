package com.codegym.youtube.repository;

import com.codegym.youtube.model.Video;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;


@Transactional
public class VideoRepositoryImpl implements VideoRepository {
    @PersistenceContext
    private EntityManager em;
    @Override
    public List<Video> findAll() {
        TypedQuery<Video> query = em.createQuery("select v from Video v",Video.class);
        return query.getResultList();
    }

    @Override
    public Video findById(Long id) {
        TypedQuery<Video> query = em.createQuery("select v from  Video v where v.id= :id" , Video.class);
        query.setParameter("id",id);
        try {
            return query.getSingleResult();
        } catch (NoResultException e){
            return null;
        }
    }

    @Override
    public void save(Video video) {
        if (video.getId() != null){
            em.merge(video);
        } else {
            em.persist(video);
        }
    }

    @Override
    public void remove(Long id) {
        Video video = findById(id);
        if (video != null){
            em.remove(video);
        }
    }
}

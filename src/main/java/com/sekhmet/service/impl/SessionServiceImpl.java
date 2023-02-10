package com.sekhmet.service.impl;

import com.sekhmet.models.Session;
import com.sekhmet.repository.SessionRepository;
import com.sekhmet.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionServiceImpl implements SessionService {
    @Autowired
    public SessionRepository sessionRepo;
    @Override
    public void createSession(Session session) {
        sessionRepo.save(session);
    }

    @Override
    public Session getSession(Long id) {
        return null;
    }

    @Override
    public List<Session> getAllSessions() {
        return null;
    }

    @Override
    public Session updateSession(Long id, Session session) {
        return null;
    }

    @Override
    public void deleteSession(Long id) {

    }
}

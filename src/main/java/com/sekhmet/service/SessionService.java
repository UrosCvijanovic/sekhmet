package com.sekhmet.service;

import com.sekhmet.models.Session;

import java.util.List;

public interface SessionService {
    void createSession(Session session);
    Session getSession(Long id);
    List<Session> getAllSessions();
    Session updateSession(Long id, Session session);
    void deleteSession(Long id);
}

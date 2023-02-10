package com.sekhmet.repository;

import com.sekhmet.models.Course;
import com.sekhmet.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}

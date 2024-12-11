package com.danieltessi.spring_specifications_with_query.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.danieltessi.spring_specifications_with_query.domain.Repere;

public interface RepereRepository extends JpaRepository<Repere, Long> {

}

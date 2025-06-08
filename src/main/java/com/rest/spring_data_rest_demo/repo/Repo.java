package com.rest.spring_data_rest_demo.repo;

import com.rest.spring_data_rest_demo.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<JobPost,Integer> {
}

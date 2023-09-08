package com.shubham.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shubham.entity.Movie;
@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

}

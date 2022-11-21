package com.k8s.sample.repository;

import com.k8s.sample.entity.TbUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TbUserRepository extends JpaRepository<TbUser, Integer> {}

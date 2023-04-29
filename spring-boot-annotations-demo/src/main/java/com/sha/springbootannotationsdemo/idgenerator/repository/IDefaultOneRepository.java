package com.sha.springbootannotationsdemo.idgenerator.repository;

import com.sha.springbootannotationsdemo.idgenerator.model.DefaultOne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDefaultOneRepository extends JpaRepository<DefaultOne, Long> {
}

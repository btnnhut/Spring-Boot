package com.sha.springbootannotationsdemo.idgenerator.repository;

import com.sha.springbootannotationsdemo.idgenerator.model.IdentityOne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IIdentityOneRepository extends JpaRepository<IdentityOne, Long> {
}

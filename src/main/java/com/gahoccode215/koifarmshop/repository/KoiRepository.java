package com.gahoccode215.koifarmshop.repository;

import com.gahoccode215.koifarmshop.pojo.Koi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KoiRepository extends JpaRepository<Koi, Long> {
}

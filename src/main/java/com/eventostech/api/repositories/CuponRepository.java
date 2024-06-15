package com.eventostech.api.repositories;

import com.eventostech.api.domain.cupon.Cupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CuponRepository extends JpaRepository<Cupon, UUID> {
}

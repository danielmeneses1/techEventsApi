package com.eventostech.api.repositories;

import com.eventostech.api.domain.Address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddresRepository extends JpaRepository<Address, UUID> {
}

package com.example.cinema.dao;

import com.example.cinema.Entity.Cinema;
import com.example.cinema.Entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TicketRepository extends JpaRepository<Ticket,Long> {
}

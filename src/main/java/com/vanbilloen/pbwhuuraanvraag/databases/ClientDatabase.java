package com.vanbilloen.pbwhuuraanvraag.databases;

import com.vanbilloen.pbwhuuraanvraag.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ClientDatabase extends JpaRepository<Client, Long> {

}

package com.vanbilloen.pbwhuuraanvraag.databases;

import com.vanbilloen.pbwhuuraanvraag.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientDatabase extends CrudRepository<Client, Long> {

}

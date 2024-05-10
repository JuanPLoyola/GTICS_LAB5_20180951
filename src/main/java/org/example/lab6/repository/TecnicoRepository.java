package org.example.lab6.repository;


import org.example.lab6.entity.Tecnicos;
import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnicoRepository extends JpaRepository<Tecnicos, Integer> {


}

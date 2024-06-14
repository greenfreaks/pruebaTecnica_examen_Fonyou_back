package com.fonyou.pruebaTecnica_examen_fonYou_back.repository;

import com.fonyou.pruebaTecnica_examen_fonYou_back.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Long> {

}

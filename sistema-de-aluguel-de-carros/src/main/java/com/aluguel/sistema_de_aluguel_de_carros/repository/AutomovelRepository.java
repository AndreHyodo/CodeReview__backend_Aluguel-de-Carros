package com.aluguel.sistema_de_aluguel_de_carros.repository;

import com.aluguel.sistema_de_aluguel_de_carros.model.AutomovelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutomovelRepository extends JpaRepository<AutomovelEntity, Long> {
    List<AutomovelEntity> findByMatricula(String matricula);
    List<AutomovelEntity> findByAno(int ano);
    List<AutomovelEntity> findByMarca(String marca);
    List<AutomovelEntity> findByModelo(String modelo);
    List<AutomovelEntity> findByplaca(String placa);
    List<AutomovelEntity> findByModeloAndAno(String modelo, int ano);



}

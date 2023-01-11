package com.attornatus.avaliacaodesenvolvedor.repositories;

import com.attornatus.avaliacaodesenvolvedor.models.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}

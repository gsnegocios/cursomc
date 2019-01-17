package com.gsnegocios.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gsnegocios.cursomc.domain.Categoria;

@Repository

 public interface  CategoriaRepository  extends JpaRepository <Categoria, Integer>{

}

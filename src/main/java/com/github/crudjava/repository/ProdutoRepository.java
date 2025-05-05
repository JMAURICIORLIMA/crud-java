package com.github.crudjava.repository;

import com.github.crudjava.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {


}

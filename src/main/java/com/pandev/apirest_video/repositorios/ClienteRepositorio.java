package com.pandev.apirest_video.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pandev.apirest_video.modelos.Cliente;

@Repository
public interface ClienteRepositorio extends JpaRepository <Cliente, Long> {
}

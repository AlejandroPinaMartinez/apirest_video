package com.pandev.apirest_video.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pandev.apirest_video.modelos.Cliente;
import com.pandev.apirest_video.repositorios.ClienteRepositorio;

@Service
public class ClienteServicioImpl implements IClienteServicio{

    @Autowired
    ClienteRepositorio clienterepositorio;

    @Override
    public List<Cliente> obtenerTodo() {
        return clienterepositorio.findAll();
    }

    @Override
    public Cliente guardar(Cliente cliente) {
        return clienterepositorio.save(cliente);
    }

    @Override
    public Cliente obtenerPorId(long id) {
        return clienterepositorio.findById(id).orElse(null);
    }

    @Override
    public void eliminar(long id) {
        clienterepositorio.deleteById(id);
    }

}

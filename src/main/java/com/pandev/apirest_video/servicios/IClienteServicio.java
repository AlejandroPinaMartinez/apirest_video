package com.pandev.apirest_video.servicios;

import java.util.List;

import com.pandev.apirest_video.modelos.Cliente;

public interface IClienteServicio {

    public List<Cliente> obtenerTodo();
    public Cliente guardar(Cliente cliente);
    public Cliente obtenerPorId(long id);
    public void eliminar(long id);

}

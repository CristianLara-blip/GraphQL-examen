package com.example.demo.dto;

public record LibroRequest(
        Integer idlibro,
        String titulo,
        String descripcion,
        Integer pagina,
        String edicion,
        Integer autor,
        Integer editorial
) {

}
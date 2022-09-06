package org.jsuccurro.springcloud.msvc.cursos.services;

import org.jsuccurro.springcloud.msvc.cursos.models.Usuario;
import org.jsuccurro.springcloud.msvc.cursos.models.entity.Curso;

import java.util.List;
import java.util.Optional;

public interface CursoService {

    List<Curso> listar();
    Optional<Curso> porId(Long id);
    Optional<Curso> porIdConUsuarios(Long id);
    Curso guardar(Curso curso);
    void eliminar(Long id);

    void eliminarCursoUsuarioPorId(Long id);


    //logica de negocio desde otro servicio
    //3 metodos remotos
    Optional<Usuario> asignarUsuario(Usuario usuario, Long cursoId);
    Optional<Usuario> crearUsuario(Usuario usuario, Long cursoId);
    Optional<Usuario> eliminarUsuario(Usuario usuario, Long cursoId);
}

package com.taller3.taller3.service.impl;

import com.taller3.taller3.Persona;
import com.taller3.taller3.repository.PersonaRepository;
import com.taller3.taller3.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;
    @Override
    public List<Persona> obtenerTodas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona obtenerPorId(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public Persona crearPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona actualizarPersona(Long id, Persona persona) {
        Persona personadb = personaRepository.findById(id).orElse(null);
        if(personadb != null){
            personadb.setNombre(persona.getNombre());
            personadb.setEdad(persona.getEdad());
            return personaRepository.save(personadb);
        }
        return null;
    }

    @Override
    public void eliminarPersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public long contarPersonas() {
        return personaRepository.count();
    }
}

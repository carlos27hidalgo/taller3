package com.taller3.taller3;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_personas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persona {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nombre;
        private int edad;

}

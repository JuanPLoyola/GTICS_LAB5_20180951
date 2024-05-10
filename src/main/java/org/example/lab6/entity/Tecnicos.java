package org.example.lab6.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

@Getter
@Setter
@Entity
@Table(name = "technician")
public class Tecnicos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "technicianID", nullable = false)
    private Integer idTecnico;

    @Column(name = "FirstName", nullable = false, length = 100)
    @NotBlank
    @Size(max = 100, message = "El nombre es muy largo")
    @Size(min = 3, message = "Muy pequeño el nomnre")
    private String nombre;

    @Column(name = "LastName", nullable = false, length = 100)
    @NotBlank
    @Size(max = 99, message = "El apellido es muy largo")
    private String apellido;

    @Column(name = "Dni", nullable = false, length = 8)
    @NotBlank
    @Size(max = 8, message = "El dni es incorrecto")
    @Pattern(regexp = "\\d{8}", message = "El código del colegio debe ser un número entero de 8 digitos")
    private String dni;

    @Column(name = "Phone", nullable = false, length = 9)
    @Size(max = 9, message = "El dni es incorrecto")
    @Pattern(regexp = "\\d{8}", message = "El dni es incorrecto")
    private String celular;

    @Column(name = "Age", nullable = false)
    @NotBlank
    @Digits(integer = 5, fraction = 0, message = "la edad es entera")
    @Max(value = 120, message = "muy viejito")
    @Min(value = 18, message = "tiene que ser mayor de edad")
    private Integer edad;

}

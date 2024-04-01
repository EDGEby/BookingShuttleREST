package by.edge.shuttle.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "shuttle")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shuttle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer capacity;

    @Column(unique = true, nullable = false, length = 50)
    private String licensePlate;

    @Column(nullable = false)
    private String model;

}

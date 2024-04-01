package by.edge.shuttle.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "schedule")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 10)
    private String departureTime;

    @Column(nullable = false, length = 10)
    private String arrivalTime;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;

}

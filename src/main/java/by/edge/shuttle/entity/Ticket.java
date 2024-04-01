package by.edge.shuttle.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Entity
@Table(name = "ticket")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "passenger_id", nullable = false)
    private Passenger passenger;

    @ManyToOne
    @JoinColumn(name = "shuttle_id", nullable = false)
    private Shuttle shuttle;

    @ManyToOne
    @JoinColumn(name = "departure_stop_id", nullable = false)
    private Stop departureStop;

    @ManyToOne
    @JoinColumn(name = "destination_stop_id", nullable = false)
    private Stop destinationStop;

    @Column(nullable = false, length = 10)
    @Temporal(TemporalType.TIME)
    private LocalTime departureTime;

    @Column(nullable = false, length = 10)
    @Temporal(TemporalType.TIME)
    private LocalTime arrivalTime;

}

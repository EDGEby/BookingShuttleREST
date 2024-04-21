package by.edge.shuttle.repository;

import by.edge.shuttle.entity.Driver;
import by.edge.shuttle.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
    public Driver findByEmail(String email);
}

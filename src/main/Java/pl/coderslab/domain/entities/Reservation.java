package pl.coderslab.domain.entities;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name="reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @Size(min = 2, max = 20)
    @NotNull
    private String firstName;

    @Column
    @NotNull
    private LocalDateTime reservationTime;

    @Column(unique = true)
    @Size(min = 1, max = 30)
    @NotNull
    private Integer reservationPeople;

    @Column
    @NotNull
    @Size(max=600)
    private String reservationNote;

    @Column
    @NotNull
    @Size(min = 8, max = 15)
    private Integer reservationTelephoneNumber;

    @PrePersist
    public void prePersist() {
        reservationTime = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDateTime getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(LocalDateTime reservationTime) {
        this.reservationTime = reservationTime;
    }

    public Integer getReservationPeople() {
        return reservationPeople;
    }

    public void setReservationPeople(Integer reservationPeople) {
        this.reservationPeople = reservationPeople;
    }

    public String getReservationNote() {
        return reservationNote;
    }

    public void setReservationNote(String reservationNote) {
        this.reservationNote = reservationNote;
    }

    public Integer getReservationTelephoneNumber() {
        return reservationTelephoneNumber;
    }

    public void setReservationTelephoneNumber(Integer reservationTelephoneNumber) {
        this.reservationTelephoneNumber = reservationTelephoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(reservationTime, that.reservationTime) &&
                Objects.equals(reservationPeople, that.reservationPeople) &&
                Objects.equals(reservationNote, that.reservationNote) &&
                Objects.equals(reservationTelephoneNumber, that.reservationTelephoneNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, firstName, reservationTime, reservationPeople, reservationNote, reservationTelephoneNumber);
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", reservationTime=" + reservationTime +
                ", reservationPeople=" + reservationPeople +
                ", reservationNote='" + reservationNote + '\'' +
                ", reservationTelephoneNumber=" + reservationTelephoneNumber +
                '}';
    }
}

package hiber.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String model;

    @Column
    private String series;

    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
    private User user;

    public Car(String model, String series) {
        this.model = model;
        this.series = series;
    }


    @Override
    public String toString() {
        return "id=" + id +
                ", model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", user=" + user.getFirstName() +
                '}';
    }
}

package com.foodList.foodList.Entitiy;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "soup")
    private String soup;

    @Column(name = "mainDish")
    private String mainDish;

    @Column(name = "optionalMainDish")
    private String optionalMainDish;

    @Column(name = "sideDish")
    private String sideDish;

    @Column(name = "dessert")
    private String dessert;

    @Column(name = "softDrinks")
    private String softDrinks;

    @JsonFormat(pattern = "yyy-MM-dd", shape = JsonFormat.Shape.STRING)
    @Column(name = "date")
    private String date;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(foreignKey = @ForeignKey(name = "CITY_FK"))
    @ToString.Exclude
    private City city;
}

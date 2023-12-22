package com.example.rent2gojavaproject.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;
import org.hibernate.annotations.SQLDelete;
import java.util.List;

@Entity
@Table(name = "customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SQLDelete(sql = "update customers SET IS_ACTIVE = false WHERE id=?")
//@Where(clause = "IS_ACTIVE=true")
@FilterDef(name="isActiveFilterCustomer", parameters=@ParamDef( name="isActive", type=Boolean.class ))
@Filter(name="isActiveFilterCustomer", condition="IS_ACTIVE = :isActive")
public class Customer extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nationality_id", nullable = false, unique = true)
    private String nationalityId;
    @Enumerated(EnumType.STRING)
    @Column(name = "city")
    private City city;
    @Column(name = "district")
    private String district;
    @Column(name = "address")
    private String address;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Rental> rentals;


}

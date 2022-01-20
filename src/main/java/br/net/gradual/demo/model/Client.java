package br.net.gradual.demo.model;

import lombok.*;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CLIENT")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String firstName;
    private String lastName;
    @Transient
    private String fullName;
    private String email;
//    private Date birth;

    public String getFullName() {
        return firstName +" "+lastName;
    }
}

package info.eniso.pharmacare.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.sql.Time;

@Entity
@Data
@AllArgsConstructor
public class Pharmacy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String location;
    @NotEmpty
    @JsonFormat(pattern = "HH:mm")
    private Time openHour;
    @NotEmpty
    @JsonFormat(pattern = "HH:mm")
    private Time closeHour;
    @NotEmpty
    private Boolean workSunday;
    @NotEmpty
    private Boolean workNight;
}

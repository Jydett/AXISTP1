package fr.jydet.business.calendar.beans;

import com.sun.istack.NotNull;
import fr.jydet.core.persistance.Identifiable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Event implements IEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;
    private String description;
    private String location;

    @Basic
    @Temporal(TemporalType.TIME)
    private Date start;

    @Basic
    @Temporal(TemporalType.TIME)
    private Date end;

    private boolean allDay;
}

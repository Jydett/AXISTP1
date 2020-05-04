package fr.jydet.business.calendar.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class RepeatEvent implements IEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String location;

    @Enumerated(EnumType.STRING)
    private Repeat repeatType;

    @Basic
    @Temporal(TemporalType.TIME)
    private Date start;

    @Basic
    @Temporal(TemporalType.TIME)
    private Date end;

    @Basic
    @Temporal(TemporalType.TIME)
    private Date endRepeat;

    private boolean allDay;
}

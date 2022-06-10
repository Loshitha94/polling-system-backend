package lk.ijse.dep8.polling.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Poll extends SuperEntity{
    @Id
    private int id;
    @Column(nullable = false)
    private String title;
    @Column(name = "up_vote",nullable = false)
    private int upVote;
    @Column(name = "down_vote",nullable = false)
    private int downVote;
    @Column(name = "created_by",nullable = false)
    private String createdBy;


}

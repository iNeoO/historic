package fr.gouv.dnum.historic.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import fr.gouv.dnum.historic.model.ActionType;
import fr.gouv.dnum.historic.model.ApplicationType;
import fr.gouv.dnum.historic.model.IHistoric;

@Entity
@Table(name = "historic")
public class HistoricEntity implements IHistoric {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "userId", nullable = false)
  private Long userId;

  @Column(name = "date", nullable = false)
  private Date date;

  @Column(name = "action", nullable = false)
  private ActionType action;

  @Column(name = "application", nullable = false)
  private ApplicationType application;

  @Column(name = "commentaire", nullable = false)
  private String commentaire;

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getUserId() {
    return this.userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public Date getDate() {
    return this.date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public ActionType getAction() {
    return this.action;
  }

  public void setAction(ActionType action) {
    this.action = action;
  }

  public ApplicationType getApplication() {
    return this.application;
  }

  public void setApplication(ApplicationType application) {
    this.application = application;
  }

  public String getCommentaire() {
    return this.commentaire;
  }

  public void setCommentaire(String commentaire) {
    this.commentaire = commentaire;
  }
}

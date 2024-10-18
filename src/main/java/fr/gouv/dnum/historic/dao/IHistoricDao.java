package fr.gouv.dnum.historic.dao;

import java.util.Date;

import fr.gouv.dnum.historic.model.ActionType;

public interface  IHistoricDao {
  Long getId();
  void setId(Long id);
  Long getUserId();
  void setUserId(Long userId);
  Date getDate();
  void setDate(Date date);
  ActionType getAction();
  void setAction(ActionType action);
  String getCommentaire();
  void setCommentaire(String commentaire);
}
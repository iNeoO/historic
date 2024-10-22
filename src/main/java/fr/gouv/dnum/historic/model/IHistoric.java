package fr.gouv.dnum.historic.model;

import java.util.Date;

public interface IHistoric {
  Long getUserId();
  void setUserId(Long userId);
  Date getDate();
  void setDate(Date date);
  ActionType getAction();
  void setAction(ActionType action);
  ApplicationType getApplication();
  void setApplication(ApplicationType application);
  String getCommentaire();
  void setCommentaire(String commentaire);
}

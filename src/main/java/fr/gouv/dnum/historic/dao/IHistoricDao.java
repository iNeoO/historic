package fr.gouv.dnum.historic.dao;

import java.util.List;

import fr.gouv.dnum.historic.entity.HistoricEntity;
import fr.gouv.dnum.historic.model.ApplicationType;
import fr.gouv.dnum.historic.model.IHistoric;

public interface  IHistoricDao <OBJ extends IHistoric> {
  void interfaceToIHistoric(HistoricEntity model);
  HistoricEntity create(IHistoric model);
  List<HistoricEntity> getAll();
  List<HistoricEntity> getByUserId(Long userId);
  List<HistoricEntity> getByApplication(ApplicationType application);
}
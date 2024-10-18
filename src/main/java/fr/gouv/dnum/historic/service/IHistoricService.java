package fr.gouv.dnum.historic.service;

import java.util.List;

import fr.gouv.dnum.historic.model.ApplicationType;
import fr.gouv.dnum.historic.model.IHistoric;

public interface  IHistoricService {
  IHistoric create(IHistoric historic);
  List<IHistoric> getAll();
  List<IHistoric> getByUserId(Long userId);
  List<IHistoric> getByApplication(ApplicationType application);
}

package fr.gouv.dnum.historic.dao.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.gouv.dnum.historic.dao.business.HistoricDaoImp;
import fr.gouv.dnum.historic.model.ApplicationType;
import fr.gouv.dnum.historic.model.IHistoric;
import fr.gouv.dnum.historic.service.IHistoricService;

@Service
public class IHistoricServiceImp implements IHistoricService {

  @Autowired
  private HistoricDaoImp historicDaoImp;

  List<IHistoric> getAll() {
    return historicDaoImp.getAll();
  }

  List<IHistoric> getByUserId(Long userId) {
    return historicDaoImp.getByUserId(userId);
  }

  List<IHistoric> getByApplication(ApplicationType application) {
    return historicDaoImp.getByApplication(application);
  }

  @Override
  public IHistoric create(IHistoric historic) {
    return historicDaoImp.create(historic);
  }
}

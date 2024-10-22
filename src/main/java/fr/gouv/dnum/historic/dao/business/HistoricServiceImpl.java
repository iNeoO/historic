package fr.gouv.dnum.historic.dao.business;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.gouv.dnum.historic.model.ApplicationType;
import fr.gouv.dnum.historic.model.IHistoric;
import fr.gouv.dnum.historic.service.IHistoricService;

@Service
public class HistoricServiceImpl<OBJ extends IHistoric> implements IHistoricService {

  @Autowired
  private HistoricDaoImpl historicDaoImpl;

  @Override
  public List<IHistoric> getAll() {
    return historicDaoImpl.getAll().stream().map(it -> (IHistoric) it).collect(Collectors.toList());
  }

  @Override
  public List<IHistoric> getByUserId(Long userId) {
    return historicDaoImpl.getByUserId(userId).stream().map(it -> (IHistoric) it).collect(Collectors.toList());
  }

  @Override
  public List<IHistoric> getByApplication(ApplicationType application) {
    return historicDaoImpl.getByApplication(application).stream().map(it -> (IHistoric) it).collect(Collectors.toList());
  }

  @Override
  public IHistoric create(IHistoric historic) {
    return historicDaoImpl.create(historic);
  }
}

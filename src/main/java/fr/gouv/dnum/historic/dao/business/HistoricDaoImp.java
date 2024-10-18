package fr.gouv.dnum.historic.dao.business;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.gouv.dnum.historic.entity.HistoricEntity;
import fr.gouv.dnum.historic.model.ApplicationType;
import fr.gouv.dnum.historic.model.IHistoric;
import fr.gouv.dnum.historic.repository.HistoricRepository;

@Component
public class HistoricDaoImp {

  @Autowired
  HistoricRepository historicRepository;

  public IHistoric getInstance() {
    return new HistoricEntity();
  }

  protected HistoricRepository getRepository() {
    return historicRepository;
  }

  public HistoricEntity interfaceToEntity(IHistoric model) {
      IHistoric historic = getInstance();
      historic.setUserId(model.getUserId());
      historic.setDate(model.getDate());
      historic.setAction(model.getAction());
      historic.setApplication(model.getApplication());
      historic.setCommentaire(model.getCommentaire());
      return (HistoricEntity) historic;
  }

  public HistoricEntity create(IHistoric model) {
    HistoricEntity historicEntity = interfaceToEntity(model);
    return historicRepository.save(historicEntity);
  }

  public List<HistoricEntity> getAll() {
    return StreamSupport.stream(historicRepository.findAll().spliterator(), false)
      .collect(Collectors.toList());
  }

  public List<HistoricEntity> getByUserId(Long userId) {
    return historicRepository.getByUserId(userId);
  }

  public List<HistoricEntity> getByApplication(ApplicationType application) {
    return historicRepository.getByApplication(application);
  }

}
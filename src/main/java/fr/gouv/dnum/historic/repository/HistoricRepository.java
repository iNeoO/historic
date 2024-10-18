package fr.gouv.dnum.historic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.gouv.dnum.historic.entity.HistoricEntity;
import fr.gouv.dnum.historic.model.ApplicationType;

@Repository
public interface HistoricRepository extends CrudRepository<HistoricEntity, Long> {
  @Query("SELECT historic from HistoricEntity historic where historic.userId = :userId")
  List<HistoricEntity> getByUserId(@Param("userId") Long userId);

  @Query("SELECT historic from HistoricEntity historic where historic.application = :application")
  List<HistoricEntity> getByApplication(@Param("application") ApplicationType application);
}

package com.sky.tv.comics.repository.custom;

import com.sky.tv.comics.entity.ComicAnalysis;
import com.sky.tv.comics.entity.custom.TopComicView;
import jakarta.persistence.EntityManager;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomComicAnalysisRepoImpl implements CustomComicAnalysisRepo {

  @Autowired
  private EntityManager entityManager;

  @Override
  public List<TopComicView> getComicAnalysisByView(String startDate, String endDate, int limit) {
    String formQuery = "SELECT SUM(cv.numberRead) AS numberRead, cv.comic as comic FROM ComicAnalysis cv WHERE cv.startDate > %s AND cv.endDate < %s GROUPING_BY(cv.comic) ORDER BY cv.numberRead";
    String query = String.format(formQuery, startDate, endDate);
    return entityManager.createQuery(query, TopComicView.class).setMaxResults(limit).getResultList();
  }

  @Override
  public List<ComicAnalysis> getComicAnalysisByLike(String startDate, String endDate, int limit) {
    return null;
  }
}

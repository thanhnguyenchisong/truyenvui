package com.sky.tv.comics.repository.extend;

import com.sky.tv.comics.entity.ComicAnalysis;
import com.sky.tv.comics.entity.custom.TopComic;
import java.util.List;

public class CustomComicAnalysisRepoImpl implements CustomComicAnalysisRepo{
    /*  @Autowired
  private EntityManager entityManager;*/

    @Override
    public List<TopComic> getComicAnalysisByView(String startDate, String endDate, int limit) {
  /*  String formQuery = "SELECT SUM(cv.numberView) AS numberView, SUM(cv.numberLike) as numberLike, cv.comic as comic FROM ComicAnalysis cv WHERE cv.startDate > %s AND cv.endDate < %s GROUPING_BY(comic) ORDER BY numberRead";
    String query = String.format(formQuery, startDate, endDate);
    return entityManager.createQuery(query, TopComic.class).setMaxResults(limit).getResultList();
  */
        return null;
    }

    @Override
    public List<ComicAnalysis> getComicAnalysisByLike(String startDate, String endDate, int limit) {
        return null;
    }
}

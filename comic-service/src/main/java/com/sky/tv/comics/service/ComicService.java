package com.sky.tv.comics.service;

import com.sky.tv.comics.dto.ComicDTO;
import com.sky.tv.comics.dto.paging.PagingResponse;

import java.util.List;

public interface ComicService extends BaseService<ComicDTO> {

    /**
     * Get random comic new
     * @param numberOfComic
     */
    List<ComicDTO> getRandomComicNew(int numberOfComic);

    /**
     * Get random some love comic
     * @param numberOfComic
     */
    List<ComicDTO> getRandomLoveComic(int numberOfComic);

    /**
     * Get random some adventure comic
     * @param comicOfComic
     */
    List<ComicDTO> getRandomAdventureComic(int comicOfComic);

    /**
     * Get randome some eastern comic
     * @param numberOfComic
     */
    List<ComicDTO> getEasternComic(int numberOfComic);

    /**
     * Get random comics
     * @param numberOfComic
     */
    List<ComicDTO> getRandomComic(int numberOfComic);

    /**
     *
     * @param pageNumber
     * @param pageSize
     * @param categories
     * @return
     */
    PagingResponse<ComicDTO> getComicByCategories(int pageNumber, int pageSize, List<String> categories);

    /**
     *
     * @param pageNumber
     * @param pageSize
     * @param category
     * @return
     */
    PagingResponse<ComicDTO> getComicByCategory(int pageNumber, int pageSize, String category);

    /**
     *
     * @param pageNumber
     * @param pageSize
     * @return
     */
    PagingResponse<ComicDTO> getComics(int pageNumber, int pageSize);

}

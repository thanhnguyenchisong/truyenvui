package com.sky.tv.comics.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity(name = "r_chapter")
public class Chapter extends UUIDEntity {

  private int number;
  private String name;
  @Column(name = "view_number")
  private int viewNumber;
  @Column(name = "avatar_url")
  private String avatarUrl;
  @Column(name = "photo_number")
  private int photoNumber;
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "r_comic", nullable = false)
  private Comic comic;
}

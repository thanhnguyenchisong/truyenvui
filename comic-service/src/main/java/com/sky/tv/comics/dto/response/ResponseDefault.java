package com.sky.tv.comics.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResponseDefault {
  CREATED("Create successfully"),
  UPDATED("Update successfully");
  private String message;
}

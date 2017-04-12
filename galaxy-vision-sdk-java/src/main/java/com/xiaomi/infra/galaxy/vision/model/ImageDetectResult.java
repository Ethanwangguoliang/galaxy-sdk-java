package com.xiaomi.infra.galaxy.vision.model;

public class ImageDetectResult {
  private DetectFacesResult detectFacesResult;
  private DetectLabelsResult detectLabelsResult;
  
  public DetectFacesResult getDetectFacesResult() {
    return detectFacesResult;
  }

  public void setDetectFacesResult(DetectFacesResult detectFacesResult) {
    this.detectFacesResult = detectFacesResult;
  }

  public DetectLabelsResult getDetectLabelsResult() {
    return detectLabelsResult;
  }

  public void setDetectLabelsResult(DetectLabelsResult detectLabelsResult) {
    this.detectLabelsResult = detectLabelsResult;
  }
}

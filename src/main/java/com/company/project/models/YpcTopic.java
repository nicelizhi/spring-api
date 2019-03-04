package com.company.project.models;

import javax.persistence.*;

@Entity
@Table (name = "ypc_topic", schema="SIMULATE")
public class YpcTopic {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column (name = "topic_id")
  private long topicId;
  @Column (name = "title")
  private String title;
  @Column (name = "intro")
  private String intro;
  @Column (name = "start_time")
  private long startTime;
  @Column (name = "end_time")
  private long endTime;
  @Column (name = "data")
  private String data;
  @Column (name = "template")
  private String template;
  @Column (name = "css")
  private String css;
  @Column (name = "topic_img")
  private String topicImg;
  @Column (name = "title_pic")
  private String titlePic;
  @Column (name = "base_style")
  private String baseStyle;
  @Column (name = "htmls")
  private String htmls;
  @Column (name = "keywords")
  private String keywords;
  @Column (name = "description")
  private String description;


  public long getTopicId() {
    return topicId;
  }

  public void setTopicId(long topicId) {
    this.topicId = topicId;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getIntro() {
    return intro;
  }

  public void setIntro(String intro) {
    this.intro = intro;
  }


  public long getStartTime() {
    return startTime;
  }

  public void setStartTime(long startTime) {
    this.startTime = startTime;
  }


  public long getEndTime() {
    return endTime;
  }

  public void setEndTime(long endTime) {
    this.endTime = endTime;
  }


  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }


  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }


  public String getCss() {
    return css;
  }

  public void setCss(String css) {
    this.css = css;
  }


  public String getTopicImg() {
    return topicImg;
  }

  public void setTopicImg(String topicImg) {
    this.topicImg = topicImg;
  }


  public String getTitlePic() {
    return titlePic;
  }

  public void setTitlePic(String titlePic) {
    this.titlePic = titlePic;
  }


  public String getBaseStyle() {
    return baseStyle;
  }

  public void setBaseStyle(String baseStyle) {
    this.baseStyle = baseStyle;
  }


  public String getHtmls() {
    return htmls;
  }

  public void setHtmls(String htmls) {
    this.htmls = htmls;
  }


  public String getKeywords() {
    return keywords;
  }

  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}

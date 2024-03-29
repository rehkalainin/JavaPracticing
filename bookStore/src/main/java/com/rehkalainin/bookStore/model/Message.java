package com.rehkalainin.bookStore.model;


import javax.persistence.*;

@Entity
public class Message
{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String text;
  private String tag;

  public Message()
  {
  }

  public Message(String text, String tag)
  {
    this.text = text;
    this.tag = tag;
  }

  public void setText(String text)
  {
    this.text = text;
  }

  public String getText()
  {
    return text;
  }

  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public String getTag()
  {
    return tag;
  }

  public void setTag(String tag)
  {
    this.tag = tag;
  }
}

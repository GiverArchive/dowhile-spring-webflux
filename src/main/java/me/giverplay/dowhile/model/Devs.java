package me.giverplay.dowhile.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Document(collection = "devs")
public class Devs
{
  @Id
  private String id;

  @NotBlank
  @Size(max = 255)
  private String name;

  @NotBlank
  @Size(max = 255)
  private String stack;

  public Devs(String id, String name, String stack)
  {
    this.id = id;
    this.name = name;
    this.stack = stack;
  }

  public Devs() { }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getStack()
  {
    return stack;
  }

  public void setStack(String stack)
  {
    this.stack = stack;
  }
}
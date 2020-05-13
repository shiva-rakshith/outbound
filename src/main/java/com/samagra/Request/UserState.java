package com.samagra.Request;

import java.util.HashMap;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@XmlRootElement
public class UserState {
  @XmlElement
  private String phoneNo;
  @XmlElement
  private HashMap<String, String> questions;
}

package com.printable.digital.works.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Resolution {
   private Integer width;
   private Integer length;

}

package org.shopping.front.web.mapper;

import com.invertory.model.Invertory;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.shopping.front.web.model.Articule;

@Mapper
public interface InvertoryServiceMapper {

    Invertory toInvertoryModel(Articule articule);
}

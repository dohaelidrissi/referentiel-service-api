package com.bcp.dto.list;

import com.bcp.dto.single.CityDTO;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CityCodesDTO {
    private List<CityDTO> cityCodes;
}
package com.bcp.dto.list;

import com.bcp.dto.single.CountryCodeDTO;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CountryCodesDTO {
    private List<CountryCodeDTO> countryCodes;
}
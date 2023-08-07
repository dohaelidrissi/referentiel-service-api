package com.bcp.dto.list;

import com.bcp.dto.single.AbroadAgencyDTO;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class AbroadAgenciesDTO {
    private List<AbroadAgencyDTO> agencies;
}
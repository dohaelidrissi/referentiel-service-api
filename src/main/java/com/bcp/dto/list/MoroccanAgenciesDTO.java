package com.bcp.dto.list;

import com.bcp.dto.single.MoroccanAgencyDTO;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class MoroccanAgenciesDTO {
    private List<MoroccanAgencyDTO> agencies;
}
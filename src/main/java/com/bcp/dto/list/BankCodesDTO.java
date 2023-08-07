package com.bcp.dto.list;

import com.bcp.dto.single.BankCodeDTO;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class BankCodesDTO {
    private List<BankCodeDTO> banks;
}
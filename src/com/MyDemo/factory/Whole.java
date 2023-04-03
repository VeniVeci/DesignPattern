package com.MyDemo.factory;


import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author PaiMon
 * @program: DesignPattern
 * @description:
 */
@Data
@AllArgsConstructor
@Getter
@Setter
public class Whole {

    private String partA;
    private String partB;
    private String partC;

}

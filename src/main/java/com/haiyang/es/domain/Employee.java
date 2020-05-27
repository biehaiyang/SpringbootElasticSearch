package com.haiyang.es.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author biehaiyang
 * @date 2020/5/27 10:08
 * @Description:Book实体 加上了@Document注解之后，默认情况下这个实体中所有的属性都会被建立索引、并且分词
 */


@Data
@ToString
@NoArgsConstructor
public class Employee {
    private String id;
    private Long   version;
    private String firstName;
    private String lastName;
    private String age;
    private String[] interests;
}

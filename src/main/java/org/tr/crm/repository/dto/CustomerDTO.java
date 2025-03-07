package org.tr.crm.repository.dto;

import io.swagger.v3.oas.annotations.media.Schema;

public class CustomerDTO {

    @Schema(description = "The name of the customer", example = "John Doe")
    private String name;

    @Schema(description = "The age of the customer", example = "30")
    private Integer age;

    @Schema(description = "The address of the customer", example = "123 Main St")
    private String address;

    public CustomerDTO(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public CustomerDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}


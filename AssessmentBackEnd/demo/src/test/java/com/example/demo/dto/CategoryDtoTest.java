package com.example.demo.dto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CategoryDtoTest {

    @Test
    void testAllArgsConstructor() {
        CategoryDto categoryDto=new CategoryDto(1,"java","java basics");
        assertEquals("java",categoryDto.getCategoryName());
        assertEquals("java basics",categoryDto.getCategoryDescription());
        assertEquals(1,categoryDto.getCategoryId());
    }

}

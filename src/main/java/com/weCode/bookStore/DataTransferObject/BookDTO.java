package com.weCode.bookStore.DataTransferObject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getter & setter
@Builder // for creating object
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {

    private String title;
    private String description;
    private int pages;
}

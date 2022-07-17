package com.weCode.bookStore.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @NotNull
    private int id;

    @Column
    @NotNull
    private String title;

    @Column
    @NotNull
    private String descp;

    @Column
    @NotNull
    private int release_year;

    @Column
    @NotNull
    private int pagecount;

}

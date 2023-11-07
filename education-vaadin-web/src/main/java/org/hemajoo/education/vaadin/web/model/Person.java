package org.hemajoo.education.vaadin.web.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Person
{
    private String image;
    private String name;
    private String date;
    private String post;
    private String likes;
    private String comments;
    private String shares;
}

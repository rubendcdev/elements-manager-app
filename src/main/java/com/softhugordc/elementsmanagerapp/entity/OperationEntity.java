package com.softhugordc.elementsmanagerapp.entity;


import com.softhugordc.elementsmanagerapp.constant.ActionEnum;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "operations_app")
public class OperationEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(columnDefinition = "CHAR(36)", nullable = false, updatable = false)
    private String id;

    @Enumerated(EnumType.STRING)
    private ActionEnum action;

    @ManyToOne(fetch = FetchType.EAGER)
    private ModuleEntity module;

}

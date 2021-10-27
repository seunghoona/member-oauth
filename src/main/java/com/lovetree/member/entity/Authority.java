package com.lovetree.member.entity;

import com.lovetree.member.entity.dto.Roles;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "authority")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Authority {
    @Id
    @Column(name = "authority_name", length = 50)
    @Enumerated(EnumType.STRING)
    private Roles authorityName;
}
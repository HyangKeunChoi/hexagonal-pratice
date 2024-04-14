package com.example.membershipservice.application.port.in;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class FindMembershipCommand {
    private final String membershipId;
}
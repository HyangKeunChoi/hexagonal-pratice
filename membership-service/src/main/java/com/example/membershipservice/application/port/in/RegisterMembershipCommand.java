package com.example.membershipservice.application.port.in;

import common.SelfValidating;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.antlr.v4.runtime.misc.NotNull;

@Builder
@Data
@EqualsAndHashCode(callSuper = false)
public class RegisterMembershipCommand {

    @NotNull
    private final String name;

    @NotNull
    private final String email;

    @NotNull
    private final String address;

    // @AssertTrue
    private final boolean isValid;

    @NotNull
    private final boolean isCorp;


//    public RegisterMembershipCommand(String name) {
//        this.name = name;
//        this.validateSelf();
//    }

}

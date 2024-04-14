package com.example.membershipservice.application.port.in;

import com.example.membershipservice.domain.Membership;
import common.UseCase;

public interface RegisterMembershipUseCase {

    Membership registerMembership(RegisterMembershipCommand command);
}

package devcourse.baemin.domain.member.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Member {

    private final String memberId;
    private final String password;
    private final String memberName;
}

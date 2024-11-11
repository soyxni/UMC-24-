package umc.spring.study.apiPayload.code;

import jakarta.validation.constraints.AssertFalse;
import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@Builder
public class ReasonDTO {

    private HttpStatus httpStatus;

    private final boolean isSuccess;
    private final String code;
    private final String message;

    public static AssertFalse builder() {
    }

    public boolean getIsSuccess(){return isSuccess;}
}
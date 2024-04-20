import java.io.IOException;
import java.util.Optional;

class ErrorHandling {

    void handleErrorByThrowingIllegalArgumentException() {
        handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(
                "Argument violates precondition");
    }

    void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(String message) {
        throw new IllegalArgumentException(message);
    }

    void handleErrorByThrowingAnyCheckedException() throws IOException {
        handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(
                "Invariant violation detected");
    }

    void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(String message)
            throws IOException {
        throw new IOException(message);
    }

    void handleErrorByThrowingAnyUncheckedException() {
        handleErrorByThrowingIllegalArgumentException();
    }

    void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(String message) {
        handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(message);
    }

    void handleErrorByThrowingCustomCheckedException() throws CustomCheckedException {
        handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(
                "Insert helpful message here");
    }

    void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(String message)
            throws CustomCheckedException {
        throw new CustomCheckedException(message);
    }

    void handleErrorByThrowingCustomUncheckedException() {
        handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(
                "Insert clever message here");
    }

    void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(String message) {
        throw new CustomUncheckedException(message);
    }

    Optional<Integer> handleErrorByReturningOptionalInstance(String integer) {
        try {
            return Optional.of(Integer.parseInt(integer));
        } catch (NumberFormatException except) {
            return Optional.empty();
        }
    }

}
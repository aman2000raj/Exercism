class CustomUncheckedException extends RuntimeException {

    CustomUncheckedException() {
        this("An exceptional condition callers probably won't be able to handle occurred.");
    }

    CustomUncheckedException(String message) {
        super(message);
    }

}

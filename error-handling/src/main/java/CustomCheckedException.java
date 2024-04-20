class CustomCheckedException extends Exception {

    CustomCheckedException() {
        this("An exceptional condition callers should be able to handle occurred");
    }

    CustomCheckedException(String message) {
        super(message);
    }

}
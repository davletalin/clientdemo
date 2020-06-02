package kz.davletalin.fibo.entity;

public enum Status {
    SUCCESS("Success"),
    TIMEOUT("Timeout");

    private String title;

    Status(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Status{" +
                title + '\'' +
                '}';
    }
}

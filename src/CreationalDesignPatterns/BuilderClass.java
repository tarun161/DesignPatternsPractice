package CreationalDesignPatterns;

public class BuilderClass {

    private Integer field1;
    private Integer field2;
    private String field3;

    public static Builder builder() {
        return new Builder();
    }

    private BuilderClass(Builder builder) {
        this.field1 = builder.field1;
        this.field2 = builder.field2;
        this.field3 = builder.field3;
    }

    public static class Builder {
        private Integer field1;
        private Integer field2;
        private String field3;

        public Builder() {

        }

        public Builder field1(Integer field1) {
            this.field1 = field1;
            return this;
        }

        public Builder field2(Integer field2) {
            this.field2 = field2;
            return this;
        }

        public Builder field3(String field3) {
            this.field3 = field3;
            return this;
        }

        public BuilderClass build() {
            return new BuilderClass(this);
        }
    }

    @Override
    public String toString() {
        return this.field1 + " " + this.field2 + " " + this.field3;
    }
}

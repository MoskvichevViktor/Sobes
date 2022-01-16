package lesson_1.task_1;

public class Person {
    //Создать builder для класса Person со следующими полями: String firstName,
    // String lastName, String middleName, String country, String address,
    // String phone, int age, String gender.

    private String firstName, lastName, middleName, country, address, phone, gender;
    private int age;

    private Person() {

    }

    private Person(String firstName,
                   String lastName,
                   String middleName,
                   String country,
                   String address,
                   String phone,
                   int age,
                   String gender
                   ) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.country = country;
        this.address = address;
        this.phone = phone;
        this.age = age;
        this.gender = gender;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public static Builder newBuilder() {
        return new Person().new Builder();
    }


    public class Builder {

        private String innerFirstName, innerLastName, innerMiddleName, innerCountry,
                innerAddress, innerPhone, innerGender;
        private int innerAge;

        private Builder() {
        }

        public Builder setInnerFirstName(String innerFirstName) {
            this.innerFirstName = innerFirstName;
            return this;
        }

        public Builder setInnerLastName(String innerLastName) {
            this.innerLastName = innerLastName;
            return this;
        }

        public Builder setInnerMiddleName(String innerMiddleName) {
            this.innerMiddleName = innerMiddleName;
            return this;
        }

        public Builder setInnerCountry(String innerCountry) {
            this.innerCountry = innerCountry;
            return this;
        }

        public Builder setInnerAddress(String innerAddress) {
            this.innerAddress = innerAddress;
            return this;
        }

        public Builder setInnerPhone(String innerPhone) {
            this.innerPhone = innerPhone;
            return this;
        }

        public Builder setInnerAge(int innerAge) {
            this.innerAge = innerAge;
            return this;
        }

        public Builder setInnerGender(String innerGender) {
            this.innerGender = innerGender;
            return this;
        }



        public Person build() {
            return new Person(innerFirstName, innerLastName, innerMiddleName,
                    innerCountry, innerAddress, innerPhone, innerAge, innerGender);
        }

    }

}

package org.yourcompany.scaler.mfweveningjune26.designpattern.builder;

import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private Integer age;
    private Double psp;
    private String primaryEmail;
    private String secondaryEmail;
    private List<String> phoneNumbers;
    private Integer studentId;
    private String university;
    private String batchId;
    private String address;
    private String city;
    private String pincode;

    public static StudentHelper getBuilder(){
        return new StudentHelper();
    }
    // constructor.
    private Student(StudentHelper sHelper) {
        if(sHelper.getFirstName() == null || sHelper.getLastName() ==null){
            throw new IllegalStateException();
        }
        this.setAddress(sHelper.getAddress());
        this.setAge(sHelper.getAge());
        this.setFirstName(sHelper.getFirstName());
        this.setLastName(sHelper.getLastName());
    }

    // created static inner class.
    static class StudentHelper{
        private String firstName;
        private String lastName;
        private Integer age;
        private Double psp;
        private String primaryEmail;
        private String secondaryEmail;
        private List<String> phoneNumbers;
        private Integer studentId;
        private String university;
        private String batchId;
        private String address;
        private String city;
        private String pincode;
        
        public Student build() throws Exception{
            // Add the validations here.
            if(this.firstName == null || this.lastName ==null){
                throw new Exception("FirstName and LastName should be present!");
            }
            return new Student(this);
        }

        public StudentHelper setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public StudentHelper setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public StudentHelper setAge(Integer age) {
            this.age = age;
            return this;
        }
        public StudentHelper setPsp(Double psp) {
            this.psp = psp;
            return this;
        }
        public StudentHelper setPrimaryEmail(String primaryEmail) {
            this.primaryEmail = primaryEmail;
            return this;
        }
        public StudentHelper setSecondaryEmail(String secondaryEmail) {
            this.secondaryEmail = secondaryEmail;
            return this;
        }
        public StudentHelper setPhoneNumbers(List<String> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }
        public StudentHelper setStudentId(Integer studentId) {
            this.studentId = studentId;
            return this;
        }
        public StudentHelper setUniversity(String university) {
            this.university = university;
            return this;
        }
        public StudentHelper setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }
        public StudentHelper setAddress(String address) {
            this.address = address;
            return this;
        }
        public StudentHelper setCity(String city) {
            this.city = city;
            return this;
        }
        public StudentHelper setPincode(String pincode) {
            this.pincode = pincode;
            return this;
        }
        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public Integer getAge() {
            return age;
        }
        public Double getPsp() {
            return psp;
        }
        public String getPrimaryEmail() {
            return primaryEmail;
        }
        public String getSecondaryEmail() {
            return secondaryEmail;
        }
        public List<String> getPhoneNumbers() {
            return phoneNumbers;
        }
        public Integer getStudentId() {
            return studentId;
        }
        public String getUniversity() {
            return university;
        }
        public String getBatchId() {
            return batchId;
        }
        public String getAddress() {
            return address;
        }
        public String getCity() {
            return city;
        }
        public String getPincode() {
            return pincode;
        }        
    
       // End of static inner class. 
    }









    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Double getPsp() {
        return psp;
    }
    public void setPsp(Double psp) {
        this.psp = psp;
    }
    public String getPrimaryEmail() {
        return primaryEmail;
    }
    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }
    public String getSecondaryEmail() {
        return secondaryEmail;
    }
    public void setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
    }
    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }
    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
    public Integer getStudentId() {
        return studentId;
    }
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
    public String getUniversity() {
        return university;
    }
    public void setUniversity(String university) {
        this.university = university;
    }
    public String getBatchId() {
        return batchId;
    }
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getPincode() {
        return pincode;
    }
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    

}

package com.example.crudapp;

public class MemberPojo {
        private Long id;
        private String name;
        private String address;
        private String phone_number;
        private String gender;
        public MemberPojo()
        {

        }

        public MemberPojo(Long id, String name, String address, String phone_number, String gender) {
                this.id = id;
                this.name = name;
                this.address = address;
                this.phone_number = phone_number;
                this.gender = gender;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public String getPhone_number() {
                return phone_number;
        }

        public void setPhone_number(String phone_number) {
                this.phone_number = phone_number;
        }

        public String getGender() {
                return gender;
        }

        public void setGender(String gender) {
                this.gender = gender;
        }
}

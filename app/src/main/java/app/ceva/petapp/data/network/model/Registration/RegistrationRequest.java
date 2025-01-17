package app.ceva.petapp.data.network.model.Registration;

public class RegistrationRequest {


    /**
     * name : nbvnvbn
     * email : bvnbv@gmal.fff
     * phone : 1234567890
     * password : 123456
     * address : vbcvb
     * region : cvbcvb
     */

    private String name;
    private String email;
    private String phone;
    private String password;
    private String address;
    private String region;

    public RegistrationRequest(String name, String email, String phone, String password, String address, String region) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.address = address;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}

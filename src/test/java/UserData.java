

//создание POJO класса

public class UserData {
    public Integer id;
    public String type;
    public String name;
    public String surName;
    public String fullName;
    public String username;
    public String dateOfBirth;
    public String email;
    public String phone;
    public String company;
    public String profession;
    public String city;
    public Integer uniqueNumber;
    public String business_email;
    public String business_phone;

//создание конструктора, в который будет заполняться ответ сервера


    public UserData(Integer id, String type, String name, String surName, String fullName, String username,
                    String dateOfBirth, String email, String phone, String company, String profession, String city,
                    Integer uniqueNumber, String business_email, String business_phone) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.surName = surName;
        this.fullName = fullName;
        this.username = username;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phone = phone;
        this.company = company;
        this.profession = profession;
        this.city = city;
        this.uniqueNumber = uniqueNumber;
        this.business_email = business_email;
        this.business_phone = business_phone;
    }


// создание геттеров для получения отдельных переменных конструктора

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUsername() {
        return username;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getCompany() {
        return company;
    }

    public String getProfession() {
        return profession;
    }

    public String getCity() {
        return city;
    }

    public Integer getUniqueNumber() {
        return uniqueNumber;
    }

    public String getBusiness_email() {
        return business_email;
    }

    public String getBusiness_phone() {
        return business_phone;
    }
}

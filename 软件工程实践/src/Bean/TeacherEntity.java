package Bean;

import org.hibernate.SQLQuery;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Created by Feng on 3/29/16.
 */
@Entity
@Table(name = "Teacher",schema = "UserDataBase")
public class TeacherEntity  {
    private int id;
    private String password;
    private String nickname;
    private Date birthDate;
    private String cellPhone;
    private String email;
    private String address;
    @OneToMany
    @JoinColumn(name = "sudent_id")
    private List<StudentEntity>studentEntities;
    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "birthDate")
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "cellPhone")
    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    @Basic
    @Column(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

package Bean;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Created by Feng on 3/29/16.
 */
@Entity
@Table(name = "student", schema = "UserDatabase", catalog = "")
public class StudentEntity  {
    private int id;
    private String password;
    private String nickname;
    private Date birthDate;
    private String cellPhone;
    private String email;
    private String sex;
    private String address;
    @ManyToOne(fetch = FetchType.EAGER)
    private TeacherEntity teacherEntity;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
    private List<StudentEntity> friends;


    /*学生权限表
    * 下载文件的权限
    * 上传作业的权限
    * 发帖 评论
    * 管理权限   包括管理学生,老师信息,删帖,禁言.
    * */
    private int downloadAuthority = 1;
    private int uploadAuthority   = 1;
    private int publishAuthority  = 1;
    private int adminAuthority    = 0;    //学生类没有管理的权限





    public StudentEntity() {
    }

    public StudentEntity(int id, String password) {
        this.id = id;
        this.password = password;
    }

    public StudentEntity(int id, String password, String nickname, Date birthDate, String cellPhone, String email, String address) {
        this.id = id;
        this.password = password;
        this.nickname = nickname;
        this.birthDate = birthDate;
        this.cellPhone = cellPhone;
        this.email = email;
        this.address = address;
    }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (id != that.id) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (nickname != null ? !nickname.equals(that.nickname) : that.nickname != null) return false;
        if (birthDate != null ? !birthDate.equals(that.birthDate) : that.birthDate != null) return false;
        if (cellPhone != null ? !cellPhone.equals(that.cellPhone) : that.cellPhone != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (cellPhone != null ? cellPhone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}

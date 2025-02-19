
package BancoDeDadosExistente.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela employees
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"employees\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("BancoDeDadosExistente.entity.Employees")
@CronappTable(role=CronappTableRole.AUTO)
public class Employees implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="INTEGER", label="Emp No")
    @Column(name = "emp_no", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer empNo;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="Birth Date")
    @Column(name = "birth_date", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.util.Date birthDate;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="First Name")
    @Column(name = "first_name", nullable = false, unique = false, length=14, insertable=true, updatable=true)
        
        private java.lang.String firstName;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Gender")
    @Column(name = "gender", nullable = false, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String gender;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="Hire Date")
    @Column(name = "hire_date", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.util.Date hireDate;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Last Name")
    @Column(name = "last_name", nullable = false, unique = false, length=16, insertable=true, updatable=true)
        
        private java.lang.String lastName;


    /**
    * Construtor
    * @generated
    */
    public Employees(){
    }

    /**
    * Obtém empNo
    * return empNo
    * @generated
    */
    public java.lang.Integer getEmpNo() {
        return this.empNo;
    }

    /**
    * Define empNo
    * @param empNo empNo
    * @generated
    */
    public Employees setEmpNo(java.lang.Integer empNo) {
        this.empNo = empNo;
        return this;
    }
    /**
    * Obtém birthDate
    * return birthDate
    * @generated
    */
    public java.util.Date getBirthDate() {
        return this.birthDate;
    }

    /**
    * Define birthDate
    * @param birthDate birthDate
    * @generated
    */
    public Employees setBirthDate(java.util.Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }
    /**
    * Obtém firstName
    * return firstName
    * @generated
    */
    public java.lang.String getFirstName() {
        return this.firstName;
    }

    /**
    * Define firstName
    * @param firstName firstName
    * @generated
    */
    public Employees setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
        return this;
    }
    /**
    * Obtém gender
    * return gender
    * @generated
    */
    public java.lang.String getGender() {
        return this.gender;
    }

    /**
    * Define gender
    * @param gender gender
    * @generated
    */
    public Employees setGender(java.lang.String gender) {
        this.gender = gender;
        return this;
    }
    /**
    * Obtém hireDate
    * return hireDate
    * @generated
    */
    public java.util.Date getHireDate() {
        return this.hireDate;
    }

    /**
    * Define hireDate
    * @param hireDate hireDate
    * @generated
    */
    public Employees setHireDate(java.util.Date hireDate) {
        this.hireDate = hireDate;
        return this;
    }
    /**
    * Obtém lastName
    * return lastName
    * @generated
    */
    public java.lang.String getLastName() {
        return this.lastName;
    }

    /**
    * Define lastName
    * @param lastName lastName
    * @generated
    */
    public Employees setLastName(java.lang.String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Employees object = (Employees)obj;
        if (empNo != null ? !empNo.equals(object.empNo) : object.empNo != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((empNo == null) ? 0 : empNo.hashCode());
        return result;
    }

}
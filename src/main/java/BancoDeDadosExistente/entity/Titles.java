
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
* Classe que representa a tabela titles
* @generated
*/
@javax.persistence.Entity
@IdClass(TitlesPK.class)
@javax.persistence.Table(name = "\"titles\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("BancoDeDadosExistente.entity.Titles")
@CronappTable(role=CronappTableRole.AUTO)
public class Titles implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @JoinColumn(name="emp_no", nullable = false, referencedColumnName = "emp_no", insertable=true, updatable=true)
        private Employees employees;

    /**
    * @generated
    */
    @Id
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="From Date")
    @Column(name = "from_date", nullable = false, insertable=true, updatable=true)
        private java.util.Date fromDate;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Title")
    @Column(name = "title", nullable = false, length=50, insertable=true, updatable=true)
        private java.lang.String title;




    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="To Date")
    @Column(name = "to_date", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date toDate;


    /**
    * Construtor
    * @generated
    */
    public Titles(){
    }

    /**
    * Obtém employees
    * return employees
    * @generated
    */
    public Employees getEmployees() {
        return this.employees;
    }

    /**
    * Define employees
    * @param employees employees
    * @generated
    */
    public Titles setEmployees(Employees employees) {
        this.employees = employees;
        return this;
    }
    /**
    * Obtém fromDate
    * return fromDate
    * @generated
    */
    public java.util.Date getFromDate() {
        return this.fromDate;
    }

    /**
    * Define fromDate
    * @param fromDate fromDate
    * @generated
    */
    public Titles setFromDate(java.util.Date fromDate) {
        this.fromDate = fromDate;
        return this;
    }
    /**
    * Obtém title
    * return title
    * @generated
    */
    public java.lang.String getTitle() {
        return this.title;
    }

    /**
    * Define title
    * @param title title
    * @generated
    */
    public Titles setTitle(java.lang.String title) {
        this.title = title;
        return this;
    }
    /**
    * Obtém toDate
    * return toDate
    * @generated
    */
    public java.util.Date getToDate() {
        return this.toDate;
    }

    /**
    * Define toDate
    * @param toDate toDate
    * @generated
    */
    public Titles setToDate(java.util.Date toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Titles object = (Titles)obj;
        if (employees != null ? !employees.equals(object.employees) : object.employees != null) return false;
        if (fromDate != null ? !fromDate.equals(object.fromDate) : object.fromDate != null) return false;
        if (title != null ? !title.equals(object.title) : object.title != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((employees == null) ? 0 : employees.hashCode());
        result = 31 * result + ((fromDate == null) ? 0 : fromDate.hashCode());
        result = 31 * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }

}
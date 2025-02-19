
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
* Classe que representa a tabela salaries
* @generated
*/
@javax.persistence.Entity
@IdClass(SalariesPK.class)
@javax.persistence.Table(name = "\"salaries\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("BancoDeDadosExistente.entity.Salaries")
@CronappTable(role=CronappTableRole.AUTO)
public class Salaries implements Serializable {
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
    @CronappColumn(attributeType="INTEGER", label="Salary")
    @Column(name = "salary", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer salary;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="To Date")
    @Column(name = "to_date", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.util.Date toDate;


    /**
    * Construtor
    * @generated
    */
    public Salaries(){
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
    public Salaries setEmployees(Employees employees) {
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
    public Salaries setFromDate(java.util.Date fromDate) {
        this.fromDate = fromDate;
        return this;
    }
    /**
    * Obtém salary
    * return salary
    * @generated
    */
    public java.lang.Integer getSalary() {
        return this.salary;
    }

    /**
    * Define salary
    * @param salary salary
    * @generated
    */
    public Salaries setSalary(java.lang.Integer salary) {
        this.salary = salary;
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
    public Salaries setToDate(java.util.Date toDate) {
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
Salaries object = (Salaries)obj;
        if (employees != null ? !employees.equals(object.employees) : object.employees != null) return false;
        if (fromDate != null ? !fromDate.equals(object.fromDate) : object.fromDate != null) return false;
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
        return result;
    }

}

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
* Classe que representa a tabela dept_manager
* @generated
*/
@javax.persistence.Entity
@IdClass(DeptManagerPK.class)
@javax.persistence.Table(name = "\"dept_manager\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("BancoDeDadosExistente.entity.DeptManager")
@CronappTable(role=CronappTableRole.AUTO)
public class DeptManager implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @JoinColumn(name="dept_no", nullable = false, referencedColumnName = "dept_no", insertable=true, updatable=true)
        private Departments departments;

    /**
    * @generated
    */
    @Id
    @JoinColumn(name="emp_no", nullable = false, referencedColumnName = "emp_no", insertable=true, updatable=true)
        private Employees employees;



    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="From Date")
    @Column(name = "from_date", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.util.Date fromDate;


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
    public DeptManager(){
    }

    /**
    * Obtém departments
    * return departments
    * @generated
    */
    public Departments getDepartments() {
        return this.departments;
    }

    /**
    * Define departments
    * @param departments departments
    * @generated
    */
    public DeptManager setDepartments(Departments departments) {
        this.departments = departments;
        return this;
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
    public DeptManager setEmployees(Employees employees) {
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
    public DeptManager setFromDate(java.util.Date fromDate) {
        this.fromDate = fromDate;
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
    public DeptManager setToDate(java.util.Date toDate) {
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
DeptManager object = (DeptManager)obj;
        if (departments != null ? !departments.equals(object.departments) : object.departments != null) return false;
        if (employees != null ? !employees.equals(object.employees) : object.employees != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((departments == null) ? 0 : departments.hashCode());
        result = 31 * result + ((employees == null) ? 0 : employees.hashCode());
        return result;
    }

}
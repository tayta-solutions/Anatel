
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
* Classe que representa a tabela dept_emp_latest_date
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"dept_emp_latest_date\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("BancoDeDadosExistente.entity.DeptEmpLatestDate")
@CronappTable(role=CronappTableRole.AUTO)
public class DeptEmpLatestDate implements Serializable {
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
    @CronappColumn(attributeType="DATE", label="From Date")
    @Column(name = "from_date", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date fromDate;


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
    public DeptEmpLatestDate(){
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
    public DeptEmpLatestDate setEmpNo(java.lang.Integer empNo) {
        this.empNo = empNo;
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
    public DeptEmpLatestDate setFromDate(java.util.Date fromDate) {
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
    public DeptEmpLatestDate setToDate(java.util.Date toDate) {
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
DeptEmpLatestDate object = (DeptEmpLatestDate)obj;
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
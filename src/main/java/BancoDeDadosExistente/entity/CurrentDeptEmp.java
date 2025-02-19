
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
* Classe que representa a tabela current_dept_emp
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"current_dept_emp\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("BancoDeDadosExistente.entity.CurrentDeptEmp")
@CronappTable(role=CronappTableRole.AUTO)
public class CurrentDeptEmp implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Dept No")
    @Column(name = "dept_no", nullable = false, unique = false, length=4, insertable=true, updatable=true)
        
        private java.lang.String deptNo;


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
    public CurrentDeptEmp(){
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
    public CurrentDeptEmp setEmpNo(java.lang.Integer empNo) {
        this.empNo = empNo;
        return this;
    }
    /**
    * Obtém deptNo
    * return deptNo
    * @generated
    */
    public java.lang.String getDeptNo() {
        return this.deptNo;
    }

    /**
    * Define deptNo
    * @param deptNo deptNo
    * @generated
    */
    public CurrentDeptEmp setDeptNo(java.lang.String deptNo) {
        this.deptNo = deptNo;
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
    public CurrentDeptEmp setFromDate(java.util.Date fromDate) {
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
    public CurrentDeptEmp setToDate(java.util.Date toDate) {
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
CurrentDeptEmp object = (CurrentDeptEmp)obj;
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
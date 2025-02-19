
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
* Classe que representa a tabela departments
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"departments\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("BancoDeDadosExistente.entity.Departments")
@CronappTable(role=CronappTableRole.AUTO)
public class Departments implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Dept No")
    @Column(name = "dept_no", nullable = false, length=4, insertable=true, updatable=true)
        private java.lang.String deptNo;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Dept Name")
    @Column(name = "dept_name", nullable = false, unique = false, length=40, insertable=true, updatable=true)
        
        private java.lang.String deptName;


    /**
    * Construtor
    * @generated
    */
    public Departments(){
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
    public Departments setDeptNo(java.lang.String deptNo) {
        this.deptNo = deptNo;
        return this;
    }
    /**
    * Obtém deptName
    * return deptName
    * @generated
    */
    public java.lang.String getDeptName() {
        return this.deptName;
    }

    /**
    * Define deptName
    * @param deptName deptName
    * @generated
    */
    public Departments setDeptName(java.lang.String deptName) {
        this.deptName = deptName;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Departments object = (Departments)obj;
        if (deptNo != null ? !deptNo.equals(object.deptNo) : object.deptNo != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((deptNo == null) ? 0 : deptNo.hashCode());
        return result;
    }

}
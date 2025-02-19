package BancoDeDadosExistente.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class DeptEmpPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private java.lang.String departments;

  /**
   * @generated
   */
  private java.lang.Integer employees;

  /**
   * Construtor
   * @generated
   */
  public DeptEmpPK(){
  }

  /**
   * Obtém departments
   * return departments
   * @generated
   */
  public java.lang.String getDepartments(){
    return this.departments;
  }

  /**
   * Define departments
   * @param departments departments
   * @generated
   */
  public DeptEmpPK setDepartments(java.lang.String departments){
    this.departments = departments;
    return this;
  }
  /**
   * Obtém employees
   * return employees
   * @generated
   */
  public java.lang.Integer getEmployees(){
    return this.employees;
  }

  /**
   * Define employees
   * @param employees employees
   * @generated
   */
  public DeptEmpPK setEmployees(java.lang.Integer employees){
    this.employees = employees;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
DeptEmpPK object = (DeptEmpPK)obj;
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

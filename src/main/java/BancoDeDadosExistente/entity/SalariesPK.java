package BancoDeDadosExistente.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class SalariesPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private java.util.Date fromDate;

  /**
   * @generated
   */
  private java.lang.Integer employees;

  /**
   * Construtor
   * @generated
   */
  public SalariesPK(){
  }

  /**
   * Obtém fromDate
   * return fromDate
   * @generated
   */
  public java.util.Date getFromDate(){
    return this.fromDate;
  }

  /**
   * Define fromDate
   * @param fromDate fromDate
   * @generated
   */
  public SalariesPK setFromDate(java.util.Date fromDate){
    this.fromDate = fromDate;
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
  public SalariesPK setEmployees(java.lang.Integer employees){
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
SalariesPK object = (SalariesPK)obj;
    if (fromDate != null ? !fromDate.equals(object.fromDate) : object.fromDate != null) return false;
    if (employees != null ? !employees.equals(object.employees) : object.employees != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((fromDate == null) ? 0 : fromDate.hashCode());
    result = 31 * result + ((employees == null) ? 0 : employees.hashCode());
    return result;
  }

}

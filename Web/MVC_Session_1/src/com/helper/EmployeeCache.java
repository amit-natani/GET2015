package com.helper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.model.Employee;



public class EmployeeCache{
	/* ConcurrentHashMap to store Employee Objects */ 
	private static Map<Integer, Employee> cache = new ConcurrentHashMap<Integer, Employee>();
	
	/* Creating object of EmployeCache */
	private static EmployeeCache employeeCache = new EmployeeCache();
	private EmployeeCache() {
		cache.put(1, new Employee("Amit", "amit@mail.com", 1, 21, "03-8-15"));
		cache.put(2, new Employee("Ankit", "ankit@mail.com", 2, 22, "03-8-15"));
		cache.put(3, new Employee("Gaurav", "gaurav@mail.com", 3, 23, "03-8-15"));
		cache.put(4, new Employee("Kanak", "kanak@mail.com", 4, 24, "03-8-15"));
		cache.put(5, new Employee("Hemant", "hemant@mail.com", 5, 25, "03-8-15"));
	}
	
	/** Method to get EmployeeCache Object 
	 * 
	 * @return employeeCache EmployeeCache object
	 */
	public static EmployeeCache getInstance() {
		return employeeCache;
	}

	/** Method to get Employee for a particular ID 
	 * @param id
	 * @return Employee
	 */
	public Employee getEmployeeForId(int id) {
		if(!(cache.isEmpty())) {
			return cache.get(id);
		} else {
			return null;
		}
	}
	
	/** Method to get Employee List
	 * @return EmployeeList
	 */
	public List<Employee> getAllEmployees() {
		 ArrayList<Employee> employeeList =new ArrayList<Employee>( cache.values());
		 Collections.sort(employeeList);
		 return employeeList;
	}
	
	/** Method to Update employee
	 * 
	 * @param employee
	 */
	public void updateEmployee(Employee employee) {
		cache.put(employee.getId(),employee);
	}
	
	/** Method to Add employee
	 * 
	 * @param employee
	 */
	public void addEmployee(Employee employee) {
		cache.put(employee.getId(),employee);
	}

}

/**
 * File Name: IJob.java<br>
 * Deng, Stephanie(Xiaofan)<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 16, 2017
 */
package com.sqa.sxd;

/**
 * IJob //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Deng, Stephanie(Xiaofan)
 * @version 1.0.0
 * @since 1.0
 */
public interface IJob {

	String completeTask(int taskID, float completion);

	void doWork(String task);

	String getJobTitle();

	int getNumDaysWorkingPerWeek();

	float getSalary();

	void setJobTitle(String jobTitle);

	void setNumDaysWorkingPerWeek(int numDaysWorkingPerWeek);

	void setSalary(float salary);

	boolean takeBreak(short minutes);
}

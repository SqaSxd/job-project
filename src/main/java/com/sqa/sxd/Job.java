/**
 * File Name: Job.java<br>
 * Deng, Stephanie(Xiaofan)<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 16, 2017
 */
package com.sqa.sxd;

/**
 * Job //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Deng, Stephanie(Xiaofan)
 * @version 1.0.0
 * @since 1.0
 */
public class Job implements IJob {

	private static int totalNumberJobs = 0;

	private String jobTitle = "";
	// ADDD Create variable to hold job duties

	private int numOfDaysPerWeek = 0;

	private float salary = (float) 0.0;

	/**
	 * @see com.sqa.sxd.IJob#completeTask(int, float)
	 */
	@Override
	public String completeTask(int taskID, float completion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void doWork(String task) {
		System.out.println("A " + this.getJobTitle() + " requires that work be done and the task of " + task
				+ " be completed. This should be done within the work week of " + this.getNumDaysWorkingPerWeek()
				+ " days. Lets get started!");
		// XXX Maybe some more System.out call will be nice...
	}

	@Override
	public String getJobTitle() {
		return this.jobTitle;
	}

	@Override
	public int getNumDaysWorkingPerWeek() {
		return this.numOfDaysPerWeek;
	}

	@Override
	public float getSalary() {
		return this.salary;
	}

	/**
	 * @param jobTitle
	 *            the jobTitle to set
	 */
	@Override
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * @see com.sqa.sxd.IJob#setNumDaysWorkingPerWeek(int)
	 */
	@Override
	public void setNumDaysWorkingPerWeek(int numDaysWorkingPerWeek) {
		this.numOfDaysPerWeek = numDaysWorkingPerWeek;
	}

	@Override
	public void setSalary(float salary) {
		this.salary = salary;
		// FIXME Correct Redundancy Loop
	}

	/**
	 * @see com.sqa.sxd.IJob#takeBreak(short)
	 */
	@Override
	public boolean takeBreak(short minutes) {
		// TODO Auto-generated method stub
		return false;
	}
}

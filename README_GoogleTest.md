# READ ME - Release Note for Google Web Test
#TEST GOOGLE WEB SITE
Deploy these codes in Jenkins or Bamboo and create the Job to trigger execution on a scheduled job. 

# Instructions
- A. Create a New Build Job in Jenkins:

Step 1) Login to Jenkins

Step 2) Create New Item
Click on “New Item” at the top left-hand side of your dashboard.

Step 3) Enter Item details
	1. Enter the name of the item you want to create: Test Google web 
	2. Select Freestyle project
	3. Click Okay

Step 4) Enter Project details
	1. Enter the details of the project in the Description: Test Monitoring Google web site.

Step 5) Enter repository URL
	1. Under the tab: Source Code Management, Enter the repository URL of Google test: 
	   https://github.com/anie1/AlsoEnergyResponse.git
	2. Click ‘Git’ radio button
	3. Branch: */master

Step 6) Settings
	1. Now that you have provided all the details, it’s time to build the code. 
	The settings under the build section to build the code at the time you want. 
	You can even schedule the build to happen periodically, at set times.
	2. Under build,
	3. Click on “Add build step”

Step 7) Save the project
	When you have entered all the data
	1. Click Apply
	2. Save the project.

- B. SHCEDULE the JOB in Jenkins

Follow the below steps to schedule it in Jenkins.
Step 1) Login to Jenkins.
Step 2) Open the job which you want to schedule.
Step 3) Click on "Configure"
Step 4) Navigate to the Build Triggers section and click on the "Build periodically" checkbox.
Step 5) On the schedule test area mention the scheduled time in the below format as per the requirement 
        as often as needed to check the Google web site whether it is up or not.
        <minute> <hour> <date> <month> <day of the week>
	
	Example: 30 16 4 5 *
	In the above, we scheduled the Jenkins job to run at 4.30 PM on May 4th
	
	Other Examples:
	• Build every hour: H * * * *
	• Build every 20 minutes: H/20 * * * *
	• Build every 20 minutes 2 am to 11 pm: H/20 5-23 * * *
	• Build every 20 minutes, work time/days (8 am-6 pm, MON-FRI) only: H/20 8-18 * * 1-5
	• Build every hour MON-WED and FRI only: H * * * 1-3,5
	• Build every hour, weekends in April and December: H * * 4,12 *




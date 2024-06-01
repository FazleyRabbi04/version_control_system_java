# version-control

this project is a shot at trying to mimic the operations performed by git and to improve them and add new features to the version control system in the future

## Supported Commands
**add to staging area**
this command works similar to the git add command.
	

    vcs add [filename | directory-name | .]
	   
**Create a commit**
this command can be used to create a snapshot of the files that are added to the staging area by the user.

    vcs commit "commit message"
	    
**view status of files**
this command gives a detailed listing of the files that have beem modified, staged and deleted since the last commit
	

    vcs status
	    
**view the history of commits**
this command is used to view the details of the previous commits in the branch
	

    vcs log
    
** create or switch to branch**
this command creates a new branch if not present or just switches to it if the branch is present.
	
    vcs checkout branch-name

**view branches**
this command lists all the branches and points to the current working branch
	

    vcs branch
    
**configuration**
this command configures the username and email befor using the VCS
	

    vcs configure [username|email] "value"
	    
## setup

 - Install JDK22 if you haven't installed in your pc
 - Open any IDE which supports Maven (Intellij)
 - Open Vcs and VersionControl from src>main>vcs(main) and src>main>version.control>VersionControl(main)
 - Main menu> Project Structure> Project> set Language Level 22
 - Create a folder outside the project folder and create repos.vcs and user.vcs inside that folder
 - Adjust project location
 - Build the project
 - Select Maven from the right side of the Intellij window>Plugins>jar>jar:jar
 - Search for "Environment Variable" in your pc and then add vcs.bat file location as environment variable
 - Adjust your service.bat and vcs.bat file location
 - Keep the service.bat running using command prompt from file location
 - Create a folder outside the project folder
 - Run vcs.bat using command prompt from file location
 - Now check the functionalities our project supports
and you are good to go






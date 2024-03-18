create a empity repository in the name of git init
then initialized a empty git repository in sid ethe flipkart project folder
.git/
step 2)create vi files like abc.java ,xyz.java etc
then there are 3 stages in the git 
1.working area  
2.staging area 
3.local repository

all the files which we have created will be in the working area 
we need to move that file in the working area to the staging area

working --->>>>> staging area
command: git add abc.java
// file moved from working area to the staging area

command:git status // to check file has moved 

staging area --->>>> local repository
command git commit -m "added file abc.java"

type the command:git commi -m "first commit" check the error messsage the go for below command
// before going to commit we need to check the login credentials 
command: git config --global "user.name"
         git congig --global "user.email"

	 git commit -m "first commit"

local repository --->>> to remote repository
connect local to remote using the username and the password while creating the git account
command: git remote add fr https://www.github.com/flipkart.git
				 
fr is a alias name given to the flipkart repository

command:git remote -v //to check maped or not

command:git push fr master //moving file from local to remote repository

command:git log //to check all the commit id's
	
command:git log -2 //to check last 2 commit id's

command: git show commit id // it will display the commit id's all the details

command: git show pretty --="" --name-only commit id // it will show only particular file name of the commit id

command:git clean -n //to check how many files afe going to delete from the directory

command:git clean -f // to remove all the file from the working directory

command: git reset  // files will come from [sa--->>wa]working area <<<<-------staging area

command:git reset cid /// it will fetch the particular file from the staging area



package curs13;

public class GitFilteringLog {
	
	//Filtering the log
	
	//git log |--> show all repo history
	//git log --oneline |--> full log truncated to one line
	//git log --oneline --all  |--> full log history truncated and on all branches
	
	//git log --oneline -2 |--> filter by number
	
	//git log --oneline --after='2023-06-01' 
	//git log --oneline --before='2023-06-01' |--> filter by date
	
	//git log --oneline --author='commit author' |--> filter by author

	//git log --oneline --grep='commit message' |--> filter by commit message
	
	//git log --oneline --stat  |--> all files changed
	//git log --oneline --patch |--> all lines changed
}

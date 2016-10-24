package com.fo0.ss.logger;

public enum LOGSTATE {

	GENERAL,

	PROCESSING,

	FINISHED,

	REGISTER,

	STARTING,

	STOPPED,

	EMERGENCY,

	QUEUED,

	WATCHDOG,

	IGNORE,

	FAILED,

	API,
	
	ADD,
	
	UPDATE,

	NOT_IMPLEMENTED;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + super.toString() + "] ";
	}

}

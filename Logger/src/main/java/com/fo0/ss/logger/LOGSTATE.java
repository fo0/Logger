package com.fo0.ss.logger;

public enum LOGSTATE {

	GENERAL,

	INITIALIZING,

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

	UNSTABLE,

	UPDATE,

	NOT_IMPLEMENTED,

	SKIPPING,

	INSTALLED,

	DEINSTALL;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + super.toString() + "] ";
	}

}

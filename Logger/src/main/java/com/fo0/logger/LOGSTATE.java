package com.fo0.logger;

public enum LOGSTATE {

	VALID,

	GENERAL,

	INIT,

	BOOTSTRAP,

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

	INSTALL,
	
	INSTALLED,

	DEINSTALL,

	DATABASE,

	SCAN,

	SUCCESS,

	LICENSE,

	MODULE,

	CONFIG,

	TODO,

	CLI,

	REMOVE,

	TEST,

	ARCHITECTURE,

	NOT_SUPPORTED,

	REFRESH;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + super.toString() + "] ";
	}

}

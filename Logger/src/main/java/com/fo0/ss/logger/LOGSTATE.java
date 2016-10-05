package com.fo0.ss.logger;

public enum LOGSTATE {

	GENERAL,

	PROCESSING,

	FINISHED,

	STARTING,

	STOPPED,

	EMERGENCY,

	QUEUED,

	WATCHDOG,

	IGNORE,

	NOT_IMPLEMENTED;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + super.toString() + "] ";
	}

}

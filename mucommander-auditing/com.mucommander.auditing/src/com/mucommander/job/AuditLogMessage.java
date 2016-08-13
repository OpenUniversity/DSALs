package com.mucommander.job;

public enum AuditLogMessage {
	COPY_STARTED("copying {0} files to {1}"),
	COPY_FINISHED("finished copying {0} files to {1}"),
	COPY_INTERRUPTED("copy {0} files to {1} was interrupted"),
	COPY_PAUSED("copying files to {0} is paused"),
	COPY_RESUMED("continue to copy files to {0}");

//	MKDIR_STARTED,
//	MKDIR_FINISHED,
//	MKDIR_INTERRUPTED,
//	MKDIR_PAUSED,
//	MKDIR_RESUMED,
//
//	DELETE_STARTED,
//	DELETE_FINISHEd,
//	DELETE_INTERRUPTED,
//	DELETE_PAUSED,
//	DELETE_RESUMED;

	private String msg;

	private AuditLogMessage(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return msg;
	}
}

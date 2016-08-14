package com.mucommander.job;

public enum AuditLogMessage {
	COPY_STARTED("start copying {0} files from {1} to {2} ({3})"),
	COPY_FINISHED("finished copying {0} files from {1} to {2}"),
	COPY_INTERRUPTED("copying files from {0} to {1} was interrupted"),
	COPY_PAUSED("copying files from {0} to {1} is paused after {2} files"),
	COPY_RESUMED("continue to copy files from {0} to {1}"),

	MKFile_STARTED("start creating file {0}"),
	MKFile_FINISHED("finished creating file {0}"),
	MKFile_INTERRUPTED("creating file {0} was interrupted"),
	MKFile_PAUSED("creating file {0} is paused"),
	MKFile_RESUMED("continue to create file {0}"),

	MKDIR_STARTED("start creating directory {0}"),
	MKDIR_FINISHED("finished creating directory {0}"),
	MKDIR_INTERRUPTED("creating directory {0} was interrupted"),
	MKDIR_PAUSED("creating directory {0} is paused"),
	MKDIR_RESUMED("continue to create directory {0}"),

	DELETE_STARTED("start to delete {0} files in {1}"),
	DELETE_FINISHEd("finished deleting {0} files in {1}"),
	DELETE_INTERRUPTED("deleting files in {0} was interrupted"),
	DELETE_PAUSED("deleting {0} files in {1} is paused after {2} files"),
	DELETE_RESUMED("continue to delete files in {1}");

	private String msg;

	private AuditLogMessage(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return msg;
	}
}

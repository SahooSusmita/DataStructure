package com.otherpractice;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.concurrent.TimeUnit;

public class FileLockClass {
	public static void main(String[] args) throws Exception {

		RandomAccessFile file = new RandomAccessFile("accounts.txt", "rw");
		FileChannel channel = file.getChannel();
		FileLock lock = null;
		try {
			lock = channel.tryLock();
		} catch (final OverlappingFileLockException e) {
			file.close();
			channel.close();
		}
		file.writeChars("writing after lock");
	}
}

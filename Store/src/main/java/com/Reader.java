package main.java.com;

import java.io.File;

/**
 * This class provides a way to read {@link Purchases} from a specified file
 * @author Carson Fujita
 * @author Evin Park
 * @since 1.0
 */
public class Reader {

	/**
	 * The specific file that this {@code Reader} will
	 * read from to parse a {@link Purchases} instance from.
	 * @author Carson Fujita
	 * @since 1.0
	 * @see #getFile()
	 * @see #setFile(File)
	 */
	private File file;

	/**
	 * Creates a reader instance from a specified file that
	 * this instance will read from in {@link #read()}
	 * @author Carson Fujita
	 * @since 1.0
	 * @param file the specified file
	 * @see #file
	 * @see #read()
	 */
	public Reader(File file) {
		this.file = file;
	}
	

	/**
	 * Reads from this instance's {@link #file} to return a 
	 * new {@link Purchases} instance.
	 * @return new Purchases instance.
	 * @author Evin Park
	 * @since 1.0
	 * @see #file
	 */
	public Purchases read() {
		//TODO implement
		return null;
	}


	/**
	 * Getter method for this {@code Reader}'s file
	 * @return the {@link #file}
	 * @author Carson Fujita
	 * @since 1.0
	 * @see #file
	 * @see #setFile(File)
	 */
	public File getFile() {
		return file;
	}

	/**
	 * Setter method for this {@code Reader}'s file.
	 * @param file the {@link #file} to set
	 * @author Carson Fujita
	 * @since 1.0
	 * @see #file
	 * @see #getFile()
	 */
	public void setFile(File file) {
		this.file = file;
	}

}

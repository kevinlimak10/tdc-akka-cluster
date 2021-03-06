package com.fmodos.subway;

import java.io.Serializable;

public class NewSandwich {

	private final String clientName;

	private final int timeout;

	private boolean faint;

	public NewSandwich(String clientName, int timeout) {
		this(clientName, timeout, false);
	}

	public NewSandwich(String clientName, int timeout, boolean faint) {
		this.clientName = clientName;
		this.timeout = timeout;
		this.faint = faint;
	}

	public void setFaint(boolean faint) {
		this.faint = faint;
	}

	public boolean isFaint() {
		return faint;
	}

	public String getClientName() {
		return clientName;
	}

	public int getTimeout() {
		return timeout;
	}

}

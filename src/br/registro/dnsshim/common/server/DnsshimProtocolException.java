/* Copyright (C) 2009 Registro.br. All rights reserved. 
* 
* Redistribution and use in source and binary forms, with or without 
* modification, are permitted provided that the following conditions are 
* met:
* 1. Redistribution of source code must retain the above copyright 
*    notice, this list of conditions and the following disclaimer.
* 2. Redistributions in binary form must reproduce the above copyright
*    notice, this list of conditions and the following disclaimer in the
*    documentation and/or other materials provided with the distribution.
* 
* THIS SOFTWARE IS PROVIDED BY REGISTRO.BR ``AS IS'' AND ANY EXPRESS OR
* IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
* WARRANTIE OF FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO
* EVENT SHALL REGISTRO.BR BE LIABLE FOR ANY DIRECT, INDIRECT,
* INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
* BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS
* OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
* ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
* TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE
* USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
* DAMAGE.
 */
package br.registro.dnsshim.common.server;

public class DnsshimProtocolException extends Exception {
	private static final long serialVersionUID = 1L;
	private String message;
	private ProtocolStatusCode status;
	private Object attachment;

	public DnsshimProtocolException(ProtocolStatusCode status, String message) {
		this.status = status;
		this.message = message;
	}

	public DnsshimProtocolException(ProtocolStatusCode status, String message, Object attachment) {
		this.status = status;
		this.message = message;
		this.attachment = attachment;
	}
	
	public DnsshimProtocolException(ProtocolStatusCode status, Object attachment) {
		this.status = status;
		this.attachment = attachment;
	}
	
	public DnsshimProtocolException(ProtocolStatusCode status) {
		this.status = status;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public ProtocolStatusCode getStatus() {
		return status;
	}
	
	public Object getAttachment() {
		return attachment;
	}

	public void setAttachment(Object attachment) {
		this.attachment = attachment;
	}
}
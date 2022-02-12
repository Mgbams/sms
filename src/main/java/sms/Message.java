package sms;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {
	@JsonProperty("receivers")
	private List<String> destinataires;
	
	@JsonProperty("message")
	private String contenu;
	
	@JsonProperty("priority")
	private String priorite;
	
	@JsonProperty("senderForResponse")
	private Boolean accuseReception;

	public Message(List<String> destinataires, String contenu) {
		this.destinataires = destinataires;
		this.contenu = contenu;
		this.priorite = "high";
		this.accuseReception = true;
	}

	public List<String> getDestinataires() {
		return destinataires;
	}

	public void setDestinataires(List<String> destinataires) {
		this.destinataires = destinataires;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	@Override
	public String toString() {
		return "Message [destinataires=" + destinataires + ", contenu=" + contenu + "]";
	}

}

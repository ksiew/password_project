package examplesites.notes;

import websitetemplate.Account;

import java.util.ArrayList;


public class NotesAccount extends Account {
	ArrayList<String> notes = new ArrayList<>();
	public NotesAccount(String pass) {
		super(pass);
		// TODO Auto-generated constructor stub
	}
	public void addNote(String note) {
		notes.add(note);
	}
	public void removeNote(int index) {
		if(notes.size() >= index) {
			notes.remove(index -1 );
		}else {
			System.out.println("note does not exist");
		}
	}
	public String getNote(int index) {
		if(notes.size() >= index) {
			return notes.get(index- 1) + "\n index: " + index;
		}else {
			return "Note does not exist";
		}
	}
}

package examplesites.notes;

import websitetemplate.Account;

import java.util.ArrayList;


public class NotesAccount extends Account {
	private final ArrayList<String> notes = new ArrayList<>();

	public NotesAccount(String pass) {
		super(pass);
	}

	public void addNote(String note) {
		notes.add(note);
	}

	public void removeNote(int index) {
		if(notes.size() >= index) {
			notes.remove(index -1 );
		}else {
			System.out.println("Note does not exist");
		}
	}

	/**
	 * Returns the note at a given index
	 *
	 * @param index which note to return
	 * @return The note at index
	 */
	public String getNote(int index) {
		if(notes.size() >= index) {
			return notes.get(index- 1) + "\n index: " + index;
		}else {
			return "Note does not exist";
		}
	}
}

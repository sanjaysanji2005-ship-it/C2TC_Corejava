package com.tnsif.dayfive.multilevelinheritance.Texteditor;

public class Word {
	 private boolean spellCheckEnabled;

	    public Word() {
	        super();
	        this.spellCheckEnabled = true;
	    }

	    public void spellCheck() {
	        if (spellCheckEnabled) {
	            System.out.println("Running spell check...");
	            // Simulate spell check logic here
	        } else {
	            System.out.println("Spell check is disabled.");
	        }
	    }

	    public void enableSpellCheck(boolean enable) {
	        spellCheckEnabled = enable;
	    }

}

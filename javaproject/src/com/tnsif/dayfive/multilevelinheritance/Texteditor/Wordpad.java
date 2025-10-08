package com.tnsif.dayfive.multilevelinheritance.Texteditor;

public class Wordpad {
	 private boolean isBold;

	    public Wordpad() {
	        super();
	        this.isBold = false;
	    }

	    public void formatText(boolean bold) {
	        if (bold) {
	            content = "<b>" + content + "</b>";
	        }
	        isBold = bold;
	    }

	    public boolean isBold() {
	        return isBold;
	    }


}

package com.infostretch;

public class ObjectVal implements IObjectVal {
	public boolean isInteger( String input ) {
    try {
        Integer.parseInt( input );
        return true;
    }
    catch( Exception e ) {
        return false;
    }
}
}

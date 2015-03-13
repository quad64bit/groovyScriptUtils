package org.gates.groovy.scriptutils

class TerminalPrintingTools{
	static BLUE = '\033[94m'
	static GREEN = '\033[92m'
	static YELLOW = '\033[93m'
	static RED = '\033[91m'
	static ENDC = '\033[0m'

	static def blue = { msg ->
	    println "${BLUE}${msg}${ENDC}"
	}
	
	static def green = { msg ->
	    println "${GREEN}${msg}${ENDC}"
	}
	
	static def yellow = { msg ->
	    println "${YELLOW}${msg}${ENDC}"
	}
	
	static def red = { msg ->
	    println "${RED}${msg}${ENDC}"
	}
}
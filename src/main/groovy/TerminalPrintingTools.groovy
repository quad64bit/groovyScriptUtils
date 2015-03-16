package org.gates.groovy.scriptutils

class TerminalPrintingTools{	
	static PINK      		= '\033[95m'
	static LIGHT_BLUE      	= '\033[94m'
	static BLUE        		= '\033[34m'
	static GREEN         	= '\033[92m'
	static LIGHT_RED        = '\033[91m'
	static RED         		= '\033[31m'
	static CYAN        		= '\033[36m'
	static RED_HIGHLIGHT    = '\033[41m'
	static LIGHT_YELLOW 	= '\033[93m'
	static YELLOW      		= '\033[33m'
	static ENDC         	= '\033[0m'

	static def pink = { msg ->
		println "${PINK}${msg}${ENDC}"
	}

	static def lightBlue = { msg ->
	    println "${LIGHT_BLUE}${msg}${ENDC}"
	}

	static def blue = { msg ->
	    println "${BLUE}${msg}${ENDC}"
	}
	
	static def green = { msg ->
	    println "${GREEN}${msg}${ENDC}"
	}
	
	static def lightRed = { msg ->
	    println "${LIGHT_RED}${msg}${ENDC}"
	}

	static def red = { msg ->
	    println "${RED}${msg}${ENDC}"
	}

	static def cyan = { msg ->
	    println "${CYAN}${msg}${ENDC}"
	}

	static def redHighlight = { msg ->
	    println "${RED_HIGHLIGHT}${msg}${ENDC}"
	}

	static def lightYellow = { msg ->
	    println "${LIGHT_YELLOW}${msg}${ENDC}"
	}

	static def yellow = { msg ->
	    println "${YELLOW}${msg}${ENDC}"
	}
}
package org.testing.runner;

import java.io.IOException;

import org.testing.TestScripts.TC1post;
import org.testing.TestScripts.TC2_get;
import org.testing.TestScripts.TC4_put;
import org.testing.TestScripts.TC5_delete;
import org.testing.TestScripts.getperticular;

public class run {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		TC1post tc1 = new TC1post();
		tc1.post();
		TC2_get tc2 = new TC2_get();
//		tc2.get();
		getperticular tc3 = new getperticular();
//		tc3.getperticular();
		TC4_put tc4 = new TC4_put();
//		tc4.put();
		TC5_delete tc5 = new TC5_delete();
//		tc5.TC5();
			}

}

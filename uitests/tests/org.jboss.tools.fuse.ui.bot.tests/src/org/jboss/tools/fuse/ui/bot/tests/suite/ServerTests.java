/*******************************************************************************
 * Copyright (c) 2017 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.fuse.ui.bot.tests.suite;

import org.eclipse.reddeer.junit.runner.RedDeerSuite;
import org.jboss.tools.fuse.ui.bot.tests.DataTransformationDeploymentTest;
import org.jboss.tools.fuse.ui.bot.tests.DeploymentTest;
import org.jboss.tools.fuse.ui.bot.tests.JMXNavigatorServerTest;
import org.jboss.tools.fuse.ui.bot.tests.QuickStartsTest;
import org.jboss.tools.fuse.ui.bot.tests.ServerJRETest;
import org.jboss.tools.fuse.ui.bot.tests.ServerTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.TestSuite;

/**
 * Runs tests that need a Fuse server instance on Fuse Tooling
 * 
 * @author tsedmik
 */
@SuiteClasses({
	DataTransformationDeploymentTest.class,
	DeploymentTest.class,
	JMXNavigatorServerTest.class,
	QuickStartsTest.class,
	ServerTest.class,
	ServerJRETest.class })
@RunWith(RedDeerSuite.class)
public class ServerTests extends TestSuite {

}

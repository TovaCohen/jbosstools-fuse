/*******************************************************************************
 * Copyright (c) 2013 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/

package org.fusesource.ide.projecttemplates.internal;

import org.eclipse.osgi.util.NLS;

/**
 * @author lhein
 */
public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.fusesource.ide.projecttemplates.l10n.messages";

	public static String newProjectWizardTitle;

	public static String newProjectWizardLocationPageName;
	public static String newProjectWizardLocationPageTitle;
	public static String newProjectWizardLocationPageDescription;
	public static String newProjectWizardLocationPageProjectNameLabel;
	public static String newProjectWizardLocationPageProjectNameDescription;
	public static String newProjectWizardLocationPageLocationGroupLabel;
	public static String newProjectWizardLocationPageLocationDefaultButtonLabel;
	public static String newProjectWizardLocationPageLocationDefaultButtonDescription;
	public static String newProjectWizardLocationPageLocationLabel;
	public static String newProjectWizardLocationPageLocationDescription;
	public static String newProjectWizardLocationPageLocationBrowseButtonLabel;
	public static String newProjectWizardLocationPageLocationBrowseButtonDescription;
	public static String newProjectWizardLocationPageLocationSelectionDialogTitle;
	public static String newProjectWizardLocationPageInvalidProjectNameText;
	public static String newProjectWizardLocationPageDuplicateProjectNameText;
	public static String newProjectWizardLocationPageInvalidProjectLocationText;

	public static String newProjectWizardRuntimePageName;
	public static String newProjectWizardRuntimePageTitle;
	public static String newProjectWizardRuntimePageDescription;
	public static String newProjectWizardRuntimePageRuntimeGroupLabel;
	public static String newProjectWizardRuntimePageRuntimeLabel;
	public static String newProjectWizardRuntimePageRuntimeDescription;
	public static String newProjectWizardRuntimePageRuntimeNewButtonLabel;
	public static String newProjectWizardRuntimePageRuntimeNewButtonDescription;
	public static String newProjectWizardRuntimePageCamelGroupLabel;
	public static String newProjectWizardRuntimePageCamelLabel;
	public static String newProjectWizardRuntimePageCamelDescription;
	public static String newProjectWizardRuntimePageNoRuntimeSelectedLabel;
	public static String newProjectWizardRuntimePageCamelVersionsDontMatchWarning;
	
	public static String newProjectWizardTemplatePageName;
	public static String newProjectWizardTemplatePageTitle;
	public static String newProjectWizardTemplatePageDescription;
	public static String newProjectWizardTemplatePageHeadlineLabel;
	public static String newProjectWizardTemplatePageEmptyProjectLabel;
	public static String newProjectWizardTemplatePageEmptyProjectDescription;
	public static String newProjectWizardTemplatePageBlueprintDSLLabel;
	public static String newProjectWizardTemplatePageBlueprintDSLDescription;
	public static String newProjectWizardTemplatePageSpringDSLLabel;
	public static String newProjectWizardTemplatePageSpringDSLDescription;
	public static String newProjectWizardTemplatePageJavaDSLLabel;
	public static String newProjectWizardTemplatePageJavaDSLDescription;
	public static String newProjectWizardTemplatePageTemplateProjectLabel;
	public static String newProjectWizardTemplatePageTemplateProjectDescription;
	public static String newProjectWizardTemplatePageDSLLabel;
	public static String newProjectWizardTemplatePageFilterBoxText;
	
	static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }
}
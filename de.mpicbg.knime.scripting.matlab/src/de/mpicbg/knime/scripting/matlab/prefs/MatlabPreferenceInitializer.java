/*
 * ------------------------------------------------------------------------
 *
 *  Copyright (C) 2003 - 2010
 *  University of Konstanz, Germany and
 *  KNIME GmbH, Konstanz, Germany
 *  Website: http://www.knime.org; Email: contact@knime.org
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License, version 2, as 
 *  published by the Free Software Foundation.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along
 *  with this program; if not, write to the Free Software Foundation, Inc.,
 *  51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * ------------------------------------------------------------------------
 *
 * History
 *   19.09.2007 (thiel): created
 */
package de.mpicbg.knime.scripting.matlab.prefs;

import de.mpicbg.knime.scripting.matlab.MatlabScriptingBundleActivator;
import de.mpicbg.knime.scripting.matlab.srv.Matlab;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;


public class MatlabPreferenceInitializer extends AbstractPreferenceInitializer {

	public static final String MATLAB_TYPE = "matlab.type";
	public static final String MATLAB_LOCAL = "matlab.local";
    public static final String MATLAB_HOST = "matlab.host";
    public static final String MATLAB_PORT = "matlab.port";

    public static final String MATLAB_TEMPLATE_RESOURCES = "template.resources";
    public static final String MATLAB_PLOT_TEMPLATE_RESOURCES = "plot.template.resources";


    @Override
    public void initializeDefaultPreferences() {
        IPreferenceStore store = MatlabScriptingBundleActivator.getDefault().getPreferenceStore();
        
        store.setDefault(MATLAB_LOCAL, Boolean.TRUE);
        store.setDefault(MATLAB_HOST, "localhost");
        store.setDefault(MATLAB_PORT, 1198);

//        store.setDefault(MATLB_TEMPLATE_RESOURCES, "file:///Volumes/tds/software+tools/KNIME/script-templates/Matlab/script-templates.txt");
        store.setDefault(MATLAB_TEMPLATE_RESOURCES, "https://raw.githubusercontent.com/knime-mpicbg/scripting-templates/master/knime-scripting-templates/Matlab/script-templates.txt");
        store.setDefault(MATLAB_PLOT_TEMPLATE_RESOURCES, "https://raw.githubusercontent.com/knime-mpicbg/scripting-templates/master/knime-scripting-templates/Matlab/figure-templates.txt");
        
        store.setDefault(MATLAB_TYPE, Matlab.DEFAULT_TYPE);
    }
}

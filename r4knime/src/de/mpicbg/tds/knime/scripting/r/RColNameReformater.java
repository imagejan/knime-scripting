package de.mpicbg.tds.knime.scripting.r;

import de.mpicbg.tds.knime.knutils.scripting.ColNameReformater;
import org.knime.core.data.DataType;

public class RColNameReformater implements ColNameReformater {

    public RColNameReformater() {
    }

    public String reformat(String name, DataType type, boolean altDown) {
        if (altDown) {
            if (name.contains(" ")) {
                return RSnippetNodeModel.R_INVAR_BASE_NAME + "$\"" + name + "\"";
            } else {
                return RSnippetNodeModel.R_INVAR_BASE_NAME + "$" + name + "";
            }

        } else {
            return "\"" + name + "\"";
        }
    }
}

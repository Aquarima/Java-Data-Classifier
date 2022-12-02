package fr.gph3.classifier.models.columns;

import fr.gph3.classifier.models.IDataSet;

public class StringColumn extends IColumn {

    public StringColumn(String name, IDataSet dataSet) {
        super(name, dataSet);
    }

    @Override
    public boolean isNormalizable() {
        return false;
    }
}

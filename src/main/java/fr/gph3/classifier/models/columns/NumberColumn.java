package fr.gph3.classifier.models.columns;

import fr.gph3.classifier.models.IDataSet;
import fr.gph3.classifier.utils.normalizers.NumberNormalizer;

public class NumberColumn extends INormalizableColumn {

    public NumberColumn(String name, IDataSet dataSet) {
        super(name, dataSet);
        initNormalizer(new NumberNormalizer(this));
    }

    @Override
    public boolean isNormalizable() {
        return true;
    }
}

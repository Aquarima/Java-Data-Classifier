package fr.gph3.classifier.models.columns;

import fr.gph3.classifier.models.IDataSet;
import fr.gph3.classifier.utils.normalizers.BooleanNormalizer;

public class BooleanColumn extends INormalizableColumn {

    private BooleanNormalizer normalizer;

    public BooleanColumn(String name, IDataSet dataSet) {
        super(name, dataSet);
        initNormalizer(new BooleanNormalizer());
    }

    @Override
    public boolean isNormalizable() {
        return true;
    }
}

package fr.gph3.classifier.models.points;

import fr.gph3.classifier.utils.CSVModel;
import fr.gph3.classifier.utils.parsers.IIrisParser;
import fr.gph3.classifier.utils.parsers.ITitanicParser;

public enum DataType {

    IRIS(new CSVModel(Iris.class, "Imported Iris", new IIrisParser())),
    TITANIC(new CSVModel(Titanic.class, "Imported Titanic", new ITitanicParser()));

    private final CSVModel model;

    DataType(CSVModel model) {
        this.model = model;
    }

    public CSVModel getModel() {
        return model;
    }
}

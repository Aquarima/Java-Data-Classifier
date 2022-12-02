package fr.gph3.classifier.utils.normalizers;

import fr.gph3.classifier.models.columns.NumberColumn;

public class NumberNormalizer implements INormalizer {
	
	private NumberColumn column;

    public NumberNormalizer(NumberColumn column) {
		this.column = column;
	}

	@Override
    public double normalize(Object value) {
        return (double) Math.round((((Number) value).doubleValue() - column.getMin()) / (column.getMax() - column.getMin()) * 1000) / 1000;
    }

    @Override
    public Object denormalize(double value) {
        return (double) Math.round((value * (column.getMax() - column.getMin()) + column.getMin()) * 1000) / 1000;
    }
}

package fr.gph3.classifier.normalizer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.gph3.classifier.models.IDataSet;
import fr.gph3.classifier.models.columns.NumberColumn;
import fr.gph3.classifier.utils.normalizers.NumberNormalizer;

public class TestNumberNormalizer {
	
	IDataSet id;
	private NumberColumn column;
	private NumberNormalizer number;
	
	@BeforeEach
	void setUp() {
		
		column=new NumberColumn("sepal.length", id);
		number = new NumberNormalizer(column);	
	}
	
	
	@Test
    void testGetNameColumn() {
    	assertEquals("sepal.length", column.getName());
    }
	
	@Test
    void testNormalize() {
    	assertEquals(0.60, number.normalize(4.9));
    }
	
	@Test
    void testDenormalize() {
    	assertEquals(4.9, number.denormalize(0.6000));
    }
}

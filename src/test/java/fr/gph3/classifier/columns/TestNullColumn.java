package fr.gph3.classifier.columns;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import fr.gph3.classifier.models.columns.IColumn;
import fr.gph3.classifier.models.columns.NullColumn;
import fr.gph3.classifier.models.points.Iris;
import fr.gph3.classifier.models.points.builders.IrisBuilder;

public class TestNullColumn {
	

	private IColumn column = new NullColumn();
	private NullColumn nul = new NullColumn();
	
	private Iris iris = new IrisBuilder()
			.withPetalLength(15.0)
			.build();
	

	
	
	
	@Test
	public void test_get_name() {
		assertEquals("Null Column", column.getName());
	}
	

	@Test
	public void test_isnormalisable() {
		assertEquals(false, column.isNormalizable());
		
	}
	
	@Test
	public void test_normalized_value() {
		assertEquals(0, nul.getNormalizedValue(iris));
	}
	
	@Test
	public void test_denormalized_value() {
		assertEquals(0, nul.getDenormalizedValue(0.66));
	}
	
	


}

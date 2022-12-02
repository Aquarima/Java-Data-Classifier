package fr.gph3.classifier.columns;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import fr.gph3.classifier.models.IDataSet;
import fr.gph3.classifier.models.columns.StringColumn;

public class TestStringColumn {
	
	private IDataSet id;
	private StringColumn col = new StringColumn("Test", id);
	
	@Test
	public void  test_get_name() {
		assertEquals("Test", col.getName());
	}

	@Test
	public void  test_is_normalizable() {
		assertFalse(col.isNormalizable());
	}
}

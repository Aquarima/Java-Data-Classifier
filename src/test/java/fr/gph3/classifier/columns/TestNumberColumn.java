package fr.gph3.classifier.columns;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import fr.gph3.classifier.models.IDataSet;
import fr.gph3.classifier.models.columns.NumberColumn;

public class TestNumberColumn {

	
	private IDataSet id;
	private NumberColumn nb = new NumberColumn("test", id);


	@BeforeEach
	public void setup() {
	}


	@Test
	public void  test_get_name() {
		assertEquals("test", nb.getName());
	}

	@Test
	public void  test_to_string() {
		assertEquals("test", nb.toString());
	}

	@Test
	public void  test_is_normalizable() {
		assertEquals(true, nb.isNormalizable());
	}


}

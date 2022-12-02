package fr.gph3.classifier;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.gph3.classifier.models.points.IPoint;
import fr.gph3.classifier.models.points.Iris;
import fr.gph3.classifier.utils.CSVModel;

public class TestCSVModel {

	
	private CSVModel model;
	
	List<IPoint> pts = new ArrayList<>();

    @BeforeEach
    void setUp(){
        this.model = new CSVModel(Iris.class, "Iris",null);
        model.loadFromFile("src/main/resources/irisTest.csv");
    }
    
    @Test
    void test_getTitle() {
    	assertEquals("Iris",model.getTitle());
    }
    
    @Test
    void test_getTotalPoints() {
    	assertEquals(15,model.getTotalPoints());
    }
    
    @Test
    void test_addPoint() {
    	assertEquals(15,model.getTotalPoints());
    	model.addPoint(model.getPoint(3));
    	assertEquals(16,model.getTotalPoints());
    }
    
    @Test
    void test_addPoints() {
    	assertEquals(15,model.getTotalPoints());
    	pts.add((Iris) model.getPoint(0));
    	pts.add((Iris) model.getPoint(1));
    	pts.add((Iris) model.getPoint(2));
    	
    	model.addPoints(pts);
    	assertEquals(18,model.getTotalPoints());
    }
    
    @Test
    void test_nbColumns() {
    	assertEquals(5,model.nbColumns());
    	
    }
    
    @Test
    void test_defaultXCol() {
    	assertEquals(model.getColumns().get(0),model.defaultXCol());
    }
    
    @Test
    void test_defaultYCol() {
    	assertEquals(model.getColumns().get(1),model.defaultYCol());
    }
    
    
}
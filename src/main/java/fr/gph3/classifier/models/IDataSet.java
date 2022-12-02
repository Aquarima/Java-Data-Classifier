package fr.gph3.classifier.models;

import fr.gph3.classifier.models.points.IPoint;

import java.util.List;

/**
 * Decrit un <i>DatSet</i>, c'est a dire un ensemble de points (ou lignes,
 * ou donnees) ayant tous la meme structure (les memes colonnes)
 *
 * Un models.DataSet est <i>Iterable</i> pour pouvoir parcourir l'ensemble des
 * donnees(ou lignes ou points) .
 * Pour cette raison, il n'y a pas de getter pour l'ensemble des points
 * d'un models.DataSet.
 */
public interface IDataSet extends Iterable<IPoint> {

    /**
     * Le nom du models.DataSet ex: models.points.IPointitanic, models.points.Iris, Pokemon, ...
     */

    String getTitle();

    /**
     * Nombre de lignes (ou donnees ou points) dans le models.DataSet
     */

    int getTotalPoints();

    IPoint getPoint(int index);

    List<IPoint> getPoints();

    /**
     * stocke dans le models.DataSet la collection de donnees passee en parametre
     */

    void setPoints(List<IPoint> points);

    /**
     * Ajoute une donnee dans le models.DataSet
     */

    void addPoint(IPoint point);

    /**
     * Ajoute une collection de donnees dans le models.DataSet
     */

    void addPoints(List<IPoint> points);
}
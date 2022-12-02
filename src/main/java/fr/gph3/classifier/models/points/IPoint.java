package fr.gph3.classifier.models.points;

import fr.gph3.classifier.models.columns.IColumn;

/**
 * Decrit un models.Point (ou donnee, ou ligne) dans un models.DataSet.
 */

public interface IPoint {

    /*
     * Retourne la valeur de ce point pour la colonne en parametre.
     *
     * Note, on aurait pu utiliser une interface generique (parametre avec
     * un type), mais cela complique significativement d'autres parties
     * du code.
     */

    Object getValue(IColumn column);

    String getCategory();

    void setCategory(String category);
}

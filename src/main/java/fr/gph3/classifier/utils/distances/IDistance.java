package fr.gph3.classifier.utils.distances;

import fr.gph3.classifier.models.points.IPoint;

public interface IDistance {

    double distance(IPoint p1, IPoint p2);
}

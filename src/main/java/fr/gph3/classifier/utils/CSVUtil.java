package fr.gph3.classifier.utils;

import com.opencsv.bean.CsvToBeanBuilder;
import fr.gph3.classifier.models.points.IPoint;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class CSVUtil {

    public static <T extends IPoint> List<T> loadCSVAsFile(Path path, Class<T> dataType) {
        try {
            return new CsvToBeanBuilder<T>(Files.newBufferedReader(path)).withSeparator(',')
                    .withType(dataType)
                    .build()
                    .parse();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}

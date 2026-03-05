package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.NoSuchFileException;

public class Utils {

    public void fileLoading(File inputCSV) {
        System.out.println(inputCSV.exists()); //check that the file exists or path is correct.
        System.out.println(inputCSV.isFile()); //I think is a built-in function to ensure the path points to an actual file.
        System.out.println(inputCSV.getAbsolutePath()); //useful for loading
    }

    private static final int SECONDS_PER_DAY = 86_400;
    private static final int SECONDS_PER_HOUR = 3_600;

    public static short dayOfYear(int secondsSinceEpoch) {
        int startYearTimeStamp = 1735689600; //Jan 1st 2025 (Hard coded, did not yet figure out how to calculate the date from timestamp)

    }



}

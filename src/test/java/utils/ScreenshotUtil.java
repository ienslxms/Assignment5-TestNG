package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtil {

    public static String capture(WebDriver driver, String name) {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String path = "screenshots/" + name + ".png";
        try {
            FileUtils.copyFile(src, new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }
}

package at.ac.tuwien.ifs;


import org.supercsv.cellprocessor.ParseDouble;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by artur on 16/09/15.
 */
public class CSVWriter {
    File file;
    String[] header;
    ICsvBeanWriter beanWriter = null;
    CellProcessor[] processors = getProcessors();
    public CSVWriter(File file){
        this.file=file;
        header= new String[] { "SSIM","Original", "Result", "Original_TIF", "Result_TIF" };

        try {
            beanWriter = new CsvBeanWriter(new FileWriter(file.getAbsolutePath()),
                    CsvPreference.STANDARD_PREFERENCE);
            beanWriter.writeHeader(header);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static CellProcessor[] getProcessors() {

        final CellProcessor[] processors = new CellProcessor[] {
                new ParseDouble(), // firstName
                new NotNull(), // lastName
                new NotNull(), // mailingAddress
                new NotNull(), // favouriteQuote
                new NotNull() // email

        };

        return processors;
    }

    public void write(ImageBean image) throws IOException {
        beanWriter.write(image, header, processors);
    }

    public void destroy(){

        try {
            beanWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}

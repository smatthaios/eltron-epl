package gr.amigos.epl.service;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.DocAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.PrintServiceAttribute;
import javax.print.attribute.standard.PrinterName;
import java.util.Arrays;
import java.util.List;

public class EltronPrintService {

    public static List<PrintService> getAvailableEltronPrinters() {
        return Arrays.asList(PrintServiceLookup.lookupPrintServices(null, null));
    }

    public static void printZpl(String zpl, String printerName) throws Exception {
        try {
            PrintService psZebra = null;
            String sPrinterName = null;
            PrintService[] services = PrintServiceLookup.lookupPrintServices((DocFlavor)null, (AttributeSet)null);

            for(int i = 0; i < services.length; ++i) {
                PrintServiceAttribute attr = services[i].getAttribute(PrinterName.class);
                sPrinterName = ((PrinterName)attr).getValue();
                if (sPrinterName.toLowerCase().indexOf(printerName.toLowerCase()) >= 0) {
                    psZebra = services[i];
                    break;
                }
            }

            if (psZebra == null) {
                throw new Exception("Zebra printer not found : " + printerName);
            } else {
                DocPrintJob job = psZebra.createPrintJob();
                byte[] by = zpl.getBytes();
                DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
                Doc doc = new SimpleDoc(by, flavor, (DocAttributeSet)null);
                job.print(doc, (PrintRequestAttributeSet)null);
            }
        } catch (PrintException var9) {
            throw new Exception("Cannot print label on this printer : " + printerName, var9);
        }
    }
}

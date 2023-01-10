package az.code.FactoryDesignPattern;

public class PdfExporter implements FileExporter {
    @Override
    public String export(String file) {
        return "Pdf  " + file;
    }
}

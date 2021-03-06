package itext;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author clairton
 */
public class NovaPagina {

    public static void main(String[] args) {
        // criação do documento
        Document document = new Document();
        try {        
            String home = System.getProperty("user.home");
            PdfWriter.getInstance(document, new FileOutputStream(home + "/NovaPagina.pdf"));
        
            document.open();
            
            // adicionando um parágrafo no documento
            document.add(new Paragraph("Gerando PDF - Java"));
            document.newPage();
            document.add(new Paragraph("Novo parágrafo na nova página."));
        } catch (DocumentException | IOException ex) {
            Logger.getLogger(PrimeiroDocumento.class.getName()).log(Level.SEVERE, null, ex);
        }
        document.close();
    }
    
}

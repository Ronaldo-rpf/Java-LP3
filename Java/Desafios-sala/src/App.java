class Documento{
    public void exportar(){
        System.out.println("Exportando Documento generico.");
    }
}

class PDF extends Documento{
    public void exportar(){
        System.out.println("Exportando PDF.");
    }
}

class Word extends Documento{
    public void exportar(){
        System.out.println("Exportando Word.");
    }
}

class ExportadordeDocumentos{
    private static int contador = 0;

    public void exportarDocumento(Documento doc){
        doc.exportar();
        contador++;
        System.out.println(contador);
    }
}

public class App{
    public void exportacao(Documento c){
        c.exportar();
    }
    public static void main(String[] args){
        Documento doc1 = new Documento();
        PDF doc2 = new PDF();
        Word doc3 = new Word();

        ExportadordeDocumentos exportador = new ExportadordeDocumentos();
        exportador.exportarDocumento(doc1);
        exportador.exportarDocumento(doc2);
        exportador.exportarDocumento(doc3);


    }
}
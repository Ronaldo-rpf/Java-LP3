class Documento:
    def exportar(self):
        print("Exportando documento generico.")

class PDF (Documento):
    def exportar(self):
        print("Exportando PDF.")

class Word (Documento):
    def exportar(self):
        print("Exportando Word.")

class ExportadordeDocumentos:
    contador = 0

    def exportarDocumento(self, doc: Documento):
        doc.exportar()
        ExportadordeDocumentos.contador += 1
        print(ExportadordeDocumentos.contador)
    


exportador = ExportadordeDocumentos()
doc1 = Documento()
doc2 = PDF()
doc3 = Word()

exportador.exportarDocumento(doc1)
exportador.exportarDocumento(doc2)
exportador.exportarDocumento(doc3)

def exportacao(var: Documento):
    var.exportar()

exportacao(Documento())
exportacao(PDF())
exportacao(Word())
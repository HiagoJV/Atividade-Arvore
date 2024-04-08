package Negocio;
import javax.swing.JOptionPane;

import Modelagem.Numero;

public class Arvore {
   
	private Numero num = null;
    private Arvore esq = null;
    private Arvore dir = null;
    private Numero[] subArvores = new Numero[11];
    public int contador = 0;

    public void adicionar(Numero n) {
        if (num == null) {
            num = n;
            subArvores[contador] = n;
            contador++;
        } else if (n.getDado() < num.getDado()) {
            if (esq == null) {
                esq = new Arvore();
            }
            esq.adicionar(n);
            subArvores[contador] = n;
            contador++;
        } else if (n.getDado() > num.getDado()) {
            if (dir == null) {
                dir = new Arvore();
            }
            dir.adicionar(n);
            subArvores[contador] = n;
            contador++;
        }
    }

    public void exibirEmOrdem(Arvore arv) {
        if (arv != null) {
            if (arv.esq != null) {
                arv.exibirEmOrdem(arv.esq);
            }
            JOptionPane.showMessageDialog(null, arv.num);
            if (arv.dir != null) {
                arv.exibirEmOrdem(arv.dir);
            }
        }
    }

    @Override
    public String toString() {
        return "Arvore [num=" + num + ", contador=" + contador + "]";
    }
}


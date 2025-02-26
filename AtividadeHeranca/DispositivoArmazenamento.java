package AtividadeHeranca;

public class DispositivoArmazenamento extends Memoria{


        private String TipodeConexao;

        public DispositivoArmazenamento(String marca, String modelo, double frequencia,
                String capacidadeDeArmazenamento, String tipodeConexao) {
            super(marca, modelo, frequencia, capacidadeDeArmazenamento);
            TipodeConexao = tipodeConexao;
        }

        public String getTipodeConexao() {
            return TipodeConexao;
        }

        public void setTipodeConexao(String tipodeConexao) {
            TipodeConexao = tipodeConexao;
        }

        @Override
        public String toString() {
            return "DispositivoArmazenamento [Marca=" + Marca + ", Modelo=" + Modelo + ", TipodeConexao="
                    + TipodeConexao + ", getCapacidadeDeArmazenamento()=" + getCapacidadeDeArmazenamento() + "]";
        }
    
    
}

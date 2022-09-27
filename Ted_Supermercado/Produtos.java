package Ted_Supermercado;

public class Produtos implements DiaEHorario{

        private String nome;
        private double preco;

    public Produtos() {
        }

        public String getNome() {
            return this.nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPreco() {
            return this.preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public int diaDaSemana(int dia) {
            return dia;
        }

        public String horario(int hora, int min, int seg) {
            return "" + hora + ":" + min + ":" + seg;
        }

        public String diaDaSemanaExtenso(int dia) {
            switch (dia) {
                case 1:
                    return "Domingo";
                case 2:
                    return "Segunda";
                case 3:
                    return "Terça";
                case 4:
                    return "Quarta";
                case 5:
                    return "Quinta";
                case 6:
                    return "Sexta";
                case 7:
                    return "Sábado";
                default:
                    return null;
            }
        }

        public double promocaoParaVoce(int dia, double preco, int hora) {
            if (dia != 1 && dia != 7) {
                return hora >= 20 ? preco * 0.9 : preco;
            } else {
                return preco * 0.9;
            }
        }
    }



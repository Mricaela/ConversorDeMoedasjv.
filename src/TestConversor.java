public class TestConversor {
        public static void main(String[] args) {
            String json = """
        {
            "conversion_rates": {
                "ARS": 890.12,
                "BOB": 6.9,
                "BRL": 5.25,
                "CLP": 930.11,
                "COP": 4025.75,
                "USD": 1.0
            }
        }
        """;

            Conversor conversor = new Conversor();

            try {
                double resultado = conversor.converter(json, "BRL", 100);
                System.out.println("Valor convertido: R$ " + resultado);
            } catch (Exception e) {
                System.err.println("Erro: " + e.getMessage());
            }
        }
    }



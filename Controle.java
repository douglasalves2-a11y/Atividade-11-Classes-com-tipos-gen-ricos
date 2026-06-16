package cadastro;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe de controle responsável por instanciar a classe Cliente,
 * inserir valores e invocar o método de impressão.
 */
public class Controle {

    // Lista genérica que aceita qualquer variação de Cliente
    private List<Cliente<?, ?, ?, ?>> listaClientes;

    public Controle() {
        this.listaClientes = new ArrayList<>();
    }

    // ── Adicionar cliente à lista ───────────────────────────────────────────
    public <N, I, E, M> void adicionarCliente(Cliente<N, I, M, E> cliente) {
        listaClientes.add(cliente);
    }

    // ── Imprimir todos os clientes cadastrados ──────────────────────────────
    public void imprimirTodos() {
        System.out.println("\n=== LISTAGEM DE TODOS OS CLIENTES ===\n");
        if (listaClientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        for (Cliente<?, ?, ?, ?> c : listaClientes) {
            c.imprimirCliente();
            System.out.println();
        }
    }

    // ── Método principal de teste ───────────────────────────────────────────
    public static void main(String[] args) {

        Controle controle = new Controle();

        // Cliente 1 — tipos: String, Integer, String, String
        Cliente<String, Integer, String, String> cliente1 =
                new Cliente<>(
                    "Ana",
                    "Souza",
                    28,
                    "Rua das Flores, 123 - Varginha/MG",
                    "ana.souza@email.com"
                );

        // Cliente 2 — tipos: String, Integer, String, String
        Cliente<String, Integer, String, String> cliente2 =
                new Cliente<>(
                    "Carlos",
                    "Oliveira",
                    35,
                    "Av. Brasil, 456 - São Paulo/SP",
                    "carlos.oliveira@empresa.com.br"
                );

        // Cliente 3 — demonstrando flexibilidade: idade como String
        Cliente<String, String, String, String> cliente3 =
                new Cliente<>(
                    "Maria",
                    "Lima",
                    "42 anos",          // <-- idade como String
                    "Travessa 7, 89 - Belo Horizonte/MG",
                    "maria.lima@gmail.com"
                );

        // ── Imprimir clientes individualmente ──────────────────────────────
        System.out.println(">>> Impressão individual:\n");
        cliente1.imprimirCliente();
        System.out.println();
        cliente2.imprimirCliente();
        System.out.println();
        cliente3.imprimirCliente();

        // ── Adicionar à lista e imprimir todos ─────────────────────────────
        controle.adicionarCliente(cliente1);
        controle.adicionarCliente(cliente2);
        controle.adicionarCliente(cliente3);

        controle.imprimirTodos();
    }
}

package cadastro;

/**
 * Classe modelo genérica para cadastro de clientes.
 *
 * Parâmetros de tipo:
 *   N  → tipo do Nome e Sobrenome (geralmente String)
 *   I  → tipo da Idade            (geralmente Integer)
 *   E  → tipo do Endereço         (geralmente String)
 *   M  → tipo do E-mail           (geralmente String)
 */
public class Cliente<N, I, E, M> {

    private N nome;
    private N sobrenome;
    private I idade;
    private E endereco;
    private M email;

    // ── Construtor ──────────────────────────────────────────────────────────
    public Cliente(N nome, N sobrenome, I idade, E endereco, M email) {
        this.nome      = nome;
        this.sobrenome = sobrenome;
        this.idade     = idade;
        this.endereco  = endereco;
        this.email     = email;
    }

    // ── Getters e Setters ───────────────────────────────────────────────────
    public N getNome()           { return nome;      }
    public void setNome(N nome)  { this.nome = nome; }

    public N getSobrenome()                  { return sobrenome;           }
    public void setSobrenome(N sobrenome)    { this.sobrenome = sobrenome; }

    public I getIdade()              { return idade;        }
    public void setIdade(I idade)    { this.idade = idade;  }

    public E getEndereco()               { return endereco;           }
    public void setEndereco(E endereco)  { this.endereco = endereco;  }

    public M getEmail()              { return email;        }
    public void setEmail(M email)    { this.email = email;  }

    // ── Método de impressão ─────────────────────────────────────────────────
    public void imprimirCliente() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║        DADOS DO CLIENTE              ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.printf( "║  Nome      : %-23s ║%n", nome + " " + sobrenome);
        System.out.printf( "║  Idade     : %-23s ║%n", idade);
        System.out.printf( "║  Endereço  : %-23s ║%n", endereco);
        System.out.printf( "║  E-mail    : %-23s ║%n", email);
        System.out.println("╚══════════════════════════════════════╝");
    }

    // ── toString ─────────────────────────────────────────────────────────────
    @Override
    public String toString() {
        return "Cliente{"
             + "nome='"      + nome      + '\''
             + ", sobrenome='" + sobrenome + '\''
             + ", idade="    + idade
             + ", endereco='" + endereco  + '\''
             + ", email='"   + email      + '\''
             + '}';
    }
}

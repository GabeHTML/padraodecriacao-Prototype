import org.example.Cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Cliente cliente = new Cliente(231120, "Gabriel", "Rio de Janeiro");

        Cliente clienteClone = cliente.clone();
        clienteClone.setCPF(267059);
        clienteClone.setNome("Gabriel o clone");
        clienteClone.setLocalNascimento("Sao Paulo");

        assertEquals("Cliente {cpf=123456, nome='Gabriel', numero= 1 }, localNascimento='Rio de Janeiro'}", cliente.toString());
        assertEquals("Cliente {cpf=654321, nome='Gabriel o clone', numero= 2 }, localNascimento='Sao Paulo'}", clienteClone.toString());
    }

}

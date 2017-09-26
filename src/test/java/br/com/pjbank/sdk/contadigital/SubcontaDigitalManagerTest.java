package br.com.pjbank.sdk.contadigital;

import br.com.pjbank.sdk.exceptions.PJBankException;
import br.com.pjbank.sdk.models.common.Boleto;
import br.com.pjbank.sdk.models.contadigital.ResponseSubconta;
import br.com.pjbank.sdk.models.contadigital.Subconta;
import org.json.JSONException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import static org.hamcrest.Matchers.*;

/**
 * @author Vinícius Silva <vinicius.silva@superlogica.com>
 * @version 1.0
 * @since 1.0
 */
public class SubcontaDigitalManagerTest {
    @Test
    public void create() throws IOException, JSONException, PJBankException {
        Subconta subconta = new Subconta();
        subconta.setDataNascimento(new Date());
        subconta.setSexo('M');
        subconta.setProduto("Caixinha");
        subconta.setValor(100.5);
        subconta.setCpfCnpj("97.806.620/0001-54");
        subconta.setNome("Cliente de Teste");
        subconta.setEmail("api@pjbank.com");

        SubcontaDigitalManager subcontaDigitalManager = new SubcontaDigitalManager("eb2af021c5e2448c343965a7a80d7d090eb64164", "a834d47e283dd12f50a1b3a771603ae9dfd5a32c");

        subcontaDigitalManager.create(subconta);

        Assert.assertThat(subconta.getNumero(), not(is(emptyOrNullString())));
        Assert.assertThat(subconta.getSubconta(), not(is(emptyOrNullString())));
        Assert.assertThat(subconta.getBoleto().getNossoNumero(), not(is(emptyOrNullString())));
        Assert.assertThat(subconta.getBoleto().getLinkBoleto(), not(is(emptyOrNullString())));
        Assert.assertThat(subconta.getBoleto().getLinhaDigitavel(), not(is(emptyOrNullString())));
    }

    @Test
    public void get() throws IOException, JSONException, ParseException, PJBankException {
        SubcontaDigitalManager subcontaDigitalManager = new SubcontaDigitalManager("eb2af021c5e2448c343965a7a80d7d090eb64164", "a834d47e283dd12f50a1b3a771603ae9dfd5a32c");

        ResponseSubconta responseSubconta = subcontaDigitalManager.get("b2240b16b373446935a2a7ab437577a823f22eaa");

        Assert.assertThat(responseSubconta.getNome(), not(is(emptyOrNullString())));
        Assert.assertThat(responseSubconta.getDocumento(), not(is(emptyOrNullString())));
        Assert.assertThat(responseSubconta.getEmail(), not(is(emptyOrNullString())));
        Assert.assertThat(responseSubconta.getEndereco().getCep(), not(is(emptyOrNullString())));
        Assert.assertThat(responseSubconta.getEndereco().getLogradouro(), not(is(emptyOrNullString())));
        Assert.assertThat(String.valueOf(responseSubconta.getEndereco().getNumero()), not(is(emptyOrNullString())));
        Assert.assertThat(responseSubconta.getEndereco().getBairro(), not(is(emptyOrNullString())));
        Assert.assertThat(responseSubconta.getEndereco().getCidade(), not(is(emptyOrNullString())));
        Assert.assertThat(responseSubconta.getEndereco().getEstado(), not(is(emptyOrNullString())));
        Assert.assertThat(responseSubconta.getNumero(), not(is(emptyOrNullString())));
        Assert.assertThat(String.valueOf(responseSubconta.getDdd()), not(is(emptyOrNullString())));
        Assert.assertThat(String.valueOf(responseSubconta.getTelefone()), not(is(emptyOrNullString())));
        Assert.assertThat(responseSubconta.getStatus(), not(is(nullValue())));
        Assert.assertThat(String.valueOf(responseSubconta.getQtdBoletosCargaPendentes()), not(is(emptyOrNullString())));
    }

    @Test
    public void addBalance() throws IOException, JSONException, PJBankException {
        SubcontaDigitalManager subcontaDigitalManager = new SubcontaDigitalManager("eb2af021c5e2448c343965a7a80d7d090eb64164", "a834d47e283dd12f50a1b3a771603ae9dfd5a32c");

        Boleto boleto = subcontaDigitalManager.addBalance("b2240b16b373446935a2a7ab437577a823f22eaa", 25.50);

        Assert.assertThat(boleto.getNossoNumero(), not(is(emptyOrNullString())));
        Assert.assertThat(boleto.getLinkBoleto(), not(is(emptyOrNullString())));
        Assert.assertThat(boleto.getLinhaDigitavel(), not(is(emptyOrNullString())));
    }
}

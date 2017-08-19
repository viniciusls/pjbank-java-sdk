package br.com.pjbank.sdk.recebimento;

import br.com.pjbank.sdk.api.PJBankClient;
import br.com.pjbank.sdk.exceptions.PJBankException;
import br.com.pjbank.sdk.models.recebimento.Credencial;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author Vinícius Silva <vinicius.silva@superlogica.com>
 * @version 1.0
 * @since 1.0
 */
public class Credenciamento {
    /**
     * EndPoint a ser requisitado na API
     */
    private String endPoint = "recebimento";

    /**
     * Gera uma credencial única por empresa para recebimento via boleto bancária
     * @return Crendencial
     */
    public Credencial create(String nomeEmpresa, String bancoRepasse, String agenciaRepasse, String contaRepasse,
                             String cnpj, int ddd, int telefone, String email) throws IOException, PJBankException {
        PJBankClient client = new PJBankClient(endPoint);
        HttpPost httpPost = client.getHttpPostClient();

        JSONObject params = new JSONObject();
        params.put("nome_empresa", nomeEmpresa);
        params.put("banco_repasse", bancoRepasse);
        params.put("agencia_repasse", agenciaRepasse);
        params.put("conta_repasse", contaRepasse);
        params.put("cnpj", cnpj);
        params.put("ddd", String.valueOf(ddd));
        params.put("telefone", String.valueOf(telefone));
        params.put("email", email);

        httpPost.setEntity(new StringEntity(params.toString(), StandardCharsets.UTF_8));

        String response = EntityUtils.toString(client.doRequest(httpPost).getEntity());

        JSONObject responseObject = new JSONObject(response);

        return new Credencial(responseObject.getString("credencial"), responseObject.getString("chave"),
                responseObject.getString("conta_virtual"), responseObject.getString("agencia_virtual"));
    }
}

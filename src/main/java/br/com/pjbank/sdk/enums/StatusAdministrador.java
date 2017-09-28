package br.com.pjbank.sdk.enums;

public enum StatusAdministrador {
    ATIVO("Ativo"), BLOQUEADO("Bloqueado"), PENDENTE_AUTORIZACAO("Pendente de Autorização"), PENDENTE_BLOQUEIO("Pendente de Bloqueio");

    private String name;

    StatusAdministrador(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static StatusAdministrador fromString(String name) {
        for (StatusAdministrador obj : StatusAdministrador.values()) {
            if (obj.name.equalsIgnoreCase(name)) {
                return obj;
            }
        }
        return null;
    }
}

package br.com.pjbank.sdk.enums;

/**
 * @author Vinícius Silva <vinicius.silva@superlogica.com>
 * @version 1.0
 * @since 1.0
 */
public enum StatusSubconta {
    ATIVO("Ativo"), BLOQUEADO("Bloqueado"), INATIVO("Inativo"), PENDENTE("Pendente");

    private String name;

    StatusSubconta(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static StatusSubconta fromString(String name) {
        for (StatusSubconta obj : StatusSubconta.values()) {
            if (obj.name.equalsIgnoreCase(name)) {
                return obj;
            }
        }
        return null;
    }
}

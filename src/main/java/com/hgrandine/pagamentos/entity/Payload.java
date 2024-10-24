package com.hgrandine.pagamentos.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Payload {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Valor da transação.
    @Setter
    @Getter
    @Column
    private float amount;

    //Método de pagamento, podendo ser PIX ou CREDIT_CARD.
    @Setter
    @Getter
    @Column
    private String paymentMethod;

    // Código da moeda (ex: "BRL", "USD").
    @Setter
    @Getter
    @Column
    private String currencyCode;

    //Descrição da transação.
    @Setter
    @Getter
    @Column
    private String description;

    public Payload(float amount, String paymentMethod, String currencyCode, String description) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.currencyCode = currencyCode;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "amount=" + amount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

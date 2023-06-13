// Payment Service Test Class
// Author: Sobantu Malotana (220472122)
// Date: 07 June 2023

package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Payment;
import za.ac.cput.factory.PaymentFactory;
import za.ac.cput.repository.PaymentRepository;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class PaymentServiceTest {
    private static PaymentRepository service = PaymentRepository.getRepository();
    private static Payment payment = PaymentFactory.createPayment(123,"EFT",750, LocalDate.parse("2023-04-04"));

    @Test
    void a_create() {
        Payment created = service.create(payment);
        assertNotNull(payment.getPaymentId());
        System.out.println("Create : "+ created);
    }

    @Test
    void b_read() {
        Payment read = service.read((Integer) payment.getPaymentId());
        assertNotNull(read);
        System.out.println("Read : "+ read);
    }

    @Test
    void c_update() {
        Payment updated = new Payment.Builder().copy(payment).setPaymentType("CASH")
                .setPaymentDate(LocalDate.parse("2023-04-06"))
                .build();
        assertNotNull(service.update(updated));
        System.out.println("Updated : "+ updated);
    }

    @Test
    void e_delete() {
        boolean success = service.delete((Integer) payment.getPaymentId());
        assertTrue(success);
        System.out.println("Deleted :"+ success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all :");
        System.out.println(service.getAll());
    }
}



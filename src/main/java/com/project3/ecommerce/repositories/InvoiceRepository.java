package com.project3.ecommerce.repositories;

import com.project3.ecommerce.models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice,Long> {
    List<Invoice> getInvoiceByGuest_Id(Long id);
}

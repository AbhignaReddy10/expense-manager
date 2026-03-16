package com.abhigna.expensemanager.repository;

import com.abhigna.expensemanager.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    List<Expense> findByCategory(String category);

    List<Expense> findByUser_Id(Long userId);

}
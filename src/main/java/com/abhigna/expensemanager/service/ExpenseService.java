package com.abhigna.expensemanager.service;

import com.abhigna.expensemanager.model.Expense;
import com.abhigna.expensemanager.model.User;
import com.abhigna.expensemanager.repository.ExpenseRepository;
import com.abhigna.expensemanager.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;
    private final UserRepository userRepository;

    public ExpenseService(ExpenseRepository expenseRepository,
                          UserRepository userRepository) {
        this.expenseRepository = expenseRepository;
        this.userRepository = userRepository;
    }

    // Add expense for a user
    public Expense addExpense(Long userId, Expense expense) {

    User user = userRepository.findById(userId)
            .orElseThrow(() -> new RuntimeException("User not found"));

    expense.setUser(user);   

    return expenseRepository.save(expense);
}

    // Get expenses for a user
    public List<Expense> getUserExpenses(Long userId){
        return expenseRepository.findByUser_Id(userId);
    }

    // Delete expense
    public void deleteExpense(Long id){
        expenseRepository.deleteById(id);
    }

    // Get expenses by category
    public List<Expense> getExpensesByCategory(String category){
        return expenseRepository.findByCategory(category);
    }

    // Get total expenses
    public double getTotalExpenses(Long userId){

        List<Expense> expenses = expenseRepository.findByUser_Id(userId);

        return expenses.stream()
                .mapToDouble(Expense::getAmount)
                .sum();
    }
}
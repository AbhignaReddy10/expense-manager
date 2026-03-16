package com.abhigna.expensemanager.controller;

import com.abhigna.expensemanager.model.Expense;
import com.abhigna.expensemanager.service.ExpenseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    // Add expense for a user
    @PostMapping("/{userId}")
    public Expense addExpense(@PathVariable Long userId,
                              @RequestBody Expense expense) {
        return expenseService.addExpense(userId, expense);
    }

    // Get expenses for a user
    @GetMapping("/{userId}")
    public List<Expense> getUserExpenses(@PathVariable Long userId) {
        return expenseService.getUserExpenses(userId);
    }

    // Delete expense
    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable Long id) {
        expenseService.deleteExpense(id);
    }

    // Get expenses by category
    @GetMapping("/category/{category}")
    public List<Expense> getExpensesByCategory(@PathVariable String category) {
        return expenseService.getExpensesByCategory(category);
    }

    // Get total expenses
    @GetMapping("/total/{userId}")
    public double getTotalExpenses(@PathVariable Long userId) {
        return expenseService.getTotalExpenses(userId);
    }
}
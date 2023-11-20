package com.example.demo;

import java.util.Collection;

// Esta é uma interface que define as operações básicas para um serviço de gerenciamento de tarefas.
public interface TaskService {
    
    // Obtém uma tarefa com base no ID fornecido.
    Task getTask(int id);

    // Obtém todas as tarefas disponíveis.
    Collection<Task> getTasks();

    // Insere uma nova tarefa no sistema.
    void insert(Task task);

    // Atualiza os detalhes de uma tarefa existente.
    void update(Task task);

    // Remove uma tarefa com base no ID fornecido.
    void delete(int id);
}

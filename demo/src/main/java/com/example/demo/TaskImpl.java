package com.example.demo;

import java.util.Collection;
import java.util.Map;

import org.springframework.stereotype.Service;

import java.util.HashMap;

// Esta classe é uma implementação concreta da interface TaskService.
@Service
public class TaskImpl implements TaskService {
    
    // Armazena as tarefas usando um mapa, com o ID como chave e a tarefa como valor.
    private static Map<Integer, Task> tasks = new HashMap<Integer, Task>(); 

    // Variável para controlar o próximo ID a ser atribuído a uma nova tarefa.
    private int nextId = 1;

    // Bloco de inicialização para adicionar algumas tarefas ao mapa ao criar uma instância desta classe.
    {
        insert(new Task("Fazer atividades do dia.", true));
        insert(new Task("Estudar os conteúdos.", false));
        insert(new Task("Entregar as tarefas.", true));
        insert(new Task("Ler os e-mails.", false));
    }

    // Retorna uma tarefa com base no ID fornecido.
    @Override
    public Task getTask(int id) { return tasks.get(id); }

    // Retorna todas as tarefas disponíveis.
    @Override
    public Collection<Task> getTasks() { return tasks.values(); }

    // Insere uma nova tarefa no mapa de tarefas.
    @Override
    public void insert(Task task) {
        task.setId(nextId++); // Atribui um novo ID à tarefa e incrementa o contador para o próximo ID.
        tasks.put(task.getId(), task); // Adiciona a tarefa ao mapa de tarefas usando o ID como chave.
    }

    // Atualiza os detalhes de uma tarefa existente.
    @Override
    public void update(Task task) {
        int id = task.getId();
        if (tasks.containsKey(id)) { // Verifica se a tarefa com o ID fornecido existe no mapa.
            tasks.put(id, task); // Atualiza a tarefa no mapa.
        }
    }

    // Remove uma tarefa com base no ID fornecido.
    @Override
    public void delete(int id) {
        Task task = tasks.get(id); // Obtém a tarefa com o ID fornecido.
        if (task != null) { // Verifica se a tarefa existe no mapa.
            tasks.remove(id); // Remove a tarefa do mapa.
        }
    }
}

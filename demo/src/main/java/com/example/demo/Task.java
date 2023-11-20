package com.example.demo;

public class Task {
    // Atributos para armazenar informações da tarefa.
    public int id; // ID da tarefa.
    public String description; // Descrição da tarefa.
    public boolean done; // Indica se a tarefa está concluída ou não.

    // Construtor vazio padrão.
    public Task(){
        
    }

    // Construtor com parâmetros para facilitar a criação de uma tarefa com descrição e status de conclusão.
    public Task(String description, boolean done){
        this.description = description; // Inicializa a descrição da tarefa.
        this.done = done; // Define o status de conclusão da tarefa.
    }

    // Método para obter a descrição da tarefa.
    public String getDescription() {
        return description;
    }

    // Método para obter o ID da tarefa.
    public int getId() {
        return id;
    }

    // Método para definir a descrição da tarefa.
    public void setDescription(String description) {
        this.description = description;
    }

    // Método para definir o status de conclusão da tarefa.
    public void setDone(boolean done) {
        this.done = done;
    }

    // Método para definir o ID da tarefa.
    public void setId(int id) {
        this.id = id;
    }

    // Método que retorna uma representação em string da tarefa.
    @Override
    public String toString() {
        return "Id: " + id + ", Description: " + description + ", Done: " + done;
        // Retorna uma string que representa o estado atual da tarefa, incluindo ID, descrição e status de conclusão.
    }
}

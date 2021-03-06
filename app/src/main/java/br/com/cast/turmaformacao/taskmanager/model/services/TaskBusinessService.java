package br.com.cast.turmaformacao.taskmanager.model.services;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import br.com.cast.turmaformacao.taskmanager.model.entities.Task;
import br.com.cast.turmaformacao.taskmanager.model.persistence.TaskRepository;

public final class TaskBusinessService {

    private static TaskBusinessService INSTANCE;

    private TaskBusinessService(){
        super();
    }

    public static List<Task> findAll(){
        return TaskRepository.getAll();
    }

    public static void save(Task task) {
        TaskRepository.save(task);
    }

    public static void delete(Task selectTask) {
        TaskRepository.delete(selectTask.getId());
    }

    public static void edit(Task selectTask) {
    }
}

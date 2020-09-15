package com.lelib.designpattern.behavior.state.workflow;

public interface WorkflowState {
    void submit(WorkflowInstance instance);
    void approve(WorkflowInstance instance);
    void pushback(WorkflowInstance instance);
    void cancel(WorkflowInstance instance);
}

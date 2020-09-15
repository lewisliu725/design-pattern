package com.lelib.designpattern.behavior.state.workflow;

public abstract class AbstractWorkflowState implements WorkflowState {
    @Override
    public void submit(WorkflowInstance instance) {
        throw new IllegalStateException("The operation is not supported in current state.");
    }

    @Override
    public void approve(WorkflowInstance instance) {
        throw new IllegalStateException("The operation is not supported in current state.");
    }

    @Override
    public void pushback(WorkflowInstance instance) {
        throw new IllegalStateException("The operation is not supported in current state.");
    }

    @Override
    public void cancel(WorkflowInstance instance) {
        throw new IllegalStateException("The operation is not supported in current state.");
    }
}

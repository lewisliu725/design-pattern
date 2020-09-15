package com.lelib.designpattern.behavior.state.workflow;

public class WorkflowInstance {
    private WorkflowState state;

    public WorkflowInstance(WorkflowState state) {
        this.state = state;
    }

    public void setState(WorkflowState state) {
        this.state = state;
    }

    public void submit() {
        this.state.submit(this);
    }

    public void approve() {
        this.state.approve(this);
    }

    public void pushback() {
        this.state.pushback(this);
    }

    public void cancel() {
        this.state.cancel(this);
    }
}

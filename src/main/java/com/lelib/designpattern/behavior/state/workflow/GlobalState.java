package com.lelib.designpattern.behavior.state.workflow;

public class GlobalState extends AbstractWorkflowState {
    @Override
    public void approve(WorkflowInstance instance) {
        instance.setState(new CompletedState());
    }

    @Override
    public void pushback(WorkflowInstance instance) {
        instance.setState(new MemberFirmState());
    }

    @Override
    public void cancel(WorkflowInstance instance) {
        instance.setState(new CancelledState());
    }
}

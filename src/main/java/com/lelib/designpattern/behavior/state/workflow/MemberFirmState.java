package com.lelib.designpattern.behavior.state.workflow;

public class MemberFirmState extends AbstractWorkflowState {
    @Override
    public void submit(WorkflowInstance instance) {
        instance.setState(new GlobalState());
    }

    @Override
    public void pushback(WorkflowInstance instance) {
        instance.setState(new DraftState());
    }

    @Override
    public void cancel(WorkflowInstance instance) {
        instance.setState(new CancelledState());
    }
}

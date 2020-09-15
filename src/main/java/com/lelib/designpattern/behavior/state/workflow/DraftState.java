package com.lelib.designpattern.behavior.state.workflow;

public class DraftState extends AbstractWorkflowState {
    @Override
    public void submit(WorkflowInstance instance) {
        instance.setState(new MemberFirmState());
    }

    @Override
    public void cancel(WorkflowInstance instance) {
        instance.setState(new CancelledState());
    }
}

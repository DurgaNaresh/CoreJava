package com.durga.deadlock.detection;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class DeadlockDetection {
    public boolean isInvolvedInDeadlock(LockNode lockNode) {
        Set<ThreadNode> involvedThreadNodes = new HashSet<>();

        while(true) {
            ThreadNode lockedByThread = lockNode.lockedBy;

            if(involvedThreadNodes.contains(lockedByThread)) {
                return true;
            }
            involvedThreadNodes.add(lockedByThread);

            if(lockedByThread.waitingFor == null) {
                return false;
            }
            lockNode = lockedByThread.waitingFor;
        }
    }
}

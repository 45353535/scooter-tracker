package com.google.firebase.remoteconfig.interop.rollouts;

import androidx.annotation.NonNull;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_RolloutsState extends RolloutsState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f33180a;

    AutoValue_RolloutsState(Set set) {
        if (set == null) {
            throw new NullPointerException("Null rolloutAssignments");
        }
        this.f33180a = set;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RolloutsState) {
            return this.f33180a.equals(((RolloutsState) obj).getRolloutAssignments());
        }
        return false;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutsState
    @NonNull
    public Set<RolloutAssignment> getRolloutAssignments() {
        return this.f33180a;
    }

    public int hashCode() {
        return this.f33180a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f33180a + "}";
    }
}

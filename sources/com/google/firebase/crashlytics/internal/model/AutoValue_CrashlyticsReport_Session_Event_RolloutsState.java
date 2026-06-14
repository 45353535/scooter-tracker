package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReport_Session_Event_RolloutsState extends CrashlyticsReport.Session.Event.RolloutsState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f32613a;

    static final class Builder extends CrashlyticsReport.Session.Event.RolloutsState.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f32614a;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder
        public CrashlyticsReport.Session.Event.RolloutsState build() {
            List list = this.f32614a;
            if (list != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_RolloutsState(list);
            }
            throw new IllegalStateException("Missing required properties: rolloutAssignments");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder
        public CrashlyticsReport.Session.Event.RolloutsState.Builder setRolloutAssignments(List<CrashlyticsReport.Session.Event.RolloutAssignment> list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.f32614a = list;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.RolloutsState) {
            return this.f32613a.equals(((CrashlyticsReport.Session.Event.RolloutsState) obj).getRolloutAssignments());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState
    @NonNull
    @Encodable.Field(name = "assignments")
    public List<CrashlyticsReport.Session.Event.RolloutAssignment> getRolloutAssignments() {
        return this.f32613a;
    }

    public int hashCode() {
        return this.f32613a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f32613a + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_RolloutsState(List list) {
        this.f32613a = list;
    }
}

package com.google.firebase.crashlytics.internal.metadata;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class RolloutAssignmentList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f32204a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32205b;

    public RolloutAssignmentList(int i10) {
        this.f32205b = i10;
    }

    public List<CrashlyticsReport.Session.Event.RolloutAssignment> getReportRolloutsState() {
        List<RolloutAssignment> rolloutAssignmentList = getRolloutAssignmentList();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < rolloutAssignmentList.size(); i10++) {
            arrayList.add(rolloutAssignmentList.get(i10).toReportProto());
        }
        return arrayList;
    }

    public synchronized List<RolloutAssignment> getRolloutAssignmentList() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.f32204a));
    }

    @CanIgnoreReturnValue
    public synchronized boolean updateRolloutAssignmentList(List<RolloutAssignment> list) {
        this.f32204a.clear();
        if (list.size() <= this.f32205b) {
            return this.f32204a.addAll(list);
        }
        Logger.getLogger().w("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f32205b);
        return this.f32204a.addAll(list.subList(0, this.f32205b));
    }
}

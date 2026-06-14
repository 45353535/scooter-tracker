package com.google.firebase.sessions;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\b\u0010\u0011¨\u0006#"}, d2 = {"Lcom/google/firebase/sessions/ProcessDetails;", "", "", "processName", "", "pid", "importance", "", "isDefaultProcess", "<init>", "(Ljava/lang/String;IIZ)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()Z", MenuActionType.COPY, "(Ljava/lang/String;IIZ)Lcom/google/firebase/sessions/ProcessDetails;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getProcessName", "b", "I", "getPid", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getImportance", "d", "Z", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProcessDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String processName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int pid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int importance;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDefaultProcess;

    public ProcessDetails(@NotNull String processName, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        this.processName = processName;
        this.pid = i10;
        this.importance = i11;
        this.isDefaultProcess = z10;
    }

    public static /* synthetic */ ProcessDetails copy$default(ProcessDetails processDetails, String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = processDetails.processName;
        }
        if ((i12 & 2) != 0) {
            i10 = processDetails.pid;
        }
        if ((i12 & 4) != 0) {
            i11 = processDetails.importance;
        }
        if ((i12 & 8) != 0) {
            z10 = processDetails.isDefaultProcess;
        }
        return processDetails.copy(str, i10, i11, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProcessName() {
        return this.processName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPid() {
        return this.pid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getImportance() {
        return this.importance;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsDefaultProcess() {
        return this.isDefaultProcess;
    }

    @NotNull
    public final ProcessDetails copy(@NotNull String processName, int pid, int importance, boolean isDefaultProcess) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        return new ProcessDetails(processName, pid, importance, isDefaultProcess);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcessDetails)) {
            return false;
        }
        ProcessDetails processDetails = (ProcessDetails) other;
        return Intrinsics.areEqual(this.processName, processDetails.processName) && this.pid == processDetails.pid && this.importance == processDetails.importance && this.isDefaultProcess == processDetails.isDefaultProcess;
    }

    public final int getImportance() {
        return this.importance;
    }

    public final int getPid() {
        return this.pid;
    }

    @NotNull
    public final String getProcessName() {
        return this.processName;
    }

    public int hashCode() {
        return (((((this.processName.hashCode() * 31) + this.pid) * 31) + this.importance) * 31) + androidx.compose.foundation.c.a(this.isDefaultProcess);
    }

    public final boolean isDefaultProcess() {
        return this.isDefaultProcess;
    }

    @NotNull
    public String toString() {
        return "ProcessDetails(processName=" + this.processName + ", pid=" + this.pid + ", importance=" + this.importance + ", isDefaultProcess=" + this.isDefaultProcess + ')';
    }
}

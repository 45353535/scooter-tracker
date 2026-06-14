package androidx.work.impl;

import androidx.work.WorkInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class q {
    public static void a(WorkLauncher workLauncher, StartStopToken workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        workLauncher.startWork(workSpecId, null);
    }

    public static void b(WorkLauncher workLauncher, StartStopToken workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        workLauncher.stopWork(workSpecId, WorkInfo.STOP_REASON_UNKNOWN);
    }

    public static void c(WorkLauncher workLauncher, StartStopToken workSpecId, int i10) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        workLauncher.stopWork(workSpecId, i10);
    }
}

package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.Operation;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkManager f58975a;

    public p(Context context) {
        WorkManager workManagerC;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            workManagerC = b(context);
        } catch (IllegalStateException e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MolocoWorkManager", "WorkManager not initialized already, performing initialization", e10, false, 8, null);
            workManagerC = c(context);
        }
        this.f58975a = workManagerC;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.o
    public Operation a(WorkRequest workRequest) {
        Intrinsics.checkNotNullParameter(workRequest, "workRequest");
        Operation operationEnqueue = this.f58975a.enqueue(workRequest);
        Intrinsics.checkNotNullExpressionValue(operationEnqueue, "enqueue(...)");
        return operationEnqueue;
    }

    public final WorkManager b(Context context) {
        WorkManager workManager = WorkManager.getInstance(context);
        Intrinsics.checkNotNullExpressionValue(workManager, "getInstance(...)");
        return workManager;
    }

    public final WorkManager c(Context context) {
        Configuration configurationBuild = new Configuration.Builder().build();
        Intrinsics.checkNotNullExpressionValue(configurationBuild, "build(...)");
        try {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "MolocoWorkManager", "Trying to initialize work manager as one is not already available", null, false, 12, null);
        } catch (IllegalStateException e10) {
            e = e10;
        }
        try {
            WorkManager.initialize(context, configurationBuild);
        } catch (IllegalStateException e11) {
            e = e11;
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MolocoWorkManager", "WorkManager initialized already at this point, retrieving instance", e, false, 8, null);
        }
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "MolocoWorkManager", "Trying to retrieve work manager instance", null, false, 12, null);
        try {
            return b(context);
        } catch (IllegalStateException e12) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "MolocoWorkManager", "WorkManager instance couldn't be re-initialized, cannot provide WorkManager", null, false, 12, null);
            throw new IllegalStateException("Cannot provide MolocoWorkManager. Failed to re-initialize WorkManager", e12);
        }
    }
}

package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    public static final s0 a(AdShowListener adShowListener, com.moloco.sdk.internal.services.q appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, Function0 provideSdkEvents, Function0 provideBUrlData, com.moloco.sdk.internal.i0 sdkEventUrlTracker, com.moloco.sdk.internal.j bUrlTracker, AdFormatType adType, com.moloco.sdk.acm.recorder.a metricsRecorder, com.moloco.sdk.internal.client_metrics_data.a acmClickDeduper) {
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        Intrinsics.checkNotNullParameter(provideBUrlData, "provideBUrlData");
        Intrinsics.checkNotNullParameter(sdkEventUrlTracker, "sdkEventUrlTracker");
        Intrinsics.checkNotNullParameter(bUrlTracker, "bUrlTracker");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(acmClickDeduper, "acmClickDeduper");
        return new t0(adShowListener, appLifecycleTrackerService, customUserEventBuilderService, provideSdkEvents, provideBUrlData, sdkEventUrlTracker, bUrlTracker, adType, metricsRecorder, acmClickDeduper);
    }

    public static /* synthetic */ s0 b(AdShowListener adShowListener, com.moloco.sdk.internal.services.q qVar, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, Function0 function0, Function0 function02, com.moloco.sdk.internal.i0 i0Var, com.moloco.sdk.internal.j jVar, AdFormatType adFormatType, com.moloco.sdk.acm.recorder.a aVar2, com.moloco.sdk.internal.client_metrics_data.a aVar3, int i10, Object obj) {
        com.moloco.sdk.acm.recorder.a aVar4;
        com.moloco.sdk.internal.client_metrics_data.a aVar5;
        com.moloco.sdk.internal.i0 i0VarB = (i10 & 32) != 0 ? com.moloco.sdk.internal.l0.b() : i0Var;
        com.moloco.sdk.internal.j jVarA = (i10 & 64) != 0 ? com.moloco.sdk.internal.m.a() : jVar;
        if ((i10 & 512) != 0) {
            aVar4 = aVar2;
            aVar5 = new com.moloco.sdk.internal.client_metrics_data.a(aVar4);
        } else {
            aVar4 = aVar2;
            aVar5 = aVar3;
        }
        return a(adShowListener, qVar, aVar, function0, function02, i0VarB, jVarA, adFormatType, aVar4, aVar5);
    }
}

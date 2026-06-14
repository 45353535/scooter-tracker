package com.inmobi.media;

import androidx.compose.material.TextFieldImplKt;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.u5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4073u5 implements InterfaceC4023s5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile CrashConfig f39635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4155xc f39636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f39637c;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4073u5(android.content.Context r7, com.inmobi.media.core.config.models.CrashConfig r8, com.inmobi.media.C4155xc r9) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "crashConfig"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "eventBus"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r6.<init>()
            r6.f39635a = r8
            r6.f39636b = r9
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.List r8 = j$.util.DesugarCollections.synchronizedList(r8)
            java.lang.String r9 = "synchronizedList(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            r6.f39637c = r8
            com.inmobi.media.core.config.models.CrashConfig r9 = r6.f39635a
            com.inmobi.media.core.config.models.CrashConfig$CrashIncidentConfig r9 = r9.getCrashConfig()
            boolean r9 = r9.getEnabled()
            if (r9 == 0) goto L3e
            com.inmobi.media.S4 r9 = new com.inmobi.media.S4
            java.lang.Thread$UncaughtExceptionHandler r0 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            r9.<init>(r0, r6)
            r8.add(r9)
        L3e:
            com.inmobi.media.core.config.models.CrashConfig r9 = r6.f39635a
            com.inmobi.media.core.config.models.CrashConfig$ANRConfig r9 = r9.getAnr()
            com.inmobi.media.core.config.models.CrashConfig$AppExitReasonConfig r9 = r9.getAppExitReason()
            boolean r9 = r9.getEnabled()
            if (r9 == 0) goto L80
            com.inmobi.media.x5 r9 = com.inmobi.media.C4148x5.f39893a
            r9.getClass()
            boolean r9 = com.inmobi.media.C4148x5.r()
            if (r9 == 0) goto L80
            com.inmobi.media.y1 r0 = new com.inmobi.media.y1
            com.inmobi.media.core.config.models.CrashConfig r9 = r6.f39635a
            com.inmobi.media.core.config.models.CrashConfig$ANRConfig r9 = r9.getAnr()
            com.inmobi.media.core.config.models.CrashConfig$AppExitReasonConfig r9 = r9.getAppExitReason()
            long r3 = r9.getIncidentWaitInterval()
            com.inmobi.media.core.config.models.CrashConfig r9 = r6.f39635a
            com.inmobi.media.core.config.models.CrashConfig$ANRConfig r9 = r9.getAnr()
            com.inmobi.media.core.config.models.CrashConfig$AppExitReasonConfig r9 = r9.getAppExitReason()
            int r5 = r9.getMaxNumberOfLines()
            r2 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r5)
            r8.add(r0)
            goto L81
        L80:
            r2 = r6
        L81:
            com.inmobi.media.core.config.models.CrashConfig r7 = r2.f39635a
            com.inmobi.media.core.config.models.CrashConfig$ANRConfig r7 = r7.getAnr()
            com.inmobi.media.core.config.models.CrashConfig$WatchDogConfig r7 = r7.getWatchdog()
            boolean r7 = r7.getEnabled()
            if (r7 == 0) goto La7
            com.inmobi.media.c r7 = new com.inmobi.media.c
            com.inmobi.media.core.config.models.CrashConfig r9 = r2.f39635a
            com.inmobi.media.core.config.models.CrashConfig$ANRConfig r9 = r9.getAnr()
            com.inmobi.media.core.config.models.CrashConfig$WatchDogConfig r9 = r9.getWatchdog()
            long r0 = r9.getInterval()
            r7.<init>(r0, r6)
            r8.add(r7)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4073u5.<init>(android.content.Context, com.inmobi.media.core.config.models.CrashConfig, com.inmobi.media.xc):void");
    }

    public final void a(Q9 incidentEvent) {
        int i10;
        Intrinsics.checkNotNullParameter(incidentEvent, "incidentEvent");
        if ((incidentEvent instanceof C4194z1) && this.f39635a.getAnr().getAppExitReason().getEnabled()) {
            i10 = 152;
        } else if ((incidentEvent instanceof T4) && this.f39635a.getCrashConfig().getEnabled()) {
            i10 = TextFieldImplKt.AnimationDuration;
        } else if (!(incidentEvent instanceof Wn) || !this.f39635a.getAnr().getWatchdog().getEnabled()) {
            return;
        } else {
            i10 = 151;
        }
        this.f39636b.b(new I2(i10, incidentEvent.f38734a, MapsKt.mapOf(TuplesKt.to("data", incidentEvent))));
    }
}

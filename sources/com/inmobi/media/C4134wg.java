package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: renamed from: com.inmobi.media.wg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4134wg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Nn f39852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableStateFlow f39853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f39854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4184yg f39855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Job f39856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f39857f;

    public C4134wg(CoroutineScope coroutineScope, C4184yg pollingVisibilityTrackerConfig, Nn visibilityTrackedView) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(pollingVisibilityTrackerConfig, "pollingVisibilityTrackerConfig");
        Intrinsics.checkNotNullParameter(visibilityTrackedView, "visibilityTrackedView");
        Intrinsics.checkNotNullParameter(visibilityTrackedView, "visibilityTrackedView");
        this.f39852a = visibilityTrackedView;
        this.f39853b = hg.l0.a(Mn.f37387a);
        this.f39854c = coroutineScope;
        this.f39855d = pollingVisibilityTrackerConfig;
        this.f39857f = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0061 -> B:17:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.inmobi.media.C4134wg r7, kotlin.coroutines.jvm.internal.d r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof com.inmobi.media.C4084ug
            if (r0 == 0) goto L16
            r0 = r8
            com.inmobi.media.ug r0 = (com.inmobi.media.C4084ug) r0
            int r1 = r0.f39687c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f39687c = r1
            goto L1b
        L16:
            com.inmobi.media.ug r0 = new com.inmobi.media.ug
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.f39685a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f39687c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            goto L38
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            kotlin.d.b(r8)
            goto L56
        L38:
            kotlin.d.b(r8)
        L3b:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f39857f
            boolean r8 = r8.get()
            if (r8 != 0) goto L64
            eg.e1 r8 = eg.o0.c()
            com.inmobi.media.vg r2 = new com.inmobi.media.vg
            r5 = 0
            r2.<init>(r7, r5)
            r0.f39687c = r4
            java.lang.Object r8 = eg.g.g(r8, r2, r0)
            if (r8 != r1) goto L56
            goto L63
        L56:
            com.inmobi.media.yg r8 = r7.f39855d
            int r8 = r8.f40004a
            long r5 = (long) r8
            r0.f39687c = r3
            java.lang.Object r8 = eg.k0.a(r5, r0)
            if (r8 != r1) goto L3b
        L63:
            return r1
        L64:
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4134wg.a(com.inmobi.media.wg, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final void a() {
        if (this.f39857f.get() || this.f39856e != null) {
            return;
        }
        this.f39856e = eg.i.d(this.f39854c, null, null, new C4059tg(this, null), 3, null);
    }
}

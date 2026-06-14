package com.inmobi.media;

import androidx.media3.exoplayer.ExoPlayer;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.videoPlayer.model.TrackPercentage;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: renamed from: com.inmobi.media.u6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4074u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExoPlayer f39638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f39639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableSharedFlow f39640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f39641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Job f39642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Job f39643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean[] f39645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f39646i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rl[] f39647j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f39648k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f39649l;

    public C4074u6(ExoPlayer player, AdConfig.HybridNativeConfig hybridNativeConfig, CoroutineScope coroutineScope, long j10, MutableSharedFlow progressEvents, TrackPercentage trackPercentage) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(hybridNativeConfig, "hybridNativeConfig");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(progressEvents, "progressEvents");
        Intrinsics.checkNotNullParameter(trackPercentage, "trackPercentage");
        this.f39638a = player;
        this.f39639b = coroutineScope;
        this.f39640c = progressEvents;
        this.f39641d = new AtomicBoolean(false);
        this.f39644g = -1;
        boolean[] zArr = new boolean[4];
        for (int i10 = 0; i10 < 4; i10++) {
            zArr[i10] = false;
        }
        this.f39645h = zArr;
        this.f39646i = new int[]{trackPercentage.getQ1(), trackPercentage.getQ2(), trackPercentage.getQ3(), trackPercentage.getQ4()};
        this.f39647j = new Rl[]{C4165xm.f39948a, C3792in.f38775a, C4016rn.f39489a, C4190ym.f40020a};
        this.f39648k = 200L;
        this.f39649l = kotlin.ranges.g.f(j10, hybridNativeConfig.getMinProgressInterval());
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a8, code lost:
    
        if (r9.a(r2, r0) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.inmobi.media.C4074u6 r9, kotlin.coroutines.jvm.internal.d r10) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof com.inmobi.media.C3999r6
            if (r0 == 0) goto L16
            r0 = r10
            com.inmobi.media.r6 r0 = (com.inmobi.media.C3999r6) r0
            int r1 = r0.f39445d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f39445d = r1
            goto L1b
        L16:
            com.inmobi.media.r6 r0 = new com.inmobi.media.r6
            r0.<init>(r9, r10)
        L1b:
            java.lang.Object r10 = r0.f39443b
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f39445d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.d.b(r10)
            goto Lab
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            int r2 = r0.f39442a
            kotlin.d.b(r10)
            goto La2
        L3e:
            kotlin.d.b(r10)
            androidx.media3.exoplayer.ExoPlayer r10 = r9.f39638a
            boolean r10 = r10.isPlaying()
            if (r10 != 0) goto L4c
            kotlin.Unit r9 = kotlin.Unit.f93236a
            return r9
        L4c:
            androidx.media3.exoplayer.ExoPlayer r10 = r9.f39638a
            long r5 = r10.getDuration()
            int r10 = (int) r5
            if (r10 > 0) goto L58
            kotlin.Unit r9 = kotlin.Unit.f93236a
            return r9
        L58:
            androidx.media3.exoplayer.ExoPlayer r2 = r9.f39638a
            long r5 = r2.getCurrentPosition()
            int r2 = (int) r5
            int r2 = r2 * 100
            int r2 = r2 / r10
            int r5 = r9.f39644g
            r6 = 0
            if (r5 != r3) goto L7d
            int[] r5 = r9.f39646i
            r5 = r5[r6]
            if (r2 >= r5) goto L7d
            r5 = -1
            r9.f39644g = r5
            r5 = 4
            boolean[] r7 = new boolean[r5]
            r8 = r6
        L74:
            if (r8 >= r5) goto L7b
            r7[r8] = r6
            int r8 = r8 + 1
            goto L74
        L7b:
            r9.f39645h = r7
        L7d:
            r0.f39442a = r2
            r0.f39445d = r4
            int r4 = r9.f39644g
            if (r4 < 0) goto L88
            kotlin.Unit r10 = kotlin.Unit.f93236a
            goto L9f
        L88:
            r9.f39644g = r6
            kotlinx.coroutines.flow.MutableSharedFlow r4 = r9.f39640c
            com.inmobi.media.kn r5 = new com.inmobi.media.kn
            float r10 = (float) r10
            r5.<init>(r10)
            java.lang.Object r10 = r4.emit(r5, r0)
            java.lang.Object r4 = pf.b.g()
            if (r10 != r4) goto L9d
            goto L9f
        L9d:
            kotlin.Unit r10 = kotlin.Unit.f93236a
        L9f:
            if (r10 != r1) goto La2
            goto Laa
        La2:
            r0.f39445d = r3
            java.lang.Object r9 = r9.a(r2, r0)
            if (r9 != r1) goto Lab
        Laa:
            return r1
        Lab:
            kotlin.Unit r9 = kotlin.Unit.f93236a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4074u6.a(com.inmobi.media.u6, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final void a() {
        if (this.f39641d.getAndSet(false)) {
            H6.a(this.f39642e);
            H6.a(this.f39643f);
            this.f39642e = null;
            this.f39643f = null;
        }
    }

    public static final Object a(C4074u6 c4074u6, C4049t6 c4049t6) {
        Object objEmit;
        if (!c4074u6.f39638a.isPlaying()) {
            return Unit.f93236a;
        }
        long duration = c4074u6.f39638a.getDuration();
        if (duration <= 0) {
            return Unit.f93236a;
        }
        return (c4074u6.f39644g != 2 && (objEmit = c4074u6.f39640c.emit(new C3852l8(c4074u6.f39638a.getCurrentPosition(), duration), c4049t6)) == pf.b.g()) ? objEmit : Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:23:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004e -> B:23:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0064 -> B:23:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r8, kotlin.coroutines.jvm.internal.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.inmobi.media.C3950p6
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.p6 r0 = (com.inmobi.media.C3950p6) r0
            int r1 = r0.f39249f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39249f = r1
            goto L18
        L13:
            com.inmobi.media.p6 r0 = new com.inmobi.media.p6
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f39247d
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f39249f
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r8 = r0.f39246c
            int r2 = r0.f39245b
            int r4 = r0.f39244a
            kotlin.d.b(r9)
            r9 = r4
            goto L67
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            kotlin.d.b(r9)
            int[] r9 = r7.f39646i
            int r9 = r9.length
            r2 = 0
            r6 = r9
            r9 = r8
            r8 = r6
        L42:
            if (r2 >= r8) goto L69
            int[] r4 = r7.f39646i
            r4 = r4[r2]
            if (r9 < r4) goto L67
            boolean[] r4 = r7.f39645h
            boolean r5 = r4[r2]
            if (r5 != 0) goto L67
            r4[r2] = r3
            kotlinx.coroutines.flow.MutableSharedFlow r4 = r7.f39640c
            com.inmobi.media.Rl[] r5 = r7.f39647j
            r5 = r5[r2]
            r0.f39244a = r9
            r0.f39245b = r2
            r0.f39246c = r8
            r0.f39249f = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L67
            return r1
        L67:
            int r2 = r2 + r3
            goto L42
        L69:
            kotlin.Unit r8 = kotlin.Unit.f93236a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4074u6.a(int, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}

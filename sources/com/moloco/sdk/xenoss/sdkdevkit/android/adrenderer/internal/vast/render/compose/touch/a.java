package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import ng.f;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements PressGestureScope, Density {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Density f58041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f58042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f58043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Mutex f58044e;

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a$a, reason: collision with other inner class name */
    public static final class C0764a extends d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f58045r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f58047t;

        public C0764a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58045r = obj;
            this.f58047t |= Integer.MIN_VALUE;
            return a.this.awaitRelease(this);
        }
    }

    public static final class b extends d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58048r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f58049s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f58051u;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58049s = obj;
            this.f58051u |= Integer.MIN_VALUE;
            return a.this.tryAwaitRelease(this);
        }
    }

    public a(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.f58041b = density;
        this.f58044e = f.a(false);
    }

    public final void a() {
        this.f58043d = true;
        Mutex.a.c(this.f58044e, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object awaitRelease(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a.C0764a
            if (r0 == 0) goto L13
            r0 = r5
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a.C0764a) r0
            int r1 = r0.f58047t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58047t = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f58045r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f58047t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.d.b(r5)
            r0.f58047t = r3
            java.lang.Object r5 = r4.tryAwaitRelease(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L48
            kotlin.Unit r5 = kotlin.Unit.f93236a
            return r5
        L48:
            androidx.compose.foundation.gestures.GestureCancellationException r5 = new androidx.compose.foundation.gestures.GestureCancellationException
            java.lang.String r0 = "The press gesture was canceled."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a.awaitRelease(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b() {
        this.f58042c = true;
        Mutex.a.c(this.f58044e, null, 1, null);
    }

    public final void c() {
        Mutex.a.b(this.f58044e, null, 1, null);
        this.f58042c = false;
        this.f58043d = false;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.f58041b.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.f58041b.getFontScale();
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public int mo301roundToPxR2X_6o(long j10) {
        return this.f58041b.mo301roundToPxR2X_6o(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public int mo302roundToPx0680j_4(float f10) {
        return this.f58041b.mo302roundToPx0680j_4(f10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public float mo303toDpGaN1DYA(long j10) {
        return this.f58041b.mo303toDpGaN1DYA(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo304toDpu2uoSUM(float f10) {
        return this.f58041b.mo304toDpu2uoSUM(f10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public long mo306toDpSizekrfVVM(long j10) {
        return this.f58041b.mo306toDpSizekrfVVM(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public float mo307toPxR2X_6o(long j10) {
        return this.f58041b.mo307toPxR2X_6o(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public float mo308toPx0680j_4(float f10) {
        return this.f58041b.mo308toPx0680j_4(f10);
    }

    @Override // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return this.f58041b.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public long mo309toSizeXkaWNTQ(long j10) {
        return this.f58041b.mo309toSizeXkaWNTQ(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public long mo310toSp0xMU5do(float f10) {
        return this.f58041b.mo310toSp0xMU5do(f10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo311toSpkPz2Gy4(float f10) {
        return this.f58041b.mo311toSpkPz2Gy4(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object tryAwaitRelease(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a.b
            if (r0 == 0) goto L13
            r0 = r5
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a$b r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a.b) r0
            int r1 = r0.f58051u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58051u = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a$b r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f58049s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f58051u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f58048r
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a) r0
            kotlin.d.b(r5)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.d.b(r5)
            boolean r5 = r4.f58042c
            if (r5 != 0) goto L4e
            boolean r5 = r4.f58043d
            if (r5 != 0) goto L4e
            kotlinx.coroutines.sync.Mutex r5 = r4.f58044e
            r0.f58048r = r4
            r0.f58051u = r3
            r2 = 0
            java.lang.Object r5 = kotlinx.coroutines.sync.Mutex.a.a(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r0 = r4
        L4f:
            boolean r5 = r0.f58042c
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a.tryAwaitRelease(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo305toDpu2uoSUM(int i10) {
        return this.f58041b.mo305toDpu2uoSUM(i10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo312toSpkPz2Gy4(int i10) {
        return this.f58041b.mo312toSpkPz2Gy4(i10);
    }
}

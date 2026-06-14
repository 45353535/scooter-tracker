package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.yf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4183yf extends En {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Fn f40000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ae f40001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4001r8 f40002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3878m9 f40003g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4183yf(Context context, GestureDetectorOnGestureListenerC3635ci adContainer, Fn mViewableAd, CoroutineScope hybridScope, Ae ae2, C4001r8 c4001r8, InterfaceC3878m9 interfaceC3878m9) {
        super(adContainer);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        Intrinsics.checkNotNullParameter(mViewableAd, "mViewableAd");
        Intrinsics.checkNotNullParameter(hybridScope, "hybridScope");
        this.f40000d = mViewableAd;
        this.f40001e = ae2;
        this.f40002f = c4001r8;
        this.f40003g = interfaceC3878m9;
        CoroutineScope coroutineScopeA = P4.a(hybridScope);
        Intrinsics.checkNotNullParameter(context, "context");
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("yf", "TAG");
            ((C3903n9) interfaceC3878m9).b("yf", "initializeOMSDK called");
        }
        int i10 = AbstractC3834kf.f38883a;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        AbstractC3834kf.a(applicationContext);
        eg.i.d(coroutineScopeA, null, null, new C4158xf(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.inmobi.media.C4183yf r11, kotlin.coroutines.jvm.internal.d r12) {
        /*
            r11.getClass()
            boolean r0 = r12 instanceof com.inmobi.media.C4133wf
            if (r0 == 0) goto L16
            r0 = r12
            com.inmobi.media.wf r0 = (com.inmobi.media.C4133wf) r0
            int r1 = r0.f39851c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f39851c = r1
            goto L1b
        L16:
            com.inmobi.media.wf r0 = new com.inmobi.media.wf
            r0.<init>(r11, r12)
        L1b:
            java.lang.Object r12 = r0.f39849a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f39851c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            kotlin.d.b(r12)
            goto L53
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            kotlin.d.b(r12)
            com.inmobi.media.pf r12 = com.inmobi.media.C3959pf.f39284a
            r0.f39851c = r4
            android.content.Context r12 = com.inmobi.media.Ji.f37157a
            if (r12 != 0) goto L43
            java.lang.String r12 = ""
            goto L50
        L43:
            kotlinx.coroutines.CoroutineDispatcher r2 = eg.o0.b()
            com.inmobi.media.nf r4 = new com.inmobi.media.nf
            r4.<init>(r12, r3)
            java.lang.Object r12 = eg.g.g(r2, r4, r0)
        L50:
            if (r12 != r1) goto L53
            return r1
        L53:
            r5 = r12
            java.lang.String r5 = (java.lang.String) r5
            com.inmobi.media.r8 r12 = r11.f40002f
            if (r12 == 0) goto L6f
            com.inmobi.media.Ae r4 = r11.f40001e
            if (r4 == 0) goto L6d
            java.util.ArrayList r6 = r12.f39454a
            java.util.Map r7 = r12.f39455b
            java.lang.String r8 = r12.f39457d
            java.lang.String r9 = r12.f39456c
            boolean r10 = r12.f39458e
            r4.a(r5, r6, r7, r8, r9, r10)
            kotlin.Unit r3 = kotlin.Unit.f93236a
        L6d:
            if (r3 != 0) goto L83
        L6f:
            com.inmobi.media.m9 r11 = r11.f40003g
            if (r11 == 0) goto L83
            java.lang.String r12 = "TAG"
            java.lang.String r0 = "yf"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r12)
            com.inmobi.media.n9 r11 = (com.inmobi.media.C3903n9) r11
            java.lang.String r12 = "OmidInfo is null, cannot track ad"
            r11.a(r0, r12)
            kotlin.Unit r11 = kotlin.Unit.f93236a
        L83:
            kotlin.Unit r11 = kotlin.Unit.f93236a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4183yf.a(com.inmobi.media.yf, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    @Override // com.inmobi.media.Fn
    public final View b() {
        return this.f40000d.b();
    }

    @Override // com.inmobi.media.Fn
    public final View c() {
        InterfaceC3878m9 interfaceC3878m9 = this.f40003g;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("yf", "TAG");
            ((C3903n9) interfaceC3878m9).c("yf", "inflateView called");
        }
        return this.f40000d.c();
    }

    @Override // com.inmobi.media.Fn
    public final void d() {
        InterfaceC3878m9 interfaceC3878m9 = this.f40003g;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("yf", "TAG");
            ((C3903n9) interfaceC3878m9).a("yf", "stopTrackingForImpression");
        }
        this.f40000d.d();
    }

    @Override // com.inmobi.media.Fn
    public final void a(View childView, FriendlyObstructionPurpose friendlyObstruction) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Intrinsics.checkNotNullParameter(friendlyObstruction, "obstructionCode");
        Ae ae2 = this.f40001e;
        if (ae2 != null) {
            Intrinsics.checkNotNullParameter(childView, "childView");
            Intrinsics.checkNotNullParameter(friendlyObstruction, "friendlyObstruction");
            if (ae2.f38485c == null) {
                InterfaceC3878m9 interfaceC3878m9 = ae2.f38484b;
                if (interfaceC3878m9 != null) {
                    ((C3903n9) interfaceC3878m9).a(AbstractC3669e1.f38482f, "Failed to addObstruction: adSession is null");
                    return;
                }
                return;
            }
            InterfaceC3878m9 interfaceC3878m92 = ae2.f38484b;
            if (interfaceC3878m92 != null) {
                ((C3903n9) interfaceC3878m92).a(AbstractC3669e1.f38482f, "addObstruction");
            }
            P4.a(ae2.f38483a, new X0(ae2, childView, friendlyObstruction, null));
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(View childView) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Ae ae2 = this.f40001e;
        if (ae2 != null) {
            Intrinsics.checkNotNullParameter(childView, "childView");
            if (ae2.f38485c == null) {
                return;
            }
            P4.a(ae2.f38483a, new C3566a1(ae2, childView, null));
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(Map map) {
        InterfaceC3878m9 interfaceC3878m9 = this.f40003g;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("yf", "TAG");
            ((C3903n9) interfaceC3878m9).a("yf", "startTrackingForImpression");
        }
        this.f40000d.a(map);
    }

    @Override // com.inmobi.media.Fn
    public final void a(Context context, byte b10) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40000d.a(context, b10);
    }

    @Override // com.inmobi.media.Fn
    public final void a() {
        InterfaceC3878m9 interfaceC3878m9 = this.f40003g;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue("yf", "TAG");
            ((C3903n9) interfaceC3878m9).c("yf", "destroy");
        }
        WeakReference weakReference = this.f36894b;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f40001e = null;
        this.f40000d.a();
    }
}

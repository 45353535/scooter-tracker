package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4182ye implements InterfaceC3636cj, InterfaceC4010rh, InterfaceC3693f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f39992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaView f39993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4036si f39994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC3669e1 f39995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D4 f39996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Nc f39997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ec f39998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Jc f39999h;

    public C4182ye(View view, MediaView mediaView, C4036si renderedStateCache, AbstractC3669e1 adSessionManager, D4 contextualDataHandler, Nc nativeBeaconProcessor, Ec nativeAdUnitComponent, Jc stateMachine) {
        Intrinsics.checkNotNullParameter(renderedStateCache, "renderedStateCache");
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        Intrinsics.checkNotNullParameter(contextualDataHandler, "contextualDataHandler");
        Intrinsics.checkNotNullParameter(nativeBeaconProcessor, "nativeBeaconProcessor");
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f39992a = view;
        this.f39993b = mediaView;
        this.f39994c = renderedStateCache;
        this.f39995d = adSessionManager;
        this.f39996e = contextualDataHandler;
        this.f39997f = nativeBeaconProcessor;
        this.f39998g = nativeAdUnitComponent;
        this.f39999h = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void a() {
        Gh gh2;
        C3903n9 c3903n9 = this.f39998g.f36789a.f39882a.f39145c;
        if (c3903n9 == null || (gh2 = c3903n9.f39085a) == null) {
            return;
        }
        gh2.a();
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC4010rh
    public final void a(InMobiNativeViewData nativeViewData) {
        Intrinsics.checkNotNullParameter(nativeViewData, "nativeViewData");
        this.f39999h.a(new C4057te(new C4082ue(this.f39994c, new Sg(nativeViewData, this.f39993b, this.f39992a), this.f39996e, this.f39995d, this.f39997f, this.f39998g), this.f39999h), this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r9.a(r2, r8, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.inmobi.media.InterfaceC3693f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.inmobi.media.C4132we
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.we r0 = (com.inmobi.media.C4132we) r0
            int r1 = r0.f39848c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39848c = r1
            goto L1a
        L13:
            com.inmobi.media.we r0 = new com.inmobi.media.we
            kotlin.coroutines.jvm.internal.d r9 = (kotlin.coroutines.jvm.internal.d) r9
            r0.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r0.f39846a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f39848c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.d.b(r9)
            goto La7
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            kotlin.d.b(r9)
            goto L92
        L3b:
            kotlin.d.b(r9)
            com.inmobi.media.e1 r9 = r8.f39995d
            com.iab.omid.library.inmobi.adsession.AdSession r2 = r9.f38485c
            r5 = 0
            if (r2 != 0) goto L53
            com.inmobi.media.m9 r9 = r9.f38484b
            if (r9 == 0) goto L6a
            java.lang.String r2 = com.inmobi.media.AbstractC3669e1.f38482f
            com.inmobi.media.n9 r9 = (com.inmobi.media.C3903n9) r9
            java.lang.String r6 = "Failed to stopAdSession. adSession is null"
            r9.a(r2, r6)
            goto L6a
        L53:
            com.inmobi.media.m9 r2 = r9.f38484b
            if (r2 == 0) goto L60
            java.lang.String r6 = com.inmobi.media.AbstractC3669e1.f38482f
            com.inmobi.media.n9 r2 = (com.inmobi.media.C3903n9) r2
            java.lang.String r7 = "stopAdSession"
            r2.a(r6, r7)
        L60:
            kotlinx.coroutines.CoroutineScope r2 = r9.f38483a
            com.inmobi.media.c1 r6 = new com.inmobi.media.c1
            r6.<init>(r9, r5)
            com.inmobi.media.P4.a(r2, r6)
        L6a:
            com.inmobi.media.Ec r9 = r8.f39998g
            kotlin.Lazy r9 = r9.f36795g
            java.lang.Object r9 = r9.getValue()
            com.inmobi.media.lc r9 = (com.inmobi.media.C3856lc) r9
            r0.f39848c = r4
            r9.getClass()
            eg.e1 r2 = eg.o0.c()
            com.inmobi.media.jc r4 = new com.inmobi.media.jc
            r4.<init>(r9, r5)
            java.lang.Object r9 = eg.g.g(r2, r4, r0)
            java.lang.Object r2 = pf.b.g()
            if (r9 != r2) goto L8d
            goto L8f
        L8d:
            kotlin.Unit r9 = kotlin.Unit.f93236a
        L8f:
            if (r9 != r1) goto L92
            goto La6
        L92:
            com.inmobi.media.D4 r9 = r8.f39996e
            r9.b()
            com.inmobi.media.Jc r9 = r8.f39999h
            com.inmobi.media.Vc r2 = new com.inmobi.media.Vc
            r2.<init>()
            r0.f39848c = r3
            java.lang.Object r9 = r9.a(r2, r8, r0)
            if (r9 != r1) goto La7
        La6:
            return r1
        La7:
            kotlin.Unit r9 = kotlin.Unit.f93236a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4182ye.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}

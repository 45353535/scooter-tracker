package com.inmobi.media;

import android.view.ViewGroup;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: renamed from: com.inmobi.media.te, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4057te extends AbstractC4167y implements InterfaceC3636cj, Ck, InterfaceC3693f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4082ue f39594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Jc f39595c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4057te(C4082ue provider, Jc stateMachine) {
        super(provider.f39675g.f36789a);
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f39594b = provider;
        this.f39595c = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void a() {
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("NativeRenderedState", "Initialize Called");
        }
        InterfaceC3636cj interfaceC3636cj = this.f39594b.f39675g.f36791c.f36566c;
        I i10 = interfaceC3636cj instanceof I ? (I) interfaceC3636cj : null;
        if (i10 != null) {
            i10.g();
        }
        C4082ue c4082ue = this.f39594b;
        C4036si c4036si = c4082ue.f39670b;
        if (!c4036si.f39545a) {
            c4036si.f39545a = true;
            AbstractC3669e1 abstractC3669e1 = c4082ue.f39673e;
            if (abstractC3669e1.f38485c == null) {
                InterfaceC3878m9 interfaceC3878m9 = abstractC3669e1.f38484b;
                if (interfaceC3878m9 != null) {
                    ((C3903n9) interfaceC3878m9).a(AbstractC3669e1.f38482f, "Failed to startAdSession. adSession is null");
                }
            } else {
                InterfaceC3878m9 interfaceC3878m92 = abstractC3669e1.f38484b;
                if (interfaceC3878m92 != null) {
                    ((C3903n9) interfaceC3878m92).a(AbstractC3669e1.f38482f, "startAdSession");
                }
                P4.a(abstractC3669e1.f38483a, new C3592b1(abstractC3669e1, null));
            }
            C4082ue c4082ue2 = this.f39594b;
            AbstractC3669e1 abstractC3669e12 = c4082ue2.f39673e;
            ViewGroup adView = c4082ue2.f39671c.f37729a.getParentView();
            abstractC3669e12.getClass();
            Intrinsics.checkNotNullParameter(adView, "adView");
            if (abstractC3669e12.f38485c == null) {
                InterfaceC3878m9 interfaceC3878m93 = abstractC3669e12.f38484b;
                if (interfaceC3878m93 != null) {
                    ((C3903n9) interfaceC3878m93).a(AbstractC3669e1.f38482f, "Failed to registerAdView. adSession is null");
                }
            } else {
                InterfaceC3878m9 interfaceC3878m94 = abstractC3669e12.f38484b;
                if (interfaceC3878m94 != null) {
                    ((C3903n9) interfaceC3878m94).a(AbstractC3669e1.f38482f, "registerAdView");
                }
                P4.a(abstractC3669e12.f38483a, new Y0(abstractC3669e12, adView, null));
            }
            G g10 = this.f39960a.f39883b;
            Intrinsics.checkNotNullParameter(g10, "<this>");
            MetaInfo metaInfo = g10.f36901d;
            if (Intrinsics.areEqual(metaInfo != null ? metaInfo.getCreativeType() : null, "video")) {
                this.f39594b.f39673e.a(true);
            } else {
                this.f39594b.f39673e.a();
            }
        }
        InterfaceC3878m9 interfaceC3878m9L2 = l();
        if (interfaceC3878m9L2 != null) {
            ((C3903n9) interfaceC3878m9L2).a("NativeRenderedState", "listenMediaEvents - setting up media event listener");
        }
        eg.i.d(this.f39594b.f39676h, null, null, new C3708fe(((C3856lc) this.f39594b.f39675g.f36795g.getValue()).f38974e, null, this), 3, null);
        P4.a(this.f39594b.f39676h, new C3631ce(this, null));
        C4082ue c4082ue3 = this.f39594b;
        if (c4082ue3.f39670b.f39546b) {
            InterfaceC3878m9 interfaceC3878m9L3 = l();
            if (interfaceC3878m9L3 != null) {
                ((C3903n9) interfaceC3878m9L3).a("NativeRenderedState", "Track Views Attached to Telemetry - Already triggered, skipping");
            }
        } else {
            eg.i.d(c4082ue3.f39676h, null, null, new C4007re(this, null), 3, null);
        }
        if (this.f39594b.f39670b.f39547c) {
            InterfaceC3878m9 interfaceC3878m9L4 = l();
            if (interfaceC3878m9L4 != null) {
                ((C3903n9) interfaceC3878m9L4).a("NativeRenderedState", "Impression Tracking - Already triggered, skipping");
            }
        } else {
            G g11 = this.f39960a.f39883b;
            Intrinsics.checkNotNullParameter(g11, "<this>");
            if (g11.f36910m.f36817a == 0) {
                InterfaceC3878m9 interfaceC3878m9L5 = l();
                if (interfaceC3878m9L5 != null) {
                    ((C3903n9) interfaceC3878m9L5).a("NativeRenderedState", "Impression Event Occurred - Load (immediate fire)");
                }
                m();
            } else {
                eg.i.d(this.f39594b.f39676h, null, null, new C3908ne(this, null), 3, null);
            }
        }
        if (!this.f39594b.f39670b.f39548d) {
            if (AbstractC4197z4.a(this.f39960a.f39883b, "mrc50").isEmpty()) {
                InterfaceC3878m9 interfaceC3878m9L6 = l();
                if (interfaceC3878m9L6 != null) {
                    ((C3903n9) interfaceC3878m9L6).a("NativeRenderedState", "MRC50 Trackers unavailable");
                }
            } else {
                Map mapA = AbstractC3789ik.a(((Dc) this.f39594b.f39675g.f36794f.getValue()).f36723a);
                Wj wj = Wj.f37959a;
                Wj.b("MRCViewable50Started", mapA, EnumC3585ak.f38215a);
                eg.i.d(this.f39594b.f39676h, null, null, new C3958pe(this, null), 3, null);
            }
        }
        C3856lc c3856lc = (C3856lc) this.f39594b.f39675g.f36795g.getValue();
        MutableStateFlow windowFlow = ((yo) this.f39594b.f39680l.getValue()).f40024b;
        c3856lc.getClass();
        Intrinsics.checkNotNullParameter(windowFlow, "windowFlow");
        C3903n9 c3903n9 = c3856lc.f38970a;
        if (c3903n9 != null) {
            c3903n9.a("MediaViewManager", "attachWindowLifecycleObserver called");
        }
        AbstractC3796j2 abstractC3796j2 = c3856lc.f38971b;
        if (abstractC3796j2 != null) {
            abstractC3796j2.a(windowFlow);
        }
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void c() {
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("NativeRenderedState", "Finalize Called");
        }
        P4.a(this.f39594b.k(), new C3657de(this, null));
        F3.a(this.f39594b.f39676h);
        ((Fd) this.f39594b.f39679k.getValue()).f36846a.a();
        ((C3707fd) this.f39594b.f39678j.getValue()).a();
        H6.a(((yo) this.f39594b.f39680l.getValue()).f40023a);
    }

    @Override // com.inmobi.media.Ck
    public final void d() {
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("NativeRenderedState", "unTrackViews");
        }
        C3856lc c3856lc = (C3856lc) this.f39594b.f39675g.f36795g.getValue();
        C3903n9 c3903n9 = c3856lc.f38970a;
        if (c3903n9 != null) {
            c3903n9.a("MediaViewManager", "detachObserversAndPause called");
        }
        AbstractC3796j2 abstractC3796j2 = c3856lc.f38971b;
        if (abstractC3796j2 != null) {
            abstractC3796j2.b();
        }
        C4082ue c4082ue = this.f39594b;
        Sg sg2 = c4082ue.f39671c;
        this.f39595c.a(new C4182ye(sg2.f37731c, sg2.f37730b, c4082ue.f39670b, c4082ue.f39673e, c4082ue.f39672d, c4082ue.f39674f, c4082ue.f39675g, this.f39595c), this);
    }

    public final void m() {
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("NativeRenderedState", "fireNativeImpression - Starting impression fire");
        }
        C4082ue c4082ue = this.f39594b;
        c4082ue.f39670b.f39547c = true;
        Map mapA = AbstractC3789ik.a(((Dc) c4082ue.f39675g.f36794f.getValue()).f36723a);
        Wj wj = Wj.f37959a;
        Wj.b("AdImpressionSuccessful", mapA, EnumC3585ak.f38215a);
        this.f39594b.f39675g.f36791c.g();
        this.f39594b.f39674f.f37444b.f37282f.a(Te.f37766a);
        AbstractC3669e1 abstractC3669e1 = this.f39594b.f39673e;
        if (abstractC3669e1.f38487e == null) {
            InterfaceC3878m9 interfaceC3878m9 = abstractC3669e1.f38484b;
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).a(AbstractC3669e1.f38482f, "Failed to registerImpression: AdEvent is null");
                return;
            }
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = abstractC3669e1.f38484b;
        if (interfaceC3878m92 != null) {
            ((C3903n9) interfaceC3878m92).a(AbstractC3669e1.f38482f, "registerImpression");
        }
        P4.a(abstractC3669e1.f38483a, new Z0(abstractC3669e1, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0122, code lost:
    
        if (r9.a(r2, r8, r0) == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.inmobi.media.InterfaceC3693f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4057te.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}

package com.inmobi.media;

import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.xe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4157xe implements InterfaceC3636cj, InterfaceC4010rh, I, InterfaceC3719g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fc f39926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4142x f39927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PublisherCallbacks f39928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC3713fj f39929d;

    public C4157xe(Fc adUnit, C4142x adComponent, PublisherCallbacks publisherCallbacks, AbstractC3713fj stateMachine) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f39926a = adUnit;
        this.f39927b = adComponent;
        this.f39928c = publisherCallbacks;
        this.f39929d = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void a() {
        C3903n9 c3903n9 = this.f39927b.f39882a.f39145c;
        if (c3903n9 != null) {
            c3903n9.a("AUM-NativeUnTrackedState", "Initialize Called");
        }
        this.f39926a.f36845b.d();
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void c() {
    }

    @Override // com.inmobi.media.I
    public final void g() {
        C3903n9 c3903n9 = this.f39927b.f39882a.f39145c;
        if (c3903n9 != null) {
            c3903n9.a("AUM-NativeUnTrackedState", "onAdDisplayed");
        }
        this.f39929d.a(new C4032se(this.f39926a, this.f39927b, this.f39928c, this.f39929d), this);
    }

    @Override // com.inmobi.media.InterfaceC3719g
    public final void j() {
        this.f39929d.a(new C3998r5(this.f39926a, null, this.f39927b), this);
    }

    @Override // com.inmobi.media.InterfaceC4010rh
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        C3903n9 c3903n9 = this.f39927b.f39882a.f39145c;
        if (c3903n9 != null) {
            c3903n9.a("AUM-NativeUnTrackedState", "registerViewForTracking");
        }
        Fc fc2 = this.f39926a;
        fc2.getClass();
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        fc2.f36845b.a(inMobiNativeViewData);
    }
}

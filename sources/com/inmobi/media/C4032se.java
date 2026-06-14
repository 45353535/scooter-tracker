package com.inmobi.media;

import com.inmobi.ads.controllers.PublisherCallbacks;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4032se extends AbstractC4011ri implements Sl, Ck {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Fc f39527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C4142x f39528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PublisherCallbacks f39529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC3713fj f39530i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4032se(Fc adUnit, C4142x adComponent, PublisherCallbacks publisherCallbacks, AbstractC3713fj stateMachine) {
        super(adUnit, adComponent, publisherCallbacks, stateMachine);
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f39527f = adUnit;
        this.f39528g = adComponent;
        this.f39529h = publisherCallbacks;
        this.f39530i = stateMachine;
    }

    @Override // com.inmobi.media.Sl
    public final void a(boolean z10) {
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("AUM-NativeRenderedState", "onAudioStateChanged " + z10);
        }
        P4.a(k(), new C3734ge(this, z10, null));
    }

    @Override // com.inmobi.media.Sl
    public final void b() {
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("AUM-NativeRenderedState", "onVideoPaused");
        }
        P4.a(k(), new C3808je(this, null));
    }

    @Override // com.inmobi.media.Ck
    public final void d() {
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("AUM-NativeRenderedState", "unTrackViews - stopping view tracking");
        }
        this.f39530i.a(new C4157xe(this.f39527f, this.f39528g, this.f39529h, this.f39530i), this);
    }

    @Override // com.inmobi.media.Sl
    public final void f() {
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("AUM-NativeRenderedState", "onVideoStarted");
        }
        P4.a(k(), new C3858le(this, null));
    }

    @Override // com.inmobi.media.Sl
    public final void h() {
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("AUM-NativeRenderedState", "onVideoCompleted");
        }
        P4.a(k(), new C3784ie(this, null));
    }

    @Override // com.inmobi.media.Sl
    public final void i() {
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("AUM-NativeRenderedState", "onVideoResumed");
        }
        P4.a(k(), new C3833ke(this, null));
    }
}

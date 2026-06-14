package com.inmobi.media;

import com.inmobi.ads.controllers.PublisherCallbacks;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ri, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4011ri extends AbstractC4167y implements InterfaceC3636cj, InterfaceC3719g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fc f39474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4142x f39475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PublisherCallbacks f39476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC3713fj f39477e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4011ri(Fc adUnit, C4142x adComponent, PublisherCallbacks publisherCallbacks, AbstractC3713fj stateMachine) {
        super(adComponent);
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f39474b = adUnit;
        this.f39475c = adComponent;
        this.f39476d = publisherCallbacks;
        this.f39477e = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void a() {
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("AUM-RenderedState", "Initialize Called");
        }
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC3719g
    public final void j() {
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("AUM-RenderedState", "onDestroy");
        }
        this.f39477e.a(new C3998r5(this.f39474b, null, this.f39475c), this);
    }
}

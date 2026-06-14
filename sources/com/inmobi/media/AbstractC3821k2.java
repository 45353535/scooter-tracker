package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3821k2 implements InterfaceC3636cj, InterfaceC3719g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC4019s1 f38850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4126w8 f38851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ac f38852c;

    public AbstractC3821k2(AbstractC4019s1 abstractC4019s1, InterfaceC4126w8 adManagerComponent, Ac stateMachine) {
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f38850a = abstractC4019s1;
        this.f38851b = adManagerComponent;
        this.f38852c = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC3719g
    public final void j() {
        this.f38852c.a(new C3998r5(this.f38851b), this);
    }
}

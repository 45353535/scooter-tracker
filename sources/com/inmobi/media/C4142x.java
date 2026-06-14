package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4142x implements InterfaceC4126w8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3920o1 f39882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G f39883b;

    public C4142x(C3920o1 adManagerComponent, G adContext) {
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(adContext, "adContext");
        this.f39882a = adManagerComponent;
        this.f39883b = adContext;
    }

    @Override // com.inmobi.media.InterfaceC4126w8
    public final CoroutineScope a() {
        return this.f39882a.f39147e;
    }

    @Override // com.inmobi.media.InterfaceC4126w8
    public final C3869m0 b() {
        return this.f39882a.f39148f;
    }

    @Override // com.inmobi.media.InterfaceC4126w8
    public final InterfaceC3878m9 c() {
        return this.f39882a.f39145c;
    }
}

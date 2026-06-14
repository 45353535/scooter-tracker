package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4167y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4142x f39960a;

    public AbstractC4167y(C4142x adComponent) {
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        this.f39960a = adComponent;
    }

    public final CoroutineScope k() {
        return this.f39960a.f39882a.f39147e;
    }

    public final InterfaceC3878m9 l() {
        return this.f39960a.f39882a.f39145c;
    }
}

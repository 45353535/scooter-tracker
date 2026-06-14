package com.inmobi.media;

import com.inmobi.media.Wm;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class Wm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f37973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3750h5 f37974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final In f37975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lazy f37976d;

    public Wm(CoroutineScope coroutineScope, C3750h5 trackingView, In config) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(trackingView, "trackingView");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f37973a = coroutineScope;
        this.f37974b = trackingView;
        this.f37975c = config;
        this.f37976d = lf.i.a(new Function0() { // from class: w3.m5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Wm.a(this.f107184b);
            }
        });
    }

    public static final C4134wg a(Wm wm) {
        In in = wm.f37975c;
        return new C4134wg(wm.f37973a, new C4184yg(wm.f37975c.f37082b), new Kn(new Jn(in.f37081a, in.f37083c), new C3584aj(wm.f37974b, CollectionsKt.emptyList())));
    }
}

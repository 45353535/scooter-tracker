package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.t5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4048t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4073u5 f39575a;

    public AbstractC4048t5(C4073u5 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f39575a = listener;
    }

    public abstract void a();

    public abstract void b();
}

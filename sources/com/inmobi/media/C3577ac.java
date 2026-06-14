package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3577ac implements Zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Zb f38178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f38179b;

    public C3577ac(Zb mediaChangeReceiver) {
        Intrinsics.checkNotNullParameter(mediaChangeReceiver, "mediaChangeReceiver");
        this.f38178a = mediaChangeReceiver;
        this.f38179b = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.Zb
    public final void a() {
        if (this.f38179b.getAndSet(false)) {
            this.f38178a.a();
        }
    }

    @Override // com.inmobi.media.Zb
    public final void b() {
        if (this.f38179b.getAndSet(true)) {
            return;
        }
        this.f38178a.b();
    }
}

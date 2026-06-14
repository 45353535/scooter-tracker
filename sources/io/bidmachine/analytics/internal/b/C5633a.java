package io.bidmachine.analytics.internal.b;

import io.bidmachine.analytics.internal.c.InterfaceC5636b;
import io.bidmachine.analytics.internal.d.C5637a;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.b.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5633a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5636b f79523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5637a f79524b;

    public C5633a(InterfaceC5636b interfaceC5636b, C5637a c5637a) {
        this.f79523a = interfaceC5636b;
        this.f79524b = c5637a;
    }

    public final C5637a a() {
        return this.f79524b;
    }

    public final byte[] a(byte[] bArr) {
        return this.f79523a.a(this.f79524b.a(), bArr);
    }
}

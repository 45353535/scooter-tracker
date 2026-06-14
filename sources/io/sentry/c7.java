package io.sentry;

import j$.time.Instant;

/* JADX INFO: loaded from: classes3.dex */
public final class c7 extends s5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Instant f83309b;

    public c7() {
        this(Instant.now());
    }

    @Override // io.sentry.s5
    public long g() {
        return l.n(this.f83309b.getEpochSecond()) + ((long) this.f83309b.getNano());
    }

    public c7(Instant instant) {
        this.f83309b = instant;
    }
}

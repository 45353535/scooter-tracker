package io.sentry.featureflags;

import io.sentry.protocol.g;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f83500a = new c();

    public static c a() {
        return f83500a;
    }

    @Override // io.sentry.featureflags.b
    public g getFeatureFlags() {
        return null;
    }

    @Override // io.sentry.featureflags.b
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public b m7810clone() {
        return f83500a;
    }
}

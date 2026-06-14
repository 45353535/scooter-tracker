package com.fyber.inneractive.sdk.metrics;

import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21150a = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21151b;

    public h(String str) {
        this.f21151b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return this.f21150a.equals(((h) obj).f21150a);
    }

    public final int hashCode() {
        return this.f21150a.hashCode();
    }
}

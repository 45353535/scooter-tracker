package io.appmetrica.analytics.networktasks.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkTask f78835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78836b;

    public d(NetworkTask networkTask) {
        this.f78835a = networkTask;
        this.f78836b = networkTask.description();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f78836b.equals(((d) obj).f78836b);
    }

    public final int hashCode() {
        return this.f78836b.hashCode();
    }
}

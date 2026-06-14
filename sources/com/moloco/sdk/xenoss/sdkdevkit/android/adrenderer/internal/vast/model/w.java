package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f57630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f57632c;

    public w(x event, String url, t tVar) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f57630a = event;
        this.f57631b = url;
        this.f57632c = tVar;
    }

    public final x a() {
        return this.f57630a;
    }

    public final t b() {
        return this.f57632c;
    }

    public final String c() {
        return this.f57631b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f57630a == wVar.f57630a && Intrinsics.areEqual(this.f57631b, wVar.f57631b) && Intrinsics.areEqual(this.f57632c, wVar.f57632c);
    }

    public int hashCode() {
        int iHashCode = ((this.f57630a.hashCode() * 31) + this.f57631b.hashCode()) * 31;
        t tVar = this.f57632c;
        return iHashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    public String toString() {
        return "Tracking(event=" + this.f57630a + ", url=" + this.f57631b + ", offset=" + this.f57632c + ')';
    }
}

package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Ke extends Me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3964pk f37222b;

    public Ke(String url, C3964pk c3964pk) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f37221a = url;
        this.f37222b = c3964pk;
    }

    @Override // com.inmobi.media.Me
    public final Map a() {
        return null;
    }

    @Override // com.inmobi.media.Me
    public final Ai b() {
        return null;
    }

    @Override // com.inmobi.media.Me
    public final String c() {
        return this.f37221a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ke)) {
            return false;
        }
        Ke ke2 = (Ke) obj;
        return Intrinsics.areEqual(this.f37221a, ke2.f37221a) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f37222b, ke2.f37222b) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        return androidx.compose.foundation.c.a(true) + ((this.f37222b.hashCode() + (this.f37221a.hashCode() * 961)) * 961);
    }

    public final String toString() {
        return "HeadRequest(url=" + this.f37221a + ", headers=" + ((Object) null) + ", timeouts=" + this.f37222b + ", retryPolicy=" + ((Object) null) + ", followRedirects=true)";
    }
}

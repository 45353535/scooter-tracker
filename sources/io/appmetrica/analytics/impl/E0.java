package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeCrashSource f75689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f75692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f75693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F0 f75694f;

    public E0(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j10, F0 f02) {
        this.f75689a = nativeCrashSource;
        this.f75690b = str;
        this.f75691c = str2;
        this.f75692d = str3;
        this.f75693e = j10;
        this.f75694f = f02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e02 = (E0) obj;
        return this.f75689a == e02.f75689a && Intrinsics.areEqual(this.f75690b, e02.f75690b) && Intrinsics.areEqual(this.f75691c, e02.f75691c) && Intrinsics.areEqual(this.f75692d, e02.f75692d) && this.f75693e == e02.f75693e && Intrinsics.areEqual(this.f75694f, e02.f75694f);
    }

    public final int hashCode() {
        return this.f75694f.hashCode() + ((androidx.collection.b.a(this.f75693e) + ((this.f75692d.hashCode() + ((this.f75691c.hashCode() + ((this.f75690b.hashCode() + (this.f75689a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AppMetricaNativeCrash(source=" + this.f75689a + ", handlerVersion=" + this.f75690b + ", uuid=" + this.f75691c + ", dumpFile=" + this.f75692d + ", creationTime=" + this.f75693e + ", metadata=" + this.f75694f + ')';
    }
}

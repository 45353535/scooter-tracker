package com.moloco.sdk.acm;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f53952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f53953b;

    public d(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f53952a = key;
        this.f53953b = value;
    }

    public final String a() {
        return this.f53952a;
    }

    public final String b() {
        return this.f53953b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f53952a, dVar.f53952a) && Intrinsics.areEqual(this.f53953b, dVar.f53953b);
    }

    public int hashCode() {
        return (this.f53952a.hashCode() * 31) + this.f53953b.hashCode();
    }

    public String toString() {
        return "EventTag(key=" + this.f53952a + ", value=" + this.f53953b + ')';
    }
}

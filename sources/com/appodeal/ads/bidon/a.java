package com.appodeal.ads.bidon;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13149a;

    public a() {
        this.f13149a = null;
    }

    public static a a(String str) {
        return new a(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f13149a, ((a) obj).f13149a);
    }

    public final int hashCode() {
        String str = this.f13149a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "BidonConfig(endpoint=" + this.f13149a + ")";
    }

    public a(String str) {
        this.f13149a = str;
    }
}

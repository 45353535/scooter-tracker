package com.inmobi.media;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Ra extends Sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f37651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f37654d;

    public Ra(Activity activity, String finalUrl, String callerId, boolean z10) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(finalUrl, "finalUrl");
        Intrinsics.checkNotNullParameter(callerId, "callerId");
        this.f37651a = activity;
        this.f37652b = finalUrl;
        this.f37653c = callerId;
        this.f37654d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ra)) {
            return false;
        }
        Ra ra2 = (Ra) obj;
        return Intrinsics.areEqual(this.f37651a, ra2.f37651a) && Intrinsics.areEqual(this.f37652b, ra2.f37652b) && Intrinsics.areEqual(this.f37653c, ra2.f37653c) && this.f37654d == ra2.f37654d;
    }

    public final int hashCode() {
        return androidx.compose.foundation.c.a(this.f37654d) + ((this.f37653c.hashCode() + ((this.f37652b.hashCode() + (this.f37651a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Valid(activity=" + this.f37651a + ", finalUrl=" + this.f37652b + ", callerId=" + this.f37653c + ", overlay=" + this.f37654d + ")";
    }
}

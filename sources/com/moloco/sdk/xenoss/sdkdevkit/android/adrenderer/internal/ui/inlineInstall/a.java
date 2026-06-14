package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f57050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f57051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f57052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f57053d;

    public a(boolean z10, boolean z11, String str, String str2) {
        this.f57050a = z10;
        this.f57051b = z11;
        this.f57052c = str;
        this.f57053d = str2;
    }

    public final String a() {
        return this.f57053d;
    }

    public final boolean b() {
        return this.f57050a;
    }

    public final String c() {
        return this.f57052c;
    }

    public final boolean d() {
        return this.f57051b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f57050a == aVar.f57050a && this.f57051b == aVar.f57051b && Intrinsics.areEqual(this.f57052c, aVar.f57052c) && Intrinsics.areEqual(this.f57053d, aVar.f57053d);
    }

    public int hashCode() {
        int iA = ((androidx.compose.foundation.c.a(this.f57050a) * 31) + androidx.compose.foundation.c.a(this.f57051b)) * 31;
        String str = this.f57052c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57053d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AndroidAutoInlineControllerData(enabled=" + this.f57050a + ", onSkip=" + this.f57051b + ", eventLink=" + this.f57052c + ", clickthroughUrl=" + this.f57053d + ')';
    }
}

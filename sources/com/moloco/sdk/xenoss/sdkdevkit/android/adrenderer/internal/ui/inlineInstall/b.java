package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f57054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57055b;

    public b(boolean z10, String str) {
        this.f57054a = z10;
        this.f57055b = str;
    }

    public final boolean a() {
        return this.f57054a;
    }

    public final String b() {
        return this.f57055b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f57054a == bVar.f57054a && Intrinsics.areEqual(this.f57055b, bVar.f57055b);
    }

    public int hashCode() {
        int iA = androidx.compose.foundation.c.a(this.f57054a) * 31;
        String str = this.f57055b;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AndroidInlineControllerData(enabled=" + this.f57054a + ", url=" + this.f57055b + ')';
    }
}

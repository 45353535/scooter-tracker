package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation;

import androidx.compose.foundation.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f56738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f56739b;

    public b(a orientation, boolean z10) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.f56738a = orientation;
        this.f56739b = z10;
    }

    public final a a() {
        return this.f56738a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f56738a == bVar.f56738a && this.f56739b == bVar.f56739b;
    }

    public int hashCode() {
        return (this.f56738a.hashCode() * 31) + c.a(this.f56739b);
    }

    public String toString() {
        return "OrientationSettings(orientation=" + this.f56738a + ", allowOrientationChange=" + this.f56739b + ')';
    }

    public /* synthetic */ b(a aVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i10 & 2) != 0 ? true : z10);
    }
}

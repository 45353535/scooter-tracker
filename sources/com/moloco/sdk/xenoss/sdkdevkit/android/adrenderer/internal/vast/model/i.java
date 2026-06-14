package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f57572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f57573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f57574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f57575e;

    public i(String str, Integer num, String str2, String str3, j child) {
        Intrinsics.checkNotNullParameter(child, "child");
        this.f57571a = str;
        this.f57572b = num;
        this.f57573c = str2;
        this.f57574d = str3;
        this.f57575e = child;
    }

    public final String a() {
        return this.f57574d;
    }

    public final j b() {
        return this.f57575e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f57571a, iVar.f57571a) && Intrinsics.areEqual(this.f57572b, iVar.f57572b) && Intrinsics.areEqual(this.f57573c, iVar.f57573c) && Intrinsics.areEqual(this.f57574d, iVar.f57574d) && Intrinsics.areEqual(this.f57575e, iVar.f57575e);
    }

    public int hashCode() {
        String str = this.f57571a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f57572b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f57573c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57574d;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f57575e.hashCode();
    }

    public String toString() {
        return "Creative(id=" + this.f57571a + ", sequence=" + this.f57572b + ", adId=" + this.f57573c + ", apiFramework=" + this.f57574d + ", child=" + this.f57575e + ')';
    }
}

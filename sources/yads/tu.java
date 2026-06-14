package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116387b;

    public tu(int i10, String str) {
        this.f116386a = str;
        this.f116387b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu)) {
            return false;
        }
        tu tuVar = (tu) obj;
        return Intrinsics.areEqual(this.f116386a, tuVar.f116386a) && this.f116387b == tuVar.f116387b;
    }

    public final int hashCode() {
        return this.f116387b + (this.f116386a.hashCode() * 31);
    }

    public final String toString() {
        return "ClickQrcode(url=" + this.f116386a + ", sizeInPx=" + this.f116387b + ")";
    }
}

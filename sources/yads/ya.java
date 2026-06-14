package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f118120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f118121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f118122c;

    public ya(String str, String str2, boolean z10) {
        this.f118120a = z10;
        this.f118121b = str;
        this.f118122c = str2;
    }

    public final String a() {
        return this.f118122c;
    }

    public final String b() {
        return this.f118121b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya)) {
            return false;
        }
        ya yaVar = (ya) obj;
        return this.f118120a == yaVar.f118120a && Intrinsics.areEqual(this.f118121b, yaVar.f118121b) && Intrinsics.areEqual(this.f118122c, yaVar.f118122c);
    }

    public final int hashCode() {
        return this.f118122c.hashCode() + j4.a(this.f118121b, androidx.compose.foundation.c.a(this.f118120a) * 31, 31);
    }

    public final String toString() {
        return "AdTuneInfo(shouldShow=" + this.f118120a + ", token=" + this.f118121b + ", advertiserInfo=" + this.f118122c + ")";
    }
}

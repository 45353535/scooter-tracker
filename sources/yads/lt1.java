package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class lt1 {

    @NotNull
    public static final kt1 Companion = new kt1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f113219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f113221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f113222d;

    public /* synthetic */ lt1(int i10, long j10, String str, String str2, String str3) {
        if (15 != (i10 & 15)) {
            yg.e2.a(i10, 15, jt1.f112455a.getDescriptor());
        }
        this.f113219a = j10;
        this.f113220b = str;
        this.f113221c = str2;
        this.f113222d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt1)) {
            return false;
        }
        lt1 lt1Var = (lt1) obj;
        return this.f113219a == lt1Var.f113219a && Intrinsics.areEqual(this.f113220b, lt1Var.f113220b) && Intrinsics.areEqual(this.f113221c, lt1Var.f113221c) && Intrinsics.areEqual(this.f113222d, lt1Var.f113222d);
    }

    public final int hashCode() {
        return this.f113222d.hashCode() + j4.a(this.f113221c, j4.a(this.f113220b, androidx.collection.b.a(this.f113219a) * 31, 31), 31);
    }

    public final String toString() {
        return "MobileAdsSdkLog(timestamp=" + this.f113219a + ", type=" + this.f113220b + ", tag=" + this.f113221c + ", text=" + this.f113222d + ")";
    }

    public lt1(long j10, String str, String str2, String str3) {
        this.f113219a = j10;
        this.f113220b = str;
        this.f113221c = str2;
        this.f113222d = str3;
    }
}

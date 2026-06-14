package f1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f69745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f69746b;

    public ef(int i10, byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f69745a = i10;
        this.f69746b = data;
    }

    public final byte[] a() {
        return this.f69746b;
    }

    public final int b() {
        return this.f69745a;
    }

    public final boolean c() {
        int i10 = this.f69745a;
        return i10 >= 200 && i10 < 300;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef)) {
            return false;
        }
        ef efVar = (ef) obj;
        return this.f69745a == efVar.f69745a && Intrinsics.areEqual(this.f69746b, efVar.f69746b);
    }

    public int hashCode() {
        return (this.f69745a * 31) + Arrays.hashCode(this.f69746b);
    }

    public String toString() {
        return "CBNetworkServerResponse(statusCode=" + this.f69745a + ", data=" + Arrays.toString(this.f69746b) + ")";
    }
}

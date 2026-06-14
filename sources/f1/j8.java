package f1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f70164c;

    public j8(String url, String vendor, String params) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f70162a = url;
        this.f70163b = vendor;
        this.f70164c = params;
    }

    public final String a() {
        return this.f70164c;
    }

    public final String b() {
        return this.f70162a;
    }

    public final String c() {
        return this.f70163b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8)) {
            return false;
        }
        j8 j8Var = (j8) obj;
        return Intrinsics.areEqual(this.f70162a, j8Var.f70162a) && Intrinsics.areEqual(this.f70163b, j8Var.f70163b) && Intrinsics.areEqual(this.f70164c, j8Var.f70164c);
    }

    public int hashCode() {
        return (((this.f70162a.hashCode() * 31) + this.f70163b.hashCode()) * 31) + this.f70164c.hashCode();
    }

    public String toString() {
        return "VerificationModel(url=" + this.f70162a + ", vendor=" + this.f70163b + ", params=" + this.f70164c + ")";
    }
}

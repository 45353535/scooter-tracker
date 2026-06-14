package f1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f69664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f69665d;

    public de(String url, String method, String str, String str2) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        this.f69662a = url;
        this.f69663b = method;
        this.f69664c = str;
        this.f69665d = str2;
    }

    public final String a() {
        return this.f69664c;
    }

    public final String b() {
        return this.f69665d;
    }

    public final String c() {
        return this.f69663b;
    }

    public final String d() {
        return this.f69662a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de)) {
            return false;
        }
        de deVar = (de) obj;
        return Intrinsics.areEqual(this.f69662a, deVar.f69662a) && Intrinsics.areEqual(this.f69663b, deVar.f69663b) && Intrinsics.areEqual(this.f69664c, deVar.f69664c) && Intrinsics.areEqual(this.f69665d, deVar.f69665d);
    }

    public int hashCode() {
        int iHashCode = ((this.f69662a.hashCode() * 31) + this.f69663b.hashCode()) * 31;
        String str = this.f69664c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f69665d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "TrackerConfig(url=" + this.f69662a + ", method=" + this.f69663b + ", bodyTemplate=" + this.f69664c + ", contentType=" + this.f69665d + ")";
    }

    public /* synthetic */ de(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
    }
}

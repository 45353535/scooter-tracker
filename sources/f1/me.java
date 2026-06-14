package f1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f70494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f70495c;

    public me(String str, boolean z10, String webViewVersion) {
        Intrinsics.checkNotNullParameter(webViewVersion, "webViewVersion");
        this.f70493a = str;
        this.f70494b = z10;
        this.f70495c = webViewVersion;
    }

    public final String a() {
        return this.f70493a;
    }

    public final boolean b() {
        return this.f70494b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me)) {
            return false;
        }
        me meVar = (me) obj;
        return Intrinsics.areEqual(this.f70493a, meVar.f70493a) && this.f70494b == meVar.f70494b && Intrinsics.areEqual(this.f70495c, meVar.f70495c);
    }

    public int hashCode() {
        String str = this.f70493a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + androidx.compose.foundation.c.a(this.f70494b)) * 31) + this.f70495c.hashCode();
    }

    public String toString() {
        return "ConfigurationBodyFields(configVariant=" + this.f70493a + ", webViewEnabled=" + this.f70494b + ", webViewVersion=" + this.f70495c + ")";
    }
}

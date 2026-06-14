package f1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f70339c;

    public l7(String mediationName, String libraryVersion, String adapterVersion) {
        Intrinsics.checkNotNullParameter(mediationName, "mediationName");
        Intrinsics.checkNotNullParameter(libraryVersion, "libraryVersion");
        Intrinsics.checkNotNullParameter(adapterVersion, "adapterVersion");
        this.f70337a = mediationName;
        this.f70338b = libraryVersion;
        this.f70339c = adapterVersion;
    }

    public final String a() {
        return this.f70339c;
    }

    public final String b() {
        return this.f70338b;
    }

    public final String c() {
        return this.f70337a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7)) {
            return false;
        }
        l7 l7Var = (l7) obj;
        return Intrinsics.areEqual(this.f70337a, l7Var.f70337a) && Intrinsics.areEqual(this.f70338b, l7Var.f70338b) && Intrinsics.areEqual(this.f70339c, l7Var.f70339c);
    }

    public int hashCode() {
        return (((this.f70337a.hashCode() * 31) + this.f70338b.hashCode()) * 31) + this.f70339c.hashCode();
    }

    public String toString() {
        return "MediationBodyFields(mediationName=" + this.f70337a + ", libraryVersion=" + this.f70338b + ", adapterVersion=" + this.f70339c + ")";
    }
}

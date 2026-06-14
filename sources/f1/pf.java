package f1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f70790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f70791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b1.e f70792e;

    public pf(String str, String location, int i10, String adTypeName, b1.e eVar) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        this.f70788a = str;
        this.f70789b = location;
        this.f70790c = i10;
        this.f70791d = adTypeName;
        this.f70792e = eVar;
    }

    public final String a() {
        return this.f70788a;
    }

    public final String b() {
        return this.f70791d;
    }

    public final String c() {
        return this.f70789b;
    }

    public final b1.e d() {
        return this.f70792e;
    }

    public final int e() {
        return this.f70790c;
    }
}

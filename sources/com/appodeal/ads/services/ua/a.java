package com.appodeal.ads.services.ua;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f14757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14758d;

    public a(String id2, String name, Map payload, String service) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f14755a = id2;
        this.f14756b = name;
        this.f14757c = payload;
        this.f14758d = service;
    }

    public final String a() {
        return this.f14755a;
    }

    public final String b() {
        return this.f14756b;
    }

    public final Map c() {
        return this.f14757c;
    }

    public final String d() {
        return this.f14758d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f14755a, aVar.f14755a) && Intrinsics.areEqual(this.f14756b, aVar.f14756b) && Intrinsics.areEqual(this.f14757c, aVar.f14757c) && Intrinsics.areEqual(this.f14758d, aVar.f14758d);
    }

    public final int hashCode() {
        return this.f14758d.hashCode() + ((this.f14757c.hashCode() + com.appodeal.ads.initializing.f.a(this.f14756b, this.f14755a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "ServiceEvent(id=" + this.f14755a + ", name=" + this.f14756b + ", payload=" + this.f14757c + ", service=" + this.f14758d + ")";
    }
}

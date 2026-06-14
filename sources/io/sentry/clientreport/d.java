package io.sentry.clientreport;

import io.sentry.util.w;

/* JADX INFO: loaded from: classes3.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f83375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f83376b;

    d(String str, String str2) {
        this.f83375a = str;
        this.f83376b = str2;
    }

    public String a() {
        return this.f83376b;
    }

    public String b() {
        return this.f83375a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return w.a(b(), dVar.b()) && w.a(a(), dVar.a());
    }

    public int hashCode() {
        return w.b(b(), a());
    }
}

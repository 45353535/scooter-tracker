package io.sentry.internal.gestures;

import io.sentry.util.w;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WeakReference f83628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f83629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f83630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f83631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final String f83632e;

    public enum a {
        CLICKABLE,
        SCROLLABLE
    }

    public b(Object obj, String str, String str2, String str3, String str4) {
        this.f83628a = new WeakReference(obj);
        this.f83629b = str;
        this.f83630c = str2;
        this.f83631d = str3;
        this.f83632e = str4;
    }

    public String a() {
        return this.f83629b;
    }

    public String b() {
        String str = this.f83630c;
        return str != null ? str : (String) w.c(this.f83631d, "UiElement.tag can't be null");
    }

    public String c() {
        return this.f83632e;
    }

    public String d() {
        return this.f83630c;
    }

    public String e() {
        return this.f83631d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (w.a(this.f83629b, bVar.f83629b) && w.a(this.f83630c, bVar.f83630c) && w.a(this.f83631d, bVar.f83631d)) {
                return true;
            }
        }
        return false;
    }

    public Object f() {
        return this.f83628a.get();
    }

    public int hashCode() {
        return w.b(this.f83628a, this.f83630c, this.f83631d);
    }
}

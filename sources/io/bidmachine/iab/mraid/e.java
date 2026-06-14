package io.bidmachine.iab.mraid;

import j$.util.Objects;
import java.util.Date;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f80207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Date f80208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f80209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f80210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Date f80211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f80212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f80213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f80214h;

    e(String str, Date date) {
        this.f80207a = str;
        this.f80208b = date;
    }

    void a(String str) {
        this.f80209c = str;
    }

    void b(Date date) {
        this.f80211e = date;
    }

    void c(String str) {
        this.f80214h = str;
    }

    void d(String str) {
        this.f80212f = str;
    }

    void e(String str) {
        this.f80210d = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Objects.equals(this.f80207a, eVar.f80207a) && Objects.equals(this.f80208b, eVar.f80208b) && Objects.equals(this.f80209c, eVar.f80209c) && Objects.equals(this.f80210d, eVar.f80210d) && Objects.equals(this.f80211e, eVar.f80211e) && Objects.equals(this.f80212f, eVar.f80212f) && Objects.equals(this.f80213g, eVar.f80213g) && Objects.equals(this.f80214h, eVar.f80214h);
    }

    void f(String str) {
        this.f80213g = str;
    }

    public String g() {
        return this.f80207a;
    }

    public Date h() {
        return this.f80211e;
    }

    public int hashCode() {
        return Objects.hash(this.f80207a, this.f80208b, this.f80209c, this.f80210d, this.f80211e, this.f80212f, this.f80213g, this.f80214h);
    }

    public String i() {
        return this.f80209c;
    }

    public String j() {
        return this.f80214h;
    }

    public Date k() {
        return this.f80208b;
    }

    public String l() {
        return this.f80212f;
    }

    public String m() {
        return this.f80210d;
    }

    public String n() {
        return this.f80213g;
    }

    public String toString() {
        return "MraidCalendarEvent{description='" + this.f80207a + "', start=" + this.f80208b + ", location='" + this.f80209c + "', summary='" + this.f80210d + "', end=" + this.f80211e + ", status='" + this.f80212f + "', transparency='" + this.f80213g + "', recurrence='" + this.f80214h + "'}";
    }
}

package com.iab.omid.library.applovin.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.applovin.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f34245f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.applovin.utils.f f34246a = new com.iab.omid.library.applovin.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f34247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f34249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f34250e;

    private a(d dVar) {
        this.f34249d = dVar;
    }

    public static a a() {
        return f34245f;
    }

    private void c() {
        if (!this.f34248c || this.f34247b == null) {
            return;
        }
        Iterator<com.iab.omid.library.applovin.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public Date b() {
        Date date = this.f34247b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f34246a.a();
        Date date = this.f34247b;
        if (date == null || dateA.after(date)) {
            this.f34247b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f34248c) {
            return;
        }
        this.f34249d.a(context);
        this.f34249d.a(this);
        this.f34249d.e();
        this.f34250e = this.f34249d.c();
        this.f34248c = true;
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z10) {
        if (!this.f34250e && z10) {
            d();
        }
        this.f34250e = z10;
    }
}

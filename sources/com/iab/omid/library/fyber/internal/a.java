package com.iab.omid.library.fyber.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.fyber.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f35021f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.fyber.utils.f f35022a = new com.iab.omid.library.fyber.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f35023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f35025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f35026e;

    private a(d dVar) {
        this.f35025d = dVar;
    }

    public static a a() {
        return f35021f;
    }

    private void c() {
        if (!this.f35024c || this.f35023b == null) {
            return;
        }
        Iterator<com.iab.omid.library.fyber.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public Date b() {
        Date date = this.f35023b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f35022a.a();
        Date date = this.f35023b;
        if (date == null || dateA.after(date)) {
            this.f35023b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f35024c) {
            return;
        }
        this.f35025d.a(context);
        this.f35025d.a(this);
        this.f35025d.e();
        this.f35026e = this.f35025d.c();
        this.f35024c = true;
    }

    @Override // com.iab.omid.library.fyber.internal.d.a
    public void a(boolean z10) {
        if (!this.f35026e && z10) {
            d();
        }
        this.f35026e = z10;
    }
}

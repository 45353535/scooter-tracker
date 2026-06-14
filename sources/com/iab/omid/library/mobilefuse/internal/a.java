package com.iab.omid.library.mobilefuse.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.mobilefuse.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f35567f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.mobilefuse.utils.f f35568a = new com.iab.omid.library.mobilefuse.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f35569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f35571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f35572e;

    private a(d dVar) {
        this.f35571d = dVar;
    }

    public static a a() {
        return f35567f;
    }

    private void c() {
        if (!this.f35570c || this.f35569b == null) {
            return;
        }
        Iterator<com.iab.omid.library.mobilefuse.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f35569b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f35568a.a();
        Date date = this.f35569b;
        if (date == null || dateA.after(date)) {
            this.f35569b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f35570c) {
            return;
        }
        this.f35571d.a(context);
        this.f35571d.a(this);
        this.f35571d.e();
        this.f35572e = this.f35571d.c();
        this.f35570c = true;
    }

    @Override // com.iab.omid.library.mobilefuse.internal.d.a
    public void a(boolean z10) {
        if (!this.f35572e && z10) {
            d();
        }
        this.f35572e = z10;
    }
}

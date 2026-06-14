package com.iab.omid.library.vungle.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.vungle.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f36369f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.vungle.utils.f f36370a = new com.iab.omid.library.vungle.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f36371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f36373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f36374e;

    private a(d dVar) {
        this.f36373d = dVar;
    }

    public static a a() {
        return f36369f;
    }

    private void c() {
        if (!this.f36372c || this.f36371b == null) {
            return;
        }
        Iterator<com.iab.omid.library.vungle.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public Date b() {
        Date date = this.f36371b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f36370a.a();
        Date date = this.f36371b;
        if (date == null || dateA.after(date)) {
            this.f36371b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f36372c) {
            return;
        }
        this.f36373d.a(context);
        this.f36373d.a(this);
        this.f36373d.e();
        this.f36374e = this.f36373d.c();
        this.f36372c = true;
    }

    @Override // com.iab.omid.library.vungle.internal.d.a
    public void a(boolean z10) {
        if (!this.f36374e && z10) {
            d();
        }
        this.f36374e = z10;
    }
}

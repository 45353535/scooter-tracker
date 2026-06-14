package com.iab.omid.library.pubmatic.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.pubmatic.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f35708f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.pubmatic.utils.f f35709a = new com.iab.omid.library.pubmatic.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f35710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f35712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f35713e;

    private a(d dVar) {
        this.f35712d = dVar;
    }

    public static a a() {
        return f35708f;
    }

    private void c() {
        if (!this.f35711c || this.f35710b == null) {
            return;
        }
        Iterator<com.iab.omid.library.pubmatic.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public Date b() {
        Date date = this.f35710b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f35709a.a();
        Date date = this.f35710b;
        if (date == null || dateA.after(date)) {
            this.f35710b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f35711c) {
            return;
        }
        this.f35712d.a(context);
        this.f35712d.a(this);
        this.f35712d.e();
        this.f35713e = this.f35712d.c();
        this.f35711c = true;
    }

    @Override // com.iab.omid.library.pubmatic.internal.d.a
    public void a(boolean z10) {
        if (!this.f35713e && z10) {
            d();
        }
        this.f35713e = z10;
    }
}

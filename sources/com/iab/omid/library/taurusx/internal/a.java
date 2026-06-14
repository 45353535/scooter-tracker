package com.iab.omid.library.taurusx.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.taurusx.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f36108f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.taurusx.utils.f f36109a = new com.iab.omid.library.taurusx.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f36110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f36112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f36113e;

    private a(d dVar) {
        this.f36112d = dVar;
    }

    public static a a() {
        return f36108f;
    }

    private void c() {
        if (!this.f36111c || this.f36110b == null) {
            return;
        }
        Iterator<com.iab.omid.library.taurusx.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f36110b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f36109a.a();
        Date date = this.f36110b;
        if (date == null || dateA.after(date)) {
            this.f36110b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f36111c) {
            return;
        }
        this.f36112d.a(context);
        this.f36112d.a(this);
        this.f36112d.e();
        this.f36113e = this.f36112d.c();
        this.f36111c = true;
    }

    @Override // com.iab.omid.library.taurusx.internal.d.a
    public void a(boolean z10) {
        if (!this.f36113e && z10) {
            d();
        }
        this.f36113e = z10;
    }
}

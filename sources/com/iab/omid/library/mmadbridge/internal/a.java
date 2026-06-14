package com.iab.omid.library.mmadbridge.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.mmadbridge.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f35432f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.mmadbridge.utils.f f35433a = new com.iab.omid.library.mmadbridge.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f35434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f35436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f35437e;

    private a(d dVar) {
        this.f35436d = dVar;
    }

    public static a a() {
        return f35432f;
    }

    private void c() {
        if (!this.f35435c || this.f35434b == null) {
            return;
        }
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f35434b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f35433a.a();
        Date date = this.f35434b;
        if (date == null || dateA.after(date)) {
            this.f35434b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f35435c) {
            return;
        }
        this.f35436d.a(context);
        this.f35436d.a(this);
        this.f35436d.e();
        this.f35437e = this.f35436d.c();
        this.f35435c = true;
    }

    @Override // com.iab.omid.library.mmadbridge.internal.d.a
    public void a(boolean z10) {
        if (!this.f35437e && z10) {
            d();
        }
        this.f35437e = z10;
    }
}

package com.iab.omid.library.chartboost.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.chartboost.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f34772f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.chartboost.utils.f f34773a = new com.iab.omid.library.chartboost.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f34774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f34776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f34777e;

    private a(d dVar) {
        this.f34776d = dVar;
    }

    public static a a() {
        return f34772f;
    }

    private void c() {
        if (!this.f34775c || this.f34774b == null) {
            return;
        }
        Iterator<com.iab.omid.library.chartboost.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public Date b() {
        Date date = this.f34774b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f34773a.a();
        Date date = this.f34774b;
        if (date == null || dateA.after(date)) {
            this.f34774b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f34775c) {
            return;
        }
        this.f34776d.a(context);
        this.f34776d.a(this);
        this.f34776d.e();
        this.f34777e = this.f34776d.c();
        this.f34775c = true;
    }

    @Override // com.iab.omid.library.chartboost.internal.d.a
    public void a(boolean z10) {
        if (!this.f34777e && z10) {
            d();
        }
        this.f34777e = z10;
    }
}

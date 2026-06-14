package com.iab.omid.library.appodeal.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.appodeal.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f34381f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.appodeal.utils.f f34382a = new com.iab.omid.library.appodeal.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f34383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f34385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f34386e;

    private a(d dVar) {
        this.f34385d = dVar;
    }

    public static a a() {
        return f34381f;
    }

    private void c() {
        if (!this.f34384c || this.f34383b == null) {
            return;
        }
        Iterator<com.iab.omid.library.appodeal.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public Date b() {
        Date date = this.f34383b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f34382a.a();
        Date date = this.f34383b;
        if (date == null || dateA.after(date)) {
            this.f34383b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f34384c) {
            return;
        }
        this.f34385d.a(context);
        this.f34385d.a(this);
        this.f34385d.e();
        this.f34386e = this.f34385d.c();
        this.f34384c = true;
    }

    @Override // com.iab.omid.library.appodeal.internal.d.a
    public void a(boolean z10) {
        if (!this.f34386e && z10) {
            d();
        }
        this.f34386e = z10;
    }
}

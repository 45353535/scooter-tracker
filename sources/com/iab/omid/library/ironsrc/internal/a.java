package com.iab.omid.library.ironsrc.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.ironsrc.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f35297f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.ironsrc.utils.f f35298a = new com.iab.omid.library.ironsrc.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f35299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f35301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f35302e;

    private a(d dVar) {
        this.f35301d = dVar;
    }

    public static a a() {
        return f35297f;
    }

    private void c() {
        if (!this.f35300c || this.f35299b == null) {
            return;
        }
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f35299b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f35298a.a();
        Date date = this.f35299b;
        if (date == null || dateA.after(date)) {
            this.f35299b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f35300c) {
            return;
        }
        this.f35301d.a(context);
        this.f35301d.a(this);
        this.f35301d.e();
        this.f35302e = this.f35301d.c();
        this.f35300c = true;
    }

    @Override // com.iab.omid.library.ironsrc.internal.d.a
    public void a(boolean z10) {
        if (!this.f35302e && z10) {
            d();
        }
        this.f35302e = z10;
    }
}

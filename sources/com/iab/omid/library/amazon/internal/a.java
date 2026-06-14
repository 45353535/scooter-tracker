package com.iab.omid.library.amazon.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.amazon.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f34116f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.amazon.utils.f f34117a = new com.iab.omid.library.amazon.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f34118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f34120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f34121e;

    private a(d dVar) {
        this.f34120d = dVar;
    }

    public static a a() {
        return f34116f;
    }

    private void c() {
        if (!this.f34119c || this.f34118b == null) {
            return;
        }
        Iterator<com.iab.omid.library.amazon.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f34118b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f34117a.a();
        Date date = this.f34118b;
        if (date == null || dateA.after(date)) {
            this.f34118b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f34119c) {
            return;
        }
        this.f34120d.a(context);
        this.f34120d.a(this);
        this.f34120d.e();
        this.f34121e = this.f34120d.c();
        this.f34119c = true;
    }

    @Override // com.iab.omid.library.amazon.internal.d.a
    public void a(boolean z10) {
        if (!this.f34121e && z10) {
            d();
        }
        this.f34121e = z10;
    }
}

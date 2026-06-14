package com.iab.omid.library.startio.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.startio.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f35978f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.startio.utils.f f35979a = new com.iab.omid.library.startio.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f35980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f35982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f35983e;

    private a(d dVar) {
        this.f35982d = dVar;
    }

    public static a a() {
        return f35978f;
    }

    private void c() {
        if (!this.f35981c || this.f35980b == null) {
            return;
        }
        Iterator<com.iab.omid.library.startio.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f35980b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f35979a.a();
        Date date = this.f35980b;
        if (date == null || dateA.after(date)) {
            this.f35980b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f35981c) {
            return;
        }
        this.f35982d.a(context);
        this.f35982d.a(this);
        this.f35982d.e();
        this.f35983e = this.f35982d.c();
        this.f35981c = true;
    }

    @Override // com.iab.omid.library.startio.internal.d.a
    public void a(boolean z10) {
        if (!this.f35983e && z10) {
            d();
        }
        this.f35983e = z10;
    }
}

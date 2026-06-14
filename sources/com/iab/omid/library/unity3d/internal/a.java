package com.iab.omid.library.unity3d.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.unity3d.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f36236f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.unity3d.utils.f f36237a = new com.iab.omid.library.unity3d.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f36238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f36240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f36241e;

    private a(d dVar) {
        this.f36240d = dVar;
    }

    public static a a() {
        return f36236f;
    }

    private void c() {
        if (!this.f36239c || this.f36238b == null) {
            return;
        }
        Iterator<com.iab.omid.library.unity3d.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f36238b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f36237a.a();
        Date date = this.f36238b;
        if (date == null || dateA.after(date)) {
            this.f36238b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f36239c) {
            return;
        }
        this.f36240d.a(context);
        this.f36240d.a(this);
        this.f36240d.e();
        this.f36241e = this.f36240d.c();
        this.f36239c = true;
    }

    @Override // com.iab.omid.library.unity3d.internal.d.a
    public void a(boolean z10) {
        if (!this.f36241e && z10) {
            d();
        }
        this.f36241e = z10;
    }
}

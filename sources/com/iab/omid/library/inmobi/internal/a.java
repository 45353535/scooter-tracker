package com.iab.omid.library.inmobi.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.inmobi.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f35162f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.inmobi.utils.f f35163a = new com.iab.omid.library.inmobi.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f35164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f35166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f35167e;

    private a(d dVar) {
        this.f35166d = dVar;
    }

    public static a a() {
        return f35162f;
    }

    private void c() {
        if (!this.f35165c || this.f35164b == null) {
            return;
        }
        Iterator<com.iab.omid.library.inmobi.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public Date b() {
        Date date = this.f35164b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f35163a.a();
        Date date = this.f35164b;
        if (date == null || dateA.after(date)) {
            this.f35164b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f35165c) {
            return;
        }
        this.f35166d.a(context);
        this.f35166d.a(this);
        this.f35166d.e();
        this.f35167e = this.f35166d.c();
        this.f35165c = true;
    }

    @Override // com.iab.omid.library.inmobi.internal.d.a
    public void a(boolean z10) {
        if (!this.f35167e && z10) {
            d();
        }
        this.f35167e = z10;
    }
}

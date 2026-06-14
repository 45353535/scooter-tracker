package com.iab.omid.library.pubnativenet.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.pubnativenet.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f35843f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.pubnativenet.utils.f f35844a = new com.iab.omid.library.pubnativenet.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f35845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f35847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f35848e;

    private a(d dVar) {
        this.f35847d = dVar;
    }

    public static a a() {
        return f35843f;
    }

    private void c() {
        if (!this.f35846c || this.f35845b == null) {
            return;
        }
        Iterator<com.iab.omid.library.pubnativenet.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f35845b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f35844a.a();
        Date date = this.f35845b;
        if (date == null || dateA.after(date)) {
            this.f35845b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f35846c) {
            return;
        }
        this.f35847d.a(context);
        this.f35847d.a(this);
        this.f35847d.e();
        this.f35848e = this.f35847d.c();
        this.f35846c = true;
    }

    @Override // com.iab.omid.library.pubnativenet.internal.d.a
    public void a(boolean z10) {
        if (!this.f35848e && z10) {
            d();
        }
        this.f35848e = z10;
    }
}

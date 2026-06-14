package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f34637f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.bytedance2.utils.f f34638a = new com.iab.omid.library.bytedance2.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f34639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f34641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f34642e;

    private a(d dVar) {
        this.f34641d = dVar;
    }

    public static a a() {
        return f34637f;
    }

    private void c() {
        if (!this.f34640c || this.f34639b == null) {
            return;
        }
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f34639b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f34638a.a();
        Date date = this.f34639b;
        if (date == null || dateA.after(date)) {
            this.f34639b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f34640c) {
            return;
        }
        this.f34641d.a(context);
        this.f34641d.a(this);
        this.f34641d.e();
        this.f34642e = this.f34641d.c();
        this.f34640c = true;
    }

    @Override // com.iab.omid.library.bytedance2.internal.d.a
    public void a(boolean z10) {
        if (!this.f34642e && z10) {
            d();
        }
        this.f34642e = z10;
    }
}

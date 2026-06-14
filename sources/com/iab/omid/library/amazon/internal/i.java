package com.iab.omid.library.amazon.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.amazon.internal.d;
import com.iab.omid.library.amazon.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class i implements d.a, com.iab.omid.library.amazon.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f34141f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f34142a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.amazon.devicevolume.e f34143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.amazon.devicevolume.b f34144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.amazon.devicevolume.d f34145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f34146e;

    public i(com.iab.omid.library.amazon.devicevolume.e eVar, com.iab.omid.library.amazon.devicevolume.b bVar) {
        this.f34143b = eVar;
        this.f34144c = bVar;
    }

    private c a() {
        if (this.f34146e == null) {
            this.f34146e = c.c();
        }
        return this.f34146e;
    }

    public static i c() {
        if (f34141f == null) {
            f34141f = new i(new com.iab.omid.library.amazon.devicevolume.e(), new com.iab.omid.library.amazon.devicevolume.b());
        }
        return f34141f;
    }

    public float b() {
        return this.f34142a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f34145d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f34145d.d();
    }

    @Override // com.iab.omid.library.amazon.devicevolume.c
    public void a(float f10) {
        this.f34142a = f10;
        Iterator<com.iab.omid.library.amazon.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f34145d = this.f34143b.a(new Handler(), context, this.f34144c.a(), this);
    }

    @Override // com.iab.omid.library.amazon.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}

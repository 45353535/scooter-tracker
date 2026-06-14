package com.iab.omid.library.startio.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.startio.internal.d;
import com.iab.omid.library.startio.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class i implements d.a, com.iab.omid.library.startio.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f36003f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f36004a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.startio.devicevolume.e f36005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.startio.devicevolume.b f36006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.startio.devicevolume.d f36007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f36008e;

    public i(com.iab.omid.library.startio.devicevolume.e eVar, com.iab.omid.library.startio.devicevolume.b bVar) {
        this.f36005b = eVar;
        this.f36006c = bVar;
    }

    private c a() {
        if (this.f36008e == null) {
            this.f36008e = c.c();
        }
        return this.f36008e;
    }

    public static i c() {
        if (f36003f == null) {
            f36003f = new i(new com.iab.omid.library.startio.devicevolume.e(), new com.iab.omid.library.startio.devicevolume.b());
        }
        return f36003f;
    }

    public float b() {
        return this.f36004a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f36007d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f36007d.d();
    }

    @Override // com.iab.omid.library.startio.devicevolume.c
    public void a(float f10) {
        this.f36004a = f10;
        Iterator<com.iab.omid.library.startio.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f36007d = this.f36005b.a(new Handler(), context, this.f36006c.a(), this);
    }

    @Override // com.iab.omid.library.startio.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}

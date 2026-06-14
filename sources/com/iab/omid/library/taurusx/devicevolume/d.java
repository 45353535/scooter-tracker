package com.iab.omid.library.taurusx.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f36103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f36104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f36105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f36106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f36107e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f36103a = context;
        this.f36104b = (AudioManager) context.getSystemService("audio");
        this.f36105c = aVar;
        this.f36106d = cVar;
    }

    private float a() {
        return this.f36105c.a(this.f36104b.getStreamVolume(3), this.f36104b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f36106d.a(this.f36107e);
    }

    public void c() {
        this.f36107e = a();
        b();
        this.f36103a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f36103a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f36107e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f36107e;
    }
}

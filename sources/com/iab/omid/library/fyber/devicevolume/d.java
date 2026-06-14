package com.iab.omid.library.fyber.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f35016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f35017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f35018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f35019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f35020e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f35016a = context;
        this.f35017b = (AudioManager) context.getSystemService("audio");
        this.f35018c = aVar;
        this.f35019d = cVar;
    }

    private float a() {
        return this.f35018c.a(this.f35017b.getStreamVolume(3), this.f35017b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f35019d.a(this.f35020e);
    }

    public void c() {
        this.f35020e = a();
        b();
        this.f35016a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f35016a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f35020e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f35020e;
    }
}

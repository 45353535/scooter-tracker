package com.iab.omid.library.ironsrc.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f35292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f35293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f35294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f35295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f35296e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f35292a = context;
        this.f35293b = (AudioManager) context.getSystemService("audio");
        this.f35294c = aVar;
        this.f35295d = cVar;
    }

    private float a() {
        return this.f35294c.a(this.f35293b.getStreamVolume(3), this.f35293b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f35295d.a(this.f35296e);
    }

    public void c() {
        this.f35296e = a();
        b();
        this.f35292a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f35292a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f35296e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f35296e;
    }
}

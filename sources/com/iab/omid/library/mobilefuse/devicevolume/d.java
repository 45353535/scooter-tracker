package com.iab.omid.library.mobilefuse.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f35562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f35563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f35564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f35565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f35566e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f35562a = context;
        this.f35563b = (AudioManager) context.getSystemService("audio");
        this.f35564c = aVar;
        this.f35565d = cVar;
    }

    private float a() {
        return this.f35564c.a(this.f35563b.getStreamVolume(3), this.f35563b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f35565d.a(this.f35566e);
    }

    public void c() {
        this.f35566e = a();
        b();
        this.f35562a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f35562a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f35566e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f35566e;
    }
}

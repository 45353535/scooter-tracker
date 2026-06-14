package com.iab.omid.library.amazon.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f34111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f34112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f34113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f34114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f34115e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f34111a = context;
        this.f34112b = (AudioManager) context.getSystemService("audio");
        this.f34113c = aVar;
        this.f34114d = cVar;
    }

    private float a() {
        return this.f34113c.a(this.f34112b.getStreamVolume(3), this.f34112b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f34114d.a(this.f34115e);
    }

    public void c() {
        this.f34115e = a();
        b();
        this.f34111a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f34111a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f34115e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f34115e;
    }
}

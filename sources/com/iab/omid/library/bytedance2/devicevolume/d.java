package com.iab.omid.library.bytedance2.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f34632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f34633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f34634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f34635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f34636e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f34632a = context;
        this.f34633b = (AudioManager) context.getSystemService("audio");
        this.f34634c = aVar;
        this.f34635d = cVar;
    }

    private float a() {
        return this.f34634c.a(this.f34633b.getStreamVolume(3), this.f34633b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f34635d.a(this.f34636e);
    }

    public void c() {
        this.f34636e = a();
        b();
        this.f34632a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f34632a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f34636e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f34636e;
    }
}

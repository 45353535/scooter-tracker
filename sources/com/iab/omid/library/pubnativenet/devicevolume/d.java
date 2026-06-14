package com.iab.omid.library.pubnativenet.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f35838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f35839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f35840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f35841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f35842e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f35838a = context;
        this.f35839b = (AudioManager) context.getSystemService("audio");
        this.f35840c = aVar;
        this.f35841d = cVar;
    }

    private float a() {
        return this.f35840c.a(this.f35839b.getStreamVolume(3), this.f35839b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f35841d.a(this.f35842e);
    }

    public void c() {
        this.f35842e = a();
        b();
        this.f35838a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f35838a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f35842e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f35842e;
    }
}

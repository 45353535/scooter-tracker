package com.iab.omid.library.unity3d.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f36231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f36232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f36233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f36234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f36235e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f36231a = context;
        this.f36232b = (AudioManager) context.getSystemService("audio");
        this.f36233c = aVar;
        this.f36234d = cVar;
    }

    private float a() {
        return this.f36233c.a(this.f36232b.getStreamVolume(3), this.f36232b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f36234d.a(this.f36235e);
    }

    public void c() {
        this.f36235e = a();
        b();
        this.f36231a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f36231a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f36235e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f36235e;
    }
}

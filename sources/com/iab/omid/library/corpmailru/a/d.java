package com.iab.omid.library.corpmailru.a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f34879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f34880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f34881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f34882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f34883e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f34879a = context;
        this.f34880b = (AudioManager) context.getSystemService("audio");
        this.f34881c = aVar;
        this.f34882d = cVar;
    }

    private float c() {
        return this.f34881c.a(this.f34880b.getStreamVolume(3), this.f34880b.getStreamMaxVolume(3));
    }

    private void d() {
        this.f34882d.a(this.f34883e);
    }

    public void a() {
        this.f34883e = c();
        d();
        this.f34879a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void b() {
        this.f34879a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fC = c();
        if (a(fC)) {
            this.f34883e = fC;
            d();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f34883e;
    }
}

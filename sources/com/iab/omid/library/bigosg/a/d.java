package com.iab.omid.library.bigosg.a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f34488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f34489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f34490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f34491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f34492e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f34488a = context;
        this.f34489b = (AudioManager) context.getSystemService("audio");
        this.f34490c = aVar;
        this.f34491d = cVar;
    }

    private float c() {
        return this.f34490c.a(this.f34489b.getStreamVolume(3), this.f34489b.getStreamMaxVolume(3));
    }

    private void d() {
        this.f34491d.a(this.f34492e);
    }

    public final void a() {
        this.f34492e = c();
        d();
        this.f34488a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.f34488a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        float fC = c();
        if (a(fC)) {
            this.f34492e = fC;
            d();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f34492e;
    }
}

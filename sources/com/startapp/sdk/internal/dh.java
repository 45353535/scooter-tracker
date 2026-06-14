package com.startapp.sdk.internal;

import android.os.Handler;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class dh implements lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f64430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hh f64431b;

    public dh(Handler handler, hh hhVar) {
        this.f64430a = handler;
        this.f64431b = hhVar;
    }

    public static void a(hh hhVar) {
        if (jh.f64771v == 1) {
            jh.f64771v = 2;
        }
        hhVar.getClass();
        WeakHashMap weakHashMap = vi.f65408a;
        hhVar.f64649d = true;
        boolean z10 = hhVar.f64650e;
        if (z10 && z10 && !hhVar.f64647b) {
            hhVar.f64647b = true;
            h0.a(hhVar.f64646a);
        }
    }

    public final void b() {
        Handler handler = this.f64430a;
        final hh hhVar = this.f64431b;
        handler.post(new Runnable() { // from class: com.startapp.sdk.internal.wl
            @Override // java.lang.Runnable
            public final void run() {
                dh.a(hhVar);
            }
        });
    }

    @Override // com.startapp.sdk.internal.lc
    public final void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z10) {
        b();
    }

    @Override // com.startapp.sdk.internal.lc
    public final void a() {
        b();
    }
}

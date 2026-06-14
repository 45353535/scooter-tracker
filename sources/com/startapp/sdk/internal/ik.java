package com.startapp.sdk.internal;

import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ik implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NotDisplayedReason f64726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONObject f64727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.startapp.sdk.ads.nativead.f f64728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f64729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f64730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Point f64731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ag f64732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BannerOptions f64733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f64734i;

    public ik(View view, Point point, ag agVar, BannerOptions bannerOptions) {
        this.f64726a = NotDisplayedReason.AD_CLOSED_TOO_QUICKLY;
        this.f64729d = new Handler(Looper.getMainLooper());
        this.f64734i = true;
        this.f64730e = new WeakReference(view);
        this.f64731f = point;
        this.f64732g = agVar;
        this.f64733h = bannerOptions;
    }

    public final void a() {
        NotDisplayedReason notDisplayedReason;
        try {
            ag agVar = this.f64732g;
            if (agVar != null && (notDisplayedReason = this.f64726a) != null) {
                agVar.a(notDisplayedReason.toString(), this.f64727b);
            }
            this.f64729d.removeCallbacksAndMessages(null);
        } catch (Throwable unused) {
        }
    }

    public final boolean b() {
        NotDisplayedReason notDisplayedReason;
        AtomicReference atomicReference = new AtomicReference();
        NotDisplayedReason notDisplayedReason2 = hk.a((View) this.f64730e.get(), this.f64731f, this.f64733h, atomicReference, false).f64896d;
        if (notDisplayedReason2 != null && ((notDisplayedReason = this.f64726a) == null || notDisplayedReason.a() <= notDisplayedReason2.a())) {
            this.f64726a = notDisplayedReason2;
            this.f64727b = (JSONObject) atomicReference.get();
        }
        return notDisplayedReason2 == null;
    }

    public final boolean c() {
        ag agVar = this.f64732g;
        return (agVar == null || agVar.f64280j.get() != 0 || this.f64730e.get() == null) ? false : true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!c()) {
                a();
                return;
            }
            boolean zB = b();
            if (zB && this.f64734i) {
                this.f64734i = false;
                this.f64732g.c();
            } else if (!zB && !this.f64734i) {
                this.f64734i = true;
                this.f64732g.a();
                com.startapp.sdk.ads.nativead.f fVar = this.f64728c;
                if (fVar != null) {
                    fVar.a();
                }
            }
            this.f64729d.postDelayed(this, 100L);
        } catch (Throwable unused) {
            this.f64726a = NotDisplayedReason.INTERNAL_ERROR;
            a();
        }
    }

    public ik(WeakReference weakReference, ag agVar, BannerOptions bannerOptions) {
        this.f64726a = NotDisplayedReason.AD_CLOSED_TOO_QUICKLY;
        this.f64729d = new Handler(Looper.getMainLooper());
        this.f64734i = true;
        this.f64730e = weakReference;
        this.f64731f = null;
        this.f64732g = agVar;
        this.f64733h = bannerOptions;
    }
}

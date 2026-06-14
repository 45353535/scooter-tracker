package yads;

import android.graphics.Bitmap;
import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
public final class up implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f116730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nl2 f116731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f116732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bq f116733e;

    public up(Bitmap bitmap, nl2 nl2Var, Handler handler, bq bqVar) {
        this.f116730b = bitmap;
        this.f116731c = nl2Var;
        this.f116732d = handler;
        this.f116733e = bqVar;
    }

    public final void a(final Bitmap bitmap) {
        this.f116732d.post(new Runnable() { // from class: yads.mr0
            @Override // java.lang.Runnable
            public final void run() {
                up.a(this.f113588b, bitmap);
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        bq bqVar = this.f116733e;
        Bitmap bitmapA = this.f116730b;
        bqVar.getClass();
        try {
            bitmapA = bq.a(bitmapA, 0.1d);
        } catch (Throwable unused) {
        }
        a(bitmapA);
    }

    public static final void a(up upVar, Bitmap bitmap) {
        nl2 nl2Var = upVar.f116731c;
        ml2 ml2Var = nl2Var.f113957a.f114372d;
        r52 r52Var = nl2Var.f113958b;
        pl2 pl2Var = nl2Var.f113959c;
        ml2Var.getClass();
        ml2.a(r52Var, pl2Var, bitmap);
    }
}

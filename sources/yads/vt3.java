package yads;

import android.webkit.WebView;
import j$.util.DesugarCollections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class vt3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f117197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xt3 f117198c;

    public vt3(xt3 xt3Var, float f10) {
        this.f117198c = xt3Var;
        this.f117197b = f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        qu3 qu3Var = this.f117198c.f117965b.f109603e;
        float f10 = this.f117197b;
        qu3Var.f115169a = f10;
        if (qu3Var.f115173e == null) {
            qu3Var.f115173e = ut3.f116776c;
        }
        Iterator it = DesugarCollections.unmodifiableCollection(qu3Var.f115173e.f116778b).iterator();
        while (it.hasNext()) {
            ia iaVar = ((dt3) it.next()).f110065e;
            pu3.f114791a.a((WebView) iaVar.f111922b.get(), "setDeviceVolume", Float.valueOf(f10), iaVar.f111921a);
        }
    }
}

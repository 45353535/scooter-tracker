package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.ironsource.D5;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f23864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.e f23865b;

    public e(com.fyber.inneractive.sdk.web.e eVar, String str) {
        this.f23865b = eVar;
        this.f23864a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.web.e eVar = this.f23865b;
        Object obj = this.f23864a;
        eVar.getClass();
        String str = (String) obj;
        String str2 = s.a() ? "http://" : DtbConstants.HTTPS;
        if (!TextUtils.isEmpty(str) && !eVar.f23946a.isTerminated() && !eVar.f23946a.isShutdown()) {
            if (TextUtils.isEmpty(eVar.f23956k)) {
                eVar.f23957l.f23985p = str2.concat("wv.inner-active.mobi/");
            } else {
                eVar.f23957l.f23985p = str2 + eVar.f23956k;
            }
            if (eVar.f23951f) {
                return;
            }
            com.fyber.inneractive.sdk.web.i iVar = eVar.f23957l;
            com.fyber.inneractive.sdk.web.m mVar = iVar.f23971b;
            if (mVar != null) {
                mVar.loadDataWithBaseURL(iVar.f23985p, str, "text/html", D5.N, null);
                eVar.f23957l.f23986q = str;
            } else {
                InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_LOAD_TO_WEBVIEW);
                com.fyber.inneractive.sdk.web.g gVar = iVar.f23975f;
                if (gVar != null) {
                    gVar.a(iVar, inneractiveInfrastructureError);
                }
                iVar.b(true);
            }
        } else if (!eVar.f23946a.isTerminated() && !eVar.f23946a.isShutdown()) {
            com.fyber.inneractive.sdk.web.i iVar2 = eVar.f23957l;
            InneractiveInfrastructureError inneractiveInfrastructureError2 = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.EMPTY_FINAL_HTML);
            com.fyber.inneractive.sdk.web.g gVar2 = iVar2.f23975f;
            if (gVar2 != null) {
                gVar2.a(iVar2, inneractiveInfrastructureError2);
            }
            iVar2.b(true);
        }
        eVar.f23951f = true;
        eVar.f23946a.shutdownNow();
        Handler handler = eVar.f23947b;
        if (handler != null) {
            d dVar = eVar.f23949d;
            if (dVar != null) {
                handler.removeCallbacks(dVar);
            }
            e eVar2 = eVar.f23948c;
            if (eVar2 != null) {
                eVar.f23947b.removeCallbacks(eVar2);
            }
            eVar.f23947b = null;
        }
        eVar.f23957l.f23984o = null;
    }
}

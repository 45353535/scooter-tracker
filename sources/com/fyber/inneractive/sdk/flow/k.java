package com.fyber.inneractive.sdk.flow;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class k implements com.fyber.inneractive.sdk.interfaces.c, com.fyber.inneractive.sdk.interfaces.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InneractiveAdRequest f20752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.e f20753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f20754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.a f20755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.b f20756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.r0 f20757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.r f20758g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.network.timeouts.content.a f20761j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20759h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20760i = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f20763l = new j(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f20762k = new d(this);

    public final void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.interfaces.a aVar, com.fyber.inneractive.sdk.interfaces.b bVar) {
        this.f20752a = inneractiveAdRequest;
        this.f20753b = eVar;
        this.f20755d = aVar;
        this.f20756e = bVar;
        this.f20762k = new d(this);
        this.f20758g = rVar;
        UnitDisplayType unitDisplayType = eVar.f23736p;
        this.f20761j = new com.fyber.inneractive.sdk.network.timeouts.content.a((unitDisplayType == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.REWARDED || unitDisplayType == UnitDisplayType.NATIVE) ? unitDisplayType.name().toLowerCase(Locale.US) : UnitDisplayType.BANNER.name().toLowerCase(Locale.US), com.fyber.inneractive.sdk.response.a.a(eVar.f23727g) == com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_VAST ? "video" : "display", (int) eVar.K, eVar.D, IAConfigManager.O.f20306l, this.f20758g);
        if (this.f20752a == null) {
            this.f20757f = com.fyber.inneractive.sdk.config.a.a(eVar.f23735o);
        }
        try {
            i();
        } catch (Throwable th2) {
            IAlog.f("Failed to start ContentLoader", IAlog.a(this));
            com.fyber.inneractive.sdk.network.z.a(th2, inneractiveAdRequest, eVar);
            this.f20762k.a();
            b(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.CONTENT_LOADER_START_FAILED));
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public final void b() {
        int i10;
        String strA = IAlog.a(this);
        Integer numValueOf = Integer.valueOf(this.f20760i - 1);
        int i11 = this.f20760i - 1;
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.f20761j;
        if (aVar != null) {
            if (aVar.f21395g) {
                i11 = aVar.f21389a - i11;
            }
            i10 = (aVar.f21390b * i11) + aVar.f21392d + (i11 == aVar.f21389a ? aVar.f21396h : 0);
        } else {
            i10 = 0;
        }
        IAlog.a("%s : IAAdContentLoaderImpl : onRetry() attempt: %d timeout: %d", strA, numValueOf, Integer.valueOf(i10));
        com.fyber.inneractive.sdk.interfaces.b bVar = this.f20756e;
        if (bVar != null) {
            bVar.b();
        }
        i();
    }

    public void c() {
        g();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public abstract void cancel();

    public InneractiveInfrastructureError d() {
        i iVar = i.WEBVIEW_LOAD_TIMEOUT;
        com.fyber.inneractive.sdk.response.e eVar = this.f20753b;
        if ("video".equalsIgnoreCase((eVar == null || com.fyber.inneractive.sdk.response.a.a(eVar.f23727g) != com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_VAST) ? "display" : "video")) {
            iVar = i.VIDEO_AD_LOAD_TIMEOUT;
        }
        return new InneractiveInfrastructureError(InneractiveErrorCode.LOAD_TIMEOUT, iVar);
    }

    public abstract String e();

    public final com.fyber.inneractive.sdk.config.s0 f() {
        InneractiveAdRequest inneractiveAdRequest = this.f20752a;
        return inneractiveAdRequest == null ? this.f20757f : inneractiveAdRequest.getSelectedUnitConfig();
    }

    public final void g() {
        String str;
        this.f20762k.a();
        InneractiveAdRequest inneractiveAdRequest = this.f20752a;
        if (inneractiveAdRequest != null) {
            str = inneractiveAdRequest.f20990b;
        } else {
            com.fyber.inneractive.sdk.response.e eVar = this.f20753b;
            if (eVar == null || (str = eVar.B) == null) {
                str = null;
            }
        }
        com.fyber.inneractive.sdk.metrics.d.f21138d.a(str).i();
        x xVar = this.f20754c;
        if (xVar != null) {
            xVar.a(str);
        }
        com.fyber.inneractive.sdk.interfaces.a aVar = this.f20755d;
        if (aVar != null) {
            aVar.a(this.f20752a);
        }
    }

    public abstract void h();

    public final void i() {
        int i10;
        int i11 = this.f20760i;
        this.f20760i = i11 + 1;
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.f20761j;
        if (aVar != null) {
            if (aVar.f21395g) {
                i11 = aVar.f21389a - i11;
            }
            i10 = (aVar.f21390b * i11) + aVar.f21392d + (i11 == aVar.f21389a ? aVar.f21396h : 0);
        } else {
            i10 = 0;
        }
        IAlog.a("%s : IAAdContentLoaderImpl : Start timeout: %d, attempt number: %d", IAlog.a(this), Integer.valueOf(i10), Integer.valueOf(this.f20760i - 1));
        d dVar = this.f20762k;
        if (dVar.f20636a == null) {
            HandlerThread handlerThread = new HandlerThread("TimeoutHandlerThread");
            handlerThread.start();
            dVar.f20636a = new Handler(handlerThread.getLooper());
        }
        dVar.f20636a.postDelayed(dVar.f20639d, i10);
        h();
    }

    public final void b(InneractiveInfrastructureError inneractiveInfrastructureError) {
        String string;
        IAlog.a("%s : IAAdContentLoaderImpl : Handle Retry for error: %s", IAlog.a(this), inneractiveInfrastructureError.getErrorCode().toString());
        d dVar = this.f20762k;
        dVar.getClass();
        IAlog.a("%s : ContentLoadTimeoutHandler stopping timeout handler", IAlog.a(dVar));
        Handler handler = dVar.f20636a;
        if (handler != null) {
            handler.removeCallbacks(dVar.f20639d);
        }
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.f20761j;
        boolean z10 = this.f20760i <= (aVar != null ? aVar.f21389a : 0);
        IAlog.a("%s : IAAdContentLoaderImpl : should retry: %s", IAlog.a(this), Boolean.valueOf(z10));
        if (z10) {
            x xVar = this.f20754c;
            if (xVar != null) {
                xVar.destroy();
                this.f20754c = null;
            }
            com.fyber.inneractive.sdk.network.timeouts.content.a aVar2 = this.f20761j;
            int i10 = aVar2 != null ? aVar2.f21393e : 0;
            IAlog.a("%s : IAAdContentLoaderImpl : retryLoad : post load ad content retry task with delay: %d", IAlog.a(this), Integer.valueOf(i10));
            com.fyber.inneractive.sdk.util.r.f23896b.postDelayed(this.f20763l, i10);
            return;
        }
        com.fyber.inneractive.sdk.interfaces.a aVar3 = this.f20755d;
        if (aVar3 != null) {
            aVar3.a(inneractiveInfrastructureError);
        }
        InneractiveAdRequest inneractiveAdRequest = this.f20752a;
        com.fyber.inneractive.sdk.response.e eVar = this.f20753b;
        com.fyber.inneractive.sdk.config.global.r rVar = this.f20758g;
        JSONArray jSONArrayB = rVar == null ? null : rVar.b();
        if (inneractiveInfrastructureError.getErrorCode() == InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD) {
            com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.NATIVE_ERROR_FAILED_TO_LOAD_AD;
            if (!inneractiveInfrastructureError.isErrorAlreadyReported(tVar)) {
                IAlog.a("Firing Event 402 - NativeAdLoadFailed - errorCode - %s", inneractiveInfrastructureError.getErrorCode());
                JSONObject jSONObject = new JSONObject();
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
                wVar.f21417b = tVar;
                wVar.f21416a = inneractiveAdRequest;
                wVar.f21419d = jSONArrayB;
                if (inneractiveInfrastructureError.getCause() != null) {
                    string = Arrays.toString(inneractiveInfrastructureError.getCause().getStackTrace());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                    for (int i11 = 7; i11 >= 0 && i11 < 13 && i11 < stackTrace.length; i11++) {
                        sb2.append(stackTrace[i11].toString());
                        sb2.append(StringUtils.COMMA);
                    }
                    Log.d("stack trace:", sb2.toString());
                    string = sb2.toString();
                }
                String string2 = inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason().toString();
                try {
                    jSONObject.put(PglCryptUtils.KEY_MESSAGE, string2);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", PglCryptUtils.KEY_MESSAGE, string2);
                }
                try {
                    jSONObject.put("description", string);
                } catch (Exception unused2) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "description", string);
                }
                String strDescription = inneractiveInfrastructureError.description();
                try {
                    jSONObject.put("extra_description", strDescription);
                } catch (Exception unused3) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "extra_description", strDescription);
                }
                wVar.f21421f.put(jSONObject);
                wVar.a((String) null);
                inneractiveInfrastructureError.addReportedError(tVar);
            }
        } else {
            a.a(inneractiveAdRequest, inneractiveInfrastructureError, this.f20754c, eVar, jSONArrayB);
        }
        cancel();
    }

    public void a() {
        int i10;
        InneractiveInfrastructureError inneractiveInfrastructureError;
        String strA = IAlog.a(this);
        Integer numValueOf = Integer.valueOf(this.f20760i - 1);
        int i11 = this.f20760i - 1;
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.f20761j;
        if (aVar != null) {
            if (aVar.f21395g) {
                i11 = aVar.f21389a - i11;
            }
            i10 = (aVar.f21390b * i11) + aVar.f21392d + (i11 == aVar.f21389a ? aVar.f21396h : 0);
        } else {
            i10 = 0;
        }
        IAlog.a("%s : IAAdContentLoaderImpl : onTimeout() attempt: %d timeout: %d", strA, numValueOf, Integer.valueOf(i10));
        com.fyber.inneractive.sdk.interfaces.b bVar = this.f20756e;
        if (bVar != null) {
            bVar.a();
        }
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar2 = this.f20761j;
        if (this.f20760i <= (aVar2 != null ? aVar2.f21389a : 0)) {
            inneractiveInfrastructureError = d();
        } else {
            inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.IN_FLIGHT_TIMEOUT, i.NO_TIME_TO_LOAD_AD_CONTENT);
        }
        com.fyber.inneractive.sdk.util.r.f23895a.execute(new e(new f(this.f20753b, this.f20752a, e(), this.f20758g.b()), inneractiveInfrastructureError));
        b(inneractiveInfrastructureError);
    }
}

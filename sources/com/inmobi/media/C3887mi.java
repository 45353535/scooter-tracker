package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.ironsource.C4240b4;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.mi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3887mi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3738gi f39041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f39042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f39043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicInteger f39046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f39047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f39048h;

    public C3887mi(C3738gi renderViewMetaData) {
        Intrinsics.checkNotNullParameter(renderViewMetaData, "renderViewMetaData");
        this.f39041a = renderViewMetaData;
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        TelemetryConfig telemetryConfig = (TelemetryConfig) Y3.f38021a.a(TelemetryConfig.class);
        C3862li c3862li = renderViewMetaData.f38650k;
        this.f39046f = new AtomicInteger(c3862li != null ? c3862li.f38985a : telemetryConfig.getMaxTemplateEvents());
        this.f39047g = new AtomicBoolean(false);
    }

    public final void a(int i10) {
        short s10;
        Context context = Ji.f37157a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Ea.f36782b;
            Ea eaA = Da.a(context, "im_telemetry_prefs");
            String str = A1.f36541c;
            if (str == null) {
                str = "unknown";
            }
            Intrinsics.checkNotNullParameter("last_app_version", C4240b4.i.W);
            if (Intrinsics.areEqual(eaA.f36783a.getString("last_app_version", null), str)) {
                return;
            }
            Map mapA = a();
            switch (i10) {
                case 8800:
                    s10 = 2365;
                    break;
                case 8801:
                default:
                    s10 = (short) i10;
                    break;
                case 8802:
                    s10 = 2366;
                    break;
                case 8803:
                    s10 = 2367;
                    break;
                case 8804:
                    s10 = 2368;
                    break;
            }
            mapA.put("errorCode", Short.valueOf(s10));
            Wj wj = Wj.f37959a;
            Wj.b("VideoPlayerNotSupported", mapA, EnumC3585ak.f38215a);
            eaA.a("last_app_version", str, false);
        }
    }

    public final void b() {
        String strA = a("WebViewLoadCalled");
        this.f39043c = SystemClock.elapsedRealtime();
        Map mapA = a();
        if (Intrinsics.areEqual(strA, "CompanionWebViewLoadCalled")) {
            long j10 = this.f39042b;
            CoroutineScope coroutineScope = AbstractC3790il.f38771a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        } else {
            C3970q1 c3970q1 = this.f39041a.f38649j;
            if (c3970q1 != null) {
                long j11 = c3970q1.f39335a.f39425c;
                CoroutineScope coroutineScope2 = AbstractC3790il.f38771a;
                mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j11));
            }
        }
        mapA.put("creativeId", this.f39041a.f38646g);
        Wj wj = Wj.f37959a;
        Wj.b(strA, mapA, EnumC3585ak.f38215a);
    }

    public final void a(String eventType, String str) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        if (this.f39047g.get()) {
            return;
        }
        if (this.f39046f.decrementAndGet() <= 0) {
            this.f39047g.set(true);
            Map mapA = a();
            long j10 = this.f39043c;
            CoroutineScope coroutineScope = AbstractC3790il.f38771a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
            Wj wj = Wj.f37959a;
            Wj.b("TemplateEventDropped", mapA, EnumC3585ak.f38215a);
            return;
        }
        if (str != null) {
            try {
            } catch (JSONException e10) {
                Log.e(Wj.f37960b, "Error parsing JSON: " + e10);
            }
            if (new JSONObject(str).length() == 0) {
                str = null;
            }
        }
        String str2 = this.f39041a.f38651l;
        if (str2 == null) {
            str2 = "";
        }
        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("trigger", str2), TuplesKt.to("plType", String.valueOf(this.f39041a.f38640a.f39716f)), TuplesKt.to("impressionId", this.f39041a.f38642c), TuplesKt.to("markupType", this.f39041a.f38641b), TuplesKt.to("networkType", C4148x5.m()));
        if (str != null) {
            mapMutableMapOf.put("payload", str);
        }
        if (this.f39041a.f38643d.length() > 0) {
            mapMutableMapOf.put("metadataBlob", this.f39041a.f38643d);
        }
        Wj.b(eventType, mapMutableMapOf, EnumC3585ak.f38216b);
    }

    public final void a(boolean z10, short s10) {
        String strA = a("WebViewRenderProcessGoneEvent");
        String str = this.f39041a.f38651l;
        if (str == null) {
            str = "";
        }
        Pair pair = TuplesKt.to("trigger", str);
        long j10 = this.f39043c;
        CoroutineScope coroutineScope = AbstractC3790il.f38771a;
        Map mapMutableMapOf = MapsKt.mutableMapOf(pair, TuplesKt.to("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10)), TuplesKt.to("source", "render_view_" + this.f39041a.f38640a.f39715e), TuplesKt.to("isCrashed", Boolean.valueOf(z10)), TuplesKt.to("creativeId", this.f39041a.f38646g), TuplesKt.to("errorCode", Short.valueOf(s10)));
        Wj wj = Wj.f37959a;
        Wj.b(strA, mapMutableMapOf, EnumC3585ak.f38215a);
    }

    public final Map a() {
        String str = this.f39041a.f38651l;
        if (str == null) {
            str = "";
        }
        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("trigger", str), TuplesKt.to("plType", String.valueOf(this.f39041a.f38640a.f39716f)), TuplesKt.to("plId", String.valueOf(this.f39041a.f38640a.f39711a)), TuplesKt.to("adType", String.valueOf(this.f39041a.f38640a.f39715e)), TuplesKt.to("markupType", this.f39041a.f38641b), TuplesKt.to("networkType", C4148x5.m()), TuplesKt.to("retryCount", String.valueOf(this.f39041a.f38644e)), TuplesKt.to("creativeType", this.f39041a.f38645f), TuplesKt.to("adPosition", String.valueOf(this.f39041a.f38648i)), TuplesKt.to("isRewarded", String.valueOf(this.f39041a.f38647h)), TuplesKt.to("impressionId", this.f39041a.f38642c));
        if (this.f39041a.f38643d.length() > 0) {
            mapMutableMapOf.put("metadataBlob", this.f39041a.f38643d);
        }
        return mapMutableMapOf;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String a(String str) {
        if (!Intrinsics.areEqual(this.f39041a.f38651l, "default")) {
            switch (str.hashCode()) {
                case -1395724590:
                    if (str.equals("PageStarted")) {
                        return "CompanionWebViewPageStarted";
                    }
                    break;
                case -81019210:
                    if (str.equals("FireAdFailed")) {
                        return "CompanionFireAdFailed";
                    }
                    break;
                case 147127306:
                    if (str.equals("FireAdReady")) {
                        return "CompanionFireAdReady";
                    }
                    break;
                case 260281564:
                    if (str.equals("WebViewLoadCalled")) {
                        return "CompanionWebViewLoadCalled";
                    }
                    break;
                case 520950289:
                    if (str.equals("WebViewLoadFinished")) {
                        return "CompanionWebViewLoadFinished";
                    }
                    break;
                case 570988141:
                    if (str.equals("RenderProcessResponsive")) {
                        return "RenderProcessResponsive";
                    }
                    break;
                case 1001819046:
                    if (str.equals("RenderProcessUnResponsive")) {
                        return "CompanionRenderProcessUnResponsive";
                    }
                    break;
            }
        }
        return str;
    }
}

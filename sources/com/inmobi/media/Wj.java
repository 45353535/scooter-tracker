package com.inmobi.media;

import androidx.compose.material.TextFieldImplKt;
import com.inmobi.media.I2;
import com.inmobi.media.Wj;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Wj implements Jf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Wj f37959a = new Wj();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f37960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f37961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Lazy f37962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f37963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static C3850l6 f37964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C3814jk f37965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Function1 f37966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static C3714fk f37967i;

    static {
        String simpleName = Wj.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        f37960b = simpleName;
        List listMutableListOf = CollectionsKt.mutableListOf("AdLoadCalled", "AdLoadDroppedAtSDK", "AdLoadSuccessful", "AdLoadFailed", "ServerFill", "ServerNoFill", "ServerError", "AssetDownloaded", "AdShowCalled", "AdShowSuccessful", "AdShowFailed", "AdGetSignalsCalled", "AdRequestPayloadCalled", "AdGetSignalsSucceeded", "AdGetSignalsFailed", "UnifiedIdNetworkCallRequested", "UnifiedIdNetworkResponseFailure", "FetchApiInvoked", "FetchCallbackFailure", "AdImpressionSuccessful", "RenderSuccess", "ParseSuccess", "PageStarted", "WebViewLoadFinished", "FireAdReady", "WebViewLoadCalled", "FireAdFailed", "ResourceCacheMiss", "ResourceCacheHit", "ResourceDiskCacheFileMissing", "ResourceDiskCacheFileEvicted", "LowAvailableSpaceForCache", "WebViewRenderProcessGoneEvent", "clickStartCalled", "landingsStartSuccess", "landingsStartFailed", "browserOpenFailed", "landingsPageStarted", "landingsCompleteSuccess", "landingsCompleteFailed", "ImmersiveNotSupported", "AdNotReady", "IAPFetchFailed", "BillingClientConnectionError", "BillingClientNotCompatible", "PingFailed", "PingStarted", "PingSuccess", "CompanionWebViewLoadCalled", "CompanionWebViewLoadFailed", "CompanionFireAdReady", "CompanionFireAdFailed", "CompanionWebViewPageStarted", "CompanionWebViewLoadFinished", "AttachedToWindow", "VideoLoadStarted", "VideoLoadSuccess", "VideoLoadFailure", "VideoStart", "VideoFirstQuartile", "VideoSecondQuartile", "VideoThirdQuartile", "VideoComplete", "VideoDestroyed");
        f37961c = listMutableListOf;
        f37962d = lf.i.a(new Function0() { // from class: w3.k5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Wj.c();
            }
        });
        f37963e = new AtomicBoolean(false);
        Vj vj = new Vj();
        f37966h = new Function1() { // from class: w3.l5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wj.a((I2) obj);
            }
        };
        TelemetryConfig telemetryConfigB = b();
        f37965g = new C3814jk(new Yj(telemetryConfigB.getEnabled(), telemetryConfigB.getAssetReporting().isImageEnabled(), telemetryConfigB.getAssetReporting().isGifEnabled(), telemetryConfigB.getAssetReporting().isVideoEnabled(), telemetryConfigB.getDisableAllGeneralEvents(), telemetryConfigB.getPriorityEventsList(), telemetryConfigB.getSamplingFactor()), CollectionsKt.toList(listMutableListOf));
        Y3.a(TelemetryCategory.TELEMETRY, vj);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Unit a(I2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = it.f37045a;
        if (i10 != 1 && i10 != 2) {
            switch (i10) {
                case TextFieldImplKt.AnimationDuration /* 150 */:
                    C3714fk c3714fk = f37967i;
                    if (c3714fk != null) {
                        Map map = it.f37047c;
                        Object obj = map != null ? map.get("data") : null;
                        c3714fk.a("CrashEventOccurred", obj instanceof T4 ? (T4) obj : null);
                    }
                    break;
                case 151:
                    C3714fk c3714fk2 = f37967i;
                    if (c3714fk2 != null) {
                        Map map2 = it.f37047c;
                        Object obj2 = map2 != null ? map2.get("data") : null;
                        Wn wn = obj2 instanceof Wn ? (Wn) obj2 : null;
                        if (wn != null && AbstractC3790il.a(wn)) {
                            C4148x5.f39893a.getClass();
                            if (!C4148x5.r()) {
                                c3714fk2.a("MainThreadBlockedEvent", wn);
                            }
                        }
                    }
                    break;
                case 152:
                    C3714fk c3714fk3 = f37967i;
                    if (c3714fk3 != null) {
                        Map map3 = it.f37047c;
                        Object obj3 = map3 != null ? map3.get("data") : null;
                        c3714fk3.a(obj3 instanceof C4194z1 ? (C4194z1) obj3 : null);
                    }
                    break;
            }
        } else {
            f37963e.set(false);
            C3850l6 c3850l6 = f37964f;
            if (c3850l6 != null) {
                c3850l6.f38950f.set(false);
                c3850l6.f38951g.set(true);
                c3850l6.f38952h.clear();
                c3850l6.f38954j = null;
            }
            f37964f = null;
            f37967i = null;
            ((C4155xc) Ji.f37161e.getValue()).a(f37966h);
        }
        return Unit.f93236a;
    }

    public static final void b(String eventType, Map keyValueMap, EnumC3585ak telemetryEventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(keyValueMap, "keyValueMap");
        Intrinsics.checkNotNullParameter(telemetryEventType, "telemetryEventType");
        eg.i.d(A9.f36557c, null, null, new Uj(eventType, keyValueMap, telemetryEventType, null), 3, null);
    }

    public static final C3663dk c() {
        return new C3663dk(AbstractC3754h9.b());
    }

    public static TelemetryConfig b() {
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        return (TelemetryConfig) Y3.f38021a.a(TelemetryConfig.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(kotlin.coroutines.jvm.internal.d r5) {
        /*
            boolean r0 = r5 instanceof com.inmobi.media.Tj
            if (r0 == 0) goto L13
            r0 = r5
            com.inmobi.media.Tj r0 = (com.inmobi.media.Tj) r0
            int r1 = r0.f37789b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37789b = r1
            goto L18
        L13:
            com.inmobi.media.Tj r0 = new com.inmobi.media.Tj
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f37788a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f37789b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r5)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.d.b(r5)
            java.util.concurrent.atomic.AtomicBoolean r5 = com.inmobi.media.Wj.f37963e
            boolean r5 = r5.getAndSet(r3)
            if (r5 != 0) goto L6a
            com.inmobi.media.Wj r5 = com.inmobi.media.Wj.f37959a
            r0.f37789b = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            kotlin.Lazy r5 = com.inmobi.media.Ji.f37161e
            java.lang.Object r5 = r5.getValue()
            com.inmobi.media.xc r5 = (com.inmobi.media.C4155xc) r5
            r0 = 152(0x98, float:2.13E-43)
            r1 = 151(0x97, float:2.12E-43)
            r2 = 2
            r4 = 150(0x96, float:2.1E-43)
            int[] r0 = new int[]{r2, r3, r4, r0, r1}
            kotlin.jvm.functions.Function1 r1 = com.inmobi.media.Wj.f37966h
            r5.a(r0, r1)
            com.inmobi.media.fk r5 = new com.inmobi.media.fk
            com.inmobi.media.core.config.models.TelemetryConfig r0 = b()
            r5.<init>(r0)
            com.inmobi.media.Wj.f37967i = r5
        L6a:
            kotlin.Unit r5 = kotlin.Unit.f93236a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Wj.b(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public static boolean a(String eventType, Map keyValueMap, EnumC3585ak telemetryEventType) {
        boolean zA;
        C3814jk c3814jk = f37965g;
        if (c3814jk == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTelemetryValidator");
            c3814jk = null;
        }
        c3814jk.getClass();
        Intrinsics.checkNotNullParameter(telemetryEventType, "telemetryEventType");
        Intrinsics.checkNotNullParameter(keyValueMap, "keyValueMap");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        if (c3814jk.f38833a.f38064a) {
            int iOrdinal = telemetryEventType.ordinal();
            if (iOrdinal == 0) {
                zA = c3814jk.f38834b.a(eventType, keyValueMap);
            } else {
                if (iOrdinal != 1) {
                    throw new lf.m();
                }
                zA = true;
            }
        } else {
            zA = false;
        }
        return !zA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        if (r9.a(r8, (kotlin.coroutines.jvm.internal.d) r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ee, code lost:
    
        if (r8 != r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.inmobi.media.C3688ek r8, kotlin.coroutines.jvm.internal.d r9) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Wj.a(com.inmobi.media.ek, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final void a() {
        if (f37963e.get()) {
            C3623c6 eventConfig = b().getEventConfig();
            eventConfig.f38330k = b().getTelemetryUrl();
            C3850l6 c3850l6 = f37964f;
            if (c3850l6 == null) {
                f37964f = new C3850l6(TelemetryCategory.TELEMETRY, (C3663dk) f37962d.getValue(), this, eventConfig, this);
            } else {
                Intrinsics.checkNotNullParameter(eventConfig, "eventConfig");
                c3850l6.f38954j = eventConfig;
            }
            C3850l6 c3850l62 = f37964f;
            if (c3850l62 != null) {
                c3850l62.a(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.inmobi.media.Qj
            if (r0 == 0) goto L13
            r0 = r5
            com.inmobi.media.Qj r0 = (com.inmobi.media.Qj) r0
            int r1 = r0.f37611c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37611c = r1
            goto L18
        L13:
            com.inmobi.media.Qj r0 = new com.inmobi.media.Qj
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f37609a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f37611c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r5)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.d.b(r5)
            kotlin.Lazy r5 = com.inmobi.media.Wj.f37962d
            java.lang.Object r5 = r5.getValue()
            com.inmobi.media.dk r5 = (com.inmobi.media.C3663dk) r5
            r0.f37611c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 <= 0) goto L50
            r4.a()
        L50:
            kotlin.Unit r5 = kotlin.Unit.f93236a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Wj.a(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // com.inmobi.media.Jf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Wj.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}

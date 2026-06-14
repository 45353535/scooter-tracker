package io.bidmachine.analytics;

import android.content.Context;
import android.util.Base64;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import eg.m1;
import eg.w0;
import io.bidmachine.analytics.internal.b.C5633a;
import io.bidmachine.analytics.internal.c.C5635a;
import io.bidmachine.analytics.internal.d.C5637a;
import io.bidmachine.analytics.internal.h.e;
import io.bidmachine.analytics.internal.j.a;
import java.util.Map;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import lf.i;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000b\u0010\u000fJ/\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u00120\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u001c\u0010\u000fR!\u0010#\u001a\u00020\u001e8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001f\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b \u0010!R$\u0010)\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00138\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R$\u00100\u001a\u0004\u0018\u00010\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Lio/bidmachine/analytics/BidMachineAnalytics;", "", "<init>", "()V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "", MobileAdsBridgeBase.initializeMethodName, "(Landroid/content/Context;)V", "Lio/bidmachine/analytics/AnalyticsConfig;", "analyticsConfig", "configure", "(Landroid/content/Context;Lio/bidmachine/analytics/AnalyticsConfig;)V", "Lio/bidmachine/analytics/ConfigureListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Landroid/content/Context;Lio/bidmachine/analytics/AnalyticsConfig;Lio/bidmachine/analytics/ConfigureListener;)V", "", "typeId", "", "", "getImpData", "(I)Ljava/util/Map;", C4240b4.i.W, "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", "", "outPublicKey", "Lio/bidmachine/analytics/internal/b/a;", "a", "([B)Lio/bidmachine/analytics/internal/b/a;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Lazy;", "getScope$bidmachine_android_sdk_bg_3_5_0", "()Lkotlinx/coroutines/CoroutineScope;", "getScope$bidmachine_android_sdk_bg_3_5_0$annotations", "scope", "<set-?>", "b", "Ljava/lang/String;", "getSessionId$bidmachine_android_sdk_bg_3_5_0", "()Ljava/lang/String;", JsonStorageKeyNames.SESSION_ID_KEY, ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lio/bidmachine/analytics/internal/b/a;", "getEncryptionManager$bidmachine_android_sdk_bg_3_5_0", "()Lio/bidmachine/analytics/internal/b/a;", "setEncryptionManager$bidmachine_android_sdk_bg_3_5_0", "(Lio/bidmachine/analytics/internal/b/a;)V", "encryptionManager", "bidmachine-android-sdk_bg_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BidMachineAnalytics {
    public static final BidMachineAnalytics INSTANCE = new BidMachineAnalytics();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final Lazy scope = i.a(b.f79457a);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static String sessionId = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static C5633a encryptionManager;

    static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f79451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f79452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AnalyticsConfig f79453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f79454d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f79455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ConfigureListener f79456f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AnalyticsConfig analyticsConfig, String str, Context context, ConfigureListener configureListener, Continuation continuation) {
            super(2, continuation);
            this.f79453c = analyticsConfig;
            this.f79454d = str;
            this.f79455e = context;
            this.f79456f = configureListener;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f79453c, this.f79454d, this.f79455e, this.f79456f, continuation);
            aVar.f79452b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objB2;
            pf.b.g();
            if (this.f79451a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            AnalyticsConfig analyticsConfig = this.f79453c;
            try {
                Result.Companion companion = Result.f93230c;
                BidMachineAnalytics bidMachineAnalytics = BidMachineAnalytics.INSTANCE;
                bidMachineAnalytics.setEncryptionManager$bidmachine_android_sdk_bg_3_5_0(bidMachineAnalytics.a(Base64.decode(analyticsConfig.getBpk(), 2)));
                objB = Result.b(Unit.f93236a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(d.a(th2));
            }
            if (Result.j(objB)) {
            }
            Result.g(objB);
            try {
                BidMachineAnalytics.INSTANCE.a(this.f79455e, this.f79453c, this.f79456f);
                objB2 = Result.b(Unit.f93236a);
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.f93230c;
                objB2 = Result.b(d.a(th3));
            }
            if (Result.j(objB2)) {
            }
            Result.g(objB2);
            return Unit.f93236a;
        }
    }

    static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f79457a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineScope invoke() {
            return kotlinx.coroutines.i.a(m1.b(null, 1, null).plus(w0.c(Executors.newSingleThreadExecutor())));
        }
    }

    private BidMachineAnalytics() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C5633a a(byte[] outPublicKey) {
        C5635a c5635a = new C5635a();
        return new C5633a(c5635a, new C5637a(outPublicKey, c5635a.getName(), null, false, 12, null));
    }

    public static final void configure(Context context, AnalyticsConfig analyticsConfig) {
        configure(context, analyticsConfig, null);
    }

    public static final Map<String, Map<String, Object>> getImpData(int typeId) {
        a.EnumC0951a enumC0951a = (a.EnumC0951a) ArraysKt.getOrNull(a.EnumC0951a.values(), typeId);
        return enumC0951a == null ? MapsKt.emptyMap() : e.f79581a.a(enumC0951a);
    }

    public static final Object getProperty(String key) {
        return e.f79581a.a(key);
    }

    public static /* synthetic */ void getScope$bidmachine_android_sdk_bg_3_5_0$annotations() {
    }

    public static final void initialize(Context context) {
        e.f79581a.b(context.getApplicationContext());
    }

    public final C5633a getEncryptionManager$bidmachine_android_sdk_bg_3_5_0() {
        return encryptionManager;
    }

    public final CoroutineScope getScope$bidmachine_android_sdk_bg_3_5_0() {
        return (CoroutineScope) scope.getValue();
    }

    public final String getSessionId$bidmachine_android_sdk_bg_3_5_0() {
        return sessionId;
    }

    public final void setEncryptionManager$bidmachine_android_sdk_bg_3_5_0(C5633a c5633a) {
        encryptionManager = c5633a;
    }

    public static final void configure(Context context, AnalyticsConfig analyticsConfig, ConfigureListener listener) {
        String str = analyticsConfig.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String();
        sessionId = str;
        initialize(context);
        eg.i.d(INSTANCE.getScope$bidmachine_android_sdk_bg_3_5_0(), null, null, new a(analyticsConfig, str, context.getApplicationContext(), listener, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, AnalyticsConfig analyticsConfig, ConfigureListener listener) {
        io.bidmachine.analytics.internal.v.a.f79897a.a(context, analyticsConfig);
        e.f79581a.a(context, analyticsConfig);
        if (listener != null) {
            listener.onConfigured();
        }
    }
}

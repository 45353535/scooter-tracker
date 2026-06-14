package io.bidmachine;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.explorestack.protobuf.Timestamp;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import io.bidmachine.InstallInfoProvider;
import io.bidmachine.protobuf.sdk.App;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u0011\u0010\r\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\nJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0013*\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lio/bidmachine/InstallInfoProvider;", "", "<init>", "()V", "", "getInstallReferrerUrl", "()Ljava/lang/String;", "getInstallVersion", "Lcom/explorestack/protobuf/Timestamp;", "getInstallReferrerClickTimestamp", "()Lcom/explorestack/protobuf/Timestamp;", "getInstallBeginTimestamp", "getInstallReferrerClickServerTimestamp", "getInstallBeginServerTimestamp", "", "isGooglePlayInstant", "()Ljava/lang/Boolean;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lh9/b;", "createBySharedPreferences", "(Landroid/content/Context;)Lh9/b;", "Lcom/android/installreferrer/api/ReferrerDetails;", "toInstallInfo", "(Lcom/android/installreferrer/api/ReferrerDetails;)Lh9/b;", "", MobileAdsBridgeBase.initializeMethodName, "(Landroid/content/Context;)V", "Lio/bidmachine/protobuf/sdk/App$Builder;", "appBuilder", Reporting.EventType.FILL, "(Lio/bidmachine/protobuf/sdk/App$Builder;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitializeExecuted", "Ljava/util/concurrent/atomic/AtomicBoolean;", "installInfo", "Lh9/b;", "a", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class InstallInfoProvider {

    @Nullable
    private h9.b installInfo;

    @NotNull
    private final AtomicBoolean isInitializeExecuted = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f79146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InstallReferrerClient f79147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InstallInfoProvider f79148c;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: io.bidmachine.InstallInfoProvider$a$a, reason: collision with other inner class name */
        final class C0933a implements InstallReferrerStateListener {
            public C0933a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void b(C0933a this$0, int i10) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.c(i10);
            }

            public final void c(int i10) {
                if (i10 == 0) {
                    try {
                        a aVar = a.this;
                        InstallInfoProvider installInfoProvider = aVar.f79148c;
                        ReferrerDetails installReferrer = aVar.f79147b.getInstallReferrer();
                        Intrinsics.checkNotNullExpressionValue(installReferrer, "installReferrerClient.installReferrer");
                        h9.b installInfo = installInfoProvider.toInstallInfo(installReferrer);
                        if (!installInfo.g()) {
                            a.this.f79148c.installInfo = installInfo;
                            n2.I(a.this.f79146a, installInfo);
                        }
                    } catch (Throwable th2) {
                        io.bidmachine.core.a.p(th2);
                    }
                }
                a.this.f79147b.endConnection();
            }

            @Override // com.android.installreferrer.api.InstallReferrerStateListener
            public void onInstallReferrerServiceDisconnected() {
            }

            @Override // com.android.installreferrer.api.InstallReferrerStateListener
            public void onInstallReferrerSetupFinished(final int i10) {
                new Thread(new i9.b() { // from class: io.bidmachine.k4
                    @Override // ae.j
                    public /* synthetic */ void c(Throwable th2) {
                        i9.a.a(this, th2);
                    }

                    @Override // ae.j
                    public final void onRun() {
                        InstallInfoProvider.a.C0933a.b(this.f80493b, i10);
                    }

                    @Override // java.lang.Runnable
                    public /* synthetic */ void run() {
                        ae.i.a(this);
                    }
                }).start();
            }
        }

        public a(InstallInfoProvider installInfoProvider, Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f79148c = installInfoProvider;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            this.f79146a = applicationContext;
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(applicationContext).build();
            Intrinsics.checkNotNullExpressionValue(installReferrerClientBuild, "newBuilder(applicationCo…\n                .build()");
            this.f79147b = installReferrerClientBuild;
        }

        public final void c() {
            try {
                this.f79147b.startConnection(new C0933a());
            } catch (Throwable th2) {
                io.bidmachine.core.a.p(th2);
            }
        }
    }

    private final h9.b createBySharedPreferences(Context context) {
        return new h9.b(n2.p(context), n2.q(context), n2.n(context), n2.l(context), n2.o(context), n2.m(context), n2.A(context));
    }

    private final Timestamp getInstallBeginServerTimestamp() {
        Long lB;
        h9.b bVar = this.installInfo;
        if (bVar != null && (lB = bVar.b()) != null) {
            long jLongValue = lB.longValue();
            if (jLongValue > 0) {
                return ae.f.r(jLongValue);
            }
        }
        return null;
    }

    private final Timestamp getInstallBeginTimestamp() {
        Long lA;
        h9.b bVar = this.installInfo;
        if (bVar != null && (lA = bVar.a()) != null) {
            long jLongValue = lA.longValue();
            if (jLongValue > 0) {
                return ae.f.r(jLongValue);
            }
        }
        return null;
    }

    private final Timestamp getInstallReferrerClickServerTimestamp() {
        Long lD;
        h9.b bVar = this.installInfo;
        if (bVar != null && (lD = bVar.d()) != null) {
            long jLongValue = lD.longValue();
            if (jLongValue > 0) {
                return ae.f.r(jLongValue);
            }
        }
        return null;
    }

    private final Timestamp getInstallReferrerClickTimestamp() {
        Long lC;
        h9.b bVar = this.installInfo;
        if (bVar != null && (lC = bVar.c()) != null) {
            long jLongValue = lC.longValue();
            if (jLongValue > 0) {
                return ae.f.r(jLongValue);
            }
        }
        return null;
    }

    private final String getInstallReferrerUrl() {
        String strE;
        h9.b bVar = this.installInfo;
        if (bVar == null || (strE = bVar.e()) == null || strE.length() <= 0) {
            return null;
        }
        return strE;
    }

    private final String getInstallVersion() {
        String strF;
        h9.b bVar = this.installInfo;
        if (bVar == null || (strF = bVar.f()) == null || strF.length() <= 0) {
            return null;
        }
        return strF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$0(InstallInfoProvider this$0, Context context) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        new a(this$0, context).c();
    }

    private final Boolean isGooglePlayInstant() {
        h9.b bVar = this.installInfo;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h9.b toInstallInfo(ReferrerDetails referrerDetails) {
        return new h9.b(referrerDetails.getInstallReferrer(), referrerDetails.getInstallVersion(), Long.valueOf(referrerDetails.getReferrerClickTimestampSeconds()), Long.valueOf(referrerDetails.getInstallBeginTimestampSeconds()), Long.valueOf(referrerDetails.getReferrerClickTimestampServerSeconds()), Long.valueOf(referrerDetails.getInstallBeginTimestampServerSeconds()), Boolean.valueOf(referrerDetails.getGooglePlayInstantParam()));
    }

    public final /* synthetic */ void fill(App.Builder appBuilder) {
        Intrinsics.checkNotNullParameter(appBuilder, "appBuilder");
        String installReferrerUrl = getInstallReferrerUrl();
        if (installReferrerUrl != null) {
            appBuilder.setInstallReferrerUrl(installReferrerUrl);
        }
        String installVersion = getInstallVersion();
        if (installVersion != null) {
            appBuilder.setInstallVersion(installVersion);
        }
        Timestamp installReferrerClickTimestamp = getInstallReferrerClickTimestamp();
        if (installReferrerClickTimestamp != null) {
            appBuilder.setInstallReferrerClickTimestamp(installReferrerClickTimestamp);
        }
        Timestamp installBeginTimestamp = getInstallBeginTimestamp();
        if (installBeginTimestamp != null) {
            appBuilder.setInstallTime(installBeginTimestamp);
        }
        Timestamp installReferrerClickServerTimestamp = getInstallReferrerClickServerTimestamp();
        if (installReferrerClickServerTimestamp != null) {
            appBuilder.setInstallReferrerClickServerTimestamp(installReferrerClickServerTimestamp);
        }
        Timestamp installBeginServerTimestamp = getInstallBeginServerTimestamp();
        if (installBeginServerTimestamp != null) {
            appBuilder.setInstallBeginServerTimestamp(installBeginServerTimestamp);
        }
        Boolean boolIsGooglePlayInstant = isGooglePlayInstant();
        if (boolIsGooglePlayInstant != null) {
            appBuilder.setIsGooglePlayInstant(boolIsGooglePlayInstant.booleanValue());
        }
    }

    @WorkerThread
    public final void initialize(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.isInitializeExecuted.compareAndSet(false, true)) {
            h9.b bVarCreateBySharedPreferences = createBySharedPreferences(context);
            this.installInfo = bVarCreateBySharedPreferences;
            if (bVarCreateBySharedPreferences == null || !bVarCreateBySharedPreferences.h()) {
                new Thread(new i9.b() { // from class: io.bidmachine.j4
                    @Override // ae.j
                    public /* synthetic */ void c(Throwable th2) {
                        i9.a.a(this, th2);
                    }

                    @Override // ae.j
                    public final void onRun() {
                        InstallInfoProvider.initialize$lambda$0(this.f80483b, context);
                    }

                    @Override // java.lang.Runnable
                    public /* synthetic */ void run() {
                        ae.i.a(this);
                    }
                }).start();
            }
        }
    }
}

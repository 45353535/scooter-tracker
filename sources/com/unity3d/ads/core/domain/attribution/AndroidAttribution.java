package com.unity3d.ads.core.domain.attribution;

import android.adservices.AdServicesState;
import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.os.ext.SdkExtensions;
import android.view.InputEvent;
import androidx.core.os.g;
import androidx.privacysandbox.ads.adservices.measurement.j;
import androidx.privacysandbox.ads.adservices.measurement.k;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import eg.w0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import lf.i;
import of.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0011\u0010\u0015\u001a\u00020\u0016H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J!\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/core/domain/attribution/AndroidAttribution;", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "(Landroid/content/Context;Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "measurementManager", "Landroid/adservices/measurement/MeasurementManager;", "getMeasurementManager", "()Landroid/adservices/measurement/MeasurementManager;", "measurementManager$delegate", "Lkotlin/Lazy;", "getUri", "Landroid/net/Uri;", "baseUrl", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "isAvailable", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerClick", "url", "(Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerView", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi", "MissingPermission"})
public final class AndroidAttribution {

    @NotNull
    private final ISDKDispatchers dispatchers;

    /* JADX INFO: renamed from: measurementManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy measurementManager;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidAttribution(@NotNull final Context context, @NotNull ISDKDispatchers dispatchers, @NotNull SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.dispatchers = dispatchers;
        this.sessionRepository = sessionRepository;
        this.measurementManager = i.a(new Function0<MeasurementManager>() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$measurementManager$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final MeasurementManager invoke() {
                return this.this$0.getMeasurementManager(context);
            }
        });
    }

    private final MeasurementManager getMeasurementManager() {
        return k.a(this.measurementManager.getValue());
    }

    private final Uri getUri(String baseUrl, AdObject adObject) {
        Uri uri = Uri.parse(baseUrl);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(this)");
        Uri uriBuild = uri.buildUpon().appendQueryParameter("sessionToken", ProtobufExtensionsKt.toBase64$default(this.sessionRepository.getSessionToken(), false, 1, null)).appendQueryParameter(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null)).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "baseUrl.toUri()\n        …4())\n            .build()");
        return uriBuild;
    }

    @Nullable
    public final Object isAvailable(@NotNull Continuation continuation) throws Throwable {
        Unit unit;
        if (Device.getApiLevel() < 33) {
            return b.a(false);
        }
        if (SdkExtensions.getExtensionVersion(1000000) < 4) {
            return b.a(false);
        }
        if (getMeasurementManager() == null) {
            return b.a(false);
        }
        if (!AdServicesState.isAdServicesStateEnabled()) {
            return b.a(false);
        }
        final e eVar = new e(pf.b.d(continuation));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.getMeasurementApiStatus(w0.a(this.dispatchers.getDefault()), g.a(new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$isAvailable$2$1
                public /* bridge */ /* synthetic */ void onResult(Object obj) {
                    onResult(((Number) obj).intValue());
                }

                public void onError(@NotNull Exception error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    Continuation continuation2 = eVar;
                    Result.Companion companion = Result.f93230c;
                    continuation2.resumeWith(Result.b(Boolean.FALSE));
                }

                public void onResult(int status) {
                    Continuation continuation2 = eVar;
                    Result.Companion companion = Result.f93230c;
                    continuation2.resumeWith(Result.b(Boolean.valueOf(status == 1)));
                }
            }));
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            Result.Companion companion = Result.f93230c;
            eVar.resumeWith(Result.b(b.a(false)));
        }
        Object objB = eVar.b();
        if (objB == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objB;
    }

    @Nullable
    public final Object registerClick(@NotNull String str, @NotNull AdObject adObject, @NotNull Continuation continuation) throws Throwable {
        WebViewContainer webViewContainer;
        StateFlow lastInputEvent;
        InputEvent inputEvent;
        Unit unit;
        if (getMeasurementManager() == null) {
            return b.a(false);
        }
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null || (webViewContainer = adPlayer.getWebViewContainer()) == null || (lastInputEvent = webViewContainer.getLastInputEvent()) == null || (inputEvent = (InputEvent) lastInputEvent.getValue()) == null) {
            return b.a(false);
        }
        final e eVar = new e(pf.b.d(continuation));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), inputEvent, w0.a(this.dispatchers.getDefault()), g.a(new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerClick$2$1
                public void onResult(@NotNull Object p02) {
                    Intrinsics.checkNotNullParameter(p02, "p0");
                    Continuation continuation2 = eVar;
                    Result.Companion companion = Result.f93230c;
                    continuation2.resumeWith(Result.b(Boolean.TRUE));
                }

                public void onError(@NotNull Exception error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    Continuation continuation2 = eVar;
                    Result.Companion companion = Result.f93230c;
                    continuation2.resumeWith(Result.b(Boolean.FALSE));
                }
            }));
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            Result.Companion companion = Result.f93230c;
            eVar.resumeWith(Result.b(b.a(false)));
        }
        Object objB = eVar.b();
        if (objB == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objB;
    }

    @Nullable
    public final Object registerView(@NotNull String str, @NotNull AdObject adObject, @NotNull Continuation continuation) throws Throwable {
        if (getMeasurementManager() == null) {
            return b.a(false);
        }
        final e eVar = new e(pf.b.d(continuation));
        MeasurementManager measurementManager = getMeasurementManager();
        Unit unit = null;
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), null, w0.a(this.dispatchers.getDefault()), g.a(new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerView$2$1
                public void onResult(@NotNull Object p02) {
                    Intrinsics.checkNotNullParameter(p02, "p0");
                    Continuation continuation2 = eVar;
                    Result.Companion companion = Result.f93230c;
                    continuation2.resumeWith(Result.b(Boolean.TRUE));
                }

                public void onError(@NotNull Exception error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    Continuation continuation2 = eVar;
                    Result.Companion companion = Result.f93230c;
                    continuation2.resumeWith(Result.b(Boolean.FALSE));
                }
            }));
            unit = Unit.f93236a;
        }
        if (unit == null) {
            Result.Companion companion = Result.f93230c;
            eVar.resumeWith(Result.b(b.a(false)));
        }
        Object objB = eVar.b();
        if (objB == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MeasurementManager getMeasurementManager(Context context) {
        if (Device.getApiLevel() >= 33 && SdkExtensions.getExtensionVersion(1000000) >= 4) {
            return k.a(context.getSystemService(j.a()));
        }
        return null;
    }
}

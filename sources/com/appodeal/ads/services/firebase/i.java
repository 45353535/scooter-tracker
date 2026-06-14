package com.appodeal.ads.services.firebase;

import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.ext.ResultExtKt;
import com.appodeal.ads.modules.common.internal.service.ConnectorCallback;
import com.appodeal.ads.modules.common.internal.service.InitializationMode;
import com.appodeal.ads.modules.common.internal.service.ServiceData;
import com.appodeal.ads.modules.common.internal.service.ServiceOptions;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.analytics.AnalyticsKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.RemoteConfigKt;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f14680r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ServiceOptions.Firebase f14681s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ FirebaseService f14682t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ServiceOptions.Firebase firebase, FirebaseService firebaseService, Continuation continuation) {
        super(2, continuation);
        this.f14681s = firebase;
        this.f14682t = firebaseService;
    }

    public static final Unit c(ServiceOptions.Firebase firebase, FirebaseRemoteConfigSettings.Builder builder) {
        Long expirationDuration = firebase.getExpirationDuration();
        builder.setMinimumFetchIntervalInSeconds(expirationDuration != null ? expirationDuration.longValue() : ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS);
        return Unit.f93236a;
    }

    public static final Unit i(FirebaseService firebaseService, String str) {
        ServiceData.Firebase firebase;
        if (str == null || StringsKt.y0(str)) {
            LogExtKt.logInternal$default("FirebaseService", "firebaseAppInstanceId is null or empty", null, 4, null);
        }
        if (str == null) {
            str = "";
        }
        ServiceData.Firebase firebase2 = firebaseService.f14663f;
        if (firebase2 == null || (firebase = ServiceData.Firebase.copy$default(firebase2, str, null, 2, null)) == null) {
            firebase = new ServiceData.Firebase(str, CollectionsKt.emptyList());
        }
        firebaseService.f14663f = firebase;
        ConnectorCallback connectorCallback = firebaseService.f14664g;
        if (connectorCallback == null) {
            throw new IllegalArgumentException("callback can not be null!");
        }
        connectorCallback.onServiceDataUpdated(firebase);
        return Unit.f93236a;
    }

    public static final void j(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        i iVar = new i(this.f14681s, this.f14682t, continuation);
        iVar.f14680r = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f14680r;
        LogExtKt.logInternal$default("FirebaseService", "Initialization mode: " + this.f14681s.getMode(), null, 4, null);
        if (this.f14681s.getMode() == InitializationMode.Active) {
            FirebaseAnalytics.getInstance(this.f14681s.getCom.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants.NATIVE_CONTEXT java.lang.String()).setAnalyticsCollectionEnabled(this.f14681s.getUserPersonalData().isUserHasConsent());
            FirebaseRemoteConfig remoteConfig = RemoteConfigKt.getRemoteConfig(Firebase.INSTANCE);
            final ServiceOptions.Firebase firebase = this.f14681s;
            remoteConfig.setConfigSettingsAsync(RemoteConfigKt.remoteConfigSettings(new Function1() { // from class: com.appodeal.ads.services.firebase.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return i.c(firebase, (FirebaseRemoteConfigSettings.Builder) obj2);
                }
            }));
        }
        Task<String> appInstanceId = AnalyticsKt.getAnalytics(Firebase.INSTANCE).getAppInstanceId();
        final FirebaseService firebaseService = this.f14682t;
        final Function1 function1 = new Function1() { // from class: com.appodeal.ads.services.firebase.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return i.i(firebaseService, (String) obj2);
            }
        };
        appInstanceId.addOnSuccessListener(new OnSuccessListener() { // from class: com.appodeal.ads.services.firebase.h
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj2) {
                i.j(function1, obj2);
            }
        });
        this.f14682t.launchAwaitingAsync(this.f14681s.getInitializationTimeout());
        eg.i.d(coroutineScope, null, null, new e(this.f14681s, this.f14682t, null), 3, null);
        return Result.a(ResultExtKt.asSuccess(Unit.f93236a));
    }
}

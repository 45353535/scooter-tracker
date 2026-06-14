package com.appodeal.ads.adapters.unityads;

import android.content.Context;
import com.appodeal.ads.AdNetworkInitializationListener;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import eg.o0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f12580r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Context f12581s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f12582t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f12583u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AdNetworkInitializationListener f12584v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ContextProvider f12585w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ UnityadsNetwork f12586x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AdNetworkMediationParams f12587y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(f fVar, AdNetworkInitializationListener adNetworkInitializationListener, ContextProvider contextProvider, UnityadsNetwork unityadsNetwork, AdNetworkMediationParams adNetworkMediationParams, Continuation continuation) {
        super(2, continuation);
        this.f12583u = fVar;
        this.f12584v = adNetworkInitializationListener;
        this.f12585w = contextProvider;
        this.f12586x = unityadsNetwork;
        this.f12587y = adNetworkMediationParams;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.f12583u, this.f12584v, this.f12585w, this.f12586x, this.f12587y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Context applicationContext;
        Context context;
        String str2;
        Object objG = pf.b.g();
        int i10 = this.f12582t;
        if (i10 == 0) {
            kotlin.d.b(obj);
            str = this.f12583u.f12566a;
            if (str.length() == 0) {
                this.f12584v.onInitializationFailed(LoadingError.IncorrectAdunit);
                return Unit.f93236a;
            }
            applicationContext = this.f12585w.getApplicationContext();
            String str3 = this.f12583u.f12567b;
            j unityMetaData = this.f12586x.getUnityMetaData();
            RestrictedData restrictedData = this.f12587y.getRestrictedData();
            this.f12580r = str;
            this.f12581s = applicationContext;
            this.f12582t = 1;
            unityMetaData.getClass();
            Object objG2 = eg.g.g(o0.b(), new i(restrictedData, applicationContext, str3, null), this);
            if (objG2 != pf.b.g()) {
                objG2 = Unit.f93236a;
            }
            if (objG2 != objG) {
            }
            return objG;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = this.f12581s;
            str2 = this.f12580r;
            kotlin.d.b(obj);
            this.f12586x.subscribeOnImpressionEvents(context);
            Context applicationContext2 = this.f12585w.getApplicationContext();
            boolean zIsTestMode = this.f12587y.isTestMode();
            final AdNetworkInitializationListener adNetworkInitializationListener = this.f12584v;
            UnityAds.initialize(applicationContext2, str2, zIsTestMode, new IUnityAdsInitializationListener() { // from class: com.appodeal.ads.adapters.unityads.UnityadsNetwork$initialize$1$1

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[UnityAds.UnityAdsInitializationError.values().length];
                        try {
                            iArr[UnityAds.UnityAdsInitializationError.INTERNAL_ERROR.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[UnityAds.UnityAdsInitializationError.AD_BLOCKER_DETECTED.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // com.unity3d.ads.IUnityAdsInitializationListener
                public void onInitializationComplete() {
                    adNetworkInitializationListener.onInitializationFinished();
                }

                @Override // com.unity3d.ads.IUnityAdsInitializationListener
                public void onInitializationFailed(UnityAds.UnityAdsInitializationError error, String message) {
                    LoadingError loadingError;
                    Intrinsics.checkNotNullParameter(error, "error");
                    Intrinsics.checkNotNullParameter(message, "message");
                    int i11 = WhenMappings.$EnumSwitchMapping$0[error.ordinal()];
                    if (i11 == 1) {
                        loadingError = LoadingError.InternalError;
                    } else if (i11 == 2) {
                        loadingError = LoadingError.InvalidAssets;
                    } else {
                        if (i11 != 3) {
                            throw new lf.m();
                        }
                        loadingError = LoadingError.NoFill;
                    }
                    adNetworkInitializationListener.onInitializationFailed(loadingError);
                }
            });
            return Unit.f93236a;
        }
        applicationContext = this.f12581s;
        String str4 = this.f12580r;
        kotlin.d.b(obj);
        str = str4;
        if (this.f12586x.isInitialized()) {
            this.f12584v.onInitializationFinished();
            return Unit.f93236a;
        }
        j unityMetaData2 = this.f12586x.getUnityMetaData();
        this.f12580r = str;
        this.f12581s = applicationContext;
        this.f12582t = 2;
        unityMetaData2.getClass();
        Object objG3 = eg.g.g(o0.b(), new h(applicationContext, null), this);
        if (objG3 != pf.b.g()) {
            objG3 = Unit.f93236a;
        }
        if (objG3 != objG) {
            context = applicationContext;
            str2 = str;
            this.f12586x.subscribeOnImpressionEvents(context);
            Context applicationContext22 = this.f12585w.getApplicationContext();
            boolean zIsTestMode2 = this.f12587y.isTestMode();
            final AdNetworkInitializationListener adNetworkInitializationListener2 = this.f12584v;
            UnityAds.initialize(applicationContext22, str2, zIsTestMode2, new IUnityAdsInitializationListener() { // from class: com.appodeal.ads.adapters.unityads.UnityadsNetwork$initialize$1$1

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[UnityAds.UnityAdsInitializationError.values().length];
                        try {
                            iArr[UnityAds.UnityAdsInitializationError.INTERNAL_ERROR.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[UnityAds.UnityAdsInitializationError.AD_BLOCKER_DETECTED.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // com.unity3d.ads.IUnityAdsInitializationListener
                public void onInitializationComplete() {
                    adNetworkInitializationListener2.onInitializationFinished();
                }

                @Override // com.unity3d.ads.IUnityAdsInitializationListener
                public void onInitializationFailed(UnityAds.UnityAdsInitializationError error, String message) {
                    LoadingError loadingError;
                    Intrinsics.checkNotNullParameter(error, "error");
                    Intrinsics.checkNotNullParameter(message, "message");
                    int i11 = WhenMappings.$EnumSwitchMapping$0[error.ordinal()];
                    if (i11 == 1) {
                        loadingError = LoadingError.InternalError;
                    } else if (i11 == 2) {
                        loadingError = LoadingError.InvalidAssets;
                    } else {
                        if (i11 != 3) {
                            throw new lf.m();
                        }
                        loadingError = LoadingError.NoFill;
                    }
                    adNetworkInitializationListener2.onInitializationFailed(loadingError);
                }
            });
            return Unit.f93236a;
        }
        return objG;
    }
}

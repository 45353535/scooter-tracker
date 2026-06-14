package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import com.facebook.infer.annotation.Nullsafe;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
class DynamicLoaderFallback {
    private static final WeakHashMap<Object, AdListener> sApiProxyToAdListenersMap = new WeakHashMap<>();

    class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f19616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f19617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f19618c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f19619d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Map f19620e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f19621f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f19622g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Method f19623h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Method f19624i;

        a(List list, Map map, List list2, List list3, Map map2, List list4, List list5, Method method, Method method2) {
            this.f19616a = list;
            this.f19617b = map;
            this.f19618c = list2;
            this.f19619d = list3;
            this.f19620e = map2;
            this.f19621f = list4;
            this.f19622g = list5;
            this.f19623h = method;
            this.f19624i = method2;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getReturnType().isPrimitive()) {
                if (!method.getReturnType().equals(Void.TYPE)) {
                    return Array.get(Array.newInstance(method.getReturnType(), 1), 0);
                }
                Iterator it = this.f19616a.iterator();
                while (it.hasNext() && (!DynamicLoaderFallback.equalsMethods(method, (Method) it.next()) || !DynamicLoaderFallback.reportError(obj, this.f19617b))) {
                }
                Iterator it2 = this.f19618c.iterator();
                while (it2.hasNext()) {
                    if (DynamicLoaderFallback.equalsMethods(method, (Method) it2.next()) && DynamicLoaderFallback.reportError(obj, this.f19617b)) {
                        return null;
                    }
                }
                return null;
            }
            if (method.getReturnType().equals(String.class)) {
                return "";
            }
            Object objNewProxyInstance = method.getReturnType().equals(obj.getClass().getInterfaces()[0]) ? obj : Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{method.getReturnType()}, this);
            Iterator it3 = this.f19619d.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (DynamicLoaderFallback.equalsMethods(method, (Method) it3.next())) {
                    DynamicLoaderFallback.sApiProxyToAdListenersMap.put(this.f19620e.get(obj), (AdListener) objArr[0]);
                    break;
                }
            }
            Iterator it4 = this.f19621f.iterator();
            while (it4.hasNext()) {
                if (DynamicLoaderFallback.equalsMethods(method, (Method) it4.next())) {
                    this.f19620e.put(objNewProxyInstance, obj);
                }
            }
            Iterator it5 = this.f19622g.iterator();
            while (it5.hasNext()) {
                if (DynamicLoaderFallback.equalsMethods(method, (Method) it5.next())) {
                    for (Object obj2 : objArr) {
                        if (obj2 instanceof Ad) {
                            this.f19617b.put(objNewProxyInstance, (Ad) obj2);
                        }
                    }
                }
            }
            if (DynamicLoaderFallback.equalsMethods(method, this.f19623h)) {
                this.f19617b.put(objArr[1], (Ad) objArr[0]);
            }
            if (DynamicLoaderFallback.equalsMethods(method, this.f19624i)) {
                this.f19617b.put(objArr[1], (Ad) objArr[0]);
            }
            return objNewProxyInstance;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdListener f19625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ad f19626c;

        b(AdListener adListener, Ad ad2) {
            this.f19625b = adListener;
            this.f19626c = ad2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19625b.onError(this.f19626c, new AdError(-1, "Can't load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder."));
        }
    }

    DynamicLoaderFallback() {
    }

    private static boolean equalsMethodParams(Method method, Method method2) {
        return Arrays.equals(method.getParameterTypes(), method2.getParameterTypes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equalsMethods(Method method, Method method2) {
        return method != null && method2 != null && method.getDeclaringClass().equals(method2.getDeclaringClass()) && method.getName().equals(method2.getName()) && equalsMethodParams(method, method2);
    }

    @SuppressLint({"Parameter Not Nullable", "CatchGeneralException"})
    static DynamicLoader makeFallbackLoader() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        c cVar = new c(null);
        DynamicLoader dynamicLoader = (DynamicLoader) cVar.c(DynamicLoader.class);
        dynamicLoader.createInterstitialAd(null, null, null);
        arrayList5.add(cVar.b());
        dynamicLoader.createRewardedVideoAd(null, null, null);
        arrayList5.add(cVar.b());
        dynamicLoader.createAdViewApi((Context) null, (String) null, (AdSize) null, (AdViewParentApi) null, (AdView) null);
        arrayList5.add(cVar.b());
        try {
            dynamicLoader.createAdViewApi((Context) null, (String) null, (String) null, (AdViewParentApi) null, (AdView) null);
        } catch (Exception unused) {
        }
        arrayList5.add(cVar.b());
        dynamicLoader.createNativeAdApi(null, null);
        Method methodB = cVar.b();
        dynamicLoader.createNativeBannerAdApi(null, null);
        Method methodB2 = cVar.b();
        NativeAdBaseApi nativeAdBaseApi = (NativeAdBaseApi) cVar.c(NativeAdBaseApi.class);
        nativeAdBaseApi.loadAd();
        arrayList.add(cVar.b());
        nativeAdBaseApi.loadAd(null);
        arrayList2.add(cVar.b());
        nativeAdBaseApi.buildLoadAdConfig(null);
        arrayList4.add(cVar.b());
        InterstitialAdApi interstitialAdApi = (InterstitialAdApi) cVar.c(InterstitialAdApi.class);
        interstitialAdApi.loadAd();
        arrayList.add(cVar.b());
        interstitialAdApi.loadAd(null);
        arrayList2.add(cVar.b());
        interstitialAdApi.buildLoadAdConfig();
        arrayList4.add(cVar.b());
        RewardedVideoAdApi rewardedVideoAdApi = (RewardedVideoAdApi) cVar.c(RewardedVideoAdApi.class);
        rewardedVideoAdApi.loadAd();
        arrayList.add(cVar.b());
        rewardedVideoAdApi.loadAd(null);
        arrayList2.add(cVar.b());
        rewardedVideoAdApi.buildLoadAdConfig();
        arrayList4.add(cVar.b());
        AdViewApi adViewApi = (AdViewApi) cVar.c(AdViewApi.class);
        adViewApi.loadAd();
        arrayList.add(cVar.b());
        adViewApi.loadAd(null);
        arrayList2.add(cVar.b());
        adViewApi.buildLoadAdConfig();
        arrayList4.add(cVar.b());
        ((AdView.AdViewLoadConfigBuilder) cVar.c(AdView.AdViewLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.b());
        ((NativeAdBase.NativeAdLoadConfigBuilder) cVar.c(NativeAdBase.NativeAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.b());
        ((InterstitialAd.InterstitialAdLoadConfigBuilder) cVar.c(InterstitialAd.InterstitialAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.b());
        ((RewardedVideoAd.RewardedVideoAdLoadConfigBuilder) cVar.c(RewardedVideoAd.RewardedVideoAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.b());
        return (DynamicLoader) Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{DynamicLoader.class}, new a(arrayList, map, arrayList2, arrayList3, map2, arrayList4, arrayList5, methodB, methodB2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean reportError(@Nullable Object obj, Map<Object, Ad> map) {
        if (obj == null) {
            return false;
        }
        AdListener adListener = sApiProxyToAdListenersMap.get(obj);
        Ad ad2 = map.get(obj);
        if (adListener == null) {
            return false;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new b(adListener, ad2), 500L);
        return true;
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Method f19627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InvocationHandler f19628b;

        class a implements InvocationHandler {
            a() {
            }

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) {
                if ("toString".equals(method.getName())) {
                    return null;
                }
                c.this.f19627a = method;
                return null;
            }
        }

        private c() {
            this.f19628b = new a();
        }

        Method b() {
            return this.f19627a;
        }

        public Object c(Class cls) {
            return cls.cast(Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, this.f19628b));
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }
}

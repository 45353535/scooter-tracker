package com.unity3d.ads;

import com.unity3d.ads.UnityAds;

/* JADX INFO: loaded from: classes11.dex */
public interface IUnityAdsInitializationListener {
    void onInitializationComplete();

    void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str);
}

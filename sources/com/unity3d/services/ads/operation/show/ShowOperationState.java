package com.unity3d.services.ads.operation.show;

import android.app.Activity;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.services.ads.operation.OperationState;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.misc.Utilities;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public class ShowOperationState extends OperationState {
    public WeakReference<Activity> activity;
    public IUnityAdsShowListener listener;
    public UnityAdsShowOptions showOptions;

    public ShowOperationState(String str, IUnityAdsShowListener iUnityAdsShowListener, Activity activity, UnityAdsShowOptions unityAdsShowOptions, Configuration configuration) {
        super(str, configuration);
        this.listener = iUnityAdsShowListener;
        this.activity = new WeakReference<>(activity);
        this.showOptions = unityAdsShowOptions;
    }

    public void onUnityAdsShowClick() {
        if (this.listener != null) {
            Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.services.ads.operation.show.b
                @Override // java.lang.Runnable
                public final void run() {
                    ShowOperationState showOperationState = this.f67972b;
                    showOperationState.listener.onUnityAdsShowClick(showOperationState.placementId);
                }
            });
        }
    }

    public void onUnityAdsShowComplete(final UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        if (this.listener != null) {
            Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.services.ads.operation.show.d
                @Override // java.lang.Runnable
                public final void run() {
                    ShowOperationState showOperationState = this.f67975b;
                    showOperationState.listener.onUnityAdsShowComplete(showOperationState.placementId, unityAdsShowCompletionState);
                }
            });
        }
    }

    public void onUnityAdsShowFailure(final UnityAds.UnityAdsShowError unityAdsShowError, final String str) {
        if (this.listener != null) {
            Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.services.ads.operation.show.e
                @Override // java.lang.Runnable
                public final void run() {
                    ShowOperationState showOperationState = this.f67977b;
                    showOperationState.listener.onUnityAdsShowFailure(showOperationState.placementId, unityAdsShowError, str);
                }
            });
        }
    }

    public void onUnityAdsShowStart(final String str) {
        if (this.listener != null) {
            Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.services.ads.operation.show.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f67973b.listener.onUnityAdsShowStart(str);
                }
            });
        }
    }
}

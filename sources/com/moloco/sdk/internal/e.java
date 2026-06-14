package com.moloco.sdk.internal;

import android.content.Context;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;

/* JADX INFO: loaded from: classes10.dex */
public interface e {
    Banner a(Context context, com.moloco.sdk.internal.services.q qVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t tVar, t0 t0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 g0Var, com.moloco.sdk.internal.publisher.n nVar, a aVar, n nVar2, com.moloco.sdk.acm.recorder.a aVar2);

    Banner b(Context context, com.moloco.sdk.internal.services.q qVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t tVar, t0 t0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 g0Var, com.moloco.sdk.internal.publisher.n nVar, a aVar, n nVar2, com.moloco.sdk.acm.recorder.a aVar2);

    NativeAd c(Context context, com.moloco.sdk.internal.services.q qVar, com.moloco.sdk.internal.services.y yVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t tVar, t0 t0Var, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVar, a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 g0Var, com.moloco.sdk.internal.publisher.n nVar, com.moloco.sdk.internal.services.i iVar, com.moloco.sdk.acm.recorder.a aVar2);

    Banner d(Context context, com.moloco.sdk.internal.services.q qVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t tVar, t0 t0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 g0Var, com.moloco.sdk.internal.publisher.n nVar, a aVar, n nVar2, com.moloco.sdk.acm.recorder.a aVar2);

    InterstitialAd e(Context context, com.moloco.sdk.internal.services.q qVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t tVar, t0 t0Var, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 g0Var, com.moloco.sdk.internal.publisher.n nVar, com.moloco.sdk.acm.recorder.a aVar);

    RewardedInterstitialAd f(Context context, com.moloco.sdk.internal.services.q qVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t tVar, t0 t0Var, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 g0Var, com.moloco.sdk.internal.publisher.n nVar, com.moloco.sdk.acm.recorder.a aVar);
}

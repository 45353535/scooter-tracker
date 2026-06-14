package com.appodeal.ads.adapters.iab.mraid.unified;

import android.content.Context;
import android.text.TextUtils;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;

/* JADX INFO: loaded from: classes6.dex */
public abstract class r {
    public static void a(Context context, UnifiedAdParams unifiedAdParams, a aVar, UnifiedAdCallback unifiedAdCallback, n nVar) {
        if (aVar == null) {
            unifiedAdCallback.onAdLoadFailed(LoadingError.IncorrectAdunit);
            return;
        }
        if (com.appodeal.ads.adapters.iab.utils.a.b(aVar.f12232d)) {
            nVar.c(context, unifiedAdParams, aVar, unifiedAdCallback);
        } else if (TextUtils.isEmpty(aVar.f12233e) || TextUtils.getTrimmedLength(aVar.f12233e) <= 0) {
            unifiedAdCallback.onAdLoadFailed(LoadingError.IncorrectAdunit);
        } else {
            nVar.a(context, unifiedAdParams, aVar, unifiedAdCallback, aVar.f12233e);
        }
    }
}

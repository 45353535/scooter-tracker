package com.applovin.impl;

import android.content.Context;
import com.amazon.aps.ads.Aps;
import com.amazon.aps.ads.model.ApsAdNetwork;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdNetworkInfo;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.applovin.mediation.MaxAdFormat;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class w implements DTBAdCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxAdFormat f11153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f11154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DTBAdRequest f11155c;

    public interface a {
        void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat);

        void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat);
    }

    public w(x xVar, MaxAdFormat maxAdFormat, Context context, a aVar) {
        this(Arrays.asList(xVar.a()), maxAdFormat, context, aVar);
    }

    public void a() {
        DTBAdRequest dTBAdRequest = this.f11155c;
        if (dTBAdRequest == null) {
            this.f11154b.onAdLoadFailed(null, this.f11153a);
        } else {
            dTBAdRequest.loadAd(this);
        }
    }

    @Override // com.amazon.device.ads.DTBAdCallback
    public void onFailure(AdError adError) {
        this.f11154b.onAdLoadFailed(adError, this.f11153a);
    }

    @Override // com.amazon.device.ads.DTBAdCallback
    public void onSuccess(DTBAdResponse dTBAdResponse) {
        this.f11154b.onAdResponseLoaded(dTBAdResponse, this.f11153a);
    }

    public w(List list, MaxAdFormat maxAdFormat, Context context, a aVar) {
        this.f11153a = maxAdFormat;
        this.f11154b = aVar;
        try {
            DTBAdSize[] dTBAdSizeArr = new DTBAdSize[list.size()];
            for (int i10 = 0; i10 < list.size(); i10++) {
                Object obj = list.get(i10);
                if (obj instanceof DTBAdSize) {
                    dTBAdSizeArr[i10] = (DTBAdSize) obj;
                }
            }
            if (n7.a(Aps.getSdkVersion(), "10.0.0") >= 0) {
                ApsAdNetwork apsAdNetwork = ApsAdNetwork.GOOGLE_AD_MANAGER;
                int i11 = DTBAdNetworkInfo.f7403a;
                this.f11155c = (DTBAdRequest) DTBAdRequest.class.getConstructor(Context.class, DTBAdNetworkInfo.class).newInstance(context.getApplicationContext(), DTBAdNetworkInfo.class.getConstructor(ApsAdNetwork.class).newInstance(ApsAdNetwork.class.getField("MAX").get(null)));
            } else {
                this.f11155c = (DTBAdRequest) DTBAdRequest.class.getConstructor(null).newInstance(null);
            }
            this.f11155c.setSizes(dTBAdSizeArr);
        } catch (Throwable unused) {
        }
    }
}

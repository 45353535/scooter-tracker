package com.my.target.mediation;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.my.target.ads.MyTargetView;
import com.my.target.common.CustomParams;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.gb;
import com.my.target.m;
import com.my.target.mediation.MediationStandardAdAdapter;
import com.my.target.ua;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class MyTargetStandardAdAdapter implements MediationStandardAdAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ua f60166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MyTargetView f60167b;

    public class a implements MyTargetView.MyTargetViewListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediationStandardAdAdapter.MediationStandardAdListener f60168a;

        public a(MediationStandardAdAdapter.MediationStandardAdListener mediationStandardAdListener) {
            this.f60168a = mediationStandardAdListener;
        }

        @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
        public void onClick(MyTargetView myTargetView) {
            gb.a("MyTargetStandardAdAdapter: Ad clicked");
            this.f60168a.onClick(MyTargetStandardAdAdapter.this);
        }

        @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
        public void onLoad(MyTargetView myTargetView) {
            gb.a("MyTargetStandardAdAdapter: Ad loaded");
            this.f60168a.onLoad(myTargetView, MyTargetStandardAdAdapter.this);
        }

        @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
        public void onNoAd(IAdLoadingError iAdLoadingError, MyTargetView myTargetView) {
            gb.a("MyTargetStandardAdAdapter: No ad (" + iAdLoadingError.getMessage() + ")");
            this.f60168a.onNoAd(iAdLoadingError, MyTargetStandardAdAdapter.this);
        }

        @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
        public void onShow(MyTargetView myTargetView) {
            gb.a("MyTargetStandardAdAdapter: Ad shown");
            this.f60168a.onShow(MyTargetStandardAdAdapter.this);
        }
    }

    public void a(ua uaVar) {
        this.f60166a = uaVar;
    }

    @Override // com.my.target.mediation.MediationAdapter
    public void destroy() {
        MyTargetView myTargetView = this.f60167b;
        if (myTargetView == null) {
            return;
        }
        myTargetView.setListener(null);
        this.f60167b.destroy();
        this.f60167b = null;
    }

    @Override // com.my.target.mediation.MediationStandardAdAdapter
    public void load(@NonNull MediationAdConfig mediationAdConfig, @NonNull MyTargetView.AdSize adSize, @NonNull MediationStandardAdAdapter.MediationStandardAdListener mediationStandardAdListener, @NonNull Context context) {
        String placementId = mediationAdConfig.getPlacementId();
        try {
            int i10 = Integer.parseInt(placementId);
            MyTargetView myTargetView = new MyTargetView(context);
            this.f60167b = myTargetView;
            myTargetView.setSlotId(i10);
            this.f60167b.setAdSize(adSize);
            this.f60167b.setRefreshAd(false);
            this.f60167b.setMediationEnabled(false);
            this.f60167b.setListener(new a(mediationStandardAdListener));
            CustomParams customParams = this.f60167b.getCustomParams();
            customParams.setAge(mediationAdConfig.getAge());
            customParams.setGender(mediationAdConfig.getGender());
            for (Map.Entry<String, String> entry : mediationAdConfig.getServerParams().entrySet()) {
                customParams.setCustomParam(entry.getKey(), entry.getValue());
            }
            String payload = mediationAdConfig.getPayload();
            if (this.f60166a != null) {
                gb.a("MyTargetStandardAdAdapter: Got banner from mediation response");
                this.f60167b.a(this.f60166a, adSize);
                return;
            }
            if (TextUtils.isEmpty(payload)) {
                gb.a("MyTargetStandardAdAdapter: Load id " + i10);
                this.f60167b.load();
                return;
            }
            gb.a("MyTargetStandardAdAdapter: Load id " + i10 + " from BID " + payload);
            this.f60167b.loadFromBid(payload);
        } catch (Throwable unused) {
            gb.b("MyTargetStandardAdAdapter: Error - failed to request ad, unable to convert slotId " + placementId + " to int");
            mediationStandardAdListener.onNoAd(m.f60110o, this);
        }
    }
}

package com.taurusx.tax.api;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.taurusx.tax.R;
import com.taurusx.tax.c.w;
import com.taurusx.tax.g.j;
import com.taurusx.tax.g.m;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.w.a.a;
import com.taurusx.tax.w.a.c;
import com.taurusx.tax.w.c.y;
import com.taurusx.tax.w.s.s;
import com.taurusx.tax.w.y;
import com.taurusx.tax.w.z;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class TaurusXNativeAds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f65902a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f65903c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f65904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f65905g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y f65906i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public y.z f65907m;
    public s mTaxCustomEvent;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f65908n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public OnTaurusXNativeListener f65909o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public y.w.C0823w f65910p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f65911s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Context f65913w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f65914y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f65915z = "TaurusXNativeAds";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f65912t = false;

    public TaurusXNativeAds(Context context) {
        this.f65913w = context != null ? context.getApplicationContext() : TaurusXAds.getContext();
    }

    public void destroy() {
        this.f65902a = true;
    }

    public String getCallToAction() {
        a aVar = this.f65904f;
        if (aVar != null) {
            return aVar.n().w();
        }
        return null;
    }

    public String getDesc() {
        a aVar = this.f65904f;
        if (aVar != null) {
            return aVar.n().z();
        }
        return null;
    }

    public String getIconUrl() {
        a aVar = this.f65904f;
        if (aVar != null) {
            return aVar.n().y();
        }
        return null;
    }

    public String getImageUrl() {
        a aVar = this.f65904f;
        if (aVar != null) {
            return aVar.n().c();
        }
        return null;
    }

    public float getPrice() {
        y.z zVar = this.f65907m;
        if (zVar != null) {
            return zVar.e();
        }
        return 0.0f;
    }

    public String getTitle() {
        a aVar = this.f65904f;
        if (aVar != null) {
            return aVar.n().s();
        }
        return null;
    }

    public boolean isReady() {
        if (!this.f65912t) {
            return false;
        }
        z zVarT = z.t();
        y.w.C0823w c0823w = this.f65910p;
        return !zVarT.z(c0823w != null ? c0823w.z() : 0L, this.f65905g);
    }

    public void loadNative() {
        if (this.f65911s || this.f65902a) {
            z(TaurusXAdError.internalError("request is ongoing"));
            return;
        }
        if (isReady() && this.f65907m != null) {
            z();
            return;
        }
        this.f65911s = true;
        String appId = TaurusXAds.getAppId();
        this.f65903c = appId;
        if (TextUtils.isEmpty(appId) || TextUtils.isEmpty(this.f65914y)) {
            try {
                LogUtil.d("TaurusXNativeAds", "Appid or unitid is empty");
                throw new RuntimeException("Appid or unitid is empty");
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        this.f65908n = System.currentTimeMillis();
        this.mTaxCustomEvent = s.z(this.f65914y);
        this.f65912t = false;
        y();
    }

    public void loadNativeFromBid(String str) {
        try {
            String string = new JSONObject(w.z(Base64.decode(str, 2), 1)).getString(com.taurusx.tax.w.o.z.f67457y);
            y yVarZ = y.z(new JSONObject(string));
            this.f65906i = yVarZ;
            this.mTaxCustomEvent = s.z(yVarZ);
            z(string);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void notifyLoss(float f10, String str, int i10) {
        a aVar = this.f65904f;
        if (aVar != null) {
            aVar.z(this.f65913w, f10, str, i10);
        }
    }

    public void notifyWin(float f10, String str) {
        a aVar = this.f65904f;
        if (aVar != null) {
            aVar.z(this.f65913w, f10, str);
        }
    }

    public void registerViewForInteraction(ViewGroup viewGroup, ImageView imageView, MediaView mediaView, List<View> list) {
        com.taurusx.tax.w.w wVarZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f65905g;
        com.taurusx.tax.w.w wVar = com.taurusx.tax.w.w.SUCCESS;
        if (this.f65904f == null || !isReady()) {
            wVarZ = com.taurusx.tax.w.w.AD_SHOW_WITH_NOT_READY;
        } else {
            this.f65904f.w(System.currentTimeMillis());
            a aVar = this.f65904f;
            wVarZ = aVar.z(viewGroup, imageView, mediaView, list, aVar.n());
        }
        this.f65912t = false;
        s sVar = this.mTaxCustomEvent;
        if (sVar != null) {
            sVar.z(jCurrentTimeMillis, 1, wVarZ.getCode(), wVarZ.getMessageCompatibility());
            this.mTaxCustomEvent.z(0L, jCurrentTimeMillis, false, wVarZ.getCode(), wVarZ.getMessageCompatibility());
        }
    }

    public void setAdUnitId(String str) {
        this.f65914y = str;
    }

    public void setListener(OnTaurusXNativeListener onTaurusXNativeListener) {
        this.f65909o = onTaurusXNativeListener;
    }

    public void showNative(Context context, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.rab_card_large, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.rab_native_title);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.rab_native_icon);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.rab_native_detail);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.rab_native_action_btn);
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.rab_native_media_cover);
        textView.setText(this.f65904f.n().s());
        textView2.setText(this.f65904f.n().z());
        textView3.setText(this.f65904f.n().w());
        MediaView mediaView = new MediaView(context);
        viewGroup2.addView(mediaView, -1, -1);
        viewGroup.addView(viewInflate, context.getResources().getDisplayMetrics().widthPixels, j.z(this.f65913w, 410.0f));
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f65905g;
        com.taurusx.tax.w.w wVar = com.taurusx.tax.w.w.SUCCESS;
        com.taurusx.tax.w.w wVarZ = (this.f65904f == null || !isReady()) ? com.taurusx.tax.w.w.AD_SHOW_WITH_NOT_READY : this.f65904f.z(viewGroup, imageView, mediaView, Arrays.asList(textView, textView2, textView3, mediaView, imageView), this.f65904f.n());
        this.f65912t = false;
        s sVar = this.mTaxCustomEvent;
        if (sVar != null) {
            sVar.z(jCurrentTimeMillis, 1, wVarZ.getCode(), wVarZ.getMessageCompatibility());
            this.mTaxCustomEvent.z(0L, jCurrentTimeMillis, false, wVarZ.getCode(), wVarZ.getMessageCompatibility());
        }
    }

    public String toString() {
        return "Data{mTitle='" + getTitle() + "', mDesc='" + getDesc() + "', mCallToAction='" + getCallToAction() + "', mIconUrl='" + getIconUrl() + "', mImageUrl='" + getImageUrl() + "', mPrice=" + getPrice() + '}';
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void y() {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.api.TaurusXNativeAds.y():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXNativeAds.4
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXNativeAds.this.f65909o != null) {
                    TaurusXNativeAds.this.f65909o.onImpression();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(String str) {
        if (TextUtils.isEmpty(str)) {
            z(TaurusXAdError.noContent("NO CONTENT"));
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (this.f65906i == null && !TextUtils.isEmpty(str)) {
                this.f65906i = y.z(new JSONObject(str));
            }
            y yVar = this.f65906i;
            if (yVar == null) {
                z(TaurusXAdError.parseError("response is null"));
                return;
            }
            this.f65910p = yVar.c().w();
            s sVar = this.mTaxCustomEvent;
            if (sVar != null) {
                sVar.w(this.f65906i);
                if (this.f65910p.w() != 1) {
                    this.mTaxCustomEvent.z(1, this.f65910p.w());
                    if (this.f65910p.K()) {
                        z(TaurusXAdError.parseError("adtype not matched"));
                        return;
                    }
                }
                this.mTaxCustomEvent.s();
            }
            this.f65907m = this.f65906i.w();
            a aVar = new a(this.f65914y, this.f65906i);
            this.f65904f = aVar;
            aVar.z(this.mTaxCustomEvent);
            this.f65904f.z(new y.w().z());
            this.f65904f.z(new c() { // from class: com.taurusx.tax.api.TaurusXNativeAds.2
                @Override // com.taurusx.tax.w.a.c
                public void onAdClicked() {
                    if (TaurusXNativeAds.this.f65909o != null) {
                        TaurusXNativeAds.this.f65909o.onClicked();
                    }
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdClosed() {
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdImpression() {
                    TaurusXNativeAds.this.w();
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdLoadFailed(com.taurusx.tax.w.w wVar) {
                    TaurusXAdError taurusXAdErrorConvertToTaurusXAdError = wVar.convertToTaurusXAdError();
                    TaurusXNativeAds.this.z(taurusXAdErrorConvertToTaurusXAdError);
                    s sVar2 = TaurusXNativeAds.this.mTaxCustomEvent;
                    if (sVar2 == null || taurusXAdErrorConvertToTaurusXAdError == null) {
                        return;
                    }
                    sVar2.w(System.currentTimeMillis() - jCurrentTimeMillis, wVar.getCode(), wVar.getMessageCompatibility());
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdLoaded() {
                    TaurusXNativeAds.this.z();
                    s sVar2 = TaurusXNativeAds.this.mTaxCustomEvent;
                    if (sVar2 != null) {
                        sVar2.w(System.currentTimeMillis() - jCurrentTimeMillis, com.taurusx.tax.w.w.SUCCESS.getCode(), "");
                    }
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdVideoEnd() {
                }

                @Override // com.taurusx.tax.w.a.c
                public void onAdVideoStart() {
                }
            });
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            this.f65905g = jCurrentTimeMillis2;
            this.f65904f.z(jCurrentTimeMillis2);
            this.f65904f.y();
        } catch (Exception e10) {
            if (e10 instanceof JSONException) {
                z(TaurusXAdError.internalError("PARSE_AD_ERROR"));
            } else {
                z(TaurusXAdError.internalError("UNKNOWN_ERROR"));
            }
            if (this.mTaxCustomEvent != null) {
                com.taurusx.tax.w.w message = com.taurusx.tax.w.w.INTERNAL_ERROR.setMessage("Ad imp parse exception: " + e10.getMessage());
                this.mTaxCustomEvent.w(System.currentTimeMillis() - jCurrentTimeMillis, message.getCode(), message.getMessageCompatibility());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        y.z zVar = this.f65907m;
        if (zVar != null) {
            com.taurusx.tax.w.s.c.z(this.f65913w, zVar.k(), com.taurusx.tax.w.s.w.f67541z, System.currentTimeMillis() - this.f65908n, this.f65906i);
            m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXNativeAds.3
                @Override // java.lang.Runnable
                public void run() {
                    TaurusXNativeAds.this.f65912t = true;
                    if (TaurusXNativeAds.this.f65909o != null) {
                        TaurusXNativeAds.this.f65909o.onAdLoaded(TaurusXNativeAds.this);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(final TaurusXAdError taurusXAdError) {
        if (taurusXAdError == null || taurusXAdError.getCode() != 3) {
            com.taurusx.tax.w.s.c.z(this.f65913w, com.taurusx.tax.w.s.w.f67539w, taurusXAdError != null ? taurusXAdError.getMessage() : null, String.valueOf(System.currentTimeMillis()), String.valueOf(System.currentTimeMillis() - this.f65908n), this.f65903c, this.f65914y);
        }
        m.c(new Runnable() { // from class: com.taurusx.tax.api.TaurusXNativeAds.5
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXNativeAds.this.f65909o != null) {
                    TaurusXNativeAds.this.f65909o.onAdFailedToLoad(taurusXAdError);
                }
            }
        });
    }
}

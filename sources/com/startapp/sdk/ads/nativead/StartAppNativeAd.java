package com.startapp.sdk.ads.nativead;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import com.amazon.device.ads.DtbConstants;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.adrules.AdaptMetaData;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.b2;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.lb;
import com.startapp.sdk.internal.qd;
import com.startapp.sdk.internal.s;
import com.startapp.sdk.internal.t;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.z6;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public class StartAppNativeAd extends Ad {
    private boolean belowMinCpm;

    @NonNull
    private List<NativeAdDetails> listNativeAds;

    @NonNull
    private final AtomicBoolean loading;

    @Nullable
    private NativeAdPreferences preferences;

    @Keep
    public enum CampaignAction {
        LAUNCH_APP,
        OPEN_MARKET
    }

    @Keep
    public StartAppNativeAd(@NonNull Context context) {
        this(context, com.startapp.sdk.components.a.a(context).K, com.startapp.sdk.components.a.a(context).f64183j, com.startapp.sdk.components.a.a(context).M, com.startapp.sdk.components.a.a(context).N, com.startapp.sdk.components.a.a(context).f64175b, com.startapp.sdk.components.a.a(context).f64187n, com.startapp.sdk.components.a.a(context).A, com.startapp.sdk.components.a.a(context).f64196w, com.startapp.sdk.components.a.a(context).f64176c);
    }

    private List<AdDetails> getAdDetailsList() {
        ArrayList arrayList = new ArrayList();
        Iterator<NativeAdDetails> it = this.listNativeAds.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getAdDetails());
        }
        return arrayList;
    }

    @Nullable
    private AdDetails getFirstAdDetails() {
        NativeAdDetails nativeAdDetails;
        if (this.listNativeAds.size() <= 0 || (nativeAdDetails = this.listNativeAds.get(0)) == null) {
            return null;
        }
        return nativeAdDetails.getAdDetails();
    }

    @NonNull
    private NativeAdPreferences getPreferences() {
        NativeAdPreferences nativeAdPreferences = this.preferences;
        if (nativeAdPreferences != null) {
            return nativeAdPreferences;
        }
        NativeAdPreferences nativeAdPreferences2 = new NativeAdPreferences();
        this.preferences = nativeAdPreferences2;
        return nativeAdPreferences2;
    }

    @Keep
    public static String getPrivacyImageUrl() {
        return AdInformationMetaData.c().d();
    }

    @Keep
    public static String getPrivacyURL() {
        if (AdInformationMetaData.c().b() == null) {
            return "";
        }
        String strB = AdInformationMetaData.c().b();
        if (strB.contains("http://") || strB.contains(DtbConstants.HTTPS)) {
            return AdInformationMetaData.c().b();
        }
        return DtbConstants.HTTPS + AdInformationMetaData.c().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @UiThread
    public void onReceiveAd(@Nullable AdEventListener adEventListener) {
        setErrorMessage(null);
        ((z6) ((y6) this.eventTracer.a())).c(this, ii.f64701f);
        ((z6) ((y6) this.eventTracer.a())).b(this, ii.f64697b);
        a0.b(this.context, adEventListener, this, false);
        this.loading.set(false);
    }

    @NonNull
    private NativeAdPreferences prepareAdPreferences() {
        String name;
        NativeAdPreferences preferences = getPreferences();
        if (preferences.getPlacementId() == null) {
            Context baseContext = this.context;
            String packageName = baseContext.getPackageName();
            String name2 = getClass().getName();
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    name = null;
                    break;
                }
                if (baseContext instanceof Activity) {
                    name = baseContext.getClass().getName();
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            preferences.setPlacementId(h0.a(packageName, name2, name, (String) null));
        }
        return preferences;
    }

    private void reset() {
        this.belowMinCpm = false;
        this.listNativeAds = Collections.EMPTY_LIST;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    @Nullable
    protected b2 createService(@Nullable AdPreferences adPreferences, @Nullable AdEventListener adEventListener, @Nullable String str) {
        return null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    @Nullable
    public String getAdId() {
        AdDetails firstAdDetails = getFirstAdDetails();
        if (firstAdDetails != null) {
            return firstAdDetails.a();
        }
        return null;
    }

    @Nullable
    public String getBidToken() {
        AdDetails firstAdDetails = getFirstAdDetails();
        if (firstAdDetails != null) {
            return firstAdDetails.e();
        }
        return null;
    }

    @Keep
    public ArrayList<NativeAdDetails> getNativeAds() {
        return getNativeAds(null);
    }

    @Keep
    public int getNumberOfAds() {
        return this.listNativeAds.size();
    }

    @UiThread
    void initNativeAdList(@NonNull qd qdVar, @NonNull NativeAdPreferences nativeAdPreferences, @Nullable AdEventListener adEventListener) {
        int size;
        this.belowMinCpm = qdVar.isBelowMinCPM();
        List list = qdVar.f64561a;
        if (list == null || (size = list.size()) <= 0) {
            onReceiveAd(adEventListener);
            return;
        }
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new NativeAdDetails((AdDetails) list.get(i10)));
        }
        this.listNativeAds = DesugarCollections.unmodifiableList(arrayList);
        if (!nativeAdPreferences.isAutoBitmapDownload()) {
            onReceiveAd(adEventListener);
            return;
        }
        i iVar = new i(this, size, adEventListener);
        ((z6) ((y6) this.eventTracer.a())).c(this, ii.f64719x);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((NativeAdDetails) it.next()).loadImages(this.context, iVar);
        }
    }

    @Override // com.startapp.sdk.adsbase.Ad
    @Keep
    public boolean isBelowMinCPM() {
        return this.belowMinCpm;
    }

    @Keep
    @Deprecated
    public boolean loadAd() {
        return loadAd((AdEventListener) null);
    }

    @Keep
    public void setPreferences(@Nullable NativeAdPreferences nativeAdPreferences) {
        this.preferences = nativeAdPreferences != null ? new NativeAdPreferences(nativeAdPreferences) : null;
    }

    @Keep
    public ArrayList<NativeAdDetails> getNativeAds(String str) {
        ArrayList<NativeAdDetails> arrayList = new ArrayList<>();
        AdRulesResult adRulesResultA = AdaptMetaData.b().a().a(AdPreferences.Placement.INAPP_NATIVE, str);
        if (adRulesResultA.b()) {
            for (NativeAdDetails nativeAdDetails : this.listNativeAds) {
                nativeAdDetails.setAdTag(str);
                arrayList.add(nativeAdDetails);
            }
            t.f65279d.a(new s(AdPreferences.Placement.INAPP_NATIVE, str));
            return arrayList;
        }
        List<AdDetails> adDetailsList = getAdDetailsList();
        ArrayList arrayList2 = new ArrayList();
        if (adDetailsList != null) {
            Iterator<AdDetails> it = adDetailsList.iterator();
            while (it.hasNext()) {
                arrayList2.addAll(Arrays.asList(it.next().t()));
            }
        }
        h0.a((String[]) arrayList2.toArray(new String[0]), str, 0, adRulesResultA.a());
        return arrayList;
    }

    @Keep
    public boolean loadAd(@Nullable AdEventListener adEventListener) {
        return loadAd(adEventListener, (String) null);
    }

    @Keep
    public boolean loadAd(@Nullable AdEventListener adEventListener, @Nullable String str) {
        if (!this.loading.compareAndSet(false, true)) {
            setErrorMessage("Ad is currently being loaded");
            return false;
        }
        reset();
        NativeAdPreferences nativeAdPreferencesPrepareAdPreferences = prepareAdPreferences();
        qd qdVar = new qd(this.context, this.eventTracer, this.consentManager, this.adCacheManager, this.videoAdCacheManager, this.webViewFactory, this.httpClient, this.networkApiExecutor, this.motionProcessor, this.webViewCacheLoader, nativeAdPreferencesPrepareAdPreferences);
        ((z6) ((y6) this.eventTracer.a())).a((Object) this, ii.f64697b);
        ((z6) ((y6) this.eventTracer.a())).a(this, qdVar);
        qdVar.load(nativeAdPreferencesPrepareAdPreferences, new j(this, qdVar, nativeAdPreferencesPrepareAdPreferences, adEventListener), str);
        return true;
    }

    @Keep
    @Deprecated
    public boolean loadAd(@Nullable NativeAdPreferences nativeAdPreferences) {
        setPreferences(nativeAdPreferences);
        return loadAd((AdEventListener) null);
    }

    @Keep
    @Deprecated
    public boolean loadAd(@Nullable NativeAdPreferences nativeAdPreferences, @Nullable AdEventListener adEventListener) {
        setPreferences(nativeAdPreferences);
        return loadAd(adEventListener);
    }

    @Keep
    public boolean loadAd(@Nullable NativeAdPreferences nativeAdPreferences, @Nullable AdEventListener adEventListener, @Nullable String str) {
        setPreferences(nativeAdPreferences);
        return loadAd(adEventListener, str);
    }

    @VisibleForTesting(otherwise = 4)
    public StartAppNativeAd(@NonNull Context context, @NonNull lb lbVar, @NonNull lb lbVar2, @NonNull lb lbVar3, @NonNull lb lbVar4, @NonNull lb lbVar5, @NonNull lb lbVar6, @NonNull lb lbVar7, @NonNull lb lbVar8, @NonNull lb lbVar9) {
        super(context, AdPreferences.Placement.INAPP_NATIVE, lbVar, lbVar2, lbVar3, lbVar4, lbVar5, lbVar6, lbVar7, lbVar8, lbVar9);
        this.listNativeAds = Collections.EMPTY_LIST;
        this.loading = new AtomicBoolean();
    }
}

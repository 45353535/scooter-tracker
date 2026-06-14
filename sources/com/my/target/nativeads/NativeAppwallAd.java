package com.my.target.nativeads;

import android.content.Context;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.a3;
import com.my.target.ab;
import com.my.target.bb;
import com.my.target.common.BaseAd;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.e1;
import com.my.target.gb;
import com.my.target.i8;
import com.my.target.m;
import com.my.target.nativeads.banners.NativeAppwallBanner;
import com.my.target.nativeads.views.AppwallAdView;
import com.my.target.s7;
import com.my.target.t;
import com.my.target.u7;
import com.my.target.v7;
import com.my.target.y7;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class NativeAppwallAd extends BaseAd {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f60207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e1 f60208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f60209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f60210h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AppwallAdListener f60211i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y7 f60212j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u7 f60213k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public WeakReference f60214l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f60215m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f60216n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f60217o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f60218p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f60219q;

    public interface AppwallAdListener {
        void onClick(@NonNull NativeAppwallBanner nativeAppwallBanner, @NonNull NativeAppwallAd nativeAppwallAd);

        void onDismiss(@NonNull NativeAppwallAd nativeAppwallAd);

        void onDisplay(@NonNull NativeAppwallAd nativeAppwallAd);

        void onLoad(@NonNull NativeAppwallAd nativeAppwallAd);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull NativeAppwallAd nativeAppwallAd);
    }

    public class a implements AppwallAdView.AppwallAdViewListener {
        public a() {
        }

        @Override // com.my.target.nativeads.views.AppwallAdView.AppwallAdViewListener
        public void onBannerClick(NativeAppwallBanner nativeAppwallBanner) {
            AppwallAdView appwallAdView;
            NativeAppwallAd.this.handleBannerClick(nativeAppwallBanner);
            WeakReference weakReference = NativeAppwallAd.this.f60214l;
            if (weakReference == null || (appwallAdView = (AppwallAdView) weakReference.get()) == null) {
                return;
            }
            appwallAdView.notifyDataSetChanged();
        }

        @Override // com.my.target.nativeads.views.AppwallAdView.AppwallAdViewListener
        public void onBannersShow(List list) {
            NativeAppwallAd.this.handleBannersShow(list);
        }
    }

    public NativeAppwallAd(int i10, @NonNull Context context) {
        super(i10, "appwall");
        this.f60208f = e1.a();
        this.f60209g = new HashMap();
        this.f60210h = new ArrayList();
        this.f60215m = "Apps";
        this.f60216n = -12232093;
        this.f60217o = -13220531;
        this.f60218p = -1;
        this.f60219q = false;
        this.f60207e = context;
        this.f59399a.b(0);
        gb.c("Native appwall ad created. Version - " + MyTargetVersion.VERSION);
    }

    public static void loadImageToView(@NonNull ImageData imageData, @NonNull ImageView imageView) {
        a3.b(imageData, imageView);
    }

    public final void a(y7 y7Var, IAdLoadingError iAdLoadingError) {
        AppwallAdListener appwallAdListener = this.f60211i;
        if (appwallAdListener == null) {
            return;
        }
        if (y7Var == null) {
            if (iAdLoadingError == null) {
                iAdLoadingError = m.f60104i;
            }
            appwallAdListener.onNoAd(iAdLoadingError, this);
            return;
        }
        this.f60212j = y7Var;
        for (s7 s7Var : y7Var.c()) {
            NativeAppwallBanner nativeAppwallBannerA = NativeAppwallBanner.a(s7Var);
            this.f60210h.add(nativeAppwallBannerA);
            this.f60209g.put(nativeAppwallBannerA, s7Var);
        }
        this.f60211i.onLoad(this);
    }

    public void destroy() {
        unregisterAppwallAdView();
        u7 u7Var = this.f60213k;
        if (u7Var != null) {
            u7Var.a();
            this.f60213k = null;
        }
        this.f60211i = null;
    }

    public void dismiss() {
        u7 u7Var = this.f60213k;
        if (u7Var != null) {
            u7Var.b();
        }
    }

    @NonNull
    public ArrayList<NativeAppwallBanner> getBanners() {
        return this.f60210h;
    }

    public long getCachePeriod() {
        return this.f59399a.e();
    }

    @Nullable
    public AppwallAdListener getListener() {
        return this.f60211i;
    }

    @NonNull
    public String getTitle() {
        return this.f60215m;
    }

    public int getTitleBackgroundColor() {
        return this.f60216n;
    }

    public int getTitleSupplementaryColor() {
        return this.f60217o;
    }

    public int getTitleTextColor() {
        return this.f60218p;
    }

    public void handleBannerClick(NativeAppwallBanner nativeAppwallBanner) {
        s7 s7Var = (s7) this.f60209g.get(nativeAppwallBanner);
        if (s7Var == null) {
            gb.a("NativeAppwallAd: Unable to handle banner click - no internal banner for id " + nativeAppwallBanner.getId());
            return;
        }
        this.f60208f.a(s7Var, 1, this.f60207e);
        if (this.f60212j != null) {
            nativeAppwallBanner.setHasNotification(false);
            i8.a(this.f60212j, this.f59399a).a(s7Var, false, this.f60207e);
        }
        AppwallAdListener appwallAdListener = this.f60211i;
        if (appwallAdListener != null) {
            appwallAdListener.onClick(nativeAppwallBanner, this);
        }
    }

    public void handleBannerShow(@NonNull NativeAppwallBanner nativeAppwallBanner) {
        s7 s7Var = (s7) this.f60209g.get(nativeAppwallBanner);
        if (s7Var != null) {
            bb.b(s7Var.x(), "playbackStarted", 1, this.f60207e);
            return;
        }
        gb.a("NativeAppwallAd: Unable to handle banner show - no internal banner for id " + nativeAppwallBanner.getId());
    }

    public void handleBannersShow(@NonNull List<NativeAppwallBanner> list) {
        ArrayList arrayList = new ArrayList();
        for (NativeAppwallBanner nativeAppwallBanner : list) {
            s7 s7Var = (s7) this.f60209g.get(nativeAppwallBanner);
            if (s7Var != null) {
                gb.a("NativeAppwallAd: Ad shown, banner Id = " + nativeAppwallBanner.getId());
                ab abVarB = s7Var.x().b("playbackStarted");
                if (!abVarB.f59176a.isEmpty()) {
                    arrayList.add(abVarB);
                }
            } else {
                gb.a("NativeAppwallAd: Unable to handle banner show - no internal banner for id " + nativeAppwallBanner.getId());
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            bb.a((ab) obj, 1, this.f60207e);
        }
    }

    public boolean hasNotifications() {
        Iterator it = this.f60209g.keySet().iterator();
        while (it.hasNext()) {
            if (((NativeAppwallBanner) it.next()).isHasNotification()) {
                return true;
            }
        }
        return false;
    }

    public boolean isAutoLoadImages() {
        int iF = this.f59399a.f();
        return iF == 0 || iF == 1;
    }

    public boolean isHideStatusBarInDialog() {
        return this.f60219q;
    }

    public void load() {
        if (isLoadCalled()) {
            gb.a("NativeAppwallAd: Appwall ad doesn't support multiple load");
            a(null, m.f60115t);
        } else {
            v7.a(this.f59399a, this.f59400b).a(new v7.b() { // from class: o5.c
                @Override // com.my.target.l.b
                public final void a(t tVar, m mVar) {
                    this.f96343a.a((y7) tVar, mVar);
                }
            }).a(this.f59400b.a(), this.f60207e);
        }
    }

    @Nullable
    public String prepareBannerClickLink(NativeAppwallBanner nativeAppwallBanner) {
        s7 s7Var = (s7) this.f60209g.get(nativeAppwallBanner);
        if (s7Var != null) {
            bb.b(s7Var.x(), "click", 2, this.f60207e);
            y7 y7Var = this.f60212j;
            if (y7Var != null) {
                i8.a(y7Var, this.f59399a).a(s7Var, false, this.f60207e);
            }
            return s7Var.B();
        }
        gb.a("NativeAppwallAd: Unable to handle banner click - no internal banner for id " + nativeAppwallBanner.getId());
        return null;
    }

    public void registerAppwallAdView(@NonNull AppwallAdView appwallAdView) {
        unregisterAppwallAdView();
        this.f60214l = new WeakReference(appwallAdView);
        appwallAdView.setAppwallAdViewListener(new a());
    }

    public void setAutoLoadImages(boolean z10) {
        this.f59399a.b(0);
    }

    public void setCachePeriod(long j10) {
        this.f59399a.a(j10);
    }

    public void setHideStatusBarInDialog(boolean z10) {
        this.f60219q = z10;
    }

    public void setListener(@Nullable AppwallAdListener appwallAdListener) {
        this.f60211i = appwallAdListener;
    }

    public void setTitle(@NonNull String str) {
        this.f60215m = str;
    }

    public void setTitleBackgroundColor(int i10) {
        this.f60216n = i10;
    }

    public void setTitleSupplementaryColor(int i10) {
        this.f60217o = i10;
    }

    public void setTitleTextColor(int i10) {
        this.f60218p = i10;
    }

    public void show() {
        if (this.f60212j == null || this.f60210h.size() <= 0) {
            gb.c("Native appwall ad show - no ad");
            return;
        }
        if (this.f60213k == null) {
            this.f60213k = u7.a(this);
        }
        this.f60213k.a(this.f60207e);
    }

    public void unregisterAppwallAdView() {
        WeakReference weakReference = this.f60214l;
        if (weakReference != null) {
            AppwallAdView appwallAdView = (AppwallAdView) weakReference.get();
            if (appwallAdView != null) {
                appwallAdView.setAppwallAdViewListener(null);
            }
            this.f60214l.clear();
            this.f60214l = null;
        }
    }
}

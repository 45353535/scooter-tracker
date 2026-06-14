package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ironsource.C4424m2;
import com.my.target.common.MyTargetPrivacy;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.g8;
import com.my.target.h6;
import com.my.target.mediation.AdChoicesClickHandler;
import com.my.target.mediation.AdNetworkConfig;
import com.my.target.mediation.MediationAdapter;
import com.my.target.mediation.MediationNativeBannerAdAdapter;
import com.my.target.mediation.MediationNativeBannerAdConfig;
import com.my.target.mediation.MyTargetNativeBannerAdAdapter;
import com.my.target.nativeads.NativeBannerAd;
import com.my.target.nativeads.NativeBannerAdViewBinder;
import com.my.target.nativeads.banners.NativeBanner;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.z5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class c6 extends z5 implements u2, NativeBannerAd.NativeBannerAdChoicesOptionListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final NativeBannerAd f59370k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final MenuFactory f59371l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public NativeBanner f59372m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public WeakReference f59373n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public WeakReference f59374o;

    public class a implements MediationNativeBannerAdAdapter.MediationNativeBannerAdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y5 f59375a;

        public a(y5 y5Var) {
            this.f59375a = y5Var;
        }

        public final boolean a() {
            return (this.f59375a.j() || "0".equals(this.f59375a.c().get("lg"))) ? false : true;
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdAdapter.MediationNativeBannerAdListener
        public void closeIfAutomaticallyDisabled(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            NativeBannerAd.NativeBannerAdChoicesOptionListener adChoicesOptionListener = c6.this.f59370k.getAdChoicesOptionListener();
            if (adChoicesOptionListener == null) {
                return;
            }
            adChoicesOptionListener.closeIfAutomaticallyDisabled(c6.this.f59370k);
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdAdapter.MediationNativeBannerAdListener
        public void onAdChoicesIconLoad(ImageData imageData, boolean z10, MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            NativeBannerAd.NativeBannerAdChoicesListener adChoicesListener = c6.this.f59370k.getAdChoicesListener();
            if (adChoicesListener == null) {
                return;
            }
            String strB = this.f59375a.b();
            if (z10) {
                gb.a("MediationNativeBannerAdEngine: AdChoices icon from" + strB + " ad network loaded successfully");
            } else {
                gb.a("MediationNativeBannerAdEngine: AdChoices icon from" + strB + " hasn't loaded");
            }
            adChoicesListener.onAdChoicesIconLoad(imageData, z10, c6.this.f59370k);
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdAdapter.MediationNativeBannerAdListener
        public void onClick(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            c6 c6Var = c6.this;
            if (c6Var.f61165d != mediationNativeBannerAdAdapter) {
                return;
            }
            Context contextG = c6Var.g();
            if (contextG != null) {
                bb.b(this.f59375a.h(), "click", 2, contextG);
            }
            NativeBannerAd.NativeBannerAdListener listener = c6.this.f59370k.getListener();
            if (listener != null) {
                listener.onClick(c6.this.f59370k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdAdapter.MediationNativeBannerAdListener
        public void onCloseAutomatically(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            NativeBannerAd.NativeBannerAdChoicesOptionListener adChoicesOptionListener = c6.this.f59370k.getAdChoicesOptionListener();
            if (adChoicesOptionListener == null) {
                return;
            }
            adChoicesOptionListener.onCloseAutomatically(c6.this.f59370k);
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdAdapter.MediationNativeBannerAdListener
        public void onLoad(NativeBanner nativeBanner, MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            if (c6.this.f61165d != mediationNativeBannerAdAdapter) {
                return;
            }
            String strB = this.f59375a.b();
            gb.a("MediationNativeBannerAdEngine: Data from " + strB + " ad network loaded successfully");
            Context contextG = c6.this.g();
            if (a() && contextG != null) {
                j7.b(strB, nativeBanner, contextG);
            }
            c6.this.a(this.f59375a, true);
            c6 c6Var = c6.this;
            c6Var.f59372m = nativeBanner;
            NativeBannerAd.NativeBannerAdListener listener = c6Var.f59370k.getListener();
            if (listener != null) {
                listener.onLoad(nativeBanner, c6.this.f59370k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdAdapter.MediationNativeBannerAdListener
        public void onNoAd(IAdLoadingError iAdLoadingError, MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            if (c6.this.f61165d != mediationNativeBannerAdAdapter) {
                return;
            }
            gb.a("MediationNativeBannerAdEngine: No data from " + this.f59375a.b() + " ad network - " + iAdLoadingError);
            c6.this.a(this.f59375a, false);
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdAdapter.MediationNativeBannerAdListener
        public void onShow(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            c6 c6Var = c6.this;
            if (c6Var.f61165d != mediationNativeBannerAdAdapter) {
                return;
            }
            Context contextG = c6Var.g();
            if (contextG != null) {
                bb.b(this.f59375a.h(), C4424m2.f43623v, 1, contextG);
            }
            NativeBannerAd.NativeBannerAdListener listener = c6.this.f59370k.getListener();
            if (listener != null) {
                listener.onShow(c6.this.f59370k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdAdapter.MediationNativeBannerAdListener
        public boolean shouldCloseAutomatically() {
            NativeBannerAd.NativeBannerAdChoicesOptionListener adChoicesOptionListener = c6.this.f59370k.getAdChoicesOptionListener();
            if (adChoicesOptionListener == null) {
                return true;
            }
            return adChoicesOptionListener.shouldCloseAutomatically();
        }
    }

    public static class b extends z5.a implements MediationNativeBannerAdConfig {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f59377h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f59378i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final MenuFactory f59379j;

        public b(String str, String str2, Map map, int i10, int i11, MyTargetPrivacy myTargetPrivacy, int i12, int i13, AdNetworkConfig adNetworkConfig, MenuFactory menuFactory) {
            super(str, str2, map, i10, i11, myTargetPrivacy, adNetworkConfig);
            this.f59377h = i12;
            this.f59378i = i13;
            this.f59379j = menuFactory;
        }

        public static b a(String str, String str2, Map map, int i10, int i11, MyTargetPrivacy myTargetPrivacy, int i12, int i13, AdNetworkConfig adNetworkConfig, MenuFactory menuFactory) {
            return new b(str, str2, map, i10, i11, myTargetPrivacy, i12, i13, adNetworkConfig, menuFactory);
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdConfig
        public int getAdChoicesPlacement() {
            return this.f59378i;
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdConfig
        public int getCachePolicy() {
            return this.f59377h;
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdConfig
        public MenuFactory getMenuFactory() {
            return this.f59379j;
        }
    }

    public c6(NativeBannerAd nativeBannerAd, x5 x5Var, j jVar, h6.a aVar, MenuFactory menuFactory) {
        super(x5Var, jVar, aVar);
        this.f59370k = nativeBannerAd;
        this.f59371l = menuFactory;
    }

    public final void b(ImageData imageData, ma maVar) {
        maVar.setImageData(imageData);
        if (imageData == null || imageData.getBitmap() != null) {
            return;
        }
        a3.b(imageData, maVar);
    }

    @Override // com.my.target.u2
    public NativeBanner c() {
        return this.f59372m;
    }

    @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdChoicesOptionListener
    public void closeIfAutomaticallyDisabled(NativeBannerAd nativeBannerAd) {
        NativeBannerAd.NativeBannerAdChoicesOptionListener adChoicesOptionListener = this.f59370k.getAdChoicesOptionListener();
        if (adChoicesOptionListener == null) {
            return;
        }
        adChoicesOptionListener.closeIfAutomaticallyDisabled(this.f59370k);
    }

    @Override // com.my.target.z5
    public void e() {
        NativeBannerAd.NativeBannerAdListener listener = this.f59370k.getListener();
        if (listener != null) {
            listener.onNoAd(m.f60116u, this.f59370k);
        }
    }

    @Override // com.my.target.u2
    public void handleAdChoicesClick(Context context) {
        MediationAdapter mediationAdapter = this.f61165d;
        if (mediationAdapter instanceof AdChoicesClickHandler) {
            ((AdChoicesClickHandler) mediationAdapter).handleAdChoicesClick(context);
        }
    }

    @Override // com.my.target.z5
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public MediationNativeBannerAdAdapter f() {
        return new MyTargetNativeBannerAdAdapter();
    }

    @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdChoicesOptionListener
    public void onCloseAutomatically(NativeBannerAd nativeBannerAd) {
        NativeBannerAd.NativeBannerAdChoicesOptionListener adChoicesOptionListener = this.f59370k.getAdChoicesOptionListener();
        if (adChoicesOptionListener == null) {
            return;
        }
        adChoicesOptionListener.onCloseAutomatically(this.f59370k);
    }

    @Override // com.my.target.u2
    public void registerView(View view, List list, int i10) {
        a(view, (NativeBannerAdViewBinder) null, list, i10, false);
    }

    @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdChoicesOptionListener
    public boolean shouldCloseAutomatically() {
        NativeBannerAd.NativeBannerAdChoicesOptionListener adChoicesOptionListener = this.f59370k.getAdChoicesOptionListener();
        if (adChoicesOptionListener == null) {
            return true;
        }
        return adChoicesOptionListener.shouldCloseAutomatically();
    }

    @Override // com.my.target.u2
    public void unregisterView() {
        if (this.f61165d == null) {
            gb.b("MediationNativeBannerAdEngine error: can't unregister view, adapter is not set");
            return;
        }
        WeakReference weakReference = this.f59374o;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            this.f59374o.clear();
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        WeakReference weakReference2 = this.f59373n;
        IconAdView iconAdView = weakReference2 != null ? (IconAdView) weakReference2.get() : null;
        if (iconAdView != null) {
            this.f59373n.clear();
            NativeBanner nativeBanner = this.f59372m;
            a(nativeBanner != null ? nativeBanner.getIcon() : null, (ma) iconAdView.getImageView());
        }
        this.f59374o = null;
        this.f59373n = null;
        try {
            ((MediationNativeBannerAdAdapter) this.f61165d).unregisterView();
        } catch (Throwable th2) {
            gb.b("MediationNativeBannerAdEngine error: " + th2);
        }
    }

    public static c6 a(NativeBannerAd nativeBannerAd, x5 x5Var, j jVar, h6.a aVar, MenuFactory menuFactory) {
        return new c6(nativeBannerAd, x5Var, jVar, aVar, menuFactory);
    }

    @Override // com.my.target.u2
    public void registerView(NativeBannerAdViewBinder nativeBannerAdViewBinder, List list, int i10) {
        a((View) null, nativeBannerAdViewBinder, list, i10, true);
    }

    @Override // com.my.target.u2
    public void a(NativeBannerAd.NativeBannerAdMediaListener nativeBannerAdMediaListener) {
        gb.a("MediationNativeBannerAdEngine: NativeBannerAdMediaListener is not currently supported for mediation");
    }

    public final void a(View view, NativeBannerAdViewBinder nativeBannerAdViewBinder, List list, int i10, boolean z10) {
        List<View> arrayList;
        g8 g8VarA;
        Context contextF;
        if (z10 && nativeBannerAdViewBinder == null) {
            gb.b("MediationNativeBannerAdEngine error: wrong args for using nativeBannerAdViewBinder");
            return;
        }
        if (!z10 && view == null) {
            gb.b("MediationNativeBannerAdEngine error: wrong args for using viewGroup like adView");
            return;
        }
        if (this.f61165d == null) {
            gb.b("MediationNativeBannerAdEngine error: Can't register view, adapter is not set");
            return;
        }
        if (this.f59372m == null) {
            gb.b("MediationNativeBannerAdEngine error: Can't register view, banner is null or not loaded yet");
            return;
        }
        unregisterView();
        if (list != null) {
            arrayList = new ArrayList<>(list);
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        if (!(this.f61165d instanceof MyTargetNativeBannerAdAdapter) && (z10 || (view instanceof ViewGroup))) {
            if (z10) {
                g8VarA = new g8.a().a(nativeBannerAdViewBinder).a();
            } else {
                g8VarA = new g8.a().b((ViewGroup) view).a();
            }
            IconAdView iconAdViewK = g8VarA.k();
            if (iconAdViewK != null) {
                this.f59373n = new WeakReference(iconAdViewK);
                try {
                    contextF = g8VarA.f();
                } catch (Throwable th2) {
                    gb.b("MediationNativeBannerAdEngine: Error - " + th2);
                }
                View iconView = contextF != null ? ((MediationNativeBannerAdAdapter) this.f61165d).getIconView(contextF) : null;
                if (iconView != null) {
                    this.f59374o = new WeakReference(iconView);
                }
                a(iconAdViewK, iconView, this.f59372m.getIcon(), arrayList);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("MediationNativeBannerAdEngine: IconView component not found in ");
                Object obj = view;
                if (z10) {
                    obj = nativeBannerAdViewBinder;
                }
                sb2.append(obj);
                sb2.append(". It's required");
                gb.b(sb2.toString());
                return;
            }
        }
        try {
            if (z10) {
                ((MediationNativeBannerAdAdapter) this.f61165d).registerView(nativeBannerAdViewBinder, arrayList, i10);
            } else {
                ((MediationNativeBannerAdAdapter) this.f61165d).registerView(view, arrayList, i10);
            }
        } catch (Throwable th3) {
            gb.b("MediationNativeBannerAdEngine: Error - " + th3);
        }
    }

    @Override // com.my.target.z5
    public void a(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter, y5 y5Var, Context context) {
        b bVarA = b.a(y5Var.e(), y5Var.d(), y5Var.c(), this.f61162a.g().getAge(), this.f61162a.g().getGender(), MyTargetPrivacy.currentPrivacy(), this.f61162a.f(), this.f59370k.getAdChoicesPlacement(), TextUtils.isEmpty(this.f61169h) ? null : this.f61162a.a(this.f61169h), this.f59371l);
        if (mediationNativeBannerAdAdapter instanceof MyTargetNativeBannerAdAdapter) {
            t tVarG = y5Var.g();
            if (tVarG instanceof o7) {
                ((MyTargetNativeBannerAdAdapter) mediationNativeBannerAdAdapter).a((o7) tVarG);
            }
        }
        try {
            mediationNativeBannerAdAdapter.load(bVarA, new a(y5Var), context);
        } catch (Throwable th2) {
            gb.b("MediationNativeBannerAdEngine error: " + th2);
        }
    }

    @Override // com.my.target.z5
    public boolean a(MediationAdapter mediationAdapter) {
        return mediationAdapter instanceof MediationNativeBannerAdAdapter;
    }

    public final void a(ImageData imageData, ma maVar) {
        if (imageData != null) {
            a3.a(imageData, maVar);
        }
        maVar.setImageData(null);
    }

    public final void a(IconAdView iconAdView, View view, ImageData imageData, List list) {
        if (imageData == null) {
            iconAdView.setPlaceHolderDimension(0, 0);
        } else if (imageData.getWidth() > 0 && imageData.getHeight() > 0) {
            iconAdView.setPlaceHolderDimension(imageData.getWidth(), imageData.getHeight());
        } else {
            iconAdView.setPlaceHolderDimension(1, 1);
        }
        if (view != null) {
            gb.a("MediationNativeBannerAdEngine: Got IconView from adapter");
            iconAdView.addView(view);
            int iIndexOf = list.indexOf(iconAdView);
            if (iIndexOf >= 0) {
                list.remove(iIndexOf);
                list.add(view);
                return;
            }
            return;
        }
        b(imageData, (ma) iconAdView.getImageView());
    }
}

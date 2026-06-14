package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ironsource.C4424m2;
import com.my.target.common.ExternalClickHandler;
import com.my.target.common.MyTargetPrivacy;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.g8;
import com.my.target.h6;
import com.my.target.mediation.AdChoicesClickHandler;
import com.my.target.mediation.AdNetworkConfig;
import com.my.target.mediation.MediationAdapter;
import com.my.target.mediation.MediationNativeAdAdapter;
import com.my.target.mediation.MediationNativeAdConfig;
import com.my.target.mediation.MyTargetNativeAdAdapter;
import com.my.target.nativeads.NativeAd;
import com.my.target.nativeads.NativeAdViewBinder;
import com.my.target.nativeads.banners.NativePromoBanner;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.my.target.z5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class b6 extends z5 implements t2, NativeAd.NativeAdChoicesOptionListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final NativeAd f59280k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final MenuFactory f59281l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public NativePromoBanner f59282m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public WeakReference f59283n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public WeakReference f59284o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public WeakReference f59285p;

    public class a implements MediationNativeAdAdapter.MediationNativeAdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y5 f59286a;

        public a(y5 y5Var) {
            this.f59286a = y5Var;
        }

        public final boolean a() {
            return (this.f59286a.j() || "0".equals(this.f59286a.c().get("lg"))) ? false : true;
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void closeIfAutomaticallyDisabled(MediationNativeAdAdapter mediationNativeAdAdapter) {
            NativeAd.NativeAdChoicesOptionListener adChoicesOptionListener = b6.this.f59280k.getAdChoicesOptionListener();
            if (adChoicesOptionListener == null) {
                return;
            }
            adChoicesOptionListener.closeIfAutomaticallyDisabled(b6.this.f59280k);
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onAdChoicesIconLoad(ImageData imageData, boolean z10, MediationNativeAdAdapter mediationNativeAdAdapter) {
            NativeAd.NativeAdChoicesListener adChoicesListener;
            b6 b6Var = b6.this;
            if (b6Var.f61165d == mediationNativeAdAdapter && (adChoicesListener = b6Var.f59280k.getAdChoicesListener()) != null) {
                String strB = this.f59286a.b();
                if (z10) {
                    gb.a("MediationNativeAdEngine: AdChoices icon from" + strB + " ad network loaded successfully");
                } else {
                    gb.a("MediationNativeAdEngine: AdChoices icon from" + strB + " hasn't loaded");
                }
                adChoicesListener.onAdChoicesIconLoad(imageData, z10, b6.this.f59280k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onClick(MediationNativeAdAdapter mediationNativeAdAdapter) {
            b6 b6Var = b6.this;
            if (b6Var.f61165d != mediationNativeAdAdapter) {
                return;
            }
            Context contextG = b6Var.g();
            if (contextG != null) {
                bb.b(this.f59286a.h(), "click", 2, contextG);
            }
            NativeAd.NativeAdListener listener = b6.this.f59280k.getListener();
            if (listener != null) {
                listener.onClick(b6.this.f59280k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onCloseAutomatically(MediationNativeAdAdapter mediationNativeAdAdapter) {
            NativeAd.NativeAdChoicesOptionListener adChoicesOptionListener = b6.this.f59280k.getAdChoicesOptionListener();
            if (adChoicesOptionListener == null) {
                return;
            }
            adChoicesOptionListener.onCloseAutomatically(b6.this.f59280k);
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onLoad(NativePromoBanner nativePromoBanner, MediationNativeAdAdapter mediationNativeAdAdapter) {
            if (b6.this.f61165d != mediationNativeAdAdapter) {
                return;
            }
            String strB = this.f59286a.b();
            gb.a("MediationNativeAdEngine: Data from " + strB + " ad network loaded successfully");
            Context contextG = b6.this.g();
            if (a() && contextG != null) {
                j7.b(strB, nativePromoBanner, contextG);
            }
            b6.this.a(this.f59286a, true);
            b6 b6Var = b6.this;
            b6Var.f59282m = nativePromoBanner;
            NativeAd.NativeAdListener listener = b6Var.f59280k.getListener();
            if (listener != null) {
                listener.onLoad(nativePromoBanner, b6.this.f59280k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onNoAd(IAdLoadingError iAdLoadingError, MediationNativeAdAdapter mediationNativeAdAdapter) {
            if (b6.this.f61165d != mediationNativeAdAdapter) {
                return;
            }
            gb.a("MediationNativeAdEngine: No data from " + this.f59286a.b() + " ad network - " + iAdLoadingError);
            b6.this.a(this.f59286a, false);
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onShow(MediationNativeAdAdapter mediationNativeAdAdapter) {
            b6 b6Var = b6.this;
            if (b6Var.f61165d != mediationNativeAdAdapter) {
                return;
            }
            Context contextG = b6Var.g();
            if (contextG != null) {
                bb.b(this.f59286a.h(), C4424m2.f43623v, 1, contextG);
            }
            NativeAd.NativeAdListener listener = b6.this.f59280k.getListener();
            if (listener != null) {
                listener.onShow(b6.this.f59280k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onVideoComplete(MediationNativeAdAdapter mediationNativeAdAdapter) {
            NativeAd.NativeAdListener listener;
            b6 b6Var = b6.this;
            if (b6Var.f61165d == mediationNativeAdAdapter && (listener = b6Var.f59280k.getListener()) != null) {
                listener.onVideoComplete(b6.this.f59280k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onVideoPause(MediationNativeAdAdapter mediationNativeAdAdapter) {
            NativeAd.NativeAdListener listener;
            b6 b6Var = b6.this;
            if (b6Var.f61165d == mediationNativeAdAdapter && (listener = b6Var.f59280k.getListener()) != null) {
                listener.onVideoPause(b6.this.f59280k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onVideoPlay(MediationNativeAdAdapter mediationNativeAdAdapter) {
            NativeAd.NativeAdListener listener;
            b6 b6Var = b6.this;
            if (b6Var.f61165d == mediationNativeAdAdapter && (listener = b6Var.f59280k.getListener()) != null) {
                listener.onVideoPlay(b6.this.f59280k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public boolean shouldCloseAutomatically() {
            NativeAd.NativeAdChoicesOptionListener adChoicesOptionListener = b6.this.f59280k.getAdChoicesOptionListener();
            if (adChoicesOptionListener == null) {
                return true;
            }
            return adChoicesOptionListener.shouldCloseAutomatically();
        }
    }

    public static class b extends z5.a implements MediationNativeAdConfig {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f59288h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f59289i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final MenuFactory f59290j;

        public b(String str, String str2, Map map, int i10, int i11, MyTargetPrivacy myTargetPrivacy, int i12, int i13, AdNetworkConfig adNetworkConfig, MenuFactory menuFactory) {
            super(str, str2, map, i10, i11, myTargetPrivacy, adNetworkConfig);
            this.f59288h = i12;
            this.f59289i = i13;
            this.f59290j = menuFactory;
        }

        public static b a(String str, String str2, Map map, int i10, int i11, MyTargetPrivacy myTargetPrivacy, int i12, int i13, AdNetworkConfig adNetworkConfig, MenuFactory menuFactory) {
            return new b(str, str2, map, i10, i11, myTargetPrivacy, i12, i13, adNetworkConfig, menuFactory);
        }

        @Override // com.my.target.mediation.MediationNativeAdConfig
        public int getAdChoicesPlacement() {
            return this.f59289i;
        }

        @Override // com.my.target.mediation.MediationNativeAdConfig
        public int getCachePolicy() {
            return this.f59288h;
        }

        @Override // com.my.target.mediation.MediationNativeAdConfig
        public MenuFactory getMenuFactory() {
            return this.f59290j;
        }

        @Override // com.my.target.mediation.MediationNativeAdConfig
        public boolean isAutoLoadImages() {
            int i10 = this.f59288h;
            return i10 == 0 || i10 == 1;
        }

        @Override // com.my.target.mediation.MediationNativeAdConfig
        public boolean isAutoLoadVideo() {
            int i10 = this.f59288h;
            return i10 == 0 || i10 == 2;
        }
    }

    public b6(NativeAd nativeAd, x5 x5Var, j jVar, h6.a aVar, MenuFactory menuFactory) {
        super(x5Var, jVar, aVar);
        this.f59280k = nativeAd;
        this.f59281l = menuFactory;
    }

    private void b(ImageData imageData, ma maVar) {
        maVar.setImageData(imageData);
        if (imageData == null || imageData.getBitmap() != null) {
            return;
        }
        a3.b(imageData, maVar);
    }

    @Override // com.my.target.t2
    public void a(ExternalClickHandler externalClickHandler) {
    }

    @Override // com.my.target.nativeads.NativeAd.NativeAdChoicesOptionListener
    public void closeIfAutomaticallyDisabled(NativeAd nativeAd) {
        NativeAd.NativeAdChoicesOptionListener adChoicesOptionListener = this.f59280k.getAdChoicesOptionListener();
        if (adChoicesOptionListener == null) {
            return;
        }
        adChoicesOptionListener.closeIfAutomaticallyDisabled(this.f59280k);
    }

    @Override // com.my.target.t2
    public NativePromoBanner d() {
        return this.f59282m;
    }

    @Override // com.my.target.z5
    public void e() {
        NativeAd.NativeAdListener listener = this.f59280k.getListener();
        if (listener != null) {
            listener.onNoAd(m.f60116u, this.f59280k);
        }
    }

    @Override // com.my.target.t2
    public void handleAdChoicesClick(Context context) {
        MediationAdapter mediationAdapter = this.f61165d;
        if (mediationAdapter instanceof AdChoicesClickHandler) {
            ((AdChoicesClickHandler) mediationAdapter).handleAdChoicesClick(context);
        }
    }

    @Override // com.my.target.z5
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public MediationNativeAdAdapter f() {
        return new MyTargetNativeAdAdapter();
    }

    @Override // com.my.target.nativeads.NativeAd.NativeAdChoicesOptionListener
    public void onCloseAutomatically(NativeAd nativeAd) {
        NativeAd.NativeAdChoicesOptionListener adChoicesOptionListener = this.f59280k.getAdChoicesOptionListener();
        if (adChoicesOptionListener == null) {
            return;
        }
        adChoicesOptionListener.onCloseAutomatically(this.f59280k);
    }

    @Override // com.my.target.t2
    public void registerView(NativeAdViewBinder nativeAdViewBinder, List list, int i10) {
        a(null, nativeAdViewBinder, list, i10, null, true);
    }

    @Override // com.my.target.nativeads.NativeAd.NativeAdChoicesOptionListener
    public boolean shouldCloseAutomatically() {
        NativeAd.NativeAdChoicesOptionListener adChoicesOptionListener = this.f59280k.getAdChoicesOptionListener();
        if (adChoicesOptionListener == null) {
            return true;
        }
        return adChoicesOptionListener.shouldCloseAutomatically();
    }

    @Override // com.my.target.t2
    public void unregisterView() {
        if (this.f61165d == null) {
            gb.b("MediationNativeAdEngine error: can't unregister view, adapter is not set");
            return;
        }
        WeakReference weakReference = this.f59284o;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            this.f59284o.clear();
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        WeakReference weakReference2 = this.f59283n;
        MediaAdView mediaAdView = weakReference2 != null ? (MediaAdView) weakReference2.get() : null;
        if (mediaAdView != null) {
            this.f59283n.clear();
            NativePromoBanner nativePromoBanner = this.f59282m;
            a(nativePromoBanner != null ? nativePromoBanner.getImage() : null, (ma) mediaAdView.getImageView());
            mediaAdView.setPlaceHolderDimension(0, 0);
        }
        WeakReference weakReference3 = this.f59285p;
        IconAdView iconAdView = weakReference3 != null ? (IconAdView) weakReference3.get() : null;
        if (iconAdView != null) {
            this.f59285p.clear();
            NativePromoBanner nativePromoBanner2 = this.f59282m;
            a(nativePromoBanner2 != null ? nativePromoBanner2.getIcon() : null, (ma) iconAdView.getImageView());
        }
        this.f59284o = null;
        this.f59283n = null;
        try {
            ((MediationNativeAdAdapter) this.f61165d).unregisterView();
        } catch (Throwable th2) {
            gb.b("MediationNativeAdEngine error: " + th2);
        }
    }

    public static final b6 a(NativeAd nativeAd, x5 x5Var, j jVar, h6.a aVar, MenuFactory menuFactory) {
        return new b6(nativeAd, x5Var, jVar, aVar, menuFactory);
    }

    @Override // com.my.target.t2
    public void a(NativeAd.NativeAdMediaListener nativeAdMediaListener) {
        gb.a("MediationNativeAdEngine: NativeAdMediaListener is not currently supported for mediation");
    }

    @Override // com.my.target.t2
    public void a(View view, List list, int i10, MediaAdView mediaAdView) {
        a(view, null, list, i10, mediaAdView, false);
    }

    public final void a(View view, NativeAdViewBinder nativeAdViewBinder, List list, int i10, MediaAdView mediaAdView, boolean z10) {
        ArrayList arrayList;
        b6 b6Var;
        g8 g8VarA;
        if (z10 && nativeAdViewBinder == null) {
            gb.b("MediationNativeAdEngine error: wrong args for using nativeAdViewBinder");
            return;
        }
        if (!z10 && view == null) {
            gb.b("MediationNativeAdEngine error: wrong args for using viewGroup like adView");
            return;
        }
        if (this.f61165d == null) {
            gb.b("MediationNativeAdEngine error: can't register view, adapter is not set");
            return;
        }
        if (this.f59282m == null) {
            gb.b("MediationNativeAdEngine error: can't register view, banner is null or not loaded yet");
            return;
        }
        unregisterView();
        View mediaView = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View view2 = (View) it.next();
                if (view2 != null) {
                    arrayList2.add(view2);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (view == null) {
            return;
        }
        if ((this.f61165d instanceof MyTargetNativeAdAdapter) || !(z10 || (view instanceof ViewGroup))) {
            b6Var = this;
        } else {
            if (z10) {
                g8VarA = new g8.a().a(nativeAdViewBinder).a();
            } else {
                g8VarA = new g8.a().b((ViewGroup) view).a(mediaAdView).a();
            }
            MediaAdView mediaAdViewL = g8VarA.l();
            if (mediaAdViewL != null) {
                this.f59283n = new WeakReference(mediaAdViewL);
                try {
                    Context contextF = g8VarA.f();
                    if (contextF != null) {
                        mediaView = ((MediationNativeAdAdapter) this.f61165d).getMediaView(contextF);
                    }
                } catch (Throwable th2) {
                    gb.b("MediationNativeAdEngine error: " + th2);
                }
                View view3 = mediaView;
                if (view3 != null) {
                    this.f59284o = new WeakReference(view3);
                }
                b6Var = this;
                b6Var.a(mediaAdViewL, view3, this.f59282m.getImage(), this.f59282m.hasVideo(), arrayList);
            } else {
                b6Var = this;
            }
            IconAdView iconAdViewK = g8VarA.k();
            ImageData icon = b6Var.f59282m.getIcon();
            if (iconAdViewK != null && icon != null) {
                b6Var.f59285p = new WeakReference(iconAdViewK);
                b(icon, (ma) iconAdViewK.getImageView());
            }
        }
        try {
            if (z10) {
                ((MediationNativeAdAdapter) b6Var.f61165d).registerView(nativeAdViewBinder, arrayList, i10);
            } else {
                ((MediationNativeAdAdapter) b6Var.f61165d).registerView(view, arrayList, i10);
            }
        } catch (Throwable th3) {
            gb.b("MediationNativeAdEngine error: " + th3);
        }
    }

    @Override // com.my.target.z5
    public void a(MediationNativeAdAdapter mediationNativeAdAdapter, y5 y5Var, Context context) {
        b bVarA = b.a(y5Var.e(), y5Var.d(), y5Var.c(), this.f61162a.g().getAge(), this.f61162a.g().getGender(), MyTargetPrivacy.currentPrivacy(), this.f61162a.f(), this.f59280k.getAdChoicesPlacement(), TextUtils.isEmpty(this.f61169h) ? null : this.f61162a.a(this.f61169h), this.f59281l);
        if (mediationNativeAdAdapter instanceof MyTargetNativeAdAdapter) {
            t tVarG = y5Var.g();
            if (tVarG instanceof o7) {
                ((MyTargetNativeAdAdapter) mediationNativeAdAdapter).a((o7) tVarG);
            }
        }
        try {
            mediationNativeAdAdapter.load(bVarA, new a(y5Var), context);
        } catch (Throwable th2) {
            gb.b("MediationNativeAdEngine error: " + th2);
        }
    }

    @Override // com.my.target.z5
    public boolean a(MediationAdapter mediationAdapter) {
        return mediationAdapter instanceof MediationNativeAdAdapter;
    }

    private void a(ImageData imageData, ma maVar) {
        if (imageData != null) {
            a3.a(imageData, maVar);
        }
        maVar.setImageData(null);
    }

    public final void a(MediaAdView mediaAdView, View view, ImageData imageData, boolean z10, List list) {
        int iIndexOf;
        if (imageData == null && !z10) {
            mediaAdView.setPlaceHolderDimension(0, 0);
        } else if (imageData != null && imageData.getWidth() > 0 && imageData.getHeight() > 0) {
            mediaAdView.setPlaceHolderDimension(imageData.getWidth(), imageData.getHeight());
        } else {
            mediaAdView.setPlaceHolderDimension(16, 10);
        }
        if (view != null) {
            gb.a("MediationNativeAdEngine: Got MediaView from adapter");
            mediaAdView.addView(view);
            if (list == null || (iIndexOf = list.indexOf(mediaAdView)) < 0) {
                return;
            }
            list.remove(iIndexOf);
            list.add(view);
            return;
        }
        b(imageData, (ma) mediaAdView.getImageView());
    }
}

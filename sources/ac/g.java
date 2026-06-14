package ac;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import dc.s;
import io.bidmachine.AdObjectImpl;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.ContextProvider;
import io.bidmachine.Executable;
import io.bidmachine.ImageData;
import io.bidmachine.ImageDataImpl;
import io.bidmachine.LabelData;
import io.bidmachine.MediaAssetType;
import io.bidmachine.PrivacySheetData;
import io.bidmachine.RendererConfiguration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import pd.i0;
import pd.t;
import pd.u;
import pd.z;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends AdObjectImpl implements i, l, j, View.OnClickListener {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final WeakHashMap f4204t = new WeakHashMap(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f4205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j9.b f4206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ViewGroup f4207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private io.bidmachine.nativead.view.a f4208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f4209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ProgressDialog f4210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f4211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d f4212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Handler f4213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Runnable f4214k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f4215l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f4216m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ImageDataImpl f4217n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ImageDataImpl f4218o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Uri f4219p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private c9.g f4220q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private n f4221r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ce.a f4222s;

    class a implements j9.p {
        a() {
        }

        @Override // j9.p
        public boolean a() {
            return g.this.A();
        }

        @Override // j9.p
        public void b() {
            g.this.f4215l = true;
            g.this.z();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.I();
        }
    }

    private static class d implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference f4226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f4227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f4228d;

        public d(View view) {
            this.f4226b = new WeakReference(view);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            View view2;
            if (view == null) {
                return;
            }
            int i18 = i12 - i10;
            int i19 = i13 - i11;
            if ((i18 == this.f4227c && i19 == this.f4228d) || (view2 = (View) this.f4226b.get()) == null) {
                return;
            }
            this.f4227c = i18;
            this.f4228d = i19;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                view2.setLayoutParams(new ViewGroup.LayoutParams(i18, i19));
                return;
            }
            layoutParams.width = i18;
            layoutParams.height = i19;
            view2.requestLayout();
        }
    }

    private final class e extends AdObjectImpl.BaseUnifiedAdCallback implements od.m {
        e(AdProcessCallback adProcessCallback) {
            super(adProcessCallback);
        }

        @Override // od.m
        public void a(n nVar) {
            try {
                g.this.P(nVar);
                if (((h) ((p) g.this.getAdRequest()).getAdRequestParameters()).c() && !nVar.isValid()) {
                    this.processCallback.processLoadFail(ae.a.h("Native ad does not contain all required assets"));
                } else if (nVar.isNetworkControlLoadingAssets()) {
                    this.processCallback.processLoadSuccess();
                } else {
                    g gVar = g.this;
                    gVar.K(gVar.getApplicationContext(), nVar);
                }
            } catch (Exception e10) {
                io.bidmachine.core.a.n(g.this.f4205b, e10);
                this.processCallback.processLoadFail(ae.a.l("Exception loading native ad assets", e10));
            }
        }
    }

    g(final ContextProvider contextProvider, AdProcessCallback adProcessCallback, p pVar, zb.b bVar, od.l lVar) {
        super(contextProvider, adProcessCallback, pVar, bVar, lVar);
        this.f4205b = new z("NativeAdObject");
        this.f4206c = new j9.b();
        this.f4222s = new ce.a(new ce.b() { // from class: ac.c
            @Override // ce.b
            public final Object get() {
                return ec.a.f69047a.a(h9.a.b(contextProvider.getApplicationContext()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        Handler handler;
        ProgressDialog progressDialog = this.f4210g;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f4210g.dismiss();
            this.f4210g = null;
        }
        Runnable runnable = this.f4214k;
        if (runnable == null || (handler = this.f4213j) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
        this.f4213j = null;
        this.f4214k = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(Context context, i iVar) {
        new ac.a(context, this.f4205b, (h) ((p) getAdRequest()).getAdRequestParameters(), getProcessCallback(), iVar, this).j(context);
    }

    private boolean L() {
        ProgressDialog progressDialog = this.f4210g;
        return progressDialog == null || !progressDialog.isShowing();
    }

    private void N() {
        View view = this.f4211h;
        if (view != null) {
            i0.k(view);
            this.f4211h = null;
        }
    }

    private void O(ViewGroup viewGroup) {
        d dVar = this.f4212i;
        if (dVar != null) {
            viewGroup.removeOnLayoutChangeListener(dVar);
            this.f4212i = null;
        }
    }

    private void Q(Activity activity) {
        if (this.f4207d != null && L() && io.bidmachine.core.h.d(activity)) {
            this.f4207d.addOnAttachStateChangeListener(new b());
            ProgressDialog progressDialogShow = ProgressDialog.show(activity, "", "Loading...");
            this.f4210g = progressDialogShow;
            progressDialogShow.setProgressStyle(0);
            this.f4210g.setCancelable(false);
            this.f4214k = new c();
            Handler handler = new Handler(Looper.getMainLooper());
            this.f4213j = handler;
            handler.postDelayed(this.f4214k, 5000L);
        }
    }

    private void q(ViewGroup viewGroup, Set set) {
        w(viewGroup);
        if (set == null || set.isEmpty()) {
            return;
        }
        WeakHashMap weakHashMap = new WeakHashMap();
        f4204t.put(viewGroup, weakHashMap);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view != null) {
                view.setOnClickListener(this);
                weakHashMap.put(view, this);
            }
        }
    }

    private ImageView r(View view) {
        ImageView imageView;
        if (view instanceof ImageView) {
            imageView = (ImageView) view;
        } else if (view instanceof ViewGroup) {
            ImageView imageView2 = new ImageView(view.getContext());
            imageView2.setId(100);
            imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.removeAllViews();
            viewGroup.addView(imageView2, new ViewGroup.LayoutParams(-1, -1));
            imageView = imageView2;
        } else {
            imageView = null;
        }
        if (imageView != null && this.f4217n != null) {
            cc.a.d(imageView.getContext(), imageView, this.f4217n.getLocalUri(), this.f4217n.getImage());
        }
        return imageView;
    }

    private void s(s sVar) {
        if (sVar == null) {
            return;
        }
        View viewU = u(sVar.getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        i0.b(sVar, viewU, layoutParams);
    }

    private void t(ViewGroup viewGroup, RendererConfiguration rendererConfiguration) {
        Drawable watermarkDrawable;
        O(viewGroup);
        N();
        if (rendererConfiguration == null || (watermarkDrawable = rendererConfiguration.getWatermarkDrawable(getApplicationContext())) == null) {
            return;
        }
        ld.c cVar = new ld.c(viewGroup.getContext().getApplicationContext());
        cVar.setLayoutParams(i0.c());
        cVar.setWatermark(watermarkDrawable);
        this.f4211h = cVar;
        d dVar = new d(cVar);
        this.f4212i = dVar;
        viewGroup.addOnLayoutChangeListener(dVar);
        viewGroup.addView(cVar);
    }

    private View u(Context context) {
        View viewCreateCustomMediaView;
        n nVar = this.f4221r;
        if (nVar != null && (viewCreateCustomMediaView = nVar.createCustomMediaView(context)) != null) {
            return viewCreateCustomMediaView;
        }
        io.bidmachine.nativead.view.a aVar = new io.bidmachine.nativead.view.a(context);
        aVar.setId(200);
        h hVar = (h) ((p) getAdRequest()).getAdRequestParameters();
        if (hVar.a(MediaAssetType.Image) || hVar.a(MediaAssetType.Video)) {
            aVar.setNativeAdObject(this);
        }
        this.f4208e = aVar;
        return aVar;
    }

    private void w(ViewGroup viewGroup) {
        WeakHashMap weakHashMap = (WeakHashMap) f4204t.get(viewGroup);
        if (weakHashMap != null) {
            for (Map.Entry entry : weakHashMap.entrySet()) {
                if (entry != null && entry.getKey() != null) {
                    ((View) entry.getKey()).setOnClickListener(null);
                }
            }
            f4204t.remove(viewGroup);
        }
    }

    public boolean A() {
        return getProcessCallback().processVisibilityTrackerShown();
    }

    public String B() {
        n nVar = this.f4221r;
        String callToAction = nVar != null ? nVar.getCallToAction() : null;
        return TextUtils.isEmpty(callToAction) ? "Install" : callToAction;
    }

    public String C() {
        n nVar = this.f4221r;
        if (nVar != null) {
            return nVar.getClickUrl();
        }
        return null;
    }

    public String D() {
        n nVar = this.f4221r;
        if (nVar != null) {
            return nVar.getDescription();
        }
        return null;
    }

    public View E(Context context) {
        n nVar;
        if (this.f4209f == null && (nVar = this.f4221r) != null) {
            this.f4209f = nVar.createProviderView(context);
        }
        return this.f4209f;
    }

    public float F() {
        n nVar = this.f4221r;
        if (nVar != null) {
            return nVar.getRating();
        }
        return -1.0f;
    }

    public z G() {
        return this.f4205b;
    }

    public String H() {
        n nVar = this.f4221r;
        if (nVar != null) {
            return nVar.getTitle();
        }
        return null;
    }

    boolean J(ViewGroup viewGroup, View view, s sVar) {
        if (viewGroup == null) {
            io.bidmachine.core.a.c(this.f4205b, "NativeAdView cannot be null. NativeAd is NOT registered");
            return false;
        }
        if (view == null && sVar == null) {
            io.bidmachine.core.a.c(this.f4205b, "ImageView or NativeMediaView cannot be null. NativeAd is NOT registered");
            return false;
        }
        if (view != null && !ae.m.a(viewGroup, view)) {
            io.bidmachine.core.a.c(this.f4205b, "ImageView should belong to NativeAdView");
        }
        if (sVar == null || ae.m.a(viewGroup, sVar)) {
            return true;
        }
        io.bidmachine.core.a.c(this.f4205b, "NativeMediaView should belong to NativeAdView");
        return true;
    }

    void M(ViewGroup viewGroup, View view, s sVar, Set set, RendererConfiguration rendererConfiguration) {
        try {
            if (!J(viewGroup, view, sVar)) {
                getProcessCallback().processShowFail(ae.a.i("Native ad views are invalid"));
                return;
            }
            q(viewGroup, set);
            ImageView imageViewR = r(view);
            s(sVar);
            this.f4207d = viewGroup;
            if (!this.f4215l) {
                getProcessCallback().processStartVisibilityTracker();
                this.f4206c.b(viewGroup, getParams().e(), new a());
                y();
            }
            io.bidmachine.nativead.view.a aVar = this.f4208e;
            if (aVar != null) {
                aVar.P();
                this.f4208e.X();
            }
            n nVar = this.f4221r;
            if (nVar != null) {
                nVar.registerNative(viewGroup, imageViewR, sVar, set);
            }
            t(viewGroup, rendererConfiguration);
            View view2 = this.f4211h;
            if (view2 != null) {
                view2.bringToFront();
            }
            this.f4216m = true;
        } catch (Throwable th2) {
            io.bidmachine.core.a.n(this.f4205b, th2);
            R();
            getProcessCallback().processShowFail(ae.a.l("Exception registering view for native ad object", th2));
        }
    }

    public void P(n nVar) {
        this.f4221r = nVar;
        if (nVar != null) {
            this.f4217n = new ImageDataImpl(nVar.getIcon());
            this.f4218o = new ImageDataImpl(nVar.getMainImage());
        }
    }

    public void R() {
        try {
            this.f4206c.c();
            ViewGroup viewGroup = this.f4207d;
            if (viewGroup != null) {
                O(viewGroup);
                w(this.f4207d);
                this.f4207d = null;
            }
            io.bidmachine.nativead.view.a aVar = this.f4208e;
            if (aVar != null) {
                aVar.Y();
                this.f4208e.V();
                this.f4208e = null;
            }
            n nVar = this.f4221r;
            if (nVar != null) {
                nVar.unregisterNative();
            }
            N();
            this.f4216m = false;
        } catch (Throwable th2) {
            io.bidmachine.core.a.n(this.f4205b, th2);
        }
    }

    @Override // ac.l
    public c9.g a() {
        return this.f4220q;
    }

    @Override // ac.m
    public Drawable b() {
        ImageDataImpl imageDataImpl = this.f4218o;
        if (imageDataImpl != null) {
            return imageDataImpl.getImage();
        }
        return null;
    }

    @Override // ac.l
    public void c(c9.g gVar) {
        this.f4220q = gVar;
    }

    @Override // ac.l
    public void d(Uri uri) {
        ImageDataImpl imageDataImpl = this.f4217n;
        if (imageDataImpl != null) {
            imageDataImpl.setLocalUri(uri);
        }
    }

    @Override // ac.l
    public void e(Uri uri) {
        ImageDataImpl imageDataImpl = this.f4218o;
        if (imageDataImpl != null) {
            imageDataImpl.setLocalUri(uri);
        }
    }

    @Override // ac.l
    public void g(Uri uri) {
        this.f4219p = uri;
    }

    @Override // ac.i
    public LabelData getAdLabelData() {
        n nVar = this.f4221r;
        if (nVar != null) {
            return nVar.getAdLabelData();
        }
        return null;
    }

    @Override // ac.o
    public ImageData getIcon() {
        return this.f4217n;
    }

    @Override // ac.m
    public Uri getIconUri() {
        ImageDataImpl imageDataImpl = this.f4217n;
        if (imageDataImpl != null) {
            return imageDataImpl.getLocalUri();
        }
        return null;
    }

    @Override // ac.o
    public ImageData getMainImage() {
        return this.f4218o;
    }

    @Override // ac.i
    public PrivacySheetData getPrivacySheetData() {
        n nVar = this.f4221r;
        if (nVar != null) {
            return nVar.getPrivacySheetData();
        }
        return null;
    }

    @Override // ac.i
    public String getVideoAdm() {
        n nVar = this.f4221r;
        if (nVar != null) {
            return nVar.getVideoAdm();
        }
        return null;
    }

    @Override // ac.i
    public String getVideoUrl() {
        n nVar = this.f4221r;
        if (nVar != null) {
            return nVar.getVideoUrl();
        }
        return null;
    }

    @Override // ac.m
    public Drawable h() {
        ImageDataImpl imageDataImpl = this.f4217n;
        if (imageDataImpl != null) {
            return imageDataImpl.getImage();
        }
        return null;
    }

    @Override // ac.o
    public boolean hasVideo() {
        if (this.f4219p != null) {
            return true;
        }
        n nVar = this.f4221r;
        return nVar != null && nVar.hasVideo();
    }

    @Override // ac.m
    public Uri i() {
        ImageDataImpl imageDataImpl = this.f4218o;
        if (imageDataImpl != null) {
            return imageDataImpl.getLocalUri();
        }
        return null;
    }

    @Override // ac.m
    public Uri j() {
        return this.f4219p;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        x();
    }

    @Override // io.bidmachine.AdObjectImpl, zb.a
    public void onClicked() {
        super.onClicked();
        String strC = C();
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        Q(getActivity());
        jd.j.c(getApplicationContext(), strC, new u() { // from class: ac.d
            @Override // pd.u
            public final void a(Object obj) {
                this.f4203a.I();
            }

            @Override // pd.u
            public /* synthetic */ void c(Throwable th2) {
                t.b(this, th2);
            }

            @Override // pd.h
            public /* synthetic */ void execute(Object obj) {
                t.a(this, obj);
            }
        });
    }

    @Override // io.bidmachine.AdObjectImpl, zb.a
    public void onDestroy() {
        try {
            super.onDestroy();
            R();
            io.bidmachine.core.h.F(this.f4217n, new Executable() { // from class: ac.e
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((ImageDataImpl) obj).destroy();
                }
            });
            io.bidmachine.core.h.F(this.f4218o, new Executable() { // from class: ac.e
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((ImageDataImpl) obj).destroy();
                }
            });
            io.bidmachine.core.h.F(this.f4221r, new Executable() { // from class: ac.f
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((n) obj).destroy();
                }
            });
            this.f4217n = null;
            this.f4218o = null;
        } catch (Throwable th2) {
            try {
                io.bidmachine.core.a.n(this.f4205b, th2);
            } finally {
                ((ec.b) this.f4222s.get()).b(this.f4205b);
            }
        }
    }

    @Override // io.bidmachine.AdObjectImpl
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public od.m createUnifiedCallback(AdProcessCallback adProcessCallback) {
        return new e(adProcessCallback);
    }

    public void x() {
        getProcessCallback().processClicked();
    }

    public void y() {
        getProcessCallback().processFillAd();
    }

    public void z() {
        getProcessCallback().processVisibilityTrackerImpression();
    }

    @Override // ac.j
    public void f() {
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            g.this.I();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}

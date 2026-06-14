package sg.bigo.ads.ad.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import com.iab.omid.library.bigosg.adsession.media.MediaEvents;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.taurusx.tax.n.z;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.ad.b.f;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.api.a.h;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.api.b.d;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.common.o;
import sg.bigo.ads.common.p.g;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.c.b;
import sg.bigo.ads.core.f.a.a;
import sg.bigo.ads.core.f.a.j;
import sg.bigo.ads.core.f.a.k;
import sg.bigo.ads.core.f.a.l;
import sg.bigo.ads.core.f.a.n;
import sg.bigo.ads.core.f.a.p;
import sg.bigo.ads.core.player.b;

/* JADX INFO: loaded from: classes4.dex */
public class c extends sg.bigo.ads.ad.b.b {

    @Nullable
    public sg.bigo.ads.core.player.c I;

    @Nullable
    public p J;
    public boolean K;
    public b L;
    private b.a O;
    private Pair<Boolean, Boolean> P;
    private AtomicBoolean Q;
    private final a R;
    private f S;
    private final sg.bigo.ads.core.g.c T;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.b.c$4, reason: invalid class name */
    final class AnonymousClass4 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f100220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d.a f100221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ sg.bigo.ads.core.a.a f100222c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ sg.bigo.ads.api.core.b f100223d;

        AnonymousClass4(int i10, d.a aVar, sg.bigo.ads.core.a.a aVar2, sg.bigo.ads.api.core.b bVar) {
            this.f100220a = i10;
            this.f100221b = aVar;
            this.f100222c = aVar2;
            this.f100223d = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f100220a != 0) {
                c.this.B();
                this.f100221b.a(c.this, 1006, this.f100220a, "Invalid media video.");
                return;
            }
            c.this.A();
            c cVar = c.this;
            p pVar = cVar.J;
            if (!c.a(cVar, (int) ((pVar != null ? pVar.f104268s : 0L) / 1000))) {
                this.f100221b.a(c.this, 1032, 1402, "Invalid video duration.");
                return;
            }
            c.this.O = new b.a() { // from class: sg.bigo.ads.ad.b.c.4.1
                @Override // sg.bigo.ads.core.player.b.a
                public final void a() {
                    if (c.this.Q.get() || AnonymousClass4.this.f100222c.bg() == 3 || AnonymousClass4.this.f100222c.bh() != null) {
                        sg.bigo.ads.common.t.a.a(0, 3, "onResourceDownloadBackup", "downloading or backup img is ready, stop to download img");
                        return;
                    }
                    sg.bigo.ads.common.t.a.a(0, 3, "onResourceDownloadBackup", "begin to download backup img");
                    c.this.Q.set(true);
                    final Pair<Boolean, Boolean> pairG = c.this.G();
                    ArrayList arrayList = new ArrayList();
                    if (((Boolean) pairG.first).booleanValue()) {
                        arrayList.add(AnonymousClass4.this.f100222c.bq().f104180b);
                    }
                    String strAT = ((sg.bigo.ads.core.a.a) c.this.f()).aT();
                    if (!TextUtils.isEmpty(strAT) && URLUtil.isNetworkUrl(strAT)) {
                        arrayList.add(AnonymousClass4.this.f100222c.aT());
                    }
                    if (arrayList.size() == 0 && !((Boolean) pairG.second).booleanValue()) {
                        AnonymousClass4.this.f100222c.k(0);
                        return;
                    }
                    AnonymousClass4.this.f100222c.k(3);
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    sg.bigo.ads.common.p.e.a(c.this.f100335b.f102178e, arrayList, anonymousClass4.f100222c.al(), new g() { // from class: sg.bigo.ads.ad.b.c.4.1.1
                        @Override // sg.bigo.ads.common.p.g
                        public final void a(int i10, @NonNull String str, String str2) {
                            AnonymousClass4.this.f100222c.k(1);
                            if (((Boolean) pairG.second).booleanValue()) {
                                VideoController videoController = c.this.getVideoController();
                                if (videoController == null || videoController.getLoadHTMLCallback() == null) {
                                    AnonymousClass4.this.f100222c.bj();
                                } else {
                                    videoController.getLoadHTMLCallback().a();
                                }
                            }
                        }

                        @Override // sg.bigo.ads.common.p.g
                        public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar) {
                            AnonymousClass4.this.f100222c.k(2);
                            AnonymousClass4.this.f100222c.a(new Pair<>(bitmap, fVar.f102683e));
                            VideoController videoController = c.this.getVideoController();
                            if (videoController != null) {
                                videoController.notifyBackupResourceReady();
                            }
                        }
                    });
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void b(int i10) {
                    sg.bigo.ads.core.a.a aVar;
                    int i11;
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    c cVar2 = c.this;
                    if (cVar2.f100338e || cVar2.f100339f) {
                        return;
                    }
                    if (anonymousClass4.f100222c.aO()) {
                        aVar = AnonymousClass4.this.f100222c;
                        i11 = 3;
                    } else {
                        aVar = AnonymousClass4.this.f100222c;
                        i11 = 4;
                    }
                    aVar.h(i11);
                    AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                    anonymousClass42.f100221b.a(c.this, IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, i10, "Failed to download media video.");
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void a(int i10) {
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    final c cVar2 = c.this;
                    final sg.bigo.ads.core.a.a aVar = anonymousClass4.f100222c;
                    if (!cVar2.J() && !cVar2.M && aVar != null && aVar.aR()) {
                        cVar2.M = true;
                        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.ad.b.d.1

                            /* JADX INFO: renamed from: a */
                            final /* synthetic */ sg.bigo.ads.core.a.a f100231a;

                            AnonymousClass1(final sg.bigo.ads.core.a.a aVar2) {
                                aVar = aVar2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    String strB = o.b(d.this.f100335b.f102178e, aVar.aN());
                                    if (TextUtils.isEmpty(strB)) {
                                        return;
                                    }
                                    File file = new File(URI.create(strB));
                                    if (!file.exists() || file.length() <= 0) {
                                        return;
                                    }
                                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                                    d.this.A = sg.bigo.ads.common.w.b.a(bitmapDecodeFile);
                                } catch (Throwable unused) {
                                }
                            }
                        });
                    }
                    c.this.a("is_cache", Boolean.valueOf(i10 == 0));
                    AnonymousClass4.this.f100222c.ba();
                    c.a(c.this);
                    c cVar3 = c.this;
                    if (cVar3.f100338e || cVar3.f100339f) {
                        return;
                    }
                    c.b(cVar3, i10);
                    AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                    anonymousClass42.f100221b.a(c.this);
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void a(String str, sg.bigo.ads.common.h.a aVar) {
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    c cVar2 = c.this;
                    if (cVar2.f100338e || cVar2.f100339f) {
                        return;
                    }
                    anonymousClass4.f100222c.h(2);
                    if (AnonymousClass4.this.f100223d.x() != 1) {
                        AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                        anonymousClass42.f100221b.a(c.this, aVar.d(), IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, 10202, "video download failed and no backup creative resource.", true);
                    } else if (AnonymousClass4.this.f100222c.bh() != null || aVar.d()) {
                        AnonymousClass4 anonymousClass43 = AnonymousClass4.this;
                        anonymousClass43.f100221b.a(c.this);
                    } else {
                        sg.bigo.ads.core.d.b.a(AnonymousClass4.this.f100222c, aVar.f102458b, str, 0L, aVar.f102463g / 1024, 2, "video", aVar.f102471o);
                        AnonymousClass4 anonymousClass44 = AnonymousClass4.this;
                        anonymousClass44.f100221b.a(c.this, IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, 10202, "video download failed and no backup creative resource.");
                    }
                }
            };
            sg.bigo.ads.core.player.b bVarA = sg.bigo.ads.core.player.b.a();
            c cVar2 = c.this;
            bVarA.a(cVar2.f100335b.f102178e, this.f100222c, cVar2.O);
        }
    }

    class a implements AdInteractionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        AdInteractionListener f100228a;

        a() {
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClicked() {
            AdInteractionListener adInteractionListener = this.f100228a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdClicked();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClosed() {
            AdInteractionListener adInteractionListener = this.f100228a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdClosed();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdError(@NonNull AdError adError) {
            if (this.f100228a != null) {
                if (adError.getCode() == 2002 && c.this.p()) {
                    sg.bigo.ads.common.t.a.a(0, 3, "NativeVideoAdImpl", "don't call onAdError when video has impressed");
                } else {
                    this.f100228a.onAdError(adError);
                }
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdImpression() {
            AdInteractionListener adInteractionListener = this.f100228a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdImpression();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdOpened() {
            AdInteractionListener adInteractionListener = this.f100228a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdOpened();
            }
        }
    }

    public interface b {
        void a(String str);
    }

    public c(@NonNull sg.bigo.ads.api.core.f fVar) {
        super(fVar);
        this.Q = new AtomicBoolean(false);
        this.R = new a();
        this.T = new sg.bigo.ads.core.g.c() { // from class: sg.bigo.ads.ad.b.c.1
            @Override // sg.bigo.ads.core.g.c
            public final void a(String str, @Nullable Object obj, @Nullable int[] iArr) {
                c.a(c.this, str, obj, iArr);
            }

            @Override // sg.bigo.ads.core.g.c
            public final void a(String str, @Nullable int[] iArr) {
                c.a(c.this, str, iArr);
            }
        };
    }

    static /* synthetic */ int a(c cVar, String str) {
        if (q.a((CharSequence) str)) {
            return 10074;
        }
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) cVar.f();
        k kVarH = cVar.H();
        p pVarA = kVarH.a(cVar.f100335b.f102178e, str);
        int i10 = kVarH.f104229a;
        String str2 = kVarH.f104231c;
        long j10 = kVarH.f104230b;
        if (i.f102116a.n().a(9) && URLUtil.isHttpUrl(str2)) {
            sg.bigo.ads.core.d.b.a(aVar, i10, str2, j10, 10076, "Invalid http url");
            return 10076;
        }
        if (pVarA != null && pVarA.f104263n != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(pVarA.f104263n.f104206c.hashCode());
            pVarA.f104264o = sb2.toString();
            cVar.I = new sg.bigo.ads.core.player.c(cVar.f100335b.f102178e, pVarA, cVar.f100337d);
            aVar.a(pVarA);
            cVar.J = pVarA;
            cVar.G();
            sg.bigo.ads.core.d.b.a(aVar, i10, j10);
            return 0;
        }
        sg.bigo.ads.core.f.a.e eVar = kVarH.f104232d;
        List<n> list = kVarH.f104233e;
        if (eVar == null) {
            return 10075;
        }
        int i11 = eVar.f104213a;
        if (i11 != 10062) {
        }
        Context context = cVar.f100335b.f102178e;
        sg.bigo.ads.core.f.a.f fVar = sg.bigo.ads.core.f.a.f.XML_PARSING_ERROR;
        sg.bigo.ads.core.player.c.a(context, list);
        sg.bigo.ads.core.d.b.a(aVar, i10, str2, j10, i11, eVar.f104214b);
        return i11;
    }

    @Override // sg.bigo.ads.ad.b.b
    protected final List<sg.bigo.ads.core.c.a> D() {
        List<sg.bigo.ads.core.c.a> list;
        p pVar = this.J;
        return (pVar == null || (list = pVar.C) == null || list.size() <= 0) ? super.D() : list;
    }

    @Override // sg.bigo.ads.ad.b.b
    protected final boolean F() {
        return ((sg.bigo.ads.core.a.a) f()).aR();
    }

    public final Pair<Boolean, Boolean> G() {
        boolean z10;
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) f();
        Pair<Boolean, Boolean> pair = this.P;
        if (pair != null) {
            return pair;
        }
        p pVar = this.J;
        boolean z11 = false;
        if (pVar != null) {
            z10 = false;
            for (sg.bigo.ads.core.f.a.a aVar2 : pVar.A) {
                if (aVar2 != null) {
                    a.C1291a c1291aA = sg.bigo.ads.core.f.a.a.a(aVar2.f104178b);
                    if (!z11 && c1291aA != null && c1291aA.a()) {
                        aVar.a(c1291aA);
                        z11 = true;
                    }
                    a.C1291a c1291aA2 = sg.bigo.ads.core.f.a.a.a(aVar2.f104177a);
                    if (!z10 && c1291aA2 != null && c1291aA2.a()) {
                        aVar.b(c1291aA2);
                        z10 = true;
                    }
                }
            }
        } else {
            z10 = false;
        }
        Pair<Boolean, Boolean> pair2 = new Pair<>(Boolean.valueOf(z11), Boolean.valueOf(z10));
        this.P = pair2;
        return pair2;
    }

    @NonNull
    protected k H() {
        int iG = this.f100335b.f102175b.g();
        h hVar = i.f102116a;
        return new k(iG, (hVar == null || hVar.r() == null) ? 0 : hVar.r().a());
    }

    @Override // sg.bigo.ads.ad.c
    public final void a_() {
        f fVar = this.S;
        if (fVar == null || !fVar.a()) {
            super.a_();
            sg.bigo.ads.common.t.a.a(0, 3, "NativeVideoAdImpl", "BIGOAds impression method");
        }
    }

    @Override // sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public void destroyInMainThread() {
        VideoController videoController = getVideoController();
        if (videoController != null) {
            videoController.setVideoLifeCallback(null);
        }
        super.destroyInMainThread();
        sg.bigo.ads.core.player.c cVar = this.I;
        if (cVar != null) {
            if (cVar.f104680c && !cVar.f104679b) {
                cVar.f104679b = true;
            }
            p pVar = cVar.f104678a;
            if (pVar != null) {
                Iterator<n> it = pVar.f104261l.iterator();
                while (it.hasNext()) {
                    cVar.a(it.next(), "va_des");
                }
            }
            sg.bigo.ads.common.t.a.a(0, 3, "AdTracker", "destroy");
            cVar.f104683f = null;
        }
        f fVar = this.S;
        if (fVar != null) {
            sg.bigo.ads.core.player.b.d dVar = fVar.f100243h;
            if (dVar != null) {
                u.b(dVar);
                fVar.f100243h.d();
                fVar.f100243h = null;
            }
            fVar.f100236a = null;
            fVar.f100238c = null;
            fVar.f100242g = null;
            fVar.f100239d = null;
            this.S = null;
        }
        this.O = null;
    }

    protected boolean e(int i10) {
        return (sg.bigo.ads.api.core.a.e(i10) && this.f100335b.f102175b.h()) || (this instanceof sg.bigo.ads.ad.b.a.b) || this.K;
    }

    @Override // sg.bigo.ads.ad.b.b, sg.bigo.ads.api.NativeAd
    public NativeAd.CreativeType getCreativeType() {
        return NativeAd.CreativeType.VIDEO;
    }

    @Override // sg.bigo.ads.ad.b.b, sg.bigo.ads.api.NativeAd
    @Nullable
    public VideoController getVideoController() {
        MediaView mediaView = ((sg.bigo.ads.ad.b.b) this).E;
        if (mediaView != null) {
            return mediaView.getVideoController();
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.c
    public void h() {
        super.h();
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) f();
        sg.bigo.ads.core.player.c cVar = this.I;
        if (cVar != null) {
            if (!cVar.f104679b) {
                cVar.f104679b = true;
            }
            sg.bigo.ads.core.player.c.a(aVar, 1);
            Iterator<n> it = cVar.f104678a.f104250a.iterator();
            while (it.hasNext()) {
                cVar.a(it.next(), "va_show", aVar);
            }
        }
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.Ad, sg.bigo.ads.api.IconAds
    @CallSuper
    public void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        super.setAdInteractionListener(this.R);
        this.R.f100228a = adInteractionListener;
    }

    static /* synthetic */ void b(c cVar, int i10) {
        ((sg.bigo.ads.core.a.a) cVar.f()).h(i10 != 0 ? i10 != 1 ? i10 != 2 ? 0 : 3 : 4 : 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [sg.bigo.ads.api.core.b] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.c
    public final void a(Point point, int i10, int i11, @NonNull sg.bigo.ads.api.core.d dVar) {
        super.a(point, i10, i11, dVar);
        sg.bigo.ads.core.player.c cVar = this.I;
        if (cVar != 0) {
            cVar.a((sg.bigo.ads.api.core.b) f());
        }
    }

    @Override // sg.bigo.ads.ad.b.b
    public final void a(@NonNull ViewGroup viewGroup, MediaView mediaView, @Nullable ImageView imageView, @Nullable AdOptionsView adOptionsView, @Nullable List<View> list, int i10, @Nullable View... viewArr) {
        super.a(viewGroup, mediaView, imageView, adOptionsView, list, i10, viewArr);
        sg.bigo.ads.core.player.c cVar = this.I;
        if (cVar != null) {
            cVar.f104683f = ((sg.bigo.ads.ad.b.b) this).C;
        }
    }

    static /* synthetic */ void a(c cVar) {
        VideoController videoController = cVar.getVideoController();
        if (videoController != null) {
            videoController.notifyResourceReady();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    static /* synthetic */ void a(c cVar, String str, Object obj, int[] iArr) {
        sg.bigo.ads.core.a.a aVar;
        d.a<T> aVar2;
        aVar = (sg.bigo.ads.core.a.a) cVar.f();
        str.getClass();
        switch (str) {
            case "AdLoaded":
                f fVar = cVar.S;
                if (fVar != null && (aVar2 = fVar.f100240e) != 0) {
                    aVar2.a(fVar.f100236a);
                    break;
                }
                break;
            case "AdVideoThirdQuartile":
                sg.bigo.ads.core.player.c cVar2 = cVar.I;
                if (cVar2 != null) {
                    Iterator<Integer> it = cVar2.f104687j.iterator();
                    while (it.hasNext()) {
                        int iIntValue = it.next().intValue();
                        if (75 >= iIntValue) {
                            if (iIntValue == 75) {
                                sg.bigo.ads.core.c.b bVar = cVar2.f104683f;
                                if (bVar != null) {
                                    bVar.a(b.EnumC1288b.f104001c);
                                }
                                iIntValue = 5;
                            }
                            sg.bigo.ads.core.player.c.a(aVar, iIntValue);
                            it.remove();
                        }
                    }
                    break;
                }
                break;
            case "AdVideoMidpoint":
                sg.bigo.ads.core.player.c cVar3 = cVar.I;
                if (cVar3 != null) {
                    Iterator<Integer> it2 = cVar3.f104687j.iterator();
                    while (it2.hasNext()) {
                        int iIntValue2 = it2.next().intValue();
                        if (50 >= iIntValue2) {
                            if (iIntValue2 == 50) {
                                sg.bigo.ads.core.c.b bVar2 = cVar3.f104683f;
                                if (bVar2 != null) {
                                    bVar2.a(b.EnumC1288b.f104000b);
                                }
                                iIntValue2 = 4;
                            }
                            sg.bigo.ads.core.player.c.a(aVar, iIntValue2);
                            it2.remove();
                        }
                    }
                    break;
                }
                break;
            case "AdVideoFirstQuartile":
                sg.bigo.ads.core.player.c cVar4 = cVar.I;
                if (cVar4 != null) {
                    Iterator<Integer> it3 = cVar4.f104687j.iterator();
                    while (it3.hasNext()) {
                        int iIntValue3 = it3.next().intValue();
                        if (25 >= iIntValue3) {
                            if (iIntValue3 == 25) {
                                sg.bigo.ads.core.c.b bVar3 = cVar4.f104683f;
                                if (bVar3 != null) {
                                    bVar3.a(b.EnumC1288b.f103999a);
                                }
                                iIntValue3 = 3;
                            }
                            sg.bigo.ads.core.player.c.a(aVar, iIntValue3);
                            it3.remove();
                        }
                    }
                    break;
                }
                break;
            case "AdVPAIDClickThru":
                if (iArr != null && iArr.length > 0) {
                    cVar.b(obj instanceof sg.bigo.ads.common.i ? (sg.bigo.ads.common.i) obj : null, 12, 5);
                    break;
                }
                break;
            case "AdError":
                f fVar2 = cVar.S;
                if (fVar2 != null) {
                    String str2 = obj instanceof String ? (String) obj : "VPAID error";
                    d.a<T> aVar3 = fVar2.f100240e;
                    if (aVar3 != 0) {
                        aVar3.a(fVar2.f100236a, 1006, 10222, str2);
                    }
                    break;
                }
                break;
            case "AdVPAIDImpression":
                f fVar3 = cVar.S;
                if (fVar3 != null && fVar3.a()) {
                    sg.bigo.ads.common.t.a.a(0, 3, "NativeVideoAdImpl", "vpaid impression method");
                    super.a_();
                    break;
                }
                break;
            case "AdVideoStart":
                sg.bigo.ads.core.player.c cVar5 = cVar.I;
                if (cVar5 != null) {
                    Iterator<Integer> it4 = cVar5.f104687j.iterator();
                    while (it4.hasNext()) {
                        int iIntValue4 = it4.next().intValue();
                        if (iIntValue4 <= 0) {
                            if (iIntValue4 == 0) {
                                sg.bigo.ads.core.c.b bVar4 = cVar5.f104683f;
                                if (bVar4 != null) {
                                    bVar4.a(cVar5.f104678a.f104268s, cVar5.f104684g ? 0.0f : 1.0f);
                                }
                                iIntValue4 = 2;
                            }
                            sg.bigo.ads.core.player.c.a(aVar, iIntValue4);
                            it4.remove();
                        }
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    static /* synthetic */ void a(c cVar, String str, int[] iArr) {
        VideoController.VideoLifeCallback videoLifeCallback;
        VideoController.d progressChangeListener;
        VideoController.a backupLoadCallback;
        VideoController videoController = cVar.getVideoController();
        if (videoController != null) {
            videoLifeCallback = videoController.getVideoLifeCallback();
            progressChangeListener = videoController.getProgressChangeListener();
            backupLoadCallback = videoController.getBackupLoadCallback();
        } else {
            videoLifeCallback = null;
            progressChangeListener = null;
            backupLoadCallback = null;
        }
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) cVar.f();
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -2104076401:
                if (str.equals("AdClosed")) {
                    b10 = 0;
                }
                break;
            case -1928311131:
                if (str.equals("AdBackupImgReady")) {
                    b10 = 1;
                }
                break;
            case -1844074968:
                if (str.equals("AdLoaded")) {
                    b10 = 2;
                }
                break;
            case -799585545:
                if (str.equals("AdVideoBuffered")) {
                    b10 = 3;
                }
                break;
            case 123005777:
                if (str.equals("AdVideoComplete")) {
                    b10 = 4;
                }
                break;
            case 227130189:
                if (str.equals("AdVolumeChange")) {
                    b10 = 5;
                }
                break;
            case 479049069:
                if (str.equals("AdSkipped")) {
                    b10 = 6;
                }
                break;
            case 488344453:
                if (str.equals("AdError")) {
                    b10 = 7;
                }
                break;
            case 739506502:
                if (str.equals("AdVideoPaused")) {
                    b10 = 8;
                }
                break;
            case 858456394:
                if (str.equals("AdVideoStart")) {
                    b10 = 9;
                }
                break;
            case 982656138:
                if (str.equals("AdVideoBuffering")) {
                    b10 = 10;
                }
                break;
            case 1099014402:
                if (str.equals("AdVideoTooLate")) {
                    b10 = Ascii.VT;
                }
                break;
            case 1746498326:
                if (str.equals("AdVideoPlaying")) {
                    b10 = Ascii.FF;
                }
                break;
            case 1766207024:
                if (str.equals("AdRemainingTimeChange")) {
                    b10 = 13;
                }
                break;
        }
        switch (b10) {
            case 0:
                sg.bigo.ads.core.player.c cVar2 = cVar.I;
                if (cVar2 != null) {
                    cVar2.a(cVar2.f104678a.f104254e, "va_close");
                }
                break;
            case 1:
                if (backupLoadCallback != null) {
                    backupLoadCallback.i(((iArr == null || iArr.length <= 0) ? 0 : iArr[0]) != 0);
                }
                break;
            case 2:
                sg.bigo.ads.core.player.c cVar3 = cVar.I;
                if (cVar3 != null) {
                    cVar3.f104680c = true;
                }
                break;
            case 3:
                if (videoLifeCallback instanceof VideoController.b) {
                    ((VideoController.b) videoLifeCallback).b();
                }
                break;
            case 4:
                if (videoLifeCallback != null) {
                    videoLifeCallback.onVideoEnd();
                }
                sg.bigo.ads.core.player.c cVar4 = cVar.I;
                if (cVar4 != null) {
                    cVar4.a(cVar4.f104678a.f104253d, "va_comp");
                    cVar4.a(cVar4.f104678a.f104251b, "va_prog1");
                    cVar4.a(cVar4.f104678a.f104252c, "va_prog2");
                    if (!cVar4.f104686i) {
                        cVar4.f104686i = true;
                        sg.bigo.ads.core.player.c.a(aVar, 6);
                        sg.bigo.ads.core.c.b bVar = cVar4.f104683f;
                        if (bVar != null) {
                            bVar.a(b.EnumC1288b.f104002d);
                        }
                    }
                }
                if (cVar.e(aVar.x()) && videoController != null) {
                    videoController.play();
                    break;
                }
                break;
            case 5:
                if (iArr != null && iArr.length > 0) {
                    int i10 = iArr[0];
                    if (videoLifeCallback != null) {
                        videoLifeCallback.onMuteChange(i10 == 0);
                    }
                    sg.bigo.ads.core.player.c cVar5 = cVar.I;
                    if (cVar5 != null) {
                        sg.bigo.ads.core.player.c.a(aVar, i10 == 0 ? 7 : 17);
                        p pVar = cVar5.f104678a;
                        if (pVar != null) {
                            Iterator<j> it = pVar.f104256g.iterator();
                            while (it.hasNext()) {
                                j next = it.next();
                                if ((i10 == 0 && next.f104227a) || (i10 == 100 && !next.f104227a)) {
                                    cVar5.a(next, "va_mst");
                                    it.remove();
                                }
                            }
                        }
                        cVar5.f104684g = i10 / 100 == 0;
                        sg.bigo.ads.core.c.b bVar2 = cVar5.f104683f;
                        if (bVar2 != null) {
                            float f10 = i10 / 100.0f;
                            MediaEvents mediaEvents = bVar2.f103986a;
                            if (mediaEvents != null && bVar2.f103987b) {
                                mediaEvents.volumeChange(f10);
                                bVar2.a("video volume change: ".concat(String.valueOf(f10)));
                                break;
                            }
                        }
                    }
                }
                break;
            case 6:
                sg.bigo.ads.core.player.c cVar6 = cVar.I;
                if (cVar6 != null) {
                    cVar6.a(cVar6.f104678a.f104255f, "va_skip");
                    sg.bigo.ads.core.c.b bVar3 = cVar6.f104683f;
                    if (bVar3 != null) {
                        bVar3.b(b.a.f103997e);
                    }
                }
                break;
            case 7:
            case 11:
                sg.bigo.ads.core.player.c cVar7 = cVar.I;
                if (cVar7 != null) {
                    String str2 = sg.bigo.ads.core.f.a.f.GENERAL_LINEAR_AD_ERROR.f104222g;
                    ArrayList<n> arrayList = cVar7.f104678a.f104260k;
                    if (arrayList != null) {
                        Iterator<n> it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            n next2 = it2.next();
                            String str3 = next2.f104245b;
                            if (q.a((CharSequence) str3) || (next2.f104246c && !next2.f104247d)) {
                                sg.bigo.ads.common.t.a.a(0, "VASTController", "invalidate tracking url or is tracked");
                            } else {
                                String strA = sg.bigo.ads.core.player.c.a(str3);
                                String strA2 = q.a((CharSequence) strA) ? "" : q.a(strA, z.f66398w, str2, false);
                                next2.f104246c = true;
                                if (!q.a((CharSequence) strA2)) {
                                    cVar7.f104682e.a(cVar7.f104685h, "va_err", strA2, "bigoad");
                                    sg.bigo.ads.common.t.a.a(0, 3, "VASTController", "Send track info, action: va_err, url: ".concat(String.valueOf(strA2)));
                                }
                            }
                            it2.remove();
                        }
                    }
                    sg.bigo.ads.core.player.c.a(aVar, 16);
                    if (iArr != null) {
                        super.a(2002, 0, "Video error: " + iArr[0], false);
                        b bVar4 = cVar.L;
                        if (bVar4 != null) {
                            bVar4.a("Video error: " + iArr[0]);
                        }
                    }
                }
                break;
            case 8:
                if (videoLifeCallback != null) {
                    videoLifeCallback.onVideoPause();
                }
                sg.bigo.ads.core.player.c cVar8 = cVar.I;
                if (cVar8 != null) {
                    cVar8.f104681d = true;
                    Iterator<n> it3 = cVar8.f104678a.f104257h.iterator();
                    while (it3.hasNext()) {
                        cVar8.a(it3.next(), "va_pau");
                    }
                    sg.bigo.ads.core.c.b bVar5 = cVar8.f104683f;
                    if (bVar5 != null) {
                        bVar5.b(b.a.f103993a);
                    }
                }
                break;
            case 9:
                if (videoLifeCallback != null) {
                    videoLifeCallback.onVideoStart();
                }
                break;
            case 10:
                if (videoLifeCallback instanceof VideoController.b) {
                    ((VideoController.b) videoLifeCallback).a();
                }
                break;
            case 12:
                if (videoLifeCallback != null) {
                    videoLifeCallback.onVideoPlay();
                }
                sg.bigo.ads.core.player.c cVar9 = cVar.I;
                if (cVar9 != null && cVar9.f104681d) {
                    cVar9.f104681d = false;
                    Iterator<n> it4 = cVar9.f104678a.f104258i.iterator();
                    while (it4.hasNext()) {
                        cVar9.a(it4.next(), "va_res");
                    }
                    sg.bigo.ads.core.c.b bVar6 = cVar9.f104683f;
                    if (bVar6 != null) {
                        bVar6.b(b.a.f103994b);
                    }
                    break;
                }
                break;
            case 13:
                if (iArr != null && iArr.length > 2) {
                    sg.bigo.ads.core.player.c cVar10 = cVar.I;
                    if (cVar10 != null && iArr.length > 2) {
                        int i11 = iArr[0];
                        int i12 = iArr[2];
                        Iterator<l> it5 = cVar10.f104678a.f104251b.iterator();
                        while (it5.hasNext()) {
                            l next3 = it5.next();
                            if (i12 >= next3.f104242a) {
                                cVar10.a(next3, "va_prog1");
                                it5.remove();
                            }
                        }
                        Iterator<sg.bigo.ads.core.f.a.c> it6 = cVar10.f104678a.f104252c.iterator();
                        while (it6.hasNext()) {
                            sg.bigo.ads.core.f.a.c next4 = it6.next();
                            if (i11 >= next4.f104211a) {
                                cVar10.a(next4, "va_prog2");
                                it6.remove();
                            }
                        }
                        Iterator<Integer> it7 = cVar10.f104688k.iterator();
                        while (it7.hasNext()) {
                            int iIntValue = it7.next().intValue();
                            if (i11 >= iIntValue) {
                                if (iIntValue == 2000) {
                                    iIntValue = 11;
                                } else if (iIntValue == 3000) {
                                    iIntValue = 12;
                                } else if (iIntValue == 5000) {
                                    iIntValue = 13;
                                } else if (iIntValue == 8000) {
                                    iIntValue = 14;
                                } else if (iIntValue == 10000) {
                                    iIntValue = 15;
                                }
                                sg.bigo.ads.core.player.c.a(aVar, iIntValue);
                                it7.remove();
                            }
                        }
                        Iterator<Integer> it8 = cVar10.f104687j.iterator();
                        while (it8.hasNext()) {
                            int iIntValue2 = it8.next().intValue();
                            if (i12 >= iIntValue2) {
                                if (iIntValue2 == 0) {
                                    sg.bigo.ads.core.c.b bVar7 = cVar10.f104683f;
                                    if (bVar7 != null) {
                                        bVar7.a(cVar10.f104678a.f104268s, cVar10.f104684g ? 0.0f : 1.0f);
                                    }
                                    iIntValue2 = 2;
                                } else if (iIntValue2 == 25) {
                                    sg.bigo.ads.core.c.b bVar8 = cVar10.f104683f;
                                    if (bVar8 != null) {
                                        bVar8.a(b.EnumC1288b.f103999a);
                                    }
                                    iIntValue2 = 3;
                                } else if (iIntValue2 == 50) {
                                    sg.bigo.ads.core.c.b bVar9 = cVar10.f104683f;
                                    if (bVar9 != null) {
                                        bVar9.a(b.EnumC1288b.f104000b);
                                    }
                                    iIntValue2 = 4;
                                } else if (iIntValue2 == 75) {
                                    sg.bigo.ads.core.c.b bVar10 = cVar10.f104683f;
                                    if (bVar10 != null) {
                                        bVar10.a(b.EnumC1288b.f104001c);
                                    }
                                    iIntValue2 = 5;
                                }
                                sg.bigo.ads.core.player.c.a(aVar, iIntValue2);
                                it8.remove();
                            }
                        }
                    }
                    if (progressChangeListener != null) {
                        progressChangeListener.a(iArr[0], iArr[1]);
                    }
                    break;
                }
                break;
        }
    }

    @Override // sg.bigo.ads.ad.b.b
    public void a(@Nullable MediaView mediaView) {
        f fVar;
        if (this.J == null || mediaView == null) {
            return;
        }
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) f();
        if (!aVar.aS() || (fVar = this.S) == null) {
            mediaView.a(aVar, this.J, this.T);
            a(mediaView.getVideoController(), this.f100335b.f102175b.i());
            return;
        }
        boolean zI = this.f100335b.f102175b.i();
        if (fVar.f100239d != null) {
            mediaView.a(fVar.f100243h);
            VideoController videoController = mediaView.getVideoController();
            if (videoController != null) {
                videoController.mute(zI);
            }
        }
    }

    protected void a(VideoController videoController, boolean z10) {
        if (videoController != null) {
            videoController.mute(z10);
        }
    }

    @Override // sg.bigo.ads.ad.b.b
    public void a(@NonNull final d.a<NativeAd> aVar, int i10) {
        sg.bigo.ads.api.a.j jVarN;
        final sg.bigo.ads.api.core.b bVar = this.f100335b.f102174a;
        if (!(bVar instanceof sg.bigo.ads.core.a.a)) {
            aVar.a(this, 1030, 1400, "NativeVideo with invalid AdData class type.");
            return;
        }
        n.c cVarAy = ((sg.bigo.ads.core.a.a) bVar).ay();
        if (cVarAy == null) {
            aVar.a(this, 1031, 1401, "Missing media video.");
            return;
        }
        final String strC = cVarAy.c();
        h hVar = i.f102116a;
        if (hVar == null || (jVarN = hVar.n()) == null || !jVarN.a(14)) {
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.ad.b.c.3
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.a(aVar, bVar, c.a(c.this, strC), false);
                }
            });
        } else {
            sg.bigo.ads.common.u.a.e.f().execute(new Runnable() { // from class: sg.bigo.ads.ad.b.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.a(aVar, bVar, c.a(c.this, strC), true);
                }
            });
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    protected void a(@NonNull d.a<NativeAd> aVar, @NonNull sg.bigo.ads.api.core.b bVar, int i10, boolean z10) {
        m mVarE;
        sg.bigo.ads.core.a.a aVar2 = (sg.bigo.ads.core.a.a) f();
        if (!aVar2.aS()) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(i10, aVar, aVar2, bVar);
            if (z10) {
                sg.bigo.ads.common.n.d.a(1, anonymousClass4);
                return;
            } else {
                anonymousClass4.run();
                return;
            }
        }
        this.f102140ac.f102212a = aVar2.bs();
        f fVar = new f(this.f100335b.f102178e, this.T, aVar2, this.J, aVar, this);
        this.S = fVar;
        int iX = fVar.f100238c.x();
        if (iX == 1 || iX == 2 || !(iX == 3 || iX == 4 || (iX == 12 ? !((mVarE = fVar.f100238c.e()) == null || 6 != mVarE.a("video_play_page.ad_component_layout", 1)) : iX == 20))) {
            fVar.f100240e.a(fVar.f100236a, 1006, 10066, "Failed to support VPAID.");
            return;
        }
        f.AnonymousClass1 anonymousClass1 = new f.AnonymousClass1(i10);
        if (z10) {
            sg.bigo.ads.common.n.d.a(1, anonymousClass1);
        } else {
            anonymousClass1.run();
        }
    }

    static /* synthetic */ boolean a(c cVar, int i10) {
        return ((sg.bigo.ads.core.a.a) cVar.f()).x() != 4 || i10 >= 5;
    }
}

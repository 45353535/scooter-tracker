package sg.bigo.ads.ad.interstitial.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.b.a;
import sg.bigo.ads.ad.interstitial.multi_img.view.d;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes4.dex */
public class m extends a {
    protected LinearLayout A;
    protected sg.bigo.ads.ad.interstitial.multi_img.view.c B;
    protected sg.bigo.ads.ad.interstitial.multi_img.view.c C;
    protected sg.bigo.ads.ad.interstitial.multi_img.a D;
    protected sg.bigo.ads.ad.interstitial.multi_img.view.b E;
    protected sg.bigo.ads.ad.interstitial.multi_img.b F;
    private final Set<sg.bigo.ads.ad.interstitial.multi_img.view.d> G;
    private final a.InterfaceC1206a H;
    private final AtomicBoolean I;
    private final List<Runnable> J;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected ViewFlow f100985x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected Indicator f100986y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected RoundedFrameLayout f100987z;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.d.m$6, reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f101013a;

        static {
            int[] iArr = new int[sg.bigo.ads.ad.interstitial.multi_img.d.values().length];
            f101013a = iArr;
            try {
                iArr[sg.bigo.ads.ad.interstitial.multi_img.d.LTR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f101013a[sg.bigo.ads.ad.interstitial.multi_img.d.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f101013a[sg.bigo.ads.ad.interstitial.multi_img.d.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f101013a[sg.bigo.ads.ad.interstitial.multi_img.d.TILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public m(@NonNull sg.bigo.ads.ad.b.b bVar) {
        super(bVar);
        this.G = new HashSet();
        this.H = new a.InterfaceC1206a() { // from class: sg.bigo.ads.ad.interstitial.d.m.1
            @Override // sg.bigo.ads.ad.b.a.InterfaceC1206a
            public final boolean a() {
                ViewFlow viewFlow = m.this.f100985x;
                if (viewFlow != null) {
                    return viewFlow.f102958h;
                }
                return false;
            }
        };
        this.I = new AtomicBoolean(false);
        this.J = new ArrayList();
    }

    public final void A() {
        int iA = this.f100985x.a(this.E.f101531j);
        if (iA < 0 || iA == this.f100985x.getCurrentItem()) {
            return;
        }
        this.f100985x.b(iA);
    }

    @Nullable
    public final sg.bigo.ads.api.a.m B() {
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.F;
        if (bVar != null) {
            return bVar.f101450a;
        }
        return null;
    }

    public boolean C() {
        return E() == sg.bigo.ads.ad.interstitial.multi_img.d.NONE;
    }

    protected int D() {
        return w();
    }

    protected sg.bigo.ads.ad.interstitial.multi_img.d E() {
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.F;
        return bVar != null ? bVar.f101451b : sg.bigo.ads.ad.interstitial.multi_img.d.NONE;
    }

    protected sg.bigo.ads.ad.interstitial.multi_img.c F() {
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.F;
        return bVar != null ? bVar.f101453d : sg.bigo.ads.ad.interstitial.multi_img.c.FILL_MATCH_SELF;
    }

    protected final void G() {
        this.I.set(true);
    }

    protected final void H() {
        this.I.set(false);
        if (sg.bigo.ads.ad.interstitial.multi_img.f.a(this.f100985x)) {
            sg.bigo.ads.ad.interstitial.multi_img.f.a(this.f100985x, new ValueCallback<Integer>() { // from class: sg.bigo.ads.ad.interstitial.d.m.14
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Integer num) {
                    Iterator it = m.this.J.iterator();
                    while (it.hasNext()) {
                        m.this.f100985x.post((Runnable) it.next());
                    }
                    m.this.J.clear();
                    sg.bigo.ads.ad.interstitial.multi_img.f.a(m.this.f100985x, (ValueCallback<Integer>) null);
                }
            });
            return;
        }
        Iterator<Runnable> it = this.J.iterator();
        while (it.hasNext()) {
            this.f100985x.post(it.next());
        }
        this.J.clear();
    }

    protected void I() {
        if (C()) {
            return;
        }
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.F;
        int iA = bVar != null ? bVar.f101450a.a("video_play_page.multi_guide") : 0;
        switch (iA) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                a(iA, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.m.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.this.f100985x.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.m.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                m mVar = m.this;
                                if (mVar.f100985x.f102957g) {
                                    return;
                                }
                                m.a(mVar, 3L, 0L, 300L);
                            }
                        });
                    }
                });
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                this.f100985x.setFlipInterval((iA - 5) * 1000);
                this.f100985x.c();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void J() {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.d.m.J():void");
    }

    protected final boolean K() {
        View viewA;
        ViewFlow viewFlow = this.f100985x;
        if (viewFlow == null) {
            return false;
        }
        List<View> items = viewFlow.getItems();
        if (sg.bigo.ads.common.utils.k.a((Collection) items) || items.size() != 1 || (viewA = this.f100985x.a(0)) == null) {
            return false;
        }
        Object tag = viewA.getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.f101525e);
        if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
            sg.bigo.ads.ad.interstitial.multi_img.view.d dVar = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag;
            sg.bigo.ads.ad.interstitial.multi_img.c cVar = sg.bigo.ads.ad.interstitial.multi_img.c.FILL_MATCH_PARENT;
            dVar.a(cVar);
            dVar.a(4);
            this.f100985x.setViewStyle(3);
            ((ViewFlow.b) viewA.getLayoutParams()).f102997d = cVar.f101470d;
            return true;
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a, sg.bigo.ads.ad.interstitial.t
    public final void f() {
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.E;
        if (bVar != null) {
            ((MediaView) bVar.f101533l).c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final ViewGroup k() {
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.E;
        if (bVar != null) {
            return bVar.f101532k;
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final MediaView l() {
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.E;
        if (bVar != null) {
            return (MediaView) bVar.f101533l;
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final Button m() {
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.E;
        if (bVar != null) {
            return bVar.f101515a;
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final void p() {
        super.p();
        synchronized (this.G) {
            try {
                if (!this.G.isEmpty()) {
                    final HashSet hashSet = new HashSet(this.G);
                    this.G.clear();
                    a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.d.m.11
                        @Override // android.webkit.ValueCallback
                        public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                            Bitmap bitmap2 = bitmap;
                            if (bitmap2 == null) {
                                synchronized (m.this.G) {
                                    m.this.G.addAll(hashSet);
                                }
                                return;
                            }
                            for (sg.bigo.ads.ad.interstitial.multi_img.view.d dVar : hashSet) {
                                if (dVar instanceof sg.bigo.ads.ad.interstitial.multi_img.view.b) {
                                    ((sg.bigo.ads.ad.interstitial.multi_img.view.b) dVar).a(bitmap2);
                                } else if (dVar instanceof sg.bigo.ads.ad.interstitial.multi_img.view.a) {
                                    ((sg.bigo.ads.ad.interstitial.multi_img.view.a) dVar).a(bitmap2);
                                }
                            }
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    protected final void r() {
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    protected final void s() {
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @CallSuper
    protected void t() {
        m mVar = this;
        super.t();
        Context context = mVar.f100916q.getContext();
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = mVar.F;
        List<String> listA = bVar != null ? bVar.a() : null;
        sg.bigo.ads.ad.interstitial.multi_img.b bVar2 = mVar.F;
        boolean z10 = bVar2 != null && bVar2.f101454e;
        sg.bigo.ads.ad.interstitial.multi_img.d dVarE = mVar.E();
        sg.bigo.ads.ad.interstitial.multi_img.c cVarF = mVar.F();
        sg.bigo.ads.common.p pVarA = sg.bigo.ads.ad.interstitial.r.a(((sg.bigo.ads.ad.interstitial.t) mVar).f101734c);
        mVar.f100985x = (ViewFlow) mVar.f100916q.findViewById(R.id.inter_media_ad_view_flow);
        mVar.f100986y = (Indicator) mVar.f100916q.findViewById(R.id.inter_vf_indicator);
        int iX = mVar.x();
        if (iX == 3 || iX == 4) {
            mVar.D = new sg.bigo.ads.ad.interstitial.multi_img.a(mVar.f100916q, mVar.f100985x, mVar.f100914o, iX);
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar3 = new sg.bigo.ads.ad.interstitial.multi_img.view.b(context, cVarF, mVar.z(), mVar.w(), iX);
        mVar.E = bVar3;
        mVar.f100987z = bVar3.f101531j;
        ((MediaView) bVar3.f101533l).setImageBlurBorder(false);
        mVar.E.a(pVarA.f102604b, pVarA.f102605c);
        if (mVar.E.b()) {
            final boolean zAR = ((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.interstitial.t) mVar).f101734c.f()).aR();
            if (zAR) {
                synchronized (mVar.G) {
                    mVar.G.add(mVar.E);
                }
            }
            if (mVar.D != null) {
                mVar.E.f101539r = new d.a() { // from class: sg.bigo.ads.ad.interstitial.d.m.8
                    @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                    public final void a() {
                        m mVar2 = m.this;
                        m.this.D.a(mVar2.f100985x.a(mVar2.E.f101531j));
                    }

                    @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                    public final void b() {
                        m.this.E.f101539r = null;
                        a();
                    }
                };
            }
            mVar.a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.d.m.9
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                    Bitmap bitmap2 = bitmap;
                    if (bitmap2 != null) {
                        if (zAR) {
                            synchronized (m.this.G) {
                                m.this.G.remove(m.this.E);
                            }
                        }
                        m.this.E.a(bitmap2);
                    }
                }
            });
        }
        mVar.A = (LinearLayout) mVar.f100916q.findViewById(R.id.inter_media_bottom_layout);
        if (sg.bigo.ads.common.utils.q.a((CharSequence) ((sg.bigo.ads.ad.interstitial.t) mVar).f101734c.getWarning())) {
            ((ViewGroup.MarginLayoutParams) mVar.A.getLayoutParams()).topMargin = sg.bigo.ads.common.utils.e.a(context, 8);
        }
        mVar.a(mVar.f100915p);
        if (mVar.F != null) {
            mVar.f100985x.setDividerWidth(sg.bigo.ads.common.utils.e.a(context, dVarE.f101478f));
            mVar.f100985x.setContentMaxWidthSpace(sg.bigo.ads.common.utils.e.a(context, dVarE.f101481i));
            mVar.f100985x.setViewStyle(dVarE.f101482j);
            mVar.f100985x.setOnItemChangeListener(new sg.bigo.ads.ad.interstitial.multi_img.f(dVarE, mVar.f100986y, mVar.D));
            int i10 = 0;
            int i11 = 0;
            while (listA != null && i11 < listA.size()) {
                String str = listA.get(i11);
                if (!TextUtils.isEmpty(str) && URLUtil.isNetworkUrl(str)) {
                    mVar.a(context, cVarF, iX, str, ((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.interstitial.t) mVar).f101734c.f()).al());
                    i10++;
                }
                i11++;
                mVar = this;
            }
            int iMax = Math.max(dVarE == sg.bigo.ads.ad.interstitial.multi_img.d.CENTER ? 2 - i10 : 0, 0);
            if (z10) {
                iMax = Math.max(iMax, 1);
            }
            int i12 = 0;
            while (i12 < iMax) {
                int i13 = i10 + 1;
                final sg.bigo.ads.ad.interstitial.multi_img.view.a aVarA = a(context, cVarF, iX, (String) null, false);
                final boolean zAR2 = ((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.interstitial.t) this).f101734c.f()).aR();
                if (zAR2) {
                    synchronized (this.G) {
                        this.G.add(aVarA);
                    }
                }
                a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.d.m.10
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                        Bitmap bitmap2 = bitmap;
                        if (bitmap2 != null) {
                            if (zAR2) {
                                synchronized (m.this.G) {
                                    m.this.G.remove(aVarA);
                                }
                            }
                            aVarA.a(bitmap2);
                        }
                    }
                });
                i12++;
                i10 = i13;
            }
            mVar = this;
            sg.bigo.ads.ad.interstitial.multi_img.d dVar = sg.bigo.ads.ad.interstitial.multi_img.d.CENTER;
            int i14 = dVarE == dVar ? i10 >> 1 : 0;
            ViewFlow.b bVar4 = new ViewFlow.b();
            bVar4.f102994a = pVarA.f102604b;
            bVar4.f102995b = pVarA.f102605c;
            bVar4.f102996c = true;
            bVar4.f102997d = cVarF.f101470d;
            mVar.f100985x.addView(mVar.f100987z, Math.max(0, i14), bVar4);
            int i15 = AnonymousClass6.f101013a[dVarE.ordinal()];
            if (i15 == 1 || i15 == 2 || i15 == 3 || i15 == 4) {
                ViewFlow.d dVar2 = new ViewFlow.d() { // from class: sg.bigo.ads.ad.interstitial.d.m.3
                    @Override // sg.bigo.ads.common.view.ViewFlow.d
                    public final void a() {
                        ((sg.bigo.ads.ad.interstitial.t) m.this).f101734c.a((sg.bigo.ads.common.i) null, 8, 29);
                    }
                };
                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context, true);
                mVar.B = cVar;
                mVar.f100985x.setStartView(cVar.f101518a);
                mVar.f100985x.setOnStartViewShowListener(dVar2);
                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context, false);
                mVar.C = cVar2;
                mVar.f100985x.setEndView(cVar2.f101518a);
                mVar.f100985x.setOnEndViewShowListener(dVar2);
            }
            int iA = dVarE == dVar ? mVar.f100985x.a(mVar.f100987z) : 0;
            mVar.f100985x.b(iA);
            sg.bigo.ads.ad.interstitial.multi_img.a aVar = mVar.D;
            if (aVar != null) {
                aVar.b(iA);
            }
        }
        mVar.b(mVar.y());
        mVar.I();
    }

    protected boolean z() {
        return false;
    }

    private sg.bigo.ads.ad.interstitial.multi_img.view.a a(Context context, sg.bigo.ads.ad.interstitial.multi_img.c cVar, int i10, String str, boolean z10) {
        final sg.bigo.ads.ad.interstitial.multi_img.view.a aVar = new sg.bigo.ads.ad.interstitial.multi_img.view.a(context, this.F, cVar, D(), i10, str, z10, new ValueCallback<sg.bigo.ads.ad.interstitial.multi_img.view.a>() { // from class: sg.bigo.ads.ad.interstitial.d.m.4
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(sg.bigo.ads.ad.interstitial.multi_img.view.a aVar2) {
                final sg.bigo.ads.ad.interstitial.multi_img.view.a aVar3 = aVar2;
                m.this.a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.d.m.4.1
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                        Bitmap bitmap2 = bitmap;
                        if (bitmap2 != null) {
                            synchronized (m.this.G) {
                                m.this.G.remove(aVar3);
                            }
                            aVar3.a(bitmap2);
                        }
                    }
                });
            }
        });
        ViewFlow.b bVar = new ViewFlow.b();
        bVar.f102994a = -1;
        bVar.f102995b = -1;
        bVar.f102996c = false;
        bVar.f102997d = cVar.f101470d;
        this.f100985x.addView(aVar.f101531j, bVar);
        if (this.D != null) {
            aVar.f101539r = new d.a() { // from class: sg.bigo.ads.ad.interstitial.d.m.5
                @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                public final void a() {
                    m.this.D.a(m.this.f100985x.a(aVar.f101531j));
                }

                @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                public final void b() {
                    aVar.f101539r = null;
                    a();
                }
            };
        }
        return aVar;
    }

    protected void b(int i10) {
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    protected void a(double d10) {
        if (d10 <= 3.0d) {
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar = this.B;
            if (cVar != null) {
                cVar.a(false);
            }
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = this.C;
            if (cVar2 != null) {
                cVar2.a(false);
                return;
            }
            return;
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar3 = this.B;
        if (cVar3 != null) {
            cVar3.a(true);
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar4 = this.C;
        if (cVar4 != null) {
            cVar4.a(true);
        }
    }

    protected void a(int i10, boolean z10, int i11, boolean z11) {
        T t10;
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.E;
        if (bVar == null || (t10 = bVar.f101533l) == 0) {
            return;
        }
        if (z11) {
            sg.bigo.ads.ad.b.a.a(this.f100916q, t10, 8, ((sg.bigo.ads.ad.interstitial.t) this).f101734c, this.H);
        } else {
            sg.bigo.ads.ad.b.a.a(this.f100916q, t10, 8, ((sg.bigo.ads.ad.interstitial.t) this).f101734c, i11);
        }
        if (z10) {
            ((MediaView) this.E.f101533l).setMediaAreaClickable(true);
            ((MediaView) this.E.f101533l).b().a(false);
        } else {
            ((MediaView) this.E.f101533l).setMediaAreaClickable(false);
            ((MediaView) this.E.f101533l).b().a(true);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.t
    public final void a(@NonNull ViewGroup viewGroup, @NonNull View view, final t.a aVar, int i10, int i11, int i12, @Nullable View... viewArr) {
        super.a(viewGroup, view, new t.a() { // from class: sg.bigo.ads.ad.interstitial.d.m.7
            @Override // sg.bigo.ads.ad.interstitial.t.a
            public final Pair<String, String> a(@NonNull TextView textView, @Nullable String str, @Nullable String str2) {
                if (textView != null && textView.getTag() == 2 && sg.bigo.ads.common.utils.q.a((CharSequence) str2)) {
                    str2 = ((sg.bigo.ads.ad.interstitial.t) m.this).f101734c.getDescription();
                }
                t.a aVar2 = aVar;
                return aVar2 != null ? aVar2.a(textView, str, str2) : Pair.create(str, str2);
            }
        }, i10, i11, i12, viewArr);
        J();
    }

    public final void a(sg.bigo.ads.ad.interstitial.a aVar, @NonNull ViewGroup viewGroup, @NonNull sg.bigo.ads.ad.interstitial.w wVar, @NonNull sg.bigo.ads.ad.interstitial.multi_img.b bVar, sg.bigo.ads.ad.interstitial.f fVar) {
        this.F = bVar;
        a(aVar, viewGroup, wVar, bVar.f101450a, fVar);
    }

    static /* synthetic */ void a(m mVar, final long j10, long j11, final long j12) {
        if (j10 > 0) {
            ViewFlow viewFlow = mVar.f100985x;
            if (!viewFlow.f102957g && !viewFlow.e()) {
                mVar.f100985x.setScrollEnabled(false);
                int iA = sg.bigo.ads.common.utils.e.a(mVar.f100916q.getContext(), 40);
                final int scrollX = mVar.f100985x.getScrollX();
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iA, 0);
                valueAnimatorOfInt.setDuration(2 * j12);
                valueAnimatorOfInt.setStartDelay(j11);
                valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                final AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: sg.bigo.ads.ad.interstitial.d.m.12
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        m.a(m.this, j10 - 1, 300L, j12);
                    }
                };
                valueAnimatorOfInt.addListener(animatorListenerAdapter);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.ad.interstitial.d.m.13
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (atomicBoolean.get()) {
                            return;
                        }
                        if (m.this.I.get()) {
                            atomicBoolean.set(true);
                            valueAnimator.removeListener(animatorListenerAdapter);
                            valueAnimator.cancel();
                            m.this.J.add(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.m.13.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AnonymousClass13 anonymousClass13 = AnonymousClass13.this;
                                    m.a(m.this, j10, 300L, j12);
                                }
                            });
                            return;
                        }
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if (animatedValue instanceof Integer) {
                            m.this.f100985x.scrollTo(scrollX + ((Integer) animatedValue).intValue(), m.this.f100985x.getScrollY());
                        }
                    }
                });
                valueAnimatorOfInt.start();
                return;
            }
        }
        mVar.f100985x.setScrollEnabled(true);
    }

    protected void a(sg.bigo.ads.ad.interstitial.q qVar) {
    }
}

package sg.bigo.ads.ad;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.api.core.f;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d<T extends Ad, U extends sg.bigo.ads.api.core.b> extends c<T, U> {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    protected d<T, U>.a f100435y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f100436z;

    public final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f100442f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f100443g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f100444h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f100445i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f100446j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f100447k = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f100437a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f100438b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f100439c = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f100448l = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Runnable f100440d = new Runnable() { // from class: sg.bigo.ads.ad.d.a.1
            @Override // java.lang.Runnable
            public final void run() {
                View view;
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f100342i || ((aVar.f100438b && aVar.f100439c) || (view = dVar.f100336c) == null)) {
                    aVar.a();
                    return;
                }
                Rect rect = new Rect();
                boolean z10 = sg.bigo.ads.common.ab.a.a(view, rect) || (d.this.p() && sg.bigo.ads.api.core.a.b(d.this.q()));
                if (z10) {
                    a aVar2 = a.this;
                    if (aVar2.f100437a == -1) {
                        aVar2.f100437a = u.a(view) ? 1 : 0;
                    }
                }
                if (z10) {
                    a aVar3 = a.this;
                    if (!aVar3.f100438b) {
                        a.a(aVar3, rect);
                    }
                    a aVar4 = a.this;
                    if (!aVar4.f100439c) {
                        a.b(aVar4, rect);
                    }
                }
                a aVar5 = a.this;
                if (aVar5.f100438b && aVar5.f100439c) {
                    aVar5.a();
                } else {
                    sg.bigo.ads.common.n.d.a(2, aVar5.f100440d, 500L);
                }
            }
        };

        protected a() {
        }

        private float a(@NonNull Rect rect) {
            d dVar = d.this;
            if (dVar.f100336c == null || sg.bigo.ads.api.core.a.b(dVar.f100335b.f102174a.x())) {
                return 0.0f;
            }
            float height = d.this.f100336c.getHeight() * 1.0f * d.this.f100336c.getWidth();
            float fHeight = rect.height() * 1.0f * rect.width();
            if (height <= 0.0f) {
                return 0.0f;
            }
            return fHeight / height;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        static /* synthetic */ void b(sg.bigo.ads.ad.d.a r9, android.graphics.Rect r10) {
            /*
                r0 = 1
                long r1 = r9.f100446j
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 != 0) goto Lf
                long r1 = android.os.SystemClock.elapsedRealtime()
                r9.f100446j = r1
            Lf:
                float r10 = r9.a(r10)
                sg.bigo.ads.ad.d r1 = sg.bigo.ads.ad.d.this
                android.view.View r2 = r1.f100336c
                int r1 = r1.q()
                sg.bigo.ads.ad.d r3 = sg.bigo.ads.ad.d.this
                int r3 = r3.r()
                if (r2 == 0) goto L6f
                int r4 = r2.getMeasuredWidth()
                if (r4 <= 0) goto L6f
                int r4 = r2.getMeasuredHeight()
                if (r4 <= 0) goto L6f
                int r4 = r2.getHeight()
                int r2 = r2.getWidth()
                int r4 = r4 * r2
                r2 = 1050253722(0x3e99999a, float:0.3)
                r5 = 242000(0x3b150, float:3.39114E-40)
                r6 = 2
                r7 = 1056964608(0x3f000000, float:0.5)
                if (r1 == r0) goto L5c
                if (r1 == r6) goto L50
                r8 = 3
                if (r1 == r8) goto L81
                r8 = 4
                if (r1 == r8) goto L81
                r8 = 12
                if (r1 == r8) goto L5c
                goto L6f
            L50:
                if (r4 <= r5) goto L57
                int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r1 <= 0) goto L6f
                goto L81
            L57:
                int r1 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r1 <= 0) goto L6f
                goto L81
            L5c:
                if (r3 != r6) goto L63
                int r1 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r1 <= 0) goto L6f
                goto L81
            L63:
                if (r4 <= r5) goto L6a
                int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r1 <= 0) goto L6f
                goto L81
            L6a:
                int r1 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r1 <= 0) goto L6f
                goto L81
            L6f:
                sg.bigo.ads.ad.d r1 = sg.bigo.ads.ad.d.this
                int r1 = r1.q()
                boolean r1 = sg.bigo.ads.api.core.a.b(r1)
                if (r1 == 0) goto La4
                sg.bigo.ads.ad.d r1 = sg.bigo.ads.ad.d.this
                boolean r1 = r1.f100341h
                if (r1 != 0) goto La4
            L81:
                long r1 = android.os.SystemClock.elapsedRealtime()
                long r3 = r9.f100446j
                long r1 = r1 - r3
                long r3 = r9.f100443g
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 < 0) goto La4
                sg.bigo.ads.ad.d r1 = sg.bigo.ads.ad.d.this
                java.lang.Float r10 = java.lang.Float.valueOf(r10)
                java.lang.Object[] r2 = new java.lang.Object[r0]
                r3 = 0
                r2[r3] = r10
                java.lang.String r10 = "%.4f"
                java.lang.String r10 = sg.bigo.ads.common.utils.q.a(r10, r2)
                r1.d(r10)
                r9.f100439c = r0
            La4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.d.a.b(sg.bigo.ads.ad.d$a, android.graphics.Rect):void");
        }

        public final void a() {
            sg.bigo.ads.common.n.d.a(this.f100440d);
            this.f100448l = false;
        }

        public final void a(final View view, boolean z10) {
            d.this.f100336c = view;
            if (view == null) {
                return;
            }
            if (z10) {
                sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.d.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.a(a.this);
                    }
                });
            } else {
                view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: sg.bigo.ads.ad.d.a.3
                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view2) {
                        a.a(a.this);
                        view.removeOnAttachStateChangeListener(this);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view2) {
                        a.this.a();
                    }
                });
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static /* synthetic */ void a(sg.bigo.ads.ad.d.a r6) {
            /*
                boolean r0 = r6.f100448l
                if (r0 != 0) goto L61
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.ad.d.this
                int r0 = r0.r()
                r1 = 2
                if (r0 != r1) goto L14
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.ad.d.this
                long r2 = sg.bigo.ads.ad.d.a(r0)
                goto L1a
            L14:
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.ad.d.this
                long r2 = sg.bigo.ads.ad.d.b(r0)
            L1a:
                r6.f100442f = r2
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.ad.d.this
                int r0 = r0.r()
                if (r0 != r1) goto L2b
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.ad.d.this
                int r0 = sg.bigo.ads.ad.d.c(r0)
                goto L31
            L2b:
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.ad.d.this
                int r0 = sg.bigo.ads.ad.d.d(r0)
            L31:
                r6.f100444h = r0
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.ad.d.this
                int r0 = r0.q()
                sg.bigo.ads.ad.d r2 = sg.bigo.ads.ad.d.this
                int r2 = r2.r()
                r3 = 1000(0x3e8, float:1.401E-42)
                r4 = 1
                if (r0 == r4) goto L52
                if (r0 == r1) goto L57
                r5 = 3
                if (r0 == r5) goto L57
                r5 = 4
                if (r0 == r5) goto L55
                r5 = 12
                if (r0 == r5) goto L52
                r3 = 0
                goto L57
            L52:
                if (r2 == r1) goto L55
                goto L57
            L55:
                r3 = 2000(0x7d0, float:2.803E-42)
            L57:
                long r2 = (long) r3
                r6.f100443g = r2
                java.lang.Runnable r0 = r6.f100440d
                sg.bigo.ads.common.n.d.a(r1, r0)
                r6.f100448l = r4
            L61:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.d.a.a(sg.bigo.ads.ad.d$a):void");
        }

        static /* synthetic */ void a(a aVar, Rect rect) {
            float fA;
            if (aVar.f100445i == 0) {
                aVar.f100445i = SystemClock.elapsedRealtime();
            }
            if (aVar.f100447k) {
                fA = 0.0f;
            } else {
                fA = aVar.a(rect);
                View view = d.this.f100336c;
                int i10 = aVar.f100444h;
                if ((view != null && view.getMeasuredHeight() > 0 && view.getMeasuredWidth() > 0 && (i10 == 0 || i10 <= 100.0f * fA)) || (sg.bigo.ads.api.core.a.b(d.this.q()) && !d.this.f100341h)) {
                    aVar.f100447k = true;
                }
            }
            long jMax = aVar.f100437a == 1 ? Math.max(r.f102828a.a(1), aVar.f100442f) : aVar.f100442f;
            if (!aVar.f100447k || SystemClock.elapsedRealtime() - aVar.f100445i < jMax) {
                return;
            }
            if (fA == 0.0f) {
                fA = aVar.a(rect);
            }
            d.this.a("show_proportion", q.a("%.4f", Float.valueOf(fA)));
            d.this.a_();
            aVar.f100438b = true;
        }
    }

    public d(@NonNull f fVar) {
        super(fVar);
        this.f100436z = false;
        this.f100435y = new a();
    }

    static /* synthetic */ long a(d dVar) {
        n.b bVarAA;
        sg.bigo.ads.api.core.b bVar = dVar.f100335b.f102174a;
        if (!(bVar instanceof n) || (bVarAA = ((n) bVar).aA()) == null) {
            return 0L;
        }
        return bVarAA.b();
    }

    static /* synthetic */ long b(d dVar) {
        n.b bVarAA;
        sg.bigo.ads.api.core.b bVar = dVar.f100335b.f102174a;
        if (!(bVar instanceof n) || (bVarAA = ((n) bVar).aA()) == null) {
            return 0L;
        }
        return bVarAA.d();
    }

    static /* synthetic */ int c(d dVar) {
        n.b bVarAA;
        sg.bigo.ads.api.core.b bVar = dVar.f100335b.f102174a;
        if (!(bVar instanceof n) || (bVarAA = ((n) bVar).aA()) == null) {
            return 0;
        }
        return bVarAA.a();
    }

    static /* synthetic */ int d(d dVar) {
        n.b bVarAA;
        sg.bigo.ads.api.core.b bVar = dVar.f100335b.f102174a;
        if (!(bVar instanceof n) || (bVarAA = ((n) bVar).aA()) == null) {
            return 0;
        }
        return bVarAA.c();
    }

    @Override // sg.bigo.ads.ad.c
    public void destroyInMainThread() {
        super.destroyInMainThread();
        this.f100435y.a();
    }

    @Override // sg.bigo.ads.ad.c
    @CallSuper
    protected final void m() {
        super.m();
        this.f100435y.a();
    }

    @Override // sg.bigo.ads.ad.c
    public void a() {
        super.a();
        this.f100435y.a();
        this.f100436z = false;
        this.f100435y = new a();
    }

    protected final void d(String str) {
        if (this.f100436z) {
            return;
        }
        this.f100436z = true;
        String strJ = j();
        int iIntValue = ((Integer) b("render_style", 0)).intValue();
        if (a("06002029")) {
            sg.bigo.ads.core.d.b.a(this, str, strJ, iIntValue);
        }
        sg.bigo.ads.api.b.a aVar = this.f102138aa;
        if (aVar != null) {
            aVar.a(str, strJ, iIntValue);
        }
    }

    public final void a(View view, boolean z10) {
        this.f100435y.a(view, z10);
    }
}

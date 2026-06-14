package sg.bigo.ads.common.view.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes4.dex */
public final class d<T extends View> implements c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f103028a = r.f102828a.a(1) / 60;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f103029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f103030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sg.bigo.ads.common.view.a.a f103031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f103032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f103033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f103034g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final sg.bigo.ads.common.c.a f103036i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Canvas f103037j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Bitmap f103038k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f103039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f103040m;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ViewTreeObserver.OnPreDrawListener f103035h = new ViewTreeObserver.OnPreDrawListener() { // from class: sg.bigo.ads.common.view.a.d.1
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - d.this.f103040m) < d.f103028a) {
                return true;
            }
            d.b(d.this);
            d.this.f103040m = jElapsedRealtime;
            return true;
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f103041n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final WeakHashMap<TextureView, Object> f103042o = new WeakHashMap<>();

    public static class a extends BitmapDrawable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final d f103045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Paint f103046b;

        private a(d dVar, Bitmap bitmap) {
            super(dVar.f103029b.getResources(), bitmap);
            this.f103045a = dVar;
            this.f103046b = new Paint();
        }

        @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            super.draw(canvas);
            b bVar = this.f103045a.f103031d.f103016b;
            if (bVar != null) {
                this.f103046b.setColor(bVar.b());
                canvas.drawRect(getBounds(), this.f103046b);
            }
        }

        /* synthetic */ a(d dVar, Bitmap bitmap, byte b10) {
            this(dVar, bitmap);
        }
    }

    public d(T t10) {
        this.f103029b = t10;
        Context context = t10.getContext();
        this.f103030c = context;
        this.f103036i = new sg.bigo.ads.common.c.b(context);
        this.f103031d = new sg.bigo.ads.common.view.a.a();
    }

    static /* synthetic */ int d(d dVar) {
        int i10 = dVar.f103041n;
        dVar.f103041n = i10 + 1;
        return i10;
    }

    public final void b() {
        Bitmap bitmap = this.f103038k;
        if (bitmap != null) {
            bitmap.recycle();
            this.f103038k = null;
        }
        if (this.f103039l != null) {
            this.f103039l = null;
        }
        this.f103036i.a();
    }

    @Override // sg.bigo.ads.common.view.a.c
    public final void setBlurStyle(b bVar) {
        sg.bigo.ads.common.view.a.a aVar = this.f103031d;
        if ((bVar == null && aVar.f103016b == null) || bVar == aVar.f103016b) {
            return;
        }
        aVar.f103016b = bVar;
        aVar.invalidateSelf();
        this.f103040m = 0L;
        b();
    }

    static /* synthetic */ void b(d dVar) {
        b bVar;
        Bitmap bitmap;
        if (dVar.f103032e) {
            return;
        }
        sg.bigo.ads.common.view.a.a aVar = dVar.f103031d;
        Drawable drawable = aVar.f102539a;
        if ((drawable == null || (drawable instanceof a)) && (bVar = aVar.f103016b) != null && bVar.c() > 0.0f && u.c(dVar.f103029b) && sg.bigo.ads.common.ab.a.a(dVar.f103029b, new Rect())) {
            b bVar2 = dVar.f103031d.f103016b;
            if (bVar2 == null) {
                dVar.b();
                return;
            }
            View view = dVar.f103033f;
            if (view == null || !dVar.f103029b.isShown()) {
                dVar.b();
                return;
            }
            Rect rect = new Rect();
            bVar2.a(rect);
            byte b10 = 0;
            if (dVar.f103037j == null || dVar.f103039l == null || dVar.f103038k == null) {
                dVar.b();
                int measuredWidth = (dVar.f103029b.getMeasuredWidth() - rect.left) - rect.right;
                int measuredHeight = (dVar.f103029b.getMeasuredHeight() - rect.top) - rect.bottom;
                int iMax = Math.max(1, (int) (measuredWidth / bVar2.d()));
                int iMax2 = Math.max(1, (int) (measuredHeight / bVar2.d()));
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                dVar.f103038k = sg.bigo.ads.common.utils.d.a(iMax, iMax2, config);
                dVar.f103039l = new a(dVar, sg.bigo.ads.common.utils.d.a(iMax, iMax2, config), b10);
                if (dVar.f103038k == null) {
                    return;
                }
                dVar.f103037j = new Canvas(dVar.f103038k);
                dVar.f103031d.a(dVar.f103039l);
                if (!dVar.f103036i.a(dVar.f103038k, bVar2.c())) {
                    return;
                }
            }
            Point pointA = u.a(view, dVar.f103029b);
            dVar.f103038k.eraseColor(bVar2.b());
            float alpha = dVar.f103029b.getAlpha();
            dVar.f103029b.setAlpha(0.0f);
            dVar.f103032e = true;
            float fD = 1.0f / bVar2.d();
            int iSave = dVar.f103037j.save();
            try {
                dVar.f103037j.scale(fD, fD);
                dVar.f103037j.translate((-pointA.x) - rect.left, (-pointA.y) - rect.top);
                if (view.getBackground() != null) {
                    view.getBackground().draw(dVar.f103037j);
                }
                view.draw(dVar.f103037j);
            } catch (Exception unused) {
            } catch (Throwable th2) {
                dVar.f103037j.restoreToCount(iSave);
                throw th2;
            }
            dVar.f103037j.restoreToCount(iSave);
            dVar.a();
            Set<TextureView> setKeySet = dVar.f103042o.keySet();
            if (!k.a(setKeySet)) {
                int i10 = pointA.x;
                Rect rect2 = new Rect(rect.left + i10, pointA.y + rect.top, (i10 + dVar.f103029b.getMeasuredWidth()) - rect.right, (pointA.y + dVar.f103029b.getMeasuredHeight()) - rect.bottom);
                Iterator<TextureView> it = setKeySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    TextureView next = it.next();
                    if (next != null && next.isOpaque() && u.d(next)) {
                        Point pointA2 = u.a(view, next);
                        int i11 = pointA2.x;
                        Rect rect3 = new Rect(i11, pointA2.y, next.getMeasuredWidth() + i11, pointA2.y + next.getMeasuredHeight());
                        Rect rect4 = new Rect(rect3);
                        if (rect4.intersect(rect2) && (bitmap = next.getBitmap()) != null) {
                            int i12 = rect4.left - rect3.left;
                            int i13 = rect4.top - rect3.top;
                            Rect rect5 = new Rect(i12, i13, rect4.width() + i12, rect4.height() + i13);
                            int i14 = rect4.left - rect2.left;
                            int i15 = rect4.top - rect2.top;
                            Rect rect6 = new Rect(i14, i15, rect4.width() + i14, rect4.height() + i15);
                            int iSave2 = dVar.f103037j.save();
                            try {
                                dVar.f103037j.scale(fD, fD);
                                dVar.f103037j.drawBitmap(bitmap, rect5, rect6, new Paint());
                            } catch (Exception unused2) {
                            } catch (Throwable th3) {
                                dVar.f103037j.restoreToCount(iSave2);
                                throw th3;
                            }
                            dVar.f103037j.restoreToCount(iSave2);
                            break;
                        }
                    }
                }
            }
            dVar.f103032e = false;
            dVar.f103029b.setAlpha(alpha);
            dVar.f103036i.a(dVar.f103038k, dVar.f103039l.getBitmap());
            dVar.f103031d.invalidateSelf();
        }
    }

    public final void a() {
        if (!(this.f103033f instanceof ViewGroup) || this.f103041n == this.f103042o.size()) {
            return;
        }
        this.f103041n = 0;
        this.f103042o.clear();
        u.a((ViewGroup) this.f103033f, new sg.bigo.ads.common.d<View>() { // from class: sg.bigo.ads.common.view.a.d.2
            @Override // sg.bigo.ads.common.d
            public final /* synthetic */ void a(View view) {
                View view2 = view;
                if (view2 instanceof TextureView) {
                    d.this.f103042o.put((TextureView) view2, d.this);
                    d.d(d.this);
                }
            }
        });
    }
}

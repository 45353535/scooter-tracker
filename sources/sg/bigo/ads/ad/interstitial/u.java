package sg.bigo.ads.ad.interstitial;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.Iterator;
import java.util.WeakHashMap;
import sg.bigo.ads.ad.interstitial.d;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.w.b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f101777c = 15;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f101778d = 300;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f101779e = 255;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.ad.b.b f101780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.api.a.m f101781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f101782h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final WeakHashMap<Object, ValueCallback<Bitmap>> f101783i = new WeakHashMap<>();

    public interface a {
        void a(View view);
    }

    public u(@NonNull sg.bigo.ads.ad.b.b bVar, @NonNull sg.bigo.ads.api.a.m mVar) {
        this.f101780f = bVar;
        this.f101781g = mVar;
    }

    @CallSuper
    public final void c(@NonNull q qVar) {
        if (this.f101783i.isEmpty()) {
            return;
        }
        a(qVar, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.u.5
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                if (bitmap2 != null) {
                    synchronized (u.this.f101783i) {
                        try {
                            Iterator it = u.this.f101783i.values().iterator();
                            while (it.hasNext()) {
                                ((ValueCallback) it.next()).onReceiveValue(bitmap2);
                            }
                            u.this.f101783i.clear();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        });
    }

    public boolean d() {
        return false;
    }

    protected abstract int e();

    protected boolean f() {
        return false;
    }

    protected static t a(@NonNull q qVar) {
        if (qVar != null) {
            return qVar.aj();
        }
        return null;
    }

    public final sg.bigo.ads.common.p b(q qVar) {
        if (d()) {
            sg.bigo.ads.common.p pVarH = a(qVar).h();
            if (pVarH.a()) {
                return pVarH;
            }
        }
        return r.a(this.f101780f);
    }

    private static void a(View view, int i10) {
        if (view == null) {
            return;
        }
        view.setBackgroundColor(i10);
    }

    private void b(q qVar, final View view) {
        int i10;
        if (qVar == null || view == null) {
            return;
        }
        if (d() && (i10 = a(qVar).f101740i) != 0) {
            a(view, i10);
            return;
        }
        Integer numA = r.a((NativeAd) this.f101780f);
        if (numA != null) {
            a(view, numA.intValue());
        } else {
            a(qVar, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.u.3

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ d.a f101787b = null;

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                    Bitmap bitmap2 = bitmap;
                    if (bitmap2 == null) {
                        u.this.a(view, this);
                        return;
                    }
                    Integer numA2 = sg.bigo.ads.common.w.b.a(bitmap2);
                    if (numA2 != null) {
                        d.a aVar = this.f101787b;
                        final int iA = aVar != null ? aVar.a() : numA2.intValue();
                        view.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.u.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                final long j10 = u.a(u.this) ? u.f101778d : 0L;
                                sg.bigo.ads.common.w.b.a(view, iA, new b.a() { // from class: sg.bigo.ads.ad.interstitial.u.3.1.1
                                    @Override // sg.bigo.ads.common.w.b.a
                                    public final long a() {
                                        return j10;
                                    }
                                });
                            }
                        });
                    }
                }
            });
        }
    }

    protected final void a(View view, ValueCallback<Bitmap> valueCallback) {
        if (view != null) {
            synchronized (this.f101783i) {
                this.f101783i.put(view, valueCallback);
            }
        }
    }

    protected void a(@NonNull q qVar, final View view) {
        int i10;
        Bitmap bitmapG;
        if (qVar == null || view == null) {
            return;
        }
        int iE = e();
        if (iE == 2) {
            i10 = ViewCompat.MEASURED_STATE_MASK;
        } else {
            if (iE == 3) {
                b(qVar, view);
                return;
            }
            if (iE == 4) {
                ValueCallback<Bitmap> valueCallback = new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.u.4

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ d.a f101794b = null;

                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                        final Bitmap bitmap2 = bitmap;
                        u uVar = u.this;
                        if (bitmap2 == null) {
                            uVar.a(view, this);
                            return;
                        }
                        final long j10 = u.a(uVar) ? u.f101778d : 0L;
                        final Bitmap bitmapB = sg.bigo.ads.common.utils.d.b(view.getContext(), bitmap2);
                        view.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.u.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                sg.bigo.ads.common.w.b.a(view, new BitmapDrawable(view.getResources(), bitmapB), j10);
                                if (AnonymousClass4.this.f101794b != null) {
                                    sg.bigo.ads.common.w.b.a(bitmap2);
                                }
                            }
                        });
                    }
                };
                if (!d() || (bitmapG = a(qVar).g()) == null) {
                    a(qVar, valueCallback);
                    return;
                } else {
                    valueCallback.onReceiveValue(bitmapG);
                    return;
                }
            }
            i10 = -1;
        }
        a(view, i10);
    }

    public static void a(@NonNull q qVar, ValueCallback<Bitmap> valueCallback) {
        if (valueCallback == null) {
            return;
        }
        t tVarA = a(qVar);
        if (tVarA == null) {
            valueCallback.onReceiveValue(sg.bigo.ads.common.utils.d.a(1, 1, Bitmap.Config.ARGB_8888));
        } else {
            tVarA.a(valueCallback);
        }
    }

    protected final boolean a(@NonNull sg.bigo.ads.ad.b.b bVar, @NonNull q qVar, @NonNull ViewGroup viewGroup, @NonNull View view, t.a aVar, int i10, int i11, int i12, @Nullable View... viewArr) {
        t tVarA = a(qVar);
        if (tVarA == null) {
            return false;
        }
        tVarA.f101734c = bVar;
        tVarA.a(viewGroup, view, aVar, i10, i11, i12, viewArr);
        sg.bigo.ads.common.utils.u.a(view, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.u.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                u.this.f101782h = SystemClock.elapsedRealtime();
            }
        });
        if (!f()) {
            return true;
        }
        t.a(view);
        return true;
    }

    protected boolean a(@NonNull q qVar, @NonNull ViewGroup viewGroup, @NonNull View view, t.a aVar, int i10, int i11, int i12, @Nullable View... viewArr) {
        t tVarA = a(qVar);
        if (tVarA == null) {
            return false;
        }
        tVarA.a(viewGroup, view, aVar, i10, i11, i12, viewArr);
        sg.bigo.ads.common.utils.u.a(view, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.u.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                u.this.f101782h = SystemClock.elapsedRealtime();
            }
        });
        if (!f()) {
            return true;
        }
        t.a(view);
        return true;
    }

    static /* synthetic */ boolean a(u uVar) {
        return (uVar.f101782h != 0 ? SystemClock.elapsedRealtime() - uVar.f101782h : 0L) > f101777c;
    }
}

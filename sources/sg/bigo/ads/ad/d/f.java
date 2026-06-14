package sg.bigo.ads.ad.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.c.x;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.utils.n;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f extends t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final sg.bigo.ads.core.adview.h f100466p = new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.d.f.1
        @Override // sg.bigo.ads.core.adview.h
        public final void a(int i10, int i11, int i12, int i13, int i14, int i15) {
            sg.bigo.ads.common.t.a.a(0, 4, "emptyClick", "emptyClick stop event Propagation");
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected m f100467l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected b f100468m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected Bitmap f100469n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected d f100470o;

    public interface a {
        void a();
    }

    public static class b extends ImageView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private View f100479a;

        public b(Context context, View view) {
            super(context);
            this.f100479a = view;
        }

        @Override // android.widget.ImageView, android.view.View
        protected final void onMeasure(int i10, int i11) {
            View view = this.f100479a;
            if (view == null) {
                super.onMeasure(i10, i11);
            } else {
                setMeasuredDimension(view.getMeasuredWidth(), this.f100479a.getMeasuredHeight());
            }
        }
    }

    public f(@NonNull sg.bigo.ads.ad.b.b bVar) {
        super(bVar);
    }

    private Bitmap a(Context context, boolean z10) {
        Bitmap bitmapA;
        Bitmap bitmapA2 = sg.bigo.ads.common.utils.d.a(context.getResources(), z10 ? R.drawable.bigo_ad_layer_gift_shadow : R.drawable.bigo_ad_layer_heart_shadow);
        if (bitmapA2 == null || bitmapA2.getHeight() <= 0 || bitmapA2.getWidth() <= 0 || (bitmapA = sg.bigo.ads.common.utils.d.a(bitmapA2.getWidth(), bitmapA2.getHeight(), bitmapA2.getConfig())) == null) {
            return null;
        }
        Canvas canvas = new Canvas(bitmapA);
        int iA = sg.bigo.ads.common.utils.e.a(context, 1);
        canvas.drawBitmap(bitmapA2, z10 ? iA : -iA, iA, (Paint) null);
        float[] fArr = {0.0f, 75.0f, 85.0f};
        Color.colorToHSV(r.a(((t) this).f101734c, 3, null), fArr);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColorFilter(new PorterDuffColorFilter(Color.HSVToColor(fArr), PorterDuff.Mode.SRC_IN));
        Bitmap bitmapA3 = sg.bigo.ads.common.utils.d.a(context.getResources(), z10 ? R.drawable.bigo_ad_layer_gift_color : R.drawable.bigo_ad_layer_heart_color);
        if (bitmapA3 != null && bitmapA3.getHeight() > 0 && bitmapA3.getWidth() > 0) {
            canvas.drawBitmap(bitmapA3, 0.0f, 0.0f, paint);
            Bitmap bitmapA4 = sg.bigo.ads.common.utils.d.a(context.getResources(), z10 ? R.drawable.bigo_ad_gift_widget : R.drawable.bigo_ad_heart_widget);
            if (bitmapA4 != null) {
                canvas.drawBitmap(bitmapA4, 0.0f, 0.0f, (Paint) null);
            }
            return bitmapA;
        }
        return null;
    }

    protected abstract void a(Context context, ViewGroup viewGroup);

    @Override // sg.bigo.ads.ad.interstitial.t
    public final void b(@NonNull final ViewGroup viewGroup) {
        viewGroup.post(new Runnable() { // from class: sg.bigo.ads.ad.d.f.4
            @Override // java.lang.Runnable
            public final void run() {
                View viewFindViewWithTag = viewGroup.findViewWithTag("adview_background_main_tag");
                if (viewFindViewWithTag instanceof ImageView) {
                    f.this.f100468m = (b) viewFindViewWithTag;
                } else {
                    Context context = viewGroup.getContext();
                    if (context != null) {
                        f.this.f100468m = new b(context, viewGroup);
                        f.this.f100468m.setTag("adview_background_main_tag");
                        f.this.f100468m.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        u.a(f.this.f100468m, viewGroup, null, 0);
                        f.this.a(context, viewGroup);
                    }
                }
                b bVar = f.this.f100468m;
                if (bVar != null) {
                    bVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    Bitmap bitmapA = f.a(f.this);
                    if (bitmapA != null) {
                        sg.bigo.ads.common.utils.d.a(f.this.f100468m.getContext(), bitmapA, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.d.f.4.1
                            @Override // android.webkit.ValueCallback
                            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                                Bitmap bitmap2 = bitmap;
                                if (bitmap2 != null) {
                                    f.this.f100468m.setImageBitmap(bitmap2);
                                }
                            }
                        });
                    }
                }
            }
        });
    }

    public void d(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        final TextView textView = (TextView) viewGroup.findViewById(R.id.inter_warning);
        final ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.media_layout);
        if (textView == null || viewGroup2 == null) {
            return;
        }
        u.a(viewGroup2, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.d.f.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                textView.getLayoutParams().height = Math.round(viewGroup2.getHeight() * 15 * 0.01f);
            }
        });
    }

    public final void f(ViewGroup viewGroup) {
        final View viewFindViewById = viewGroup != null ? viewGroup.findViewById(R.id.inter_btn_cta_layout) : null;
        if (viewFindViewById == null) {
            return;
        }
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.d.f.2
            @Override // java.lang.Runnable
            public final void run() {
                if (f.this.l()) {
                    sg.bigo.ads.ad.interstitial.c.e(viewFindViewById);
                } else {
                    viewFindViewById.clearAnimation();
                }
            }
        });
    }

    public final void g(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        a(viewGroup, (ImageView) viewGroup.findViewById(R.id.gift_widget), true);
        a(viewGroup, (ImageView) viewGroup.findViewById(R.id.heart_widget), false);
    }

    public final void h(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_title);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.inter_description);
        if (q.a((CharSequence) ((t) this).f101734c.getDescription())) {
            if (textView != null) {
                textView.setLines(2);
            }
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
    }

    protected abstract boolean j();

    protected abstract int k();

    protected abstract boolean l();

    public final void p() {
        n nVar;
        d dVar = this.f100470o;
        if (dVar == null || (nVar = dVar.f100462e) == null) {
            return;
        }
        nVar.d();
    }

    public final void q() {
        n nVar;
        d dVar = this.f100470o;
        if (dVar == null || dVar.f100463f || (nVar = dVar.f100462e) == null || !nVar.e()) {
            return;
        }
        dVar.f100462e.c();
    }

    public f(@NonNull sg.bigo.ads.ad.b.b bVar, m mVar) {
        this(bVar);
        this.f100467l = mVar;
    }

    static /* synthetic */ Bitmap a(f fVar) {
        Bitmap bitmap = fVar.f101738g;
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap bitmap2 = fVar.f100469n;
        if (bitmap2 != null) {
            return bitmap2;
        }
        sg.bigo.ads.api.core.n nVar = (sg.bigo.ads.api.core.n) ((t) fVar).f101734c.f();
        if (nVar.bh() == null) {
            return null;
        }
        Bitmap bitmap3 = (Bitmap) nVar.bh().first;
        fVar.f100469n = bitmap3;
        return bitmap3;
    }

    private void a(ViewGroup viewGroup, ImageView imageView, boolean z10) {
        if (imageView == null) {
            return;
        }
        if (!j()) {
            imageView.clearAnimation();
            imageView.setVisibility(4);
            return;
        }
        imageView.setImageBitmap(a(imageView.getContext(), z10));
        sg.bigo.ads.ad.interstitial.c.a(imageView, z10);
        imageView.setVisibility(0);
        imageView.setTag(32);
        sg.bigo.ads.ad.b.a.a(viewGroup, imageView, this instanceof x ? 9 : 8, ((t) this).f101734c, ((t) this).f101734c.H);
    }

    protected final void a(@NonNull ViewGroup viewGroup, boolean z10, boolean z11, boolean z12, int i10) {
        int i11 = this instanceof x ? 9 : 8;
        MediaView mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media);
        if (mediaView != null) {
            mediaView.setTag(5);
        }
        if (mediaView != null) {
            sg.bigo.ads.ad.b.a.a(viewGroup, mediaView, i11, ((t) this).f101734c, i10);
            if (z10) {
                mediaView.setMediaAreaClickable(true);
                mediaView.b().a(false);
            } else {
                mediaView.setMediaAreaClickable(false);
                mediaView.b().a(true);
            }
        }
        viewGroup.setTag(31);
        sg.bigo.ads.ad.b.a.a(viewGroup, viewGroup, i11, z12 ? ((t) this).f101734c : f100466p, i10);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.inter_ad_info);
        if (viewGroup2 != null) {
            viewGroup2.setTag(18);
            sg.bigo.ads.ad.b.a.a(viewGroup, viewGroup2, i11, z11 ? ((t) this).f101734c : f100466p, i10);
        }
    }

    public void a(AdCountDownButton adCountDownButton, ViewGroup viewGroup, a aVar) {
        if (adCountDownButton == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        int iK = k();
        if (iK == 1) {
            layoutParams.addRule(2, R.id.media_layout);
            layoutParams.addRule(14, -1);
        } else {
            if (iK != 3) {
                if (iK != 4) {
                    return;
                }
                int i10 = R.id.media_layout;
                layoutParams.addRule(7, i10);
                layoutParams.addRule(6, i10);
                layoutParams.rightMargin = sg.bigo.ads.common.utils.e.a(adCountDownButton.getContext(), 12);
                layoutParams.topMargin = sg.bigo.ads.common.utils.e.a(adCountDownButton.getContext(), 12);
                adCountDownButton.setLayoutParams(layoutParams);
            }
            int i11 = R.id.media_layout;
            layoutParams.addRule(7, i11);
            layoutParams.addRule(2, i11);
        }
        layoutParams.bottomMargin = sg.bigo.ads.common.utils.e.a(adCountDownButton.getContext(), -84);
        adCountDownButton.setLayoutParams(layoutParams);
    }
}

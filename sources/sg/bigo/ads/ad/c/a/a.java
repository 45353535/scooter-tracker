package sg.bigo.ads.ad.c.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import sg.bigo.ads.R;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.core.h;
import sg.bigo.ads.common.n.d;
import sg.bigo.ads.common.o;
import sg.bigo.ads.common.p;
import sg.bigo.ads.common.p.e;
import sg.bigo.ads.common.p.f;
import sg.bigo.ads.common.p.g;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p f100376f = new p(320, 50);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p f100377g = new p(300, 250);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    protected final sg.bigo.ads.ad.b.b f100378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    protected FrameLayout f100379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f100380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected MediaView f100381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Bitmap f100382e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C1214a f100383h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Bitmap f100384i;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.c.a.a$2, reason: invalid class name */
    public class AnonymousClass2 implements ValueCallback<Bitmap> {
        public AnonymousClass2() {
        }

        @Override // android.webkit.ValueCallback
        public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
            final Bitmap bitmap2 = bitmap;
            d.b(new Runnable() { // from class: sg.bigo.ads.ad.c.a.a.2.1
                @Override // java.lang.Runnable
                @RequiresApi(api = 17)
                public final void run() {
                    a aVar = a.this;
                    if (aVar.f100380c == null) {
                        return;
                    }
                    MediaView mediaView = aVar.f100381d;
                    View viewFindViewWithTag = mediaView != null ? mediaView.findViewWithTag("blur_image_view") : null;
                    if (viewFindViewWithTag instanceof C1214a) {
                        a.this.f100383h = (C1214a) viewFindViewWithTag;
                    } else {
                        a aVar2 = a.this;
                        a aVar3 = a.this;
                        aVar2.f100383h = aVar3.new C1214a(aVar3.f100380c);
                        a.this.f100383h.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        u.a(a.this.f100383h, a.this.f100381d, null, 0);
                        a.this.f100383h.setTag("blur_image_view");
                    }
                    if (a.this.f100383h != null) {
                        a.this.f100383h.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        Bitmap bitmap3 = bitmap2;
                        sg.bigo.ads.common.utils.d.b(a.this.f100383h.getContext(), (bitmap3 == null || bitmap3.getWidth() <= 0 || bitmap2.getHeight() <= 0) ? a.this.g() : bitmap2, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.c.a.a.2.1.1
                            @Override // android.webkit.ValueCallback
                            public final /* synthetic */ void onReceiveValue(Bitmap bitmap4) {
                                Bitmap bitmap5 = bitmap4;
                                if (a.this.f100383h != null) {
                                    a.this.f100383h.setImageBitmap(bitmap5);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.ad.c.a.a$a, reason: collision with other inner class name */
    class C1214a extends ImageView {
        public C1214a(Context context) {
            super(context);
        }

        @Override // android.widget.ImageView, android.view.View
        protected final void onMeasure(int i10, int i11) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        }
    }

    protected a(@NonNull sg.bigo.ads.ad.b.b bVar, @NonNull Context context) {
        this.f100378a = bVar;
        this.f100380c = context;
        d();
    }

    public abstract int a();

    public abstract int b();

    protected void b(int i10) {
        Button button;
        FrameLayout frameLayout = this.f100379b;
        if (frameLayout != null && (button = (Button) frameLayout.findViewById(R.id.inter_btn_cta)) != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: sg.bigo.ads.ad.c.a.1

                /* JADX INFO: renamed from: a */
                final /* synthetic */ Button f100361a;

                public AnonymousClass1(Button button2) {
                    button = button2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.9f, 1.0f, 0.9f, 1, 0.5f, 1, 0.5f);
                    scaleAnimation.setDuration(200L);
                    scaleAnimation.setInterpolator(sg.bigo.ads.common.utils.b.a(1));
                    scaleAnimation.setRepeatCount(-1);
                    scaleAnimation.setRepeatMode(2);
                    button.startAnimation(scaleAnimation);
                }
            });
        }
        if (i10 == 1) {
            sg.bigo.ads.ad.c.a.a(this.f100379b, 2000L, 6);
        } else {
            if (i10 != 2) {
                return;
            }
            sg.bigo.ads.ad.c.a.a(this.f100379b, 2000L, 3, c());
        }
    }

    public abstract int[] c();

    public abstract void d();

    public final View e() {
        return this.f100379b;
    }

    public final void f() {
        View viewFindViewById;
        FrameLayout frameLayout = this.f100379b;
        if (frameLayout == null || (viewFindViewById = frameLayout.findViewById(R.id.inter_banner_click_guide_contain)) == null) {
            return;
        }
        viewFindViewById.clearAnimation();
        u.b(viewFindViewById);
    }

    protected final Bitmap g() {
        Bitmap bitmap;
        int width;
        int height;
        Bitmap bitmapA;
        Bitmap bitmap2 = this.f100382e;
        if (bitmap2 != null) {
            return bitmap2;
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) sg.bigo.ads.common.utils.a.a(this.f100380c, R.drawable.bigo_ad_default_base_image);
        if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null || bitmap.getHeight() <= 0 || bitmap.getWidth() <= 0 || (bitmapA = sg.bigo.ads.common.utils.d.a((width = bitmap.getWidth()), (height = bitmap.getHeight()), bitmap.getConfig())) == null) {
            return null;
        }
        Canvas canvas = new Canvas(bitmapA);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        Paint paint = new Paint();
        float[] fArr = new float[3];
        sg.bigo.ads.ad.b.b bVar = this.f100378a;
        Integer numValueOf = bVar.J() ? null : bVar.N;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(q.b("#009dff", -16776961));
        }
        Color.colorToHSV(Color.argb(255, Color.red(numValueOf.intValue()), Color.green(numValueOf.intValue()), Color.blue(numValueOf.intValue())), fArr);
        fArr[1] = 100.0f;
        fArr[2] = 100.0f;
        paint.setColor(Color.HSVToColor(fArr));
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
        canvas.drawRect(0.0f, 0.0f, width, height, paint);
        this.f100382e = bitmapA;
        return bitmapA;
    }

    public final void h() {
        FrameLayout frameLayout = this.f100379b;
        if (frameLayout != null) {
            u.b(frameLayout);
            this.f100379b = null;
        }
        MediaView mediaView = this.f100381d;
        if (mediaView != null) {
            u.b(mediaView);
            this.f100381d.c();
            this.f100381d = null;
        }
        this.f100380c = null;
    }

    public abstract int i();

    public abstract int j();

    public static a a(@NonNull sg.bigo.ads.ad.b.b bVar, @NonNull Context context, h.b bVar2) {
        return f100377g.equals(new p(bVar2 != null ? bVar2.a() : 0, bVar2 != null ? bVar2.b() : 0)) ? new b(bVar, context) : new c(bVar, context);
    }

    public final void a(int i10) {
        b(i10);
    }

    public final void a(View view, boolean z10) {
        FrameLayout frameLayout = this.f100379b;
        if (frameLayout == null || view == null) {
            return;
        }
        sg.bigo.ads.ad.c.a.a(frameLayout, view, z10);
    }

    public final synchronized void a(final ValueCallback<Bitmap> valueCallback, boolean z10) {
        if (z10) {
            Bitmap bitmap = this.f100384i;
            if (bitmap != null) {
                valueCallback.onReceiveValue(bitmap);
                return;
            }
        }
        final sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) this.f100378a.f();
        if (z10) {
            a(aVar, valueCallback);
            return;
        }
        String strB = o.b(this.f100378a.f100335b.f102178e, aVar.aN());
        if (q.a((CharSequence) strB)) {
            a(aVar, valueCallback);
        } else {
            final String path = Uri.parse(strB).getPath();
            d.a(3, new Runnable() { // from class: sg.bigo.ads.ad.c.a.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    Bitmap bitmapA = sg.bigo.ads.common.utils.d.a(Uri.parse(path).getPath(), a.this.f100378a.f100335b.f102178e);
                    if (bitmapA == null) {
                        a.this.a(aVar, (ValueCallback<Bitmap>) valueCallback);
                    } else {
                        a.this.f100384i = bitmapA;
                        valueCallback.onReceiveValue(bitmapA);
                    }
                }
            });
        }
    }

    public final void a(final ImageView imageView, final int i10) {
        if (this.f100379b == null) {
            return;
        }
        final View viewA = sg.bigo.ads.common.utils.a.a(this.f100380c, a(), this.f100379b, true);
        d.b(new Runnable() { // from class: sg.bigo.ads.ad.c.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                View view = viewA;
                if (view != null) {
                    a aVar = a.this;
                    a.a(aVar, aVar.f100379b, view, aVar.f100381d, imageView, i10);
                }
            }
        });
    }

    protected static void a(TextView textView, @Nullable String str, @Nullable String str2) {
        if (textView == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
        } else {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            textView.setText(str2);
        }
    }

    static /* synthetic */ void a(a aVar, ViewGroup viewGroup, View view, MediaView mediaView, ImageView imageView, int i10) {
        ArrayList arrayList = new ArrayList();
        TextView textView = (TextView) view.findViewById(R.id.inter_title);
        if (textView != null) {
            textView.setTag(2);
            a(textView, aVar.f100378a.getTitle(), "");
            arrayList.add(textView);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.inter_description);
        if (textView2 != null) {
            textView2.setTag(6);
            a(textView2, aVar.f100378a.getDescription(), "");
            arrayList.add(textView2);
        }
        TextView textView3 = (TextView) view.findViewById(R.id.inter_btn_cta);
        if (textView3 != null) {
            textView3.setTag(7);
            a(textView3, aVar.f100378a.getCallToAction(), "");
            arrayList.add(textView3);
        }
        TextView textView4 = (TextView) view.findViewById(R.id.inter_advertiser);
        if (textView4 != null) {
            String advertiser = aVar.f100378a.getAdvertiser();
            if (q.a((CharSequence) advertiser)) {
                textView4.setVisibility(8);
            } else {
                textView4.setText(advertiser);
            }
        }
        if (imageView != null) {
            try {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (marginLayoutParams != null) {
                    marginLayoutParams.rightMargin = aVar.b();
                }
                imageView.setLayoutParams(marginLayoutParams);
            } catch (Exception unused) {
            }
            u.a(imageView, (ViewGroup) view.findViewById(R.id.inter_rounded_icon_layout), null, -1);
        }
        AdOptionsView adOptionsView = (AdOptionsView) view.findViewById(R.id.inter_options);
        if (mediaView != null) {
            u.a(mediaView, (ViewGroup) view.findViewById(R.id.inter_media_layout), null, -1);
        }
        sg.bigo.ads.ad.b.b bVar = aVar.f100378a;
        bVar.H = i10;
        bVar.registerViewForInteraction(viewGroup, mediaView, imageView, adOptionsView, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(sg.bigo.ads.core.a.a aVar, final ValueCallback<Bitmap> valueCallback) {
        String strAT = aVar.aT();
        if (q.a((CharSequence) strAT)) {
            valueCallback.onReceiveValue(null);
        } else {
            e.a(this.f100378a.f100335b.f102178e, strAT, aVar.al(), new g() { // from class: sg.bigo.ads.ad.c.a.a.4
                @Override // sg.bigo.ads.common.p.g
                public final void a(int i10, @NonNull String str, String str2) {
                    valueCallback.onReceiveValue(null);
                }

                @Override // sg.bigo.ads.common.p.g
                public final void a(@NonNull Bitmap bitmap, @NonNull f fVar) {
                    a.this.f100384i = bitmap;
                    valueCallback.onReceiveValue(bitmap);
                }
            });
        }
    }

    public final void a(boolean z10) {
        a(this.f100381d, z10);
    }
}

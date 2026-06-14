package sg.bigo.ads.ad.interstitial.multi_img;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ViewGroup f101440a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ViewFlow f101443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f101444e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final sg.bigo.ads.ad.interstitial.d f101447h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f101441b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f101442c = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f101445f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f101446g = Float.MIN_VALUE;

    public a(ViewGroup viewGroup, ViewFlow viewFlow, sg.bigo.ads.ad.interstitial.d dVar, int i10) {
        this.f101440a = viewGroup;
        this.f101443d = viewFlow;
        this.f101447h = dVar;
        this.f101444e = i10;
    }

    public final void a(final int i10) {
        if (this.f101445f) {
            sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = a.this;
                    int i11 = i10;
                    if (i11 == aVar.f101441b && i11 == aVar.f101442c) {
                        aVar.b(i11);
                    }
                }
            });
        }
    }

    public final void b(int i10) {
        if (this.f101445f) {
            View viewA = this.f101443d.a(i10);
            Object tag = viewA.getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.f101525e);
            if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
                sg.bigo.ads.ad.interstitial.multi_img.view.d dVar = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag;
                this.f101441b = i10;
                this.f101446g = Float.MIN_VALUE;
                this.f101442c = i10;
                if (dVar.d(this.f101444e)) {
                    this.f101440a.setBackgroundColor(this.f101447h.a(dVar.f101535n));
                    return;
                }
                if (dVar.c(this.f101444e)) {
                    this.f101447h.a(dVar.f101536o);
                    Bitmap bitmap = dVar.f101537p;
                    int i11 = dVar.f101538q;
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(viewA.getResources(), bitmap);
                    bitmapDrawable.setAlpha(i11);
                    ViewGroup viewGroup = this.f101440a;
                    if (bitmap == null) {
                        bitmapDrawable = null;
                    }
                    a(viewGroup, bitmapDrawable, (BitmapDrawable) null);
                }
            }
        }
    }

    public static void a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
        a(viewGroup, "adview_background_main_tag", bitmapDrawable);
        a(viewGroup, "adview_background_second_tag", bitmapDrawable2);
    }

    public static void a(ViewGroup viewGroup, Object obj, BitmapDrawable bitmapDrawable) {
        ImageView imageView;
        View viewFindViewWithTag = viewGroup.findViewWithTag(obj);
        if (viewFindViewWithTag instanceof ImageView) {
            imageView = (ImageView) viewFindViewWithTag;
        } else {
            Context context = viewGroup.getContext();
            if (context != null) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setTag(obj);
                imageView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                u.a(imageView2, viewGroup, null, 0);
                imageView = imageView2;
            } else {
                imageView = null;
            }
        }
        if (imageView != null) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageDrawable(bitmapDrawable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void a(sg.bigo.ads.ad.interstitial.multi_img.view.d r3, float r4, int r5) {
        /*
            r2 = this;
            int r0 = r2.f101441b
            if (r5 == r0) goto L5
            goto L61
        L5:
            int r0 = r2.f101444e
            boolean r0 = r3.d(r0)
            if (r0 == 0) goto L10
            int r3 = r3.f101535n
            goto L12
        L10:
            int r3 = r3.f101536o
        L12:
            r2.f101446g = r4
            r1 = 0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L1e
            int r5 = r5 + (-1)
        L1b:
            r2.f101442c = r5
            goto L21
        L1e:
            int r5 = r5 + 1
            goto L1b
        L21:
            sg.bigo.ads.common.view.ViewFlow r5 = r2.f101443d
            int r1 = r2.f101442c
            android.view.View r5 = r5.a(r1)
            if (r5 == 0) goto L43
            int r1 = sg.bigo.ads.ad.interstitial.multi_img.view.d.f101525e
            java.lang.Object r5 = r5.getTag(r1)
            boolean r1 = r5 instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d
            if (r1 == 0) goto L43
            sg.bigo.ads.ad.interstitial.multi_img.view.d r5 = (sg.bigo.ads.ad.interstitial.multi_img.view.d) r5
            if (r0 == 0) goto L3c
            int r5 = r5.f101535n
            goto L3e
        L3c:
            int r5 = r5.f101536o
        L3e:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L44
        L43:
            r5 = 0
        L44:
            float r4 = java.lang.Math.abs(r4)
            if (r5 != 0) goto L4c
            r5 = r3
            goto L50
        L4c:
            int r5 = r5.intValue()
        L50:
            int r3 = sg.bigo.ads.common.w.b.a(r4, r3, r5)
            sg.bigo.ads.ad.interstitial.d r4 = r2.f101447h
            int r3 = r4.a(r3)
            if (r0 == 0) goto L61
            android.view.ViewGroup r4 = r2.f101440a
            r4.setBackgroundColor(r3)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.multi_img.a.a(sg.bigo.ads.ad.interstitial.multi_img.view.d, float, int):void");
    }
}

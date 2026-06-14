package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.my.target.a3;
import com.my.target.bc;
import com.my.target.c9;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import com.my.target.d;
import com.my.target.g7;
import com.my.target.g8;
import com.my.target.nativeads.NativeAdViewBinder;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.my.target.q7;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class r7 implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f60726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e8 f60727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b7 f60728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bc f60729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yb f60730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f8 f60731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f60732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final bc.a f60733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e7 f60734i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f60736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f60737l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f60739n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q7 f60740o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Parcelable f60741p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public g8 f60742q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f60743r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View.OnClickListener f60744s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View.OnClickListener f60745t;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f60735j = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f60738m = true;

    public class a extends bc.a {
        public a() {
        }

        @Override // com.my.target.bc.a
        public void a(boolean z10) {
            r7.this.d(z10);
        }

        @Override // com.my.target.bc.a
        public void a() {
            r7.this.d();
        }
    }

    public static final class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f7 f60747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f60748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public g7 f60749c;

        public b(f7 f7Var, c cVar) {
            this.f60747a = f7Var;
            this.f60748b = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g7 g7VarA = g7.a(this.f60747a);
            this.f60749c = g7VarA;
            g7VarA.a(this.f60748b);
            this.f60749c.a(view.getContext());
        }
    }

    public interface c extends q7.b, c9.a, m8, g7.a, a3.b {
        void a(Context context);

        void a(View view);

        void b();

        void f();
    }

    public r7(b7 b7Var, c cVar, e8 e8Var, MenuFactory menuFactory) {
        this.f60732g = cVar;
        this.f60728c = b7Var;
        this.f60726a = b7Var.O().size() > 0;
        this.f60727b = e8Var;
        this.f60734i = e7.b(b7Var.a(), menuFactory, cVar);
        this.f60744s = new View.OnClickListener() { // from class: k5.y1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86165b.b(view);
            }
        };
        this.f60745t = new View.OnClickListener() { // from class: k5.z1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86172b.c(view);
            }
        };
        s5 s5VarP = b7Var.P();
        this.f60736k = (s5VarP == null || s5VarP.k0() == null) ? false : true;
        this.f60729d = bc.a(b7Var.E(), b7Var.x(), s5VarP == null);
        this.f60730e = yb.a(b7Var.x());
        this.f60731f = new f8(b7Var.x());
        this.f60733h = new a();
    }

    public static r7 a(b7 b7Var, c cVar, e8 e8Var, MenuFactory menuFactory) {
        return new r7(b7Var, cVar, e8Var, menuFactory);
    }

    public final /* synthetic */ void b(View view) {
        this.f60732g.a(view, 1);
    }

    public final /* synthetic */ void c(View view) {
        this.f60732g.a(view, 2);
    }

    public void d() {
        g8 g8Var = this.f60742q;
        ViewGroup viewGroupO = g8Var != null ? g8Var.o() : null;
        if (viewGroupO != null) {
            this.f60732g.a(viewGroupO);
        }
    }

    public final /* synthetic */ void e(View view) {
        this.f60740o.b(view);
    }

    public void f() {
        this.f60729d.e();
        this.f60729d.a((bc.a) null);
        this.f60730e.a((View) null);
        e();
        if (this.f60742q == null) {
            return;
        }
        this.f60728c.d().a(1, 5004);
        IconAdView iconAdViewK = this.f60742q.k();
        if (iconAdViewK != null) {
            b(iconAdViewK);
        }
        MediaAdView mediaAdViewL = this.f60742q.l();
        if (mediaAdViewL != null) {
            e(mediaAdViewL);
        }
        c9 c9VarN = this.f60742q.n();
        if (c9VarN != null) {
            c9VarN.setPromoCardSliderListener(null);
            this.f60741p = c9VarN.getState();
            c9VarN.dispose();
        }
        ViewGroup viewGroupO = this.f60742q.o();
        if (viewGroupO != null) {
            this.f60734i.b(viewGroupO);
            viewGroupO.setVisibility(0);
        }
        a(this.f60742q, (View.OnClickListener) null, (View.OnClickListener) null);
        this.f60742q.a();
        this.f60742q = null;
        this.f60743r = null;
    }

    public void a(NativeAdViewBinder nativeAdViewBinder, List list, int i10) {
        ViewGroup rootAdView = nativeAdViewBinder.getRootAdView();
        if (this.f60739n) {
            this.f60728c.d().b(1, 5003);
            gb.b("NativeAdViewController: Registering ad was disabled by user");
            rootAdView.setVisibility(4);
        } else {
            g8 g8VarA = new g8.a().a(nativeAdViewBinder).a(list).a();
            this.f60742q = g8VarA;
            a(g8VarA, this.f60744s, this.f60745t);
            a(this.f60742q, i10);
        }
    }

    public void b(Context context) {
        bb.b(this.f60728c.x(), "closedByUser", -1, context);
        this.f60729d.e();
        this.f60729d.a((bc.a) null);
        this.f60730e.c();
        a(false);
        this.f60739n = true;
        g8 g8Var = this.f60742q;
        ViewGroup viewGroupO = g8Var != null ? g8Var.o() : null;
        if (viewGroupO != null) {
            viewGroupO.setVisibility(4);
        }
    }

    public void c(Context context) {
        this.f60734i.a(context);
    }

    public final void e() {
        q7 q7Var = this.f60740o;
        if (q7Var == null) {
            return;
        }
        q7Var.z();
    }

    public final /* synthetic */ void c(boolean z10) {
        if (z10) {
            this.f60732g.b();
        }
    }

    public final void c(MediaAdView mediaAdView, ImageData imageData) {
        a(mediaAdView, imageData);
        if (this.f60735j == 2) {
            return;
        }
        this.f60735j = 3;
        Context context = mediaAdView.getContext();
        z8 z8VarB = b(mediaAdView);
        if (z8VarB == null) {
            z8VarB = new y8(context);
            mediaAdView.addView(z8VarB.getView(), new ViewGroup.LayoutParams(-1, -1));
        }
        Parcelable parcelable = this.f60741p;
        if (parcelable != null) {
            z8VarB.restoreState(parcelable);
        }
        z8VarB.getView().setClickable(this.f60738m);
        z8VarB.setupCards(this.f60728c.O());
        z8VarB.setPromoCardSliderListener(this.f60732g);
        z8VarB.setVisibility(0);
        mediaAdView.setBackgroundColor(0);
    }

    public void d(boolean z10) {
        g8 g8Var = this.f60742q;
        if (g8Var != null && g8Var.o() != null) {
            if (this.f60735j == 1) {
                a(z10);
                return;
            }
            return;
        }
        f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(MediaAdView mediaAdView) {
        ImageData imageDataS = this.f60728c.s();
        ma maVar = (ma) mediaAdView.getImageView();
        if (imageDataS != null) {
            a3.a(imageDataS, maVar);
        }
        maVar.setImageData(null);
        mediaAdView.getProgressBarView().setVisibility(8);
        mediaAdView.getPlayButtonView().setVisibility(8);
        mediaAdView.setPlaceHolderDimension(0, 0);
        mediaAdView.setOnClickListener(null);
        mediaAdView.setBackgroundColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
        z8 z8VarB = b(mediaAdView);
        if (z8VarB != 0) {
            this.f60741p = z8VarB.getState();
            z8VarB.dispose();
            ((View) z8VarB).setVisibility(8);
        }
        com.my.target.a aVarA = a(mediaAdView);
        if (aVarA != null) {
            mediaAdView.removeView(aVarA);
        }
    }

    public final void d(MediaAdView mediaAdView) {
        ImageData imageDataS = this.f60728c.s();
        if (this.f60726a) {
            c(mediaAdView, imageDataS);
            return;
        }
        b(mediaAdView, imageDataS);
        com.my.target.a aVarC = this.f60743r != null ? c(mediaAdView) : null;
        if (this.f60736k) {
            a(mediaAdView, aVarC != null, this.f60732g);
        } else {
            d(mediaAdView, imageDataS);
        }
    }

    public int[] b() {
        c9 c9VarB;
        g8 g8Var = this.f60742q;
        if (g8Var == null) {
            return null;
        }
        int i10 = this.f60735j;
        if (i10 == 2) {
            c9VarB = g8Var.n();
        } else if (i10 == 3) {
            MediaAdView mediaAdViewL = g8Var.l();
            if (mediaAdViewL == null) {
                return null;
            }
            c9VarB = b(mediaAdViewL);
        } else {
            c9VarB = null;
        }
        if (c9VarB == null) {
            return null;
        }
        return c9VarB.getVisibleCardNumbers();
    }

    public void a(View view, List list, int i10, MediaAdView mediaAdView) {
        this.f60728c.d().a(1, 5000);
        if (!(view instanceof ViewGroup)) {
            this.f60728c.d().a(1, 5001, "rootView is not ViewGroup");
            gb.b("NativeAdViewController: Unable to register view for displaying NativeAd " + view + ", should be instance of ViewGroup");
            return;
        }
        if (this.f60739n) {
            this.f60728c.d().b(1, 5003);
            gb.b("NativeAdViewController: Registering ad was disabled by user");
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
            g8 g8VarA = new g8.a().b((ViewGroup) view).a(list).a(mediaAdView).a();
            this.f60742q = g8VarA;
            a(g8VarA, this.f60744s, this.f60745t);
            a(this.f60742q, i10);
        }
    }

    public final void b(IconAdView iconAdView) {
        iconAdView.setOnClickListener(null);
        ImageView imageView = iconAdView.getImageView();
        imageView.setImageBitmap(null);
        if (imageView instanceof ma) {
            ((ma) imageView).setPlaceholderDimensions(0, 0);
        }
        ImageData imageDataQ = this.f60728c.q();
        if (imageDataQ != null) {
            a3.a(imageDataQ, imageView);
        }
    }

    public final void d(MediaAdView mediaAdView, ImageData imageData) {
        a(mediaAdView, imageData);
        this.f60735j = 0;
        mediaAdView.getImageView().setVisibility(0);
        mediaAdView.getPlayButtonView().setVisibility(8);
        mediaAdView.getProgressBarView().setVisibility(8);
        if (this.f60738m) {
            b bVar = this.f60743r;
            if (bVar != null) {
                mediaAdView.setOnClickListener(bVar);
            } else {
                mediaAdView.setOnClickListener(new View.OnClickListener() { // from class: k5.b2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f85999b.d(view);
                    }
                });
            }
        }
    }

    public final com.my.target.a c(MediaAdView mediaAdView) {
        com.my.target.a aVarA = a(mediaAdView);
        if (aVarA == null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
            com.my.target.a aVar = new com.my.target.a(mediaAdView.getContext());
            mediaAdView.addView(aVar, layoutParams);
            aVarA = aVar;
        }
        aVarA.a(this.f60728c.N(), this.f60728c.M());
        aVarA.setOnClickListener(this.f60743r);
        return aVarA;
    }

    public final z8 b(MediaAdView mediaAdView) {
        if (!this.f60726a) {
            return null;
        }
        for (int i10 = 0; i10 < mediaAdView.getChildCount(); i10++) {
            KeyEvent.Callback childAt = mediaAdView.getChildAt(i10);
            if (childAt instanceof c9) {
                return (z8) childAt;
            }
        }
        return null;
    }

    public final /* synthetic */ void d(View view) {
        this.f60732g.a(view, 1);
    }

    public final void b(MediaAdView mediaAdView, ImageData imageData) {
        ma maVar = (ma) mediaAdView.getImageView();
        if (imageData == null) {
            maVar.setImageBitmap(null);
            return;
        }
        Bitmap bitmap = imageData.getBitmap();
        if (bitmap != null) {
            maVar.setImageBitmap(bitmap);
        } else {
            maVar.setImageBitmap(null);
            a3.a(imageData, maVar, new a3.b() { // from class: k5.d2
                @Override // com.my.target.a3.b
                public final void a(boolean z10) {
                    this.f86019a.b(z10);
                }
            });
        }
    }

    public final void a(g8 g8Var, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        List listE = g8Var.e();
        if (listE != null && !listE.isEmpty()) {
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                a((View) it.next(), onClickListener);
            }
            return;
        }
        Iterator it2 = g8Var.m().iterator();
        while (it2.hasNext()) {
            a((View) it2.next(), onClickListener);
        }
        a(g8Var.c(), onClickListener);
        a(g8Var.d(), onClickListener);
        a(g8Var.h(), onClickListener);
        a(g8Var.i(), onClickListener);
        a(g8Var.j(), onClickListener);
        a(g8Var.k(), onClickListener);
        a(g8Var.p(), onClickListener);
        a(g8Var.q(), onClickListener);
        a(g8Var.r(), onClickListener);
        a(g8Var.g(), onClickListener2);
    }

    public final /* synthetic */ void b(boolean z10) {
        if (z10) {
            this.f60732g.f();
        }
    }

    public final void a(g8 g8Var, int i10) {
        ViewGroup viewGroupO = g8Var.o();
        if (viewGroupO == null) {
            gb.b("NativeAdViewController: something wrong, adview is null");
            return;
        }
        c9 c9VarN = g8Var.n();
        this.f60738m = g8Var.s();
        f7 f7VarL = this.f60728c.L();
        if (f7VarL != null) {
            this.f60743r = new b(f7VarL, this.f60732g);
        }
        IconAdView iconAdViewK = g8Var.k();
        if (iconAdViewK == null) {
            this.f60728c.d().c(1, 5001, "iconAdView is null");
            gb.b("NativeAdViewController: IconAdView component not found in ad view " + viewGroupO.getClass().getName() + ". It will be required in future versions of sdk.");
        } else {
            ba.c();
        }
        MediaAdView mediaAdViewL = g8Var.l();
        if (mediaAdViewL == null) {
            gb.b("NativeAdViewController: MediaAdView component not found in ad view " + viewGroupO.getClass().getName() + ". It will be required in future versions of sdk.");
        } else {
            ba.d();
        }
        this.f60729d.a(this.f60733h);
        this.f60734i.a(viewGroupO, g8Var, this, i10);
        if (this.f60726a && c9VarN != null) {
            a(c9VarN);
        } else if (mediaAdViewL != null) {
            d(mediaAdViewL);
        }
        if (iconAdViewK != null) {
            a(iconAdViewK);
        }
        ba.b(viewGroupO.getContext());
        this.f60729d.c(viewGroupO);
        this.f60730e.a(viewGroupO);
        this.f60730e.b();
        this.f60731f.a(g8Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a() {
        MediaAdView mediaAdViewL;
        this.f60736k = false;
        this.f60735j = 0;
        q7 q7Var = this.f60740o;
        if (q7Var != null) {
            q7Var.z();
        }
        g8 g8Var = this.f60742q;
        if (g8Var == null || (mediaAdViewL = g8Var.l()) == null) {
            return;
        }
        mediaAdViewL.setBackgroundColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
        z8 z8VarB = b(mediaAdViewL);
        if (z8VarB != 0) {
            this.f60741p = z8VarB.getState();
            z8VarB.dispose();
            ((View) z8VarB).setVisibility(8);
        }
        a(mediaAdViewL, this.f60728c.s());
        mediaAdViewL.getImageView().setVisibility(0);
        mediaAdViewL.getProgressBarView().setVisibility(8);
        mediaAdViewL.getPlayButtonView().setVisibility(8);
        if (this.f60738m) {
            mediaAdViewL.setOnClickListener(new View.OnClickListener() { // from class: k5.a2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f85988b.a(view);
                }
            });
        }
    }

    public final /* synthetic */ void a(View view) {
        this.f60732g.a(view, 1);
    }

    @Override // com.my.target.d.a
    public void a(Context context) {
        this.f60732g.a(context);
    }

    public void a(boolean z10) {
        q7 q7Var = this.f60740o;
        if (q7Var == null) {
            return;
        }
        if (z10) {
            q7Var.w();
        } else {
            q7Var.v();
        }
    }

    public final void a(IconAdView iconAdView) {
        ImageView imageView = iconAdView.getImageView();
        if (imageView instanceof ma) {
            ma maVar = (ma) imageView;
            ImageData imageDataQ = this.f60728c.q();
            if (imageDataQ == null) {
                imageView.setImageBitmap(null);
                maVar.setPlaceholderDimensions(0, 0);
                return;
            }
            int width = imageDataQ.getWidth();
            int height = imageDataQ.getHeight();
            if (width <= 0 || height <= 0) {
                width = 100;
                height = 100;
            }
            maVar.setPlaceholderDimensions(width, height);
            Bitmap bitmap = imageDataQ.getBitmap();
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            } else {
                a3.a(imageDataQ, imageView, new a3.b() { // from class: k5.c2
                    @Override // com.my.target.a3.b
                    public final void a(boolean z10) {
                        this.f86008a.c(z10);
                    }
                });
            }
        }
    }

    public final void a(c9 c9Var) {
        this.f60735j = 2;
        c9Var.setPromoCardSliderListener(this.f60732g);
        Parcelable parcelable = this.f60741p;
        if (parcelable != null) {
            c9Var.restoreState(parcelable);
        }
    }

    public final void a(MediaAdView mediaAdView, q7 q7Var) {
        q7Var.a((m8) this.f60732g);
        g8 g8Var = this.f60742q;
        if (g8Var == null) {
            return;
        }
        q7Var.a(mediaAdView, g8Var.f());
    }

    public final void a(MediaAdView mediaAdView, boolean z10, q7.b bVar) {
        VideoData videoData;
        this.f60735j = 1;
        s5 s5VarP = this.f60728c.P();
        if (s5VarP != null) {
            mediaAdView.setPlaceHolderDimension(s5VarP.G(), s5VarP.p());
            videoData = (VideoData) s5VarP.k0();
        } else {
            videoData = null;
        }
        if (videoData == null) {
            return;
        }
        if (this.f60740o == null) {
            this.f60740o = new q7(this.f60728c, s5VarP, videoData, this.f60727b);
        }
        b bVar2 = this.f60743r;
        if (bVar2 != null) {
            mediaAdView.setOnClickListener(bVar2);
        } else {
            mediaAdView.setOnClickListener(new View.OnClickListener() { // from class: k5.x1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f86159b.e(view);
                }
            });
        }
        this.f60740o.a(bVar);
        this.f60740o.c(z10);
        this.f60740o.a(z10);
        a(mediaAdView, this.f60740o);
    }

    public final com.my.target.a a(MediaAdView mediaAdView) {
        int childCount = mediaAdView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = mediaAdView.getChildAt(i10);
            if (childAt instanceof com.my.target.a) {
                return (com.my.target.a) childAt;
            }
        }
        return null;
    }

    public final void a(MediaAdView mediaAdView, ImageData imageData) {
        if (imageData == null) {
            mediaAdView.setPlaceHolderDimension(0, 0);
            return;
        }
        int width = imageData.getWidth();
        int height = imageData.getHeight();
        if (!this.f60737l && width > 0 && height > 0) {
            mediaAdView.setPlaceHolderDimension(width, height);
        } else {
            mediaAdView.setPlaceHolderDimension(16, 9);
            this.f60737l = true;
        }
    }

    public final void a(View view, View.OnClickListener onClickListener) {
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }
}

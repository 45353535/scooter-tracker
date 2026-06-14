package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.my.target.a3;
import com.my.target.bc;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.ImageData;
import com.my.target.d;
import com.my.target.g8;
import com.my.target.nativeads.NativeBannerAdViewBinder;
import com.my.target.nativeads.views.IconAdView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class d8 implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b7 f59504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bc f59505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yb f59506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f8 f59507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f59508e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e7 f59510g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g8 f59513j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f59514k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View.OnClickListener f59511h = new View.OnClickListener() { // from class: k5.w
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f86152b.a(view);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View.OnClickListener f59512i = new View.OnClickListener() { // from class: k5.x
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f86157b.b(view);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bc.a f59509f = new a();

    public class a extends bc.a {
        public a() {
        }

        @Override // com.my.target.bc.a
        public void a() {
            d8.this.a();
        }
    }

    public interface b extends m8, a3.b {
        void a(View view);

        void b();

        void b(Context context);
    }

    public d8(b7 b7Var, b bVar, MenuFactory menuFactory) {
        this.f59508e = bVar;
        this.f59504a = b7Var;
        this.f59510g = e7.b(b7Var.a(), menuFactory, bVar);
        this.f59505b = bc.a(b7Var.E(), b7Var.x(), true);
        this.f59506c = yb.a(b7Var.x());
        this.f59507d = new f8(b7Var.x());
    }

    public void c(Context context) {
        this.f59510g.a(context);
    }

    public static d8 a(b7 b7Var, b bVar, MenuFactory menuFactory) {
        return new d8(b7Var, bVar, menuFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        b bVar = this.f59508e;
        if (bVar != null) {
            bVar.a(view, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        b bVar = this.f59508e;
        if (bVar != null) {
            bVar.a(view, 1);
        }
    }

    public void b() {
        this.f59505b.e();
        this.f59505b.a((bc.a) null);
        this.f59506c.a((View) null);
        g8 g8Var = this.f59513j;
        if (g8Var == null) {
            return;
        }
        IconAdView iconAdViewK = g8Var.k();
        if (iconAdViewK != null) {
            b(iconAdViewK);
        }
        ViewGroup viewGroupO = this.f59513j.o();
        if (viewGroupO != null) {
            this.f59510g.b(viewGroupO);
            viewGroupO.setVisibility(0);
        }
        a(this.f59513j, (View.OnClickListener) null, (View.OnClickListener) null);
        this.f59513j.a();
        this.f59513j = null;
    }

    public void a(NativeBannerAdViewBinder nativeBannerAdViewBinder, List list, int i10) {
        if (this.f59514k) {
            gb.b("Registering ad was disabled by user");
            nativeBannerAdViewBinder.getRootAdBannerView().setVisibility(4);
        } else {
            g8 g8VarA = new g8.a().a(nativeBannerAdViewBinder).a(list).a();
            this.f59513j = g8VarA;
            a(g8VarA, this.f59511h, this.f59512i);
            a(this.f59513j, i10);
        }
    }

    private void a(View view, View.OnClickListener onClickListener) {
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public void a(View view, List list, int i10) {
        if (this.f59514k) {
            gb.b("Registering ad was disabled by user");
            view.setVisibility(4);
            return;
        }
        view.setVisibility(0);
        if (!(view instanceof ViewGroup)) {
            gb.b("unable to register view for displaying NativeBannerAd " + view + ", should be instance of ViewGroup");
            return;
        }
        g8 g8VarA = new g8.a().b((ViewGroup) view).a(list).a();
        this.f59513j = g8VarA;
        a(g8VarA, this.f59511h, this.f59512i);
        a(this.f59513j, i10);
    }

    public void b(Context context) {
        bb.b(this.f59504a.x(), "closedByUser", -1, context);
        g8 g8Var = this.f59513j;
        ViewGroup viewGroupO = g8Var != null ? g8Var.o() : null;
        this.f59505b.e();
        this.f59505b.a((bc.a) null);
        this.f59506c.c();
        this.f59514k = true;
        if (viewGroupO != null) {
            viewGroupO.setVisibility(4);
        }
    }

    private void b(IconAdView iconAdView) {
        iconAdView.setOnClickListener(null);
        ImageView imageView = iconAdView.getImageView();
        imageView.setImageBitmap(null);
        if (imageView instanceof ma) {
            ((ma) imageView).setPlaceholderDimensions(0, 0);
        }
        ImageData imageDataQ = this.f59504a.q();
        if (imageDataQ != null) {
            a3.a(imageDataQ, imageView);
        }
    }

    private void a(g8 g8Var, int i10) {
        ViewGroup viewGroupO = g8Var.o();
        if (viewGroupO == null) {
            gb.b("something wrong, root ad view is null");
            return;
        }
        IconAdView iconAdViewK = g8Var.k();
        if (iconAdViewK == null) {
            gb.b("IconAdView component not found in ad view  " + viewGroupO + ". It's required");
            return;
        }
        ba.c();
        a(iconAdViewK);
        this.f59505b.a(this.f59509f);
        this.f59510g.a(viewGroupO, g8Var, this, i10);
        ba.b(viewGroupO.getContext());
        this.f59505b.c(viewGroupO);
        this.f59506c.a(viewGroupO);
        this.f59506c.b();
        this.f59507d.a(g8Var);
    }

    @Override // com.my.target.d.a
    public void a(Context context) {
        this.f59508e.b(context);
    }

    public void a() {
        g8 g8Var = this.f59513j;
        ViewGroup viewGroupO = g8Var != null ? g8Var.o() : null;
        if (viewGroupO != null) {
            this.f59508e.a(viewGroupO);
        }
    }

    private void a(IconAdView iconAdView) {
        ImageView imageView = iconAdView.getImageView();
        if (imageView instanceof ma) {
            ImageData imageDataQ = this.f59504a.q();
            if (imageDataQ != null) {
                Bitmap bitmap = imageDataQ.getBitmap();
                int width = imageDataQ.getWidth();
                int height = imageDataQ.getHeight();
                if (width <= 0 || height <= 0) {
                    width = 100;
                    height = 100;
                }
                ((ma) imageView).setPlaceholderDimensions(width, height);
                if (bitmap == null) {
                    a3.a(imageDataQ, imageView, new a3.b() { // from class: k5.v
                        @Override // com.my.target.a3.b
                        public final void a(boolean z10) {
                            this.f86149a.a(z10);
                        }
                    });
                    return;
                } else {
                    imageView.setImageBitmap(bitmap);
                    return;
                }
            }
            imageView.setImageBitmap(null);
            ((ma) imageView).setPlaceholderDimensions(0, 0);
        }
    }

    public final /* synthetic */ void a(boolean z10) {
        if (z10) {
            this.f59508e.b();
        }
    }

    private void a(g8 g8Var, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
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
        a(g8Var.d(), onClickListener);
        a(g8Var.c(), onClickListener);
        a(g8Var.k(), onClickListener);
        a(g8Var.q(), onClickListener);
        a(g8Var.j(), onClickListener);
        a(g8Var.r(), onClickListener);
        a(g8Var.p(), onClickListener);
        a(g8Var.i(), onClickListener);
        a(g8Var.g(), onClickListener2);
    }
}

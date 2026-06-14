package yads;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class l31 extends nh3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h21 f112939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h31 f112940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vy2 f112941e;

    public l31(ImageView imageView, h21 h21Var, h31 h31Var, vy2 vy2Var) {
        super(imageView);
        this.f112939c = h21Var;
        this.f112940d = h31Var;
        this.f112941e = vy2Var;
    }

    @Override // yads.nh3
    public final void a(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageDrawable(null);
        this.f112941e.a(imageView);
        imageView.setVisibility(8);
        imageView.setOnClickListener(null);
        imageView.setOnTouchListener(null);
        imageView.setSelected(false);
    }

    @Override // yads.nh3
    public final void b(View view, Object obj) {
        a((d31) obj);
    }

    public /* synthetic */ l31(ImageView imageView, hg2 hg2Var, t9 t9Var) {
        this(imageView, new h21(imageView.getContext(), new g22(t9Var), hg2Var), new h31(hg2Var), new vy2());
    }

    @Override // yads.nh3
    public final boolean a(View view, Object obj) {
        wp aj0Var;
        d31 d31Var = (d31) obj;
        h31 h31Var = this.f112940d;
        Drawable drawable = ((ImageView) view).getDrawable();
        Bitmap bitmapA = h31Var.f111462a.a(d31Var);
        if (bitmapA == null) {
            hg2 hg2Var = h31Var.f111462a;
            hg2Var.getClass();
            String str = d31Var.f109737g;
            gg2 gg2Var = str != null ? new gg2(str, new kx2(d31Var.f109731a, d31Var.f109732b)) : null;
            bitmapA = gg2Var != null ? (Bitmap) hg2Var.f111586c.get(gg2Var) : null;
        }
        if (drawable == null || bitmapA == null) {
            return false;
        }
        h31Var.f111463b.getClass();
        if (drawable instanceof BitmapDrawable) {
            aj0Var = new yp();
        } else {
            aj0Var = new aj0(new jq2(), new zp());
        }
        return aj0Var.a(drawable, bitmapA);
    }

    public final void a(final d31 d31Var) {
        this.f112939c.a(d31Var, new e21() { // from class: yads.li
            @Override // yads.e21
            public final void a(Drawable drawable) {
                l31.a(this.f113097a, d31Var, drawable);
            }
        });
    }

    public static final void a(l31 l31Var, d31 d31Var, Drawable drawable) {
        ImageView imageView;
        if (drawable == null || (imageView = (ImageView) l31Var.b()) == null) {
            return;
        }
        if (d31Var.f109735e != null) {
            l31Var.f112941e.a(drawable, imageView, d31Var);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }
}

package com.my.target;

import android.content.Context;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.my.target.f1;
import com.my.target.j0;
import com.my.target.k;
import com.my.target.l8;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public final class g7 implements k.a, j0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f7 f59715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bc f59716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f59717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f59718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f59719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l8 f59720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j0 f59721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f59722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f59723i;

    public interface a {
        void a(f7 f7Var, String str, Context context);
    }

    public g7(f7 f7Var) {
        this.f59715a = f7Var;
    }

    @Override // com.my.target.j0.a
    public void a() {
    }

    @Override // com.my.target.k.a
    public void r() {
        WeakReference weakReference = this.f59717c;
        if (weakReference != null) {
            k kVar = (k) weakReference.get();
            if (!this.f59722h) {
                bb.b(this.f59715a.x(), "closedByUser", -1, kVar.getContext());
            }
            this.f59717c.clear();
            this.f59717c = null;
        }
        bc bcVar = this.f59716b;
        if (bcVar != null) {
            bcVar.e();
            this.f59716b = null;
        }
        WeakReference weakReference2 = this.f59718d;
        if (weakReference2 != null) {
            weakReference2.clear();
            this.f59718d = null;
        }
        l8 l8Var = this.f59720f;
        if (l8Var != null) {
            l8Var.a();
        }
        j0 j0Var = this.f59721g;
        if (j0Var != null) {
            j0Var.a(this.f59720f != null ? 7000 : 0);
        }
    }

    public static g7 a(f7 f7Var) {
        return new g7(f7Var);
    }

    @Override // com.my.target.k.a
    public void b(boolean z10) {
        j0 j0Var;
        if (z10 == this.f59723i) {
            return;
        }
        this.f59723i = z10;
        bc bcVar = this.f59716b;
        if (bcVar == null) {
            return;
        }
        if (!z10) {
            bcVar.e();
            return;
        }
        WeakReference weakReference = this.f59718d;
        if (weakReference == null || (j0Var = (j0) weakReference.get()) == null) {
            return;
        }
        this.f59716b.c(j0Var);
    }

    public void a(a aVar) {
        this.f59719e = aVar;
    }

    public void a(Context context) {
        k kVarA = k.a(this, context);
        this.f59717c = new WeakReference(kVarA);
        try {
            kVarA.show();
        } catch (Throwable th2) {
            th2.printStackTrace();
            gb.b("Unable to start video dialog! Check myTarget MediaAdView, maybe it was created with non-Activity context");
            r();
        }
    }

    @Override // com.my.target.j0.a
    public void b(String str) {
        k kVar;
        WeakReference weakReference = this.f59717c;
        if (weakReference == null || (kVar = (k) weakReference.get()) == null) {
            return;
        }
        a aVar = this.f59719e;
        if (aVar != null) {
            aVar.a(this.f59715a, str, kVar.getContext());
        }
        this.f59722h = true;
        b(kVar);
    }

    @Override // com.my.target.k.a
    public void a(final k kVar, FrameLayout frameLayout) {
        f1 f1Var = new f1(frameLayout.getContext());
        f1Var.setOnCloseListener(new f1.a() { // from class: k5.o0
            @Override // com.my.target.f1.a
            public final void b() {
                this.f86104a.b(kVar);
            }
        });
        frameLayout.addView(f1Var, -1, -1);
        j0 j0Var = new j0(frameLayout.getContext());
        this.f59721g = j0Var;
        j0Var.setVisibility(8);
        this.f59721g.setBannerWebViewListener(this);
        f1Var.addView(this.f59721g, new FrameLayout.LayoutParams(-1, -1));
        this.f59721g.setData(this.f59715a.L());
        final ProgressBar progressBar = new ProgressBar(frameLayout.getContext(), null, android.R.attr.progressBarStyle);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(progressBar, layoutParams);
        frameLayout.postDelayed(new Runnable() { // from class: k5.p0
            @Override // java.lang.Runnable
            public final void run() {
                this.f86114b.a(progressBar);
            }
        }, 555L);
    }

    public final /* synthetic */ void a(ProgressBar progressBar) {
        a(this.f59721g, progressBar);
    }

    @Override // com.my.target.j0.a
    public void a(String str) {
        gb.a("NativeAdContentController: Content JS error - " + str);
    }

    @Override // com.my.target.j0.a
    public void a(WebView webView) {
        l8 l8Var = this.f59720f;
        if (l8Var == null) {
            return;
        }
        l8Var.a(webView, new l8.b[0]);
        this.f59720f.c();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(k kVar) {
        if (kVar.isShowing()) {
            kVar.dismiss();
        }
    }

    public final void a(j0 j0Var, ProgressBar progressBar) {
        this.f59720f = l8.a(this.f59715a, 1, null, j0Var.getContext());
        this.f59718d = new WeakReference(j0Var);
        progressBar.setVisibility(8);
        j0Var.setVisibility(0);
        bc bcVar = this.f59716b;
        if (bcVar != null) {
            bcVar.e();
        }
        bc bcVarB = bc.b(this.f59715a.E(), this.f59715a.x());
        this.f59716b = bcVarB;
        if (this.f59723i) {
            bcVarB.c(j0Var);
        }
    }
}

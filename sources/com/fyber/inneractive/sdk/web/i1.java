package com.fyber.inneractive.sdk.web;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public abstract class i1 extends i {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final c0 G;
    public com.fyber.inneractive.sdk.measurement.e H;
    public com.fyber.inneractive.sdk.measurement.tracker.e I;
    public final e1 J;
    public final f1 K;
    public final g1 L;
    public final h1 M;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f24005u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f24006v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f24007w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f24008x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f24009y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f24010z;

    public i1(boolean z10, c0 c0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(z10, rVar);
        this.f24005u = -1;
        this.f24006v = -1;
        this.f24007w = -1;
        this.f24008x = -1;
        this.f24009y = -1;
        this.f24010z = -1;
        this.A = false;
        this.B = true;
        this.C = false;
        this.D = false;
        this.E = false;
        this.I = null;
        this.J = new e1(this);
        this.K = new f1(this);
        this.L = new g1(this);
        this.M = new h1(this);
        this.G = c0Var;
    }

    public final void a(ArrayList arrayList) {
        if (this.f23971b != null) {
            String string = arrayList.toString();
            if (string.length() < 2) {
                return;
            }
            String str = "{" + string.substring(1, string.length() - 1) + "}";
            this.f23971b.a("window.mraidbridge.fireChangeEvent(" + str + ");");
            IAlog.e("Fire changes: %s", str);
        }
    }

    public void j() {
        m mVar = this.f23971b;
        if (mVar != null) {
            mVar.a("window.mraidbridge.fireReadyEvent();");
        }
    }

    public void k() {
        ArrayList arrayList = new ArrayList();
        m mVar = this.f23971b;
        if (mVar == null || mVar.getScaleX() == 1.0f || this.f23971b.getScaleY() == 1.0f) {
            arrayList.add(new com.fyber.inneractive.sdk.mraid.c0(this.f24007w, this.f24008x));
            arrayList.add(new com.fyber.inneractive.sdk.mraid.a0(this.f24005u, this.f24006v));
        } else {
            int widthDp = this.f23971b.getWidthDp();
            int heightDp = this.f23971b.getHeightDp();
            arrayList.add(new com.fyber.inneractive.sdk.mraid.c0(widthDp, heightDp));
            arrayList.add(new com.fyber.inneractive.sdk.mraid.a0(widthDp, heightDp));
        }
        m mVar2 = this.f23971b;
        int iC = com.fyber.inneractive.sdk.util.o.c(mVar2 != null ? mVar2.getWidth() : this.f24005u);
        m mVar3 = this.f23971b;
        arrayList.add(new com.fyber.inneractive.sdk.mraid.z(iC, com.fyber.inneractive.sdk.util.o.c(mVar3 != null ? mVar3.getHeight() : this.f24006v)));
        a(arrayList);
        a(new com.fyber.inneractive.sdk.mraid.d0(com.fyber.inneractive.sdk.mraid.f0.DEFAULT));
    }

    public final void l() {
        m mVar = this.f23971b;
        if (mVar != null) {
            this.C = true;
            if (this.A) {
                mVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
            }
            com.fyber.inneractive.sdk.util.r.f23896b.postDelayed(this.J, 0L);
        }
    }

    public boolean m() {
        c0 c0Var = this.G;
        return c0Var != null && c0Var.equals(c0.INTERSTITIAL);
    }

    public void n() {
        m mVar;
        if (this.C && this.D && this.A && (mVar = this.f23971b) != null) {
            mVar.a("FyberMraidVideoController.play()");
            h1 h1Var = this.M;
            if (h1Var != null) {
                com.fyber.inneractive.sdk.util.r.f23896b.postDelayed(h1Var, 5000L);
            }
            if (this.E) {
                this.f23971b.a("FyberMraidVideoController.mute(true)");
            }
        }
    }

    public void setAdDefaultSize(int i10, int i11) {
        this.f24009y = i10;
        this.f24010z = i11;
    }

    public void setAutoplayMRAIDVideos(boolean z10) {
        this.A = z10;
    }

    public void setCenteringTagsRequired(boolean z10) {
        this.B = z10;
    }

    public void setMuteMraidVideo(boolean z10) {
        this.E = z10;
    }

    public final void a(com.fyber.inneractive.sdk.mraid.y yVar) {
        if (this.f23971b != null) {
            String str = "{" + yVar.toString() + "}";
            this.f23971b.a("window.mraidbridge.fireChangeEvent(" + str + ");");
            IAlog.e("Fire changes: %s", str);
        }
    }

    public void a(Context context, boolean z10) {
        Window window;
        Window window2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (context != null) {
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        }
        Rect rect = new Rect();
        boolean z11 = context instanceof Activity;
        if (z11 && (window2 = ((Activity) context).getWindow()) != null) {
            window2.getDecorView().getWindowVisibleDisplayFrame(rect);
        }
        int i10 = rect.top;
        View viewFindViewById = (!z11 || (window = ((Activity) context).getWindow()) == null) ? null : window.findViewById(R.id.content);
        int top = viewFindViewById != null ? viewFindViewById.getTop() - i10 : 0;
        int i11 = displayMetrics.widthPixels;
        int i12 = displayMetrics.heightPixels;
        double d10 = i11;
        double d11 = 160.0d / ((double) displayMetrics.densityDpi);
        int widthDp = (int) (d11 * d10);
        int heightDp = (int) (d11 * ((double) i12));
        int iB = (i12 - i10) - top;
        m mVar = this.f23971b;
        if (mVar != null && mVar.getScaleX() != 1.0f && this.f23971b.getScaleY() != 1.0f) {
            widthDp = this.f23971b.getWidthDp();
            heightDp = this.f23971b.getHeightDp();
            iB = (com.fyber.inneractive.sdk.util.o.b(this.f23971b.getHeightDp()) - i10) - top;
            this.f24005u = this.f24007w;
        } else {
            this.f24005u = (int) ((160.0d / ((double) displayMetrics.densityDpi)) * d10);
        }
        this.f24006v = (int) ((160.0d / ((double) displayMetrics.densityDpi)) * ((double) iB));
        if (this.f24007w == widthDp && this.f24008x == heightDp) {
            return;
        }
        this.f24007w = widthDp;
        this.f24008x = heightDp;
        a(new com.fyber.inneractive.sdk.mraid.c0(widthDp, heightDp));
        a(new com.fyber.inneractive.sdk.mraid.a0(this.f24005u, this.f24006v));
        a(new com.fyber.inneractive.sdk.mraid.z(this.f24005u, this.f24006v));
        int i13 = this.f24009y;
        if (i13 > 0 && this.f24010z > 0) {
            a(new com.fyber.inneractive.sdk.mraid.x(com.fyber.inneractive.sdk.util.o.c(i13), com.fyber.inneractive.sdk.util.o.c(this.f24010z)));
            return;
        }
        m mVar2 = this.f23971b;
        if (mVar2 == null || mVar2.getWidth() <= 0 || this.f23971b.getHeight() <= 0) {
            return;
        }
        a(new com.fyber.inneractive.sdk.mraid.x(com.fyber.inneractive.sdk.util.o.c(this.f23971b.getWidth()), com.fyber.inneractive.sdk.util.o.c(this.f23971b.getHeight())));
    }
}

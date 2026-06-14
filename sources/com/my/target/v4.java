package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;
import com.my.target.common.models.ImageData;
import com.my.target.d;
import com.my.target.j0;
import com.my.target.l5;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class v4 implements j0.a, l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f60927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y2 f60928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f60929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f60930d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f60931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f60932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f60933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l5.a f60934h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f60935i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f60936j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j4 f60937k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f60938l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f60939m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f f60940n;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v4.this.b();
        }
    }

    public class b implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.my.target.b f60942a;

        public b(com.my.target.b bVar) {
            this.f60942a = bVar;
        }

        @Override // com.my.target.d.a
        public void a(Context context) {
            l5.a aVar = v4.this.f60934h;
            if (aVar != null) {
                aVar.a(this.f60942a, context);
            }
        }
    }

    public static class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v4 f60944a;

        public c(v4 v4Var) {
            this.f60944a = v4Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l5.a aVarC = this.f60944a.c();
            v4 v4Var = this.f60944a;
            j4 j4Var = v4Var.f60937k;
            if (aVarC == null || j4Var == null) {
                return;
            }
            aVarC.b(j4Var, v4Var.f60929c.getContext());
        }
    }

    public static class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v4 f60945a;

        public d(v4 v4Var) {
            this.f60945a = v4Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            l5.a aVarC = this.f60945a.c();
            if (aVarC != null) {
                aVarC.b(this.f60945a.f60929c.getContext());
            }
        }
    }

    public static class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y2 f60946a;

        public e(y2 y2Var) {
            this.f60946a = y2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            gb.a("InterstitialHtmlPresenter: Banner became just closeable");
            this.f60946a.setVisibility(0);
        }
    }

    public v4(Context context) {
        j0 j0Var = new j0(context);
        this.f60927a = j0Var;
        y2 y2Var = new y2(context);
        this.f60928b = y2Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f60929c = frameLayout;
        y2Var.setContentDescription("Close");
        kb.b(y2Var, "close_button");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = GravityCompat.END;
        y2Var.setVisibility(8);
        y2Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 1;
        j0Var.setLayoutParams(layoutParams2);
        frameLayout.addView(j0Var);
        if (y2Var.getParent() == null) {
            frameLayout.addView(y2Var);
        }
        Bitmap bitmapA = l0.a(kb.e(context).b(28));
        if (bitmapA != null) {
            y2Var.a(bitmapA, false);
        }
        i iVar = new i(context);
        this.f60931e = iVar;
        int iA = kb.a(10, context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(iA, iA, iA, iA);
        frameLayout.addView(iVar, layoutParams3);
    }

    public static v4 a(Context context) {
        return new v4(context);
    }

    @Override // com.my.target.j0.a
    public void b(String str) {
        l5.a aVar = this.f60934h;
        if (aVar != null) {
            aVar.a(this.f60937k, str, 1, j().getContext());
        }
    }

    public l5.a c() {
        return this.f60934h;
    }

    @Override // com.my.target.b5
    public void destroy() {
        a(0);
    }

    @Override // com.my.target.b5
    public View getCloseButton() {
        return this.f60928b;
    }

    @Override // com.my.target.b5
    public View j() {
        return this.f60929c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // com.my.target.b5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void pause() {
        /*
            r7 = this;
            long r0 = r7.f60935i
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1f
            long r0 = java.lang.System.currentTimeMillis()
            long r4 = r7.f60935i
            long r0 = r0 - r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1d
            long r4 = r7.f60936j
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L1d
            long r4 = r4 - r0
            r7.f60936j = r4
            goto L1f
        L1d:
            r7.f60936j = r2
        L1f:
            long r0 = r7.f60938l
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L3c
            long r0 = java.lang.System.currentTimeMillis()
            long r4 = r7.f60938l
            long r0 = r0 - r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L3a
            long r4 = r7.f60939m
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L3a
            long r4 = r4 - r0
            r7.f60939m = r4
            goto L3c
        L3a:
            r7.f60939m = r2
        L3c:
            com.my.target.v4$d r0 = r7.f60933g
            if (r0 == 0) goto L45
            android.os.Handler r1 = r7.f60930d
            r1.removeCallbacks(r0)
        L45:
            com.my.target.v4$e r0 = r7.f60932f
            if (r0 == 0) goto L4e
            android.os.Handler r1 = r7.f60930d
            r1.removeCallbacks(r0)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.v4.pause():void");
    }

    @Override // com.my.target.b5
    public void resume() {
        long j10 = this.f60936j;
        if (j10 > 0) {
            a(j10);
        }
        long j11 = this.f60939m;
        if (j11 > 0) {
            b(j11);
        }
    }

    @Override // com.my.target.b5
    public void stop() {
    }

    @Override // com.my.target.l5
    public void a(t4 t4Var, j4 j4Var) {
        this.f60937k = j4Var;
        this.f60927a.setBannerWebViewListener(this);
        String strQ = j4Var.Q();
        if (strQ == null) {
            c("failed to load, null source");
            return;
        }
        this.f60927a.setData(strQ);
        this.f60927a.setForceMediaPlayback(j4Var.P());
        ImageData imageDataM = j4Var.M();
        if (imageDataM != null) {
            this.f60928b.a(imageDataM.getBitmap(), false);
        }
        this.f60928b.setOnClickListener(new c(this));
        if (j4Var.L() > 0.0f) {
            gb.a("InterstitialHtmlPresenter: Banner will be allowed to close in " + j4Var.L() + " seconds");
            this.f60932f = new e(this.f60928b);
            long jL = (long) (j4Var.L() * 1000.0f);
            this.f60936j = jL;
            a(jL);
        } else {
            gb.a("InterstitialHtmlPresenter: Banner is allowed to close");
            this.f60928b.setVisibility(0);
        }
        float fR = j4Var.R();
        if (fR > 0.0f) {
            this.f60933g = new d(this);
            long j10 = ((long) fR) * 1000;
            this.f60939m = j10;
            b(j10);
        }
        a(j4Var);
        l5.a aVar = this.f60934h;
        if (aVar != null) {
            aVar.a(j4Var, j());
        }
    }

    public final void c(String str) {
        l5.a aVar = this.f60934h;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    public void b() {
        com.my.target.c cVarA;
        j4 j4Var = this.f60937k;
        if (j4Var == null || (cVarA = j4Var.a()) == null) {
            return;
        }
        f fVar = this.f60940n;
        if (fVar == null || !fVar.b()) {
            Context context = j().getContext();
            if (fVar == null) {
                y3.a(cVarA.b(), context);
            } else {
                fVar.a(context);
            }
        }
    }

    public final void b(long j10) {
        d dVar = this.f60933g;
        if (dVar == null) {
            return;
        }
        this.f60930d.removeCallbacks(dVar);
        this.f60938l = System.currentTimeMillis();
        this.f60930d.postDelayed(this.f60933g, j10);
    }

    @Override // com.my.target.l5
    public void a(int i10) {
        this.f60927a.b("window.playerDestroy && window.playerDestroy();");
        this.f60929c.removeView(this.f60927a);
        this.f60927a.a(i10);
    }

    @Override // com.my.target.j0.a
    public void a(String str) {
        c(str);
    }

    @Override // com.my.target.j0.a
    public void a(WebView webView) {
        l5.a aVar = this.f60934h;
        if (aVar != null) {
            aVar.a(webView);
        }
    }

    @Override // com.my.target.j0.a
    public void a() {
        l5.a aVar = this.f60934h;
        if (aVar == null) {
            return;
        }
        q5 q5VarF = q5.a("WebView error").f("InterstitialHtml WebView renderer crashed");
        j4 j4Var = this.f60937k;
        q5 q5VarE = q5VarF.e(j4Var == null ? null : j4Var.Q());
        j4 j4Var2 = this.f60937k;
        aVar.a(q5VarE.d(j4Var2 != null ? j4Var2.r() : null));
    }

    @Override // com.my.target.l5
    public void a(l5.a aVar) {
        this.f60934h = aVar;
    }

    public final void a(com.my.target.b bVar) {
        com.my.target.c cVarA = bVar.a();
        if (cVarA == null) {
            this.f60931e.setVisibility(8);
            return;
        }
        this.f60931e.setImageBitmap(cVarA.c().getBitmap());
        this.f60931e.setOnClickListener(new a());
        List listA = cVarA.a();
        if (listA == null) {
            return;
        }
        f fVarA = f.a(listA, new q1());
        this.f60940n = fVarA;
        fVarA.a(new b(bVar));
    }

    public final void a(long j10) {
        e eVar = this.f60932f;
        if (eVar == null) {
            return;
        }
        this.f60930d.removeCallbacks(eVar);
        this.f60935i = System.currentTimeMillis();
        this.f60930d.postDelayed(this.f60932f, j10);
    }
}

package com.bytedance.sdk.openadsdk.component;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.adsdk.ugeno.tvp.mml.a;
import com.bytedance.adsdk.ugeno.tvp.mml.b;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.mo;
import com.bytedance.sdk.openadsdk.component.tvp.mzz;
import com.bytedance.sdk.openadsdk.core.lnr.ud;
import com.bytedance.sdk.openadsdk.core.mo.jpc;
import com.bytedance.sdk.openadsdk.core.model.jl;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.jtx;
import com.bytedance.sdk.openadsdk.core.widget.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.yt;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class lnr {
    private jpc aaj;
    private com.bytedance.sdk.openadsdk.component.jpc.lnr bch;
    private PAGLogoView bjy;
    private jtx bqt;
    private jpc exc;
    private RelativeLayout exu;
    protected final com.bytedance.sdk.openadsdk.component.jpc.qdl fs;
    private yt jl;
    protected FrameLayout jpc;
    private jpc jtx;
    private float jyq;
    private View koa;

    @NonNull
    private final com.bytedance.sdk.openadsdk.component.tvp.jpc ljh = new com.bytedance.sdk.openadsdk.component.tvp.jpc();
    protected final boolean lnr;
    protected final FrameLayout mml;
    protected final int mo;
    protected final com.bytedance.sdk.openadsdk.component.qdl mzz;
    private float oth;
    protected final Activity qdl;
    private ImageView rdp;
    protected jpc rq;
    protected com.bytedance.sdk.openadsdk.core.mo.mml to;
    protected View tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    protected final ljh f16989ud;
    private jpc uw;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    protected int f16990wd;
    private com.bytedance.sdk.openadsdk.core.mo.mml xmv;
    private ImageView yt;

    public static class qdl implements mo.lnr {
        WeakReference<Activity> qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private final WeakReference<lnr> f16991ud;

        qdl(Activity activity, lnr lnrVar) {
            this.qdl = new WeakReference<>(activity);
            this.f16991ud = new WeakReference<>(lnrVar);
        }

        @Override // com.bytedance.sdk.openadsdk.component.mo.lnr
        public void qdl(Object obj) {
            lnr lnrVar;
            if (this.qdl.get() == null || this.qdl.get().isFinishing() || (lnrVar = this.f16991ud.get()) == null) {
                return;
            }
            lnrVar.qdl(obj);
        }
    }

    public static class ud implements yt.qdl {
        private final WeakReference<lnr> qdl;

        public ud(lnr lnrVar) {
            this.qdl = new WeakReference<>(lnrVar);
        }

        @Override // com.bytedance.sdk.openadsdk.utils.yt.qdl
        public void qdl() {
        }

        @Override // com.bytedance.sdk.openadsdk.utils.yt.qdl
        public void qdl(com.bytedance.sdk.openadsdk.jl.qdl.ud udVar) {
            lnr lnrVar;
            if (!udVar.mzz() || (lnrVar = this.qdl.get()) == null) {
                return;
            }
            lnrVar.qdl(udVar);
            if (udVar.ud() != null) {
                lnrVar.qdl(udVar.qdl());
            }
        }
    }

    public lnr(Activity activity, ljh ljhVar, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.qdl qdlVar, int i10, boolean z10, com.bytedance.sdk.openadsdk.component.jpc.qdl qdlVar2) {
        this.qdl = activity;
        this.f16989ud = ljhVar;
        this.mml = frameLayout;
        this.f16990wd = i10;
        this.lnr = z10;
        this.mzz = qdlVar;
        this.mo = ljhVar.fz();
        this.fs = qdlVar2;
    }

    private void jpc() {
        boolean z10;
        this.ljh.qdl();
        this.jtx.setText(this.f16989ud.uvi());
        if (this.f16989ud.xmv()) {
            tvp();
            return;
        }
        if (this.lnr) {
            ud(0);
            qdl(8);
            if (qdl(this.jpc)) {
                this.mzz.lnr();
            } else {
                this.mzz.mml();
            }
            mo.qdl(this.f16989ud, new qdl(this.qdl, this), 25);
        } else {
            ud(8);
            qdl(0);
            to();
            this.mzz.lnr();
        }
        boolean z11 = true;
        if (this.uw == null) {
            z10 = false;
        } else {
            if (TextUtils.isEmpty(this.f16989ud.ca())) {
                if (this.f16989ud.fhs() != null) {
                    this.uw.setText(this.f16989ud.fhs().ud());
                }
                z10 = false;
            } else {
                this.uw.setText(this.f16989ud.ca());
            }
            z10 = true;
        }
        if (this.xmv != null) {
            com.bytedance.sdk.openadsdk.jl.ud.ud().qdl(this.f16989ud.hcs(), this.xmv, this.f16989ud);
        }
        jtx jtxVar = this.bqt;
        if (jtxVar != null) {
            ax.qdl((TextView) null, jtxVar, this.f16989ud);
            if (this.f16989ud.fhs() == null || this.f16989ud.fhs().mml() < 0.0d) {
                this.bqt.setVisibility(8);
                z11 = z10;
            }
        } else {
            z11 = z10;
        }
        View view = this.koa;
        if (view != null) {
            view.setVisibility(z11 ? 0 : 8);
        }
    }

    private void to() {
        jl jlVar = this.f16989ud.vm().get(0);
        com.bytedance.sdk.openadsdk.utils.yt.qdl(new com.bytedance.sdk.openadsdk.jl.qdl(jlVar.qdl(), jlVar.wd()), jlVar.ud(), jlVar.lnr(), new ud(this), com.bytedance.sdk.openadsdk.component.wd.qdl.ud(TextUtils.isEmpty(jlVar.wd()) ? com.bytedance.sdk.component.utils.mzz.qdl(jlVar.qdl()) : jlVar.wd()).getParent(), 25);
    }

    private void tvp() {
        if (this.exc != null) {
            if (this.f16989ud.fhs() != null && !TextUtils.isEmpty(this.f16989ud.fhs().ud())) {
                this.exc.setText(this.f16989ud.fhs().ud());
            } else if (TextUtils.isEmpty(this.f16989ud.ca())) {
                this.exc.setVisibility(8);
            } else {
                this.exc.setText(this.f16989ud.ca());
            }
        }
        if (this.aaj != null) {
            if (TextUtils.isEmpty(this.f16989ud.gsv())) {
                this.aaj.setVisibility(8);
            } else {
                this.aaj.setText(this.f16989ud.gsv());
            }
        }
        if (this.jl != null && this.f16989ud.hcs() != null && !TextUtils.isEmpty(this.f16989ud.hcs().qdl())) {
            com.bytedance.sdk.openadsdk.jl.ud.ud().qdl(this.f16989ud.hcs().qdl(), this.f16989ud.hcs().ud(), this.f16989ud.hcs().lnr(), this.jl, this.f16989ud);
        }
        this.mzz.lnr();
    }

    public void lnr() {
        com.bytedance.sdk.openadsdk.component.jpc.lnr lnrVar = this.bch;
        if (lnrVar != null) {
            lnrVar.fs();
        }
    }

    public int mml() {
        return -1;
    }

    protected void mo() {
        this.tvp.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.lnr.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.bytedance.sdk.openadsdk.component.qdl qdlVar = lnr.this.mzz;
                if (qdlVar != null) {
                    qdlVar.ud(view);
                }
            }
        });
        this.to.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.lnr.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.bytedance.sdk.openadsdk.component.qdl qdlVar = lnr.this.mzz;
                if (qdlVar != null) {
                    qdlVar.qdl(view);
                }
            }
        });
    }

    public void mzz() {
    }

    public JSONObject qdl(JSONObject jSONObject) {
        return null;
    }

    public void ud() {
        if (this.f16989ud.vxm()) {
            this.mzz.lnr();
        } else {
            jpc();
        }
    }

    public com.bytedance.sdk.openadsdk.component.jpc.lnr wd() {
        return this.bch;
    }

    public void qdl(ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.component.tvp.lnr mmlVar = new com.bytedance.sdk.openadsdk.component.tvp.mml(this.qdl, this.f16989ud);
        int iXi = this.f16989ud.xi();
        if (iXi == 5) {
            mmlVar = new com.bytedance.sdk.openadsdk.component.tvp.mo(this.qdl, this.f16989ud);
        } else if (iXi == 4) {
            mmlVar = new com.bytedance.sdk.openadsdk.component.tvp.mzz(this.qdl, this.f16989ud);
        }
        com.bytedance.sdk.openadsdk.component.tvp.lnr lnrVar = mmlVar;
        this.exu = lnrVar;
        viewGroup.addView(lnrVar);
        this.yt = lnrVar.getBackImage();
        this.jpc = lnrVar.getVideoContainer();
        this.rdp = lnrVar.getImageView();
        this.jtx = lnrVar.getClickButton();
        this.bjy = lnrVar.getAdLogo();
        this.uw = lnrVar.getAdTitleTextView();
        this.xmv = lnrVar.getAdIconView();
        this.bqt = lnrVar.getScoreBar();
        this.koa = lnrVar.getOverlayLayout();
        if (this.f16989ud.xmv()) {
            this.jl = lnrVar.getIconOnlyView();
            this.exc = lnrVar.getTitle();
            this.aaj = lnrVar.getContent();
        }
        if (lnrVar.getDspAdChoice() != null) {
            lnrVar.getDspAdChoice().qdl(14, this.f16989ud);
        }
        if (!this.f16989ud.vxm()) {
            this.ljh.qdl(lnrVar, this.f16989ud, this.oth, this.jyq, this.lnr);
        }
        this.tvp = lnrVar.getTopDisLike();
        this.to = lnrVar.getTopSkip();
        this.rq = lnrVar.getTopCountDown();
        if (lnrVar instanceof com.bytedance.sdk.openadsdk.component.tvp.mzz) {
            ((com.bytedance.sdk.openadsdk.component.tvp.mzz) lnrVar).setRenderListener(new mzz.qdl() { // from class: com.bytedance.sdk.openadsdk.component.lnr.1
                @Override // com.bytedance.sdk.openadsdk.component.tvp.mzz.qdl
                public void qdl(View view, int i10) {
                    lnr.this.mzz.mzz();
                }
            });
        }
    }

    private void ud(int i10) {
        ax.qdl((View) this.jpc, i10);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void qdl() {
        this.bjy.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.lnr.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    lnr lnrVar = lnr.this;
                    TTWebsiteActivity.qdl(lnrVar.qdl, lnrVar.f16989ud, "open_ad");
                } catch (Throwable th2) {
                    aaj.lnr("AppOpenAdNativeManager", th2.getMessage());
                }
            }
        });
        mo();
        if (this.f16989ud.vxm()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.qdl.qdl qdlVarQdl = com.bytedance.sdk.openadsdk.component.qdl.ud.qdl(this.f16989ud, this.qdl, this.fs);
        qdlVarQdl.qdl(new ud.qdl() { // from class: com.bytedance.sdk.openadsdk.component.lnr.3
            @Override // com.bytedance.sdk.openadsdk.core.lnr.ud.qdl
            public void qdl(View view, int i10) {
                lnr.this.mzz.mzz();
            }
        });
        qdlVarQdl.qdl(this.bch);
        if (this.f16989ud.irn() == 1) {
            this.exu.setOnClickListener(qdlVarQdl);
            this.exu.setOnTouchListener(qdlVarQdl);
        }
        this.jtx.setOnClickListener(qdlVarQdl);
        this.jtx.setOnTouchListener(qdlVarQdl);
    }

    protected boolean qdl(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.jpc.lnr lnrVar = new com.bytedance.sdk.openadsdk.component.jpc.lnr(this.qdl);
        this.bch = lnrVar;
        return lnrVar.qdl(frameLayout, this.mzz, this.f16989ud);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(Object obj) {
        try {
            if (obj instanceof Bitmap) {
                this.yt.setImageDrawable(new BitmapDrawable(com.bytedance.sdk.openadsdk.core.yt.qdl().getResources(), (Bitmap) obj));
            }
        } catch (Throwable unused) {
            aaj.lnr("AppOpenAdNativeManager", "open_ad", "bindBackGroundImage error");
        }
    }

    void qdl(com.bytedance.sdk.openadsdk.jl.qdl.ud udVar) {
        if (this.rdp == null) {
            return;
        }
        if (udVar.ud() != null) {
            this.rdp.setImageBitmap(udVar.ud());
            return;
        }
        Drawable drawableMml = udVar.mml();
        if (drawableMml != null) {
            this.rdp.setScaleType(ImageView.ScaleType.FIT_CENTER);
            if (Build.VERSION.SDK_INT >= 28 && a.a(drawableMml)) {
                b.a(drawableMml).start();
            }
            this.rdp.setImageDrawable(drawableMml);
            return;
        }
        if (this.f16989ud.vm() == null || this.f16989ud.vm().get(0) == null) {
            return;
        }
        Drawable drawableQdl = com.bytedance.sdk.openadsdk.utils.yt.qdl(udVar.lnr(), this.f16989ud.vm().get(0).ud());
        this.rdp.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.rdp.setImageDrawable(drawableQdl);
    }

    void qdl(int i10) {
        ax.qdl((View) this.rdp, i10);
    }

    public void qdl(float f10, float f11) {
        this.oth = f10;
        this.jyq = f11;
    }

    public void qdl(int i10, boolean z10) {
        jpc jpcVar;
        if (this.to == null || (jpcVar = this.rq) == null) {
            return;
        }
        if (z10) {
            if (jpcVar.getVisibility() != 8) {
                this.rq.setVisibility(8);
            }
            if (this.to.getVisibility() != 0) {
                this.to.setVisibility(0);
                return;
            }
            return;
        }
        this.rq.setText(i10 + "s");
        if (this.rq.getVisibility() != 0) {
            this.rq.setVisibility(0);
        }
    }
}

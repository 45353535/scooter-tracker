package com.bytedance.sdk.openadsdk.core.tvp;

import com.bytedance.sdk.openadsdk.utils.fco;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class exu implements com.bytedance.adsdk.ugeno.core.jl, com.bytedance.sdk.component.adexpress.ud.tvp {
    private final com.bytedance.sdk.openadsdk.core.model.ljh lnr;
    private final String mml;
    private boolean mo;
    private long mzz;
    private final com.bytedance.sdk.openadsdk.mml.mml.mzz qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final String f17510ud;

    public exu(com.bytedance.sdk.openadsdk.mml.mml.mzz mzzVar, String str, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, String str2, boolean z10) {
        this.qdl = mzzVar;
        this.f17510ud = str;
        this.mml = str2;
        this.lnr = ljhVar;
        this.mo = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.tvp
    public void jpc() {
        this.qdl.rdp();
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.tvp
    public void lnr(int i10) {
        if (i10 == 3) {
            this.qdl.mml("dynamic_sub_analysis2_end");
        } else {
            this.qdl.mml("dynamic_sub_analysis_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.tvp
    public void mml() {
        this.qdl.qdl();
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.tvp
    public void mo(int i10) {
        final String str;
        System.currentTimeMillis();
        if (i10 == 3) {
            this.qdl.wd("dynamic_render2_success");
            str = "dynamic2_render";
        } else {
            this.qdl.wd("dynamic_render_success");
            str = "dynamic_backup_native_render";
        }
        this.qdl.qdl(true);
        fco.ud(new com.bytedance.sdk.component.jpc.jpc("dynamic_success") { // from class: com.bytedance.sdk.openadsdk.core.tvp.exu.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.mml.lnr.ud(exu.this.lnr, exu.this.f17510ud, str, (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.tvp
    public void mzz() {
        this.qdl.ud();
    }

    public void rq() {
        this.qdl.rq();
        this.qdl.fs();
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.tvp
    public void to() {
        this.qdl.ud();
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.tvp
    public void tvp() {
        this.qdl.bjy();
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.tvp
    public void wd() {
        this.qdl.qdl(true);
        this.qdl.exu();
        fco.ud(new com.bytedance.sdk.component.jpc.jpc("native_success") { // from class: com.bytedance.sdk.openadsdk.core.tvp.exu.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.mml.lnr.ud(exu.this.lnr, exu.this.f17510ud, "dynamic_backup_render", (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.tvp
    public void mml(int i10) {
        if (i10 == 3) {
            this.qdl.mml("dynamic_sub_render2_start");
        } else {
            this.qdl.mml("dynamic_sub_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.tvp
    public void mzz(int i10) {
        if (i10 == 3) {
            this.qdl.mml("dynamic_sub_render2_end");
        } else {
            this.qdl.mml("dynamic_sub_render_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.tvp
    public void qdl(boolean z10) {
        this.qdl.qdl(z10 ? 1 : 0);
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.tvp
    public void ud(int i10) {
        if (i10 == 3) {
            this.qdl.mml("dynamic_sub_analysis2_start");
        } else {
            this.qdl.mml("dynamic_sub_analysis_start");
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.jl
    public void lnr() {
        this.qdl.mzz("ugen_sub_render_start");
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.tvp
    public void qdl(int i10, String str) {
        this.qdl.qdl(i10, str);
        rq.qdl("Web", i10, str, this.f17510ud, this.mml, this.lnr);
    }

    @Override // com.bytedance.adsdk.ugeno.core.jl
    public void ud() {
        this.qdl.mzz("ugen_sub_analysis_end");
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.tvp
    public void qdl(int i10) {
        this.mzz = System.currentTimeMillis();
        if (i10 == 3) {
            this.qdl.lnr("dynamic_render2_start");
        } else {
            this.qdl.lnr("dynamic_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.tvp
    public void mo() {
        this.qdl.lnr();
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.tvp
    public void qdl(int i10, int i11, String str, boolean z10) {
        if (!z10) {
            this.qdl.qdl(true);
        }
        if (i10 == 3) {
            this.qdl.ud(i11, "dynamic_render2_error");
        } else {
            this.qdl.ud(i11, "dynamic_render_error");
        }
        rq.qdl("NDR", i11, str, this.f17510ud, this.mml, this.lnr);
    }

    @Override // com.bytedance.adsdk.ugeno.core.jl
    public void qdl() {
        this.qdl.qdl("ugen_render_start", this.mo);
        this.qdl.mzz("ugen_sub_analysis_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.jl
    public void qdl(com.bytedance.adsdk.ugeno.core.yt ytVar) {
        if (ytVar.qdl() == 0) {
            this.qdl.mzz("ugen_sub_render_end");
            this.qdl.mo("ugen_render_success");
        } else {
            this.qdl.lnr(ytVar.qdl(), "ugen_render_error");
            rq.qdl("UGen", ytVar.qdl(), ytVar.ud(), this.f17510ud, this.mml, this.lnr);
        }
        this.qdl.qdl(true);
    }
}

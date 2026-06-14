package com.bytedance.sdk.openadsdk.core.tvp;

import android.view.View;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.fco;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class jyq extends com.bytedance.sdk.component.adexpress.ud.qdl<qdl> {
    private final View lnr;
    private com.bytedance.sdk.component.adexpress.ud.lnr mml;
    private final com.bytedance.sdk.component.adexpress.ud.exu mo;
    private com.bytedance.sdk.component.adexpress.ud.wd mzz;
    AtomicBoolean qdl = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private qdl f17519ud;

    public jyq(View view, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.component.adexpress.ud.exu exuVar) {
        this.lnr = view;
        this.mo = exuVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud() {
        if (this.qdl.get()) {
            return;
        }
        com.bytedance.sdk.component.adexpress.ud.lnr lnrVar = this.mml;
        if (lnrVar == null || !lnrVar.qdl((aaj) this.lnr, 0)) {
            this.mzz.qdl(107, "backup false");
            return;
        }
        this.mo.mzz().wd();
        qdl qdlVar = (qdl) this.lnr.findViewWithTag("tt_express_backup_fl_tag_26");
        this.f17519ud = qdlVar;
        if (qdlVar == null) {
            this.mzz.qdl(107, "backupview is null");
            return;
        }
        com.bytedance.sdk.component.adexpress.ud.rdp rdpVar = new com.bytedance.sdk.component.adexpress.ud.rdp();
        qdl qdlVar2 = this.f17519ud;
        float realWidth = qdlVar2 == null ? 0.0f : qdlVar2.getRealWidth();
        qdl qdlVar3 = this.f17519ud;
        float realHeight = qdlVar3 != null ? qdlVar3.getRealHeight() : 0.0f;
        rdpVar.qdl(true);
        rdpVar.qdl(realWidth);
        rdpVar.ud(realHeight);
        this.mzz.qdl(this.f17519ud, rdpVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.mml
    public void qdl(com.bytedance.sdk.component.adexpress.ud.wd wdVar) {
        this.mzz = wdVar;
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tvp.jyq.1
            @Override // java.lang.Runnable
            public void run() {
                jyq.this.ud();
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.mml
    /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
    public qdl mzz() {
        return this.f17519ud;
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.qdl
    public void qdl(com.bytedance.sdk.component.adexpress.ud.lnr lnrVar) {
        this.mml = lnrVar;
    }
}

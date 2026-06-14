package com.bytedance.sdk.component.adexpress.ud;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.adexpress.ud.to;

/* JADX INFO: loaded from: classes6.dex */
public class ud implements to {
    private ThemeStatusBroadcastReceiver lnr;
    private jpc mml;
    private int mo;
    private exu mzz;
    private Context qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.qdl.qdl f16485ud;

    public ud(Context context, exu exuVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, com.bytedance.sdk.component.adexpress.dynamic.mzz.jpc jpcVar, jpc jpcVar2, com.bytedance.sdk.component.adexpress.dynamic.mo.qdl qdlVar, com.bytedance.sdk.component.adexpress.dynamic.qdl.qdl qdlVar2) {
        this.qdl = context;
        this.mzz = exuVar;
        this.lnr = themeStatusBroadcastReceiver;
        this.mml = jpcVar2;
        if (qdlVar2 != null) {
            this.f16485ud = qdlVar2;
        } else {
            this.f16485ud = new com.bytedance.sdk.component.adexpress.dynamic.qdl.qdl(context, themeStatusBroadcastReceiver, z10, jpcVar, exuVar, qdlVar);
        }
        this.f16485ud.qdl(this.mml);
        if (jpcVar instanceof com.bytedance.sdk.component.adexpress.dynamic.mzz.wd) {
            this.mo = 3;
        } else {
            this.mo = 2;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.to
    public boolean qdl(final to.qdl qdlVar) {
        this.mzz.mzz().qdl(this.mo);
        this.f16485ud.qdl(new wd() { // from class: com.bytedance.sdk.component.adexpress.ud.ud.1
            @Override // com.bytedance.sdk.component.adexpress.ud.wd
            public void qdl(View view, rdp rdpVar) {
                if (qdlVar.lnr()) {
                    return;
                }
                ud.this.mzz.mzz().mzz(ud.this.mo);
                ud.this.mzz.mzz().mo(ud.this.mo);
                ud.this.mzz.mzz().to();
                bjy bjyVarUd = qdlVar.ud();
                if (bjyVarUd == null) {
                    return;
                }
                bjyVarUd.qdl(ud.this.f16485ud, rdpVar);
                qdlVar.qdl(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.ud.wd
            public void qdl(int i10, String str) {
                ud.this.mzz.mzz().qdl(ud.this.mo, i10, str, qdlVar.ud(ud.this));
                if (qdlVar.ud(ud.this)) {
                    qdlVar.qdl(ud.this);
                    return;
                }
                bjy bjyVarUd = qdlVar.ud();
                if (bjyVarUd == null) {
                    return;
                }
                bjyVarUd.a_(i10);
            }
        });
        return true;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.mml ud() {
        com.bytedance.sdk.component.adexpress.dynamic.qdl.qdl qdlVar = this.f16485ud;
        if (qdlVar != null) {
            return qdlVar.mml();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.to
    public void qdl() {
        com.bytedance.sdk.component.adexpress.dynamic.qdl.qdl qdlVar = this.f16485ud;
        if (qdlVar != null) {
            qdlVar.ud();
        }
    }
}

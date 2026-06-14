package com.bytedance.sdk.component.adexpress.ud;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.ud.to;

/* JADX INFO: loaded from: classes6.dex */
public class mo implements to {
    private exu lnr;
    private Context qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private qdl f16481ud;

    public mo(Context context, exu exuVar, qdl qdlVar) {
        this.qdl = context;
        this.f16481ud = qdlVar;
        this.lnr = exuVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.to
    public void qdl() {
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.to
    public boolean qdl(final to.qdl qdlVar) {
        this.lnr.mzz().mo();
        this.f16481ud.qdl(new wd() { // from class: com.bytedance.sdk.component.adexpress.ud.mo.1
            @Override // com.bytedance.sdk.component.adexpress.ud.wd
            public void qdl(View view, rdp rdpVar) {
                if (qdlVar.lnr()) {
                    return;
                }
                bjy bjyVarUd = qdlVar.ud();
                if (bjyVarUd != null) {
                    bjyVarUd.qdl(mo.this.f16481ud, rdpVar);
                }
                qdlVar.qdl(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.ud.wd
            public void qdl(int i10, String str) {
                bjy bjyVarUd = qdlVar.ud();
                if (bjyVarUd != null) {
                    bjyVarUd.a_(i10);
                }
            }
        });
        return true;
    }

    public void qdl(lnr lnrVar) {
        this.f16481ud.qdl(lnrVar);
    }
}

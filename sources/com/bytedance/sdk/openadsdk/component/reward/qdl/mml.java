package com.bytedance.sdk.openadsdk.component.reward.qdl;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.lnr.lnr;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mml {
    private final String lnr;
    private boolean mml;
    private final com.bytedance.sdk.openadsdk.component.reward.qdl.qdl mzz;
    com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final ljh f17083ud;

    public interface qdl {
        void qdl(View view, float f10, float f11, float f12, float f13, SparseArray<lnr.qdl> sparseArray, int i10, int i11, int i12);

        void qdl(String str, JSONObject jSONObject);
    }

    public mml(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        this.mzz = qdlVar;
        this.f17083ud = qdlVar.f17090ud;
        this.lnr = qdlVar.mzz;
    }

    private void mml() {
        if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr() && this.f17083ud.ygv() == 4) {
            this.qdl = com.bytedance.sdk.openadsdk.exc.qdl.qdl.wd.qdl(this.mzz.om, this.lnr);
        }
        if (this.qdl == null) {
            this.qdl = com.bytedance.sdk.openadsdk.exc.qdl.qdl.wd.qdl(this.mzz.f17086ag, this.lnr);
        }
    }

    public com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo lnr() {
        return this.qdl;
    }

    public void qdl() {
        if (this.mml) {
            return;
        }
        this.mml = true;
        mml();
    }

    public void ud() {
        com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo moVar = this.qdl;
        if (moVar != null) {
            moVar.lnr(this.f17083ud);
        }
    }

    public void qdl(View view, float f10, float f11, float f12, float f13, SparseArray<lnr.qdl> sparseArray, int i10, int i11, int i12, qdl qdlVar) {
        if (this.qdl != null) {
            int id2 = view.getId();
            if (id2 == com.bytedance.sdk.openadsdk.utils.jtx.mzz) {
                qdlVar.qdl("click_play_star_level", null);
                return;
            }
            if (id2 == com.bytedance.sdk.openadsdk.utils.jtx.mml) {
                qdlVar.qdl("click_play_star_nums", null);
                return;
            } else if (id2 == com.bytedance.sdk.openadsdk.utils.jtx.lnr) {
                qdlVar.qdl("click_play_source", null);
                return;
            } else {
                if (id2 == com.bytedance.sdk.openadsdk.utils.jtx.f17869ud) {
                    qdlVar.qdl("click_play_logo", null);
                    return;
                }
                return;
            }
        }
        qdlVar.qdl(view, f10, f11, f12, f13, sparseArray, i10, i11, i12);
    }
}

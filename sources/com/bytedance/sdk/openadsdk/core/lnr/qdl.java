package com.bytedance.sdk.openadsdk.core.lnr;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.jl;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.tvp.jpc;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.utils.jtx;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class qdl extends ud {
    private int fco;
    private WeakReference<InterfaceC0263qdl> hkc;
    private boolean hzv;
    private boolean lnr;
    private boolean qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private boolean f17299ud;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.lnr.qdl$qdl, reason: collision with other inner class name */
    public interface InterfaceC0263qdl {
        long getVideoProgress();
    }

    public qdl(@NonNull Context context, @NonNull ljh ljhVar, @NonNull String str, int i10) {
        super(context, ljhVar, str, i10);
        this.qdl = true;
        this.f17299ud = false;
        this.lnr = false;
        this.hzv = false;
    }

    private boolean jpc() {
        return this instanceof jpc;
    }

    private boolean tvp() {
        ljh ljhVar = ((ud) this).mo;
        if (ljhVar == null || jpc()) {
            return false;
        }
        if (ljhVar.vxg() != 5 && ljhVar.vxg() != 15) {
            return false;
        }
        if (this.fco == 0) {
            this.fco = ljhVar.vz();
        }
        ud();
        qdl();
        lnr();
        if (this.fco == 5 && wd() && qdl() && !ud() && !lnr()) {
            return false;
        }
        int i10 = this.fco;
        return i10 == 1 || i10 == 2 || i10 == 5;
    }

    private boolean wd() {
        ljh ljhVar = ((ud) this).mo;
        return ljh.mzz(ljhVar) && ljhVar.kab() == 1;
    }

    public boolean lnr() {
        return false;
    }

    public void mml(boolean z10) {
        this.hzv = z10;
    }

    public void qdl(boolean z10) {
        this.qdl = z10;
    }

    public boolean ud() {
        return false;
    }

    private boolean lnr(View view) {
        if (view == null) {
            return false;
        }
        if ((view instanceof com.bytedance.sdk.openadsdk.core.exu.ud.mo) || view.getId() == jtx.tdy || view.getId() == jtx.ax || view.getId() == jtx.f17858ag || view.getId() == jtx.f17871wc || view.getId() == jtx.om || view.getId() == 520093726 || view.getId() == jtx.f17862hd) {
            return true;
        }
        if (view instanceof ViewGroup) {
            int i10 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i10 >= viewGroup.getChildCount()) {
                    break;
                }
                if (lnr(viewGroup.getChildAt(i10))) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fc  */
    @Override // com.bytedance.sdk.openadsdk.core.lnr.ud, com.bytedance.sdk.openadsdk.core.lnr.lnr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void qdl(android.view.View r27, float r28, float r29, float r30, float r31, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 925
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.lnr.qdl.qdl(android.view.View, float, float, float, float, android.util.SparseArray, boolean):void");
    }

    public void ud(boolean z10) {
        this.f17299ud = z10;
    }

    private String ud(String str) {
        str.getClass();
        switch (str) {
            case "banner_ad":
                return "banner_call";
            case "open_ad":
                return "open_ad";
            case "embeded_ad":
                return "feed_call";
            case "interaction":
                return "interaction_call";
            case "slide_banner_ad":
                return "banner_call";
            default:
                return "";
        }
    }

    public void lnr(boolean z10) {
        this.lnr = z10;
    }

    protected boolean qdl() {
        ljh ljhVar = ((ud) this).mo;
        if (ljhVar == null) {
            return true;
        }
        int iUd = yt.mml().ud(ljhVar.fz());
        int iLnr = jl.lnr(yt.qdl());
        if (iUd == 1) {
            return gy.mml(iLnr);
        }
        if (iUd == 2) {
            return gy.mzz(iLnr) || gy.mml(iLnr) || gy.mo(iLnr);
        }
        if (iUd != 3) {
            return iUd != 5 || gy.mml(iLnr) || gy.mo(iLnr);
        }
        return false;
    }

    public void qdl(InterfaceC0263qdl interfaceC0263qdl) {
        this.hkc = new WeakReference<>(interfaceC0263qdl);
    }
}

package com.bytedance.adsdk.ugeno.qdl;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class mo {
    private Context lnr;
    private com.bytedance.adsdk.ugeno.ud.lnr mml;
    private List<lnr> qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private List<qdl> f16218ud;

    public mo(Context context, com.bytedance.adsdk.ugeno.ud.lnr lnrVar, List<lnr> list) {
        this.mml = lnrVar;
        this.lnr = context;
        this.qdl = list;
        mml();
    }

    private void mml() {
        this.f16218ud = new ArrayList();
        List<lnr> list = this.qdl;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < this.qdl.size(); i10++) {
            lnr lnrVar = this.qdl.get(i10);
            if (lnrVar != null) {
                this.f16218ud.add(new qdl(this.lnr, this.mml, lnrVar));
            }
        }
    }

    public void lnr() {
        List<qdl> list = this.f16218ud;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (qdl qdlVar : this.f16218ud) {
            if (qdlVar != null) {
                qdlVar.lnr();
            }
        }
    }

    public void qdl() {
        List<qdl> list = this.f16218ud;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (qdl qdlVar : this.f16218ud) {
            if (qdlVar != null) {
                qdlVar.mml();
            }
        }
    }

    public void ud() {
        List<qdl> list = this.f16218ud;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (qdl qdlVar : this.f16218ud) {
            if (qdlVar != null) {
                qdlVar.qdl();
            }
        }
    }

    public void qdl(Canvas canvas) {
        List<qdl> list = this.f16218ud;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (qdl qdlVar : this.f16218ud) {
            if (qdlVar != null) {
                qdlVar.qdl(canvas);
            }
        }
    }

    public void ud(Canvas canvas) {
        List<qdl> list = this.f16218ud;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (qdl qdlVar : this.f16218ud) {
            if (qdlVar != null) {
                qdlVar.ud(canvas);
            }
        }
    }

    public void qdl(int i10, int i11) {
        List<qdl> list = this.f16218ud;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (qdl qdlVar : this.f16218ud) {
            if (qdlVar != null) {
                qdlVar.qdl(i10, i11);
            }
        }
    }

    public qdl qdl(String str) {
        List<qdl> list = this.f16218ud;
        if (list != null && !list.isEmpty()) {
            for (qdl qdlVar : this.f16218ud) {
                if (qdlVar != null && TextUtils.equals(qdlVar.mzz(), str)) {
                    return qdlVar;
                }
            }
        }
        return null;
    }
}

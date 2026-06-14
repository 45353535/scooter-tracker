package com.bytedance.sdk.component.qdl;

import android.webkit.WebView;
import com.bytedance.sdk.component.qdl.lnr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class bjy {
    private final tvp lnr;
    private final List<fs> mml;
    private volatile boolean mzz;
    private final qdl qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final WebView f16653ud;

    bjy(tvp tvpVar) {
        ArrayList arrayList = new ArrayList();
        this.mml = arrayList;
        this.mzz = false;
        this.lnr = tvpVar;
        if (tvpVar.qdl != null) {
            qdl qdlVar = tvpVar.f16667ud;
            if (qdlVar == null) {
                this.qdl = new aaj();
            } else {
                this.qdl = qdlVar;
            }
        } else {
            this.qdl = tvpVar.f16667ud;
        }
        this.qdl.lnr(tvpVar);
        this.f16653ud = tvpVar.qdl;
        arrayList.add(tvpVar.tvp);
        exc.qdl(tvpVar.f16668wd);
    }

    public static tvp qdl(WebView webView) {
        return new tvp(webView);
    }

    private void ud() {
        if (this.mzz) {
            jpc.qdl(new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }

    public bjy qdl(String str, mml<?, ?> mmlVar) {
        return qdl(str, (String) null, mmlVar);
    }

    public bjy qdl(Set<String> set, jl<?, ?> jlVar) {
        return qdl(set, (String) null, jlVar);
    }

    public bjy qdl(String str, String str2, mml<?, ?> mmlVar) {
        ud();
        this.qdl.f16661wd.qdl(str, mmlVar);
        return this;
    }

    public bjy qdl(Set<String> set, String str, jl<?, ?> jlVar) {
        ud();
        this.qdl.f16661wd.qdl(set, jlVar);
        return this;
    }

    public bjy qdl(String str, lnr.ud udVar) {
        return qdl(str, (String) null, udVar);
    }

    public bjy qdl(String str, String str2, lnr.ud udVar) {
        ud();
        this.qdl.f16661wd.qdl(str, udVar);
        return this;
    }

    public void qdl() {
        if (this.mzz) {
            return;
        }
        this.qdl.ud();
        this.mzz = true;
        Iterator<fs> it = this.mml.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}

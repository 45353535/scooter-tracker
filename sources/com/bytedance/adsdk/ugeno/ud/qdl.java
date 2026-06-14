package com.bytedance.adsdk.ugeno.ud;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.wd.jpc;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class qdl<E extends ViewGroup> extends lnr {
    protected List<lnr<View>> qdl;

    public qdl(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    protected lnr lnr(String str) {
        lnr<T> lnrVarWd;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.fs) && this.mlb == 0) {
            return this;
        }
        if (this.mlb != 0) {
            return null;
        }
        for (lnr<View> lnrVar : this.qdl) {
            if (lnrVar != null && (lnrVarWd = lnrVar.wd(str)) != 0) {
                return lnrVarWd;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    protected lnr mml(String str) {
        lnr<T> lnrVarJpc;
        if (!TextUtils.isEmpty(str) && exu(str) != null) {
            return this;
        }
        for (lnr<View> lnrVar : this.qdl) {
            if (lnrVar != null && (lnrVarJpc = lnrVar.jpc(str)) != 0) {
                return lnrVarJpc;
            }
        }
        return null;
    }

    public void qdl(lnr lnrVar) {
        if (lnrVar == null) {
            return;
        }
        this.qdl.add(lnrVar);
        View viewRq = lnrVar.rq();
        if (viewRq != null) {
            ((ViewGroup) this.mzz).addView(viewRq);
        }
    }

    public C0215qdl to() {
        return new C0215qdl(this);
    }

    public List<lnr<View>> tvp() {
        return this.qdl;
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public void ud() {
        super.ud();
    }

    public qdl(Context context, qdl qdlVar) {
        super(context, qdlVar);
        this.qdl = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public lnr ud(String str) {
        lnr<T> lnrVarMo;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.fs)) {
            return this;
        }
        for (lnr<View> lnrVar : this.qdl) {
            if (lnrVar != null && (lnrVarMo = lnrVar.mo(str)) != 0) {
                return lnrVarMo;
            }
        }
        return null;
    }

    public void qdl(lnr lnrVar, ViewGroup.LayoutParams layoutParams) {
        if (lnrVar == null) {
            return;
        }
        this.qdl.add(lnrVar);
        View viewRq = lnrVar.rq();
        if (viewRq != null) {
            ((ViewGroup) this.mzz).addView(viewRq, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public lnr qdl(String str) {
        lnr<T> lnrVarMzz;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.rq)) {
            return this;
        }
        for (lnr<View> lnrVar : this.qdl) {
            if (lnrVar != null && (lnrVarMzz = lnrVar.mzz(str)) != 0) {
                return lnrVarMzz;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ud.qdl$qdl, reason: collision with other inner class name */
    public static class C0215qdl {
        protected boolean aaj;
        protected ViewGroup.LayoutParams bch;
        protected boolean bjy;
        protected boolean exc;
        protected float exu;
        protected float fs;
        protected boolean jl;
        protected float jpc;
        protected boolean jtx;
        protected boolean jyq;
        protected boolean ljh;
        protected float mo;
        protected float mzz;
        protected boolean oth;
        protected float rdp;
        protected float rq;
        protected float to;
        protected float tvp;
        protected qdl uw;

        /* JADX INFO: renamed from: wd, reason: collision with root package name */
        protected float f16270wd;
        protected boolean yt;
        protected float qdl = -2.0f;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        protected float f16269ud = -2.0f;
        protected float lnr = 0.0f;
        protected float mml = 0.0f;

        public C0215qdl(qdl qdlVar) {
            this.uw = qdlVar;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public void qdl(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            str.getClass();
            byte b10 = -1;
            switch (str.hashCode()) {
                case -1501175880:
                    if (str.equals("paddingLeft")) {
                        b10 = 0;
                    }
                    break;
                case -1375815020:
                    if (str.equals("minWidth")) {
                        b10 = 1;
                    }
                    break;
                case -1221029593:
                    if (str.equals("height")) {
                        b10 = 2;
                    }
                    break;
                case -1081309778:
                    if (str.equals("margin")) {
                        b10 = 3;
                    }
                    break;
                case -1044792121:
                    if (str.equals("marginTop")) {
                        b10 = 4;
                    }
                    break;
                case -806339567:
                    if (str.equals("padding")) {
                        b10 = 5;
                    }
                    break;
                case -289173127:
                    if (str.equals("marginBottom")) {
                        b10 = 6;
                    }
                    break;
                case -133587431:
                    if (str.equals("minHeight")) {
                        b10 = 7;
                    }
                    break;
                case 90130308:
                    if (str.equals("paddingTop")) {
                        b10 = 8;
                    }
                    break;
                case 113126854:
                    if (str.equals("width")) {
                        b10 = 9;
                    }
                    break;
                case 202355100:
                    if (str.equals("paddingBottom")) {
                        b10 = 10;
                    }
                    break;
                case 713848971:
                    if (str.equals("paddingRight")) {
                        b10 = Ascii.VT;
                    }
                    break;
                case 975087886:
                    if (str.equals("marginRight")) {
                        b10 = Ascii.FF;
                    }
                    break;
                case 1970934485:
                    if (str.equals("marginLeft")) {
                        b10 = 13;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    this.rq = jpc.qdl(context, str2);
                    this.jtx = true;
                    break;
                case 1:
                    this.lnr = jpc.qdl(context, str2);
                    break;
                case 2:
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.f16269ud = -1.0f;
                    } else if (!TextUtils.equals(str2, "wrap_content")) {
                        this.f16269ud = jpc.qdl(context, str2);
                    } else {
                        this.f16269ud = -2.0f;
                    }
                    break;
                case 3:
                    this.mzz = jpc.qdl(context, str2);
                    break;
                case 4:
                    this.jpc = jpc.qdl(context, str2);
                    this.oth = true;
                    break;
                case 5:
                    this.to = jpc.qdl(context, str2);
                    this.bjy = true;
                    break;
                case 6:
                    this.tvp = jpc.qdl(context, str2);
                    this.ljh = true;
                    break;
                case 7:
                    this.mml = jpc.qdl(context, str2);
                    break;
                case 8:
                    this.fs = jpc.qdl(context, str2);
                    this.jl = true;
                    break;
                case 9:
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.qdl = -1.0f;
                    } else if (!TextUtils.equals(str2, "wrap_content")) {
                        this.qdl = jpc.qdl(context, str2);
                    } else {
                        this.qdl = -2.0f;
                    }
                    break;
                case 10:
                    this.rdp = jpc.qdl(context, str2);
                    this.exc = true;
                    break;
                case 11:
                    this.exu = jpc.qdl(context, str2);
                    this.yt = true;
                    break;
                case 12:
                    this.f16270wd = jpc.qdl(context, str2);
                    this.jyq = true;
                    break;
                case 13:
                    this.mo = jpc.qdl(context, str2);
                    this.aaj = true;
                    break;
            }
        }

        public String toString() {
            return "LayoutParams{mWidth=" + this.qdl + ", mHeight=" + this.f16269ud + ", mMargin=" + this.mzz + ", mMarginLeft=" + this.mo + ", mMarginRight=" + this.f16270wd + ", mMarginTop=" + this.jpc + ", mMarginBottom=" + this.tvp + ", mParams=" + this.bch + '}';
        }

        public ViewGroup.LayoutParams qdl() {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) this.qdl, (int) this.f16269ud);
            marginLayoutParams.leftMargin = (int) (this.aaj ? this.mo : this.mzz);
            marginLayoutParams.rightMargin = (int) (this.jyq ? this.f16270wd : this.mzz);
            marginLayoutParams.topMargin = (int) (this.oth ? this.jpc : this.mzz);
            marginLayoutParams.bottomMargin = (int) (this.ljh ? this.tvp : this.mzz);
            return marginLayoutParams;
        }
    }
}

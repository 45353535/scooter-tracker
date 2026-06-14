package com.bytedance.adsdk.ugeno.tvp.mo;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.ud.lnr;
import com.bytedance.adsdk.ugeno.wd.jpc;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes6.dex */
public class ud extends lnr<qdl> {

    /* JADX INFO: renamed from: ca, reason: collision with root package name */
    private int f16239ca;
    protected int dps;

    @Deprecated
    private float fge;

    @Deprecated
    private TextUtils.TruncateAt gsp;

    @Deprecated
    private float hcs;

    /* JADX INFO: renamed from: hd, reason: collision with root package name */
    private float f16240hd;
    private float hr;
    private float iw;
    private float kj;
    private int kr;
    private float lme;
    private float nts;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private float f16241od;
    protected String qdl;

    /* JADX INFO: renamed from: se, reason: collision with root package name */
    private int f16242se;
    private int syy;
    private int tdy;

    /* JADX INFO: renamed from: vc, reason: collision with root package name */
    private boolean f16243vc;
    private float vm;
    private int xx;
    private TextUtils.TruncateAt ygv;

    public ud(Context context) {
        super(context);
        this.dps = ViewCompat.MEASURED_STATE_MASK;
        this.iw = 12.0f;
        this.lme = -1.0f;
        this.xx = Integer.MAX_VALUE;
        this.tdy = GravityCompat.START;
        this.ygv = TextUtils.TruncateAt.END;
        this.hr = -1.0f;
        this.f16240hd = 400.0f;
    }

    private TextUtils.TruncateAt bjy(String str) {
        str.getClass();
        switch (str) {
            case "center":
                this.gsp = TextUtils.TruncateAt.MIDDLE;
                break;
            case "end":
                this.gsp = TextUtils.TruncateAt.END;
                break;
            case "start":
                this.gsp = TextUtils.TruncateAt.START;
                break;
            default:
                this.gsp = null;
                break;
        }
        return this.gsp;
    }

    private int exc(String str) {
        str.getClass();
        switch (str) {
            case "underline":
                return 8;
            case "strikethrough":
                return 16;
            case "none":
            default:
                return Integer.MAX_VALUE;
        }
    }

    private int jl(String str) {
        str.getClass();
        switch (str) {
            case "center":
                return 17;
            case "center_vertical":
                return 16;
            case "left":
                return 3;
            case "right":
                return 5;
            case "center_horizontal":
                return 1;
            default:
                return 3;
        }
    }

    private TextUtils.TruncateAt jtx(String str) {
        if (TextUtils.equals(str, "none")) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    private void mml() {
        ((qdl) this.mzz).setLineSpacing(0.0f, this.hr);
    }

    private void tvp() {
        float f10 = this.hr;
        if (f10 <= 3.0f) {
            ((qdl) this.mzz).setLineSpacing(0.0f, f10);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            int iRound = Math.round(jpc.qdl(this.f16262ud, (f10 - (this.iw * 1.2f)) / 2.0f));
            int paddingTop = ((qdl) this.mzz).getPaddingTop() + iRound;
            int paddingBottom = ((qdl) this.mzz).getPaddingBottom() + iRound;
            T t10 = this.mzz;
            ((qdl) t10).setPadding(((qdl) t10).getPaddingLeft(), paddingTop, ((qdl) this.mzz).getPaddingRight(), paddingBottom);
            ((qdl) this.mzz).setLineHeight(Math.round(jpc.qdl(this.f16262ud, this.hr)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int yt(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r1 = -1178781136(0xffffffffb9bd3a30, float:-3.6092242E-4)
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == r1) goto L2b
            r1 = -1039745817(0xffffffffc206bce7, float:-33.684475)
            if (r0 == r1) goto L21
            r1 = 3029637(0x2e3a85, float:4.245426E-39)
            if (r0 == r1) goto L17
            goto L35
        L17:
            java.lang.String r0 = "bold"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L35
            r6 = r3
            goto L36
        L21:
            java.lang.String r0 = "normal"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L35
            r6 = r2
            goto L36
        L2b:
            java.lang.String r0 = "italic"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L35
            r6 = r4
            goto L36
        L35:
            r6 = -1
        L36:
            if (r6 == 0) goto L3c
            if (r6 == r4) goto L3b
            return r3
        L3b:
            return r2
        L3c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.tvp.mo.ud.yt(java.lang.String):int");
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    /* JADX INFO: renamed from: lnr, reason: merged with bridge method [inline-methods] */
    public qdl qdl() {
        qdl qdlVar = new qdl(this.f16262ud);
        qdlVar.qdl(this);
        return qdlVar;
    }

    public void rdp(String str) {
        this.qdl = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals("null", str)) {
            this.qdl = "";
        }
        ((qdl) this.mzz).setText(this.qdl);
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public void ud() {
        super.ud();
        if (TextUtils.equals("null", this.qdl)) {
            this.qdl = "";
        }
        rdp(this.qdl);
        ((qdl) this.mzz).setTextSize(1, this.iw);
        ((qdl) this.mzz).setTextColor(this.dps);
        ((qdl) this.mzz).setLines(this.syy);
        ((qdl) this.mzz).setMaxLines(this.xx);
        ((qdl) this.mzz).setGravity(this.tdy);
        ((qdl) this.mzz).setIncludeFontPadding(false);
        ((qdl) this.mzz).setMinTextSize(jpc.qdl(this.f16262ud, this.lme));
        qdl(this.f16239ca);
        if (kdv()) {
            qdl(this.ygv);
        } else {
            qdl(this.gsp);
        }
        if (this.hr > 0.0f) {
            if (kdv()) {
                tvp();
            } else {
                mml();
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        ((qdl) this.mzz).setBreakStrategy(0);
        if (!kdv()) {
            ((qdl) this.mzz).setShadowLayer(this.vm, this.fge, this.hcs, this.f16242se);
        } else if (this.f16243vc) {
            if (this.vm <= 0.0f) {
                this.vm = 1.0E-5f;
            }
            ((qdl) this.mzz).setShadowLayer(this.vm, this.kj, this.f16241od, this.f16242se);
        }
        int i11 = this.kr;
        if (i11 == 1) {
            ((qdl) this.mzz).setTypeface(Typeface.DEFAULT, i11);
        } else if (i10 >= 28) {
            ((qdl) this.mzz).setTypeface(Typeface.create(Typeface.DEFAULT, (int) this.f16240hd, i11 == 2));
        } else if (this.f16240hd >= 500.0f) {
            ((qdl) this.mzz).setTypeface(Typeface.DEFAULT, 1);
        }
        if (jpc.qdl(this.f16262ud, this.iw) > 0.0f) {
            ((qdl) this.mzz).setLetterSpacing(this.nts / jpc.qdl(this.f16262ud, this.iw));
        }
    }

    public void qdl(int i10) {
        this.f16239ca = i10;
        if (i10 == Integer.MAX_VALUE) {
            return;
        }
        ((qdl) this.mzz).setPaintFlags(i10);
    }

    public void qdl(TextUtils.TruncateAt truncateAt) {
        if (truncateAt == null) {
            return;
        }
        ((qdl) this.mzz).setEllipsize(truncateAt);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public void qdl(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.qdl(str, str2);
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1621067310:
                if (str.equals("shadowRadius")) {
                    b10 = 0;
                }
                break;
            case -1589741021:
                if (str.equals("shadowColor")) {
                    b10 = 1;
                }
                break;
            case -1230714651:
                if (str.equals("shadowOffsetX")) {
                    b10 = 2;
                }
                break;
            case -1230714650:
                if (str.equals("shadowOffsetY")) {
                    b10 = 3;
                }
                break;
            case -1065511464:
                if (str.equals("textAlign")) {
                    b10 = 4;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    b10 = 5;
                }
                break;
            case -1048634236:
                if (str.equals("textStyle")) {
                    b10 = 6;
                }
                break;
            case -1021145689:
                if (str.equals("shadowBlur")) {
                    b10 = 7;
                }
                break;
            case -1003668786:
                if (str.equals("textSize")) {
                    b10 = 8;
                }
                break;
            case -879295043:
                if (str.equals("textDecoration")) {
                    b10 = 9;
                }
                break;
            case -756368940:
                if (str.equals("shadowDx")) {
                    b10 = 10;
                }
                break;
            case -756368939:
                if (str.equals("shadowDy")) {
                    b10 = Ascii.VT;
                }
                break;
            case -734428249:
                if (str.equals("fontWeight")) {
                    b10 = Ascii.FF;
                }
                break;
            case -515807685:
                if (str.equals("lineHeight")) {
                    b10 = 13;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    b10 = Ascii.SO;
                }
                break;
            case 102977279:
                if (str.equals("lines")) {
                    b10 = Ascii.SI;
                }
                break;
            case 188702929:
                if (str.equals("ellipsis")) {
                    b10 = Ascii.DLE;
                }
                break;
            case 351195968:
                if (str.equals("minTextSize")) {
                    b10 = 17;
                }
                break;
            case 390232059:
                if (str.equals("maxLines")) {
                    b10 = Ascii.DC2;
                }
                break;
            case 1554823821:
                if (str.equals("ellipsize")) {
                    b10 = 19;
                }
                break;
            case 2111078717:
                if (str.equals("letterSpacing")) {
                    b10 = Ascii.DC4;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 7:
                this.vm = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case 1:
                this.f16242se = com.bytedance.adsdk.ugeno.wd.qdl.qdl(str2);
                this.f16243vc = true;
                break;
            case 2:
                this.kj = jpc.qdl(this.f16262ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f));
                break;
            case 3:
                this.f16241od = jpc.qdl(this.f16262ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f));
                break;
            case 4:
                this.tdy = jl(str2);
                break;
            case 5:
                this.dps = com.bytedance.adsdk.ugeno.wd.qdl.qdl(str2);
                break;
            case 6:
                this.kr = yt(str2);
                break;
            case 8:
                this.iw = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case 9:
                this.f16239ca = exc(str2);
                break;
            case 10:
                this.fge = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case 11:
                this.hcs = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case 12:
                float fQdl = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, -1.0f);
                this.f16240hd = fQdl;
                if (fQdl < 1.0f || fQdl > 1000.0f) {
                    this.f16240hd = 400.0f;
                }
                break;
            case 13:
                this.hr = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 1.0f);
                break;
            case 14:
                this.qdl = str2;
                break;
            case 15:
                this.syy = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0);
                break;
            case 16:
                this.ygv = jtx(str2);
                break;
            case 17:
                this.lme = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, -1.0f);
                break;
            case 18:
                int iQdl = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, Integer.MAX_VALUE);
                this.xx = iQdl > 0 ? iQdl : Integer.MAX_VALUE;
                break;
            case 19:
                this.gsp = bjy(str2);
                break;
            case 20:
                this.nts = jpc.qdl(this.f16262ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f));
                break;
        }
    }
}

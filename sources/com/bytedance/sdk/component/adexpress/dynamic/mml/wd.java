package com.bytedance.sdk.component.adexpress.dynamic.mml;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.adexpress.dynamic.mzz.rq;
import com.ironsource.C4240b4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class wd {
    public JSONObject lnr;
    private mo mml;
    private String mo;
    private mzz mzz;
    public int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public String f16388ud;

    public wd(mzz mzzVar) {
        this.mzz = mzzVar;
        this.qdl = mzzVar.qdl();
        this.f16388ud = mzzVar.lnr();
        this.lnr = mzzVar.mzz().en();
        this.mo = mzzVar.mml();
        if (com.bytedance.sdk.component.adexpress.mml.lnr() == 1) {
            this.mml = mzzVar.wd();
        } else {
            this.mml = mzzVar.mzz();
        }
        if (com.bytedance.sdk.component.adexpress.mml.ud()) {
            this.mml = mzzVar.mzz();
        }
    }

    private boolean gg() {
        return (com.bytedance.sdk.component.adexpress.mml.ud() && (this.mzz.ud().contains("logo-union") || this.mzz.ud().contains("logounion") || this.mzz.ud().contains("logoad"))) || "logo-union".equals(this.mzz.ud()) || "logounion".equals(this.mzz.ud()) || "logoad".equals(this.mzz.ud());
    }

    private boolean rzg() {
        if (com.bytedance.sdk.component.adexpress.mml.ud()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.f16388ud) && this.f16388ud.contains("adx:")) || rq.ud();
    }

    public boolean aaj() {
        return this.mml.gsp();
    }

    public int ag() {
        return this.mml.ra();
    }

    public int ax() {
        return this.mml.qk();
    }

    public String bch() {
        return this.mml.gy();
    }

    public float bjy() {
        return this.mml.rq();
    }

    public int bqt() {
        String strGy = this.mml.gy();
        if ("skip-with-time-skip-btn".equals(this.mzz.ud()) || "skip".equals(this.mzz.ud()) || TextUtils.equals("skip-with-countdowns-skip-btn", this.mzz.ud())) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.mzz.ud()) && !"skip-with-time".equals(this.mzz.ud())) {
            if (this.qdl == 10 && TextUtils.equals(this.mml.ax(), "click")) {
                return 5;
            }
            if (gg() && rzg()) {
                return 0;
            }
            if (gg()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.mzz.ud())) {
                return 3;
            }
            if (!TextUtils.isEmpty(strGy) && !strGy.equals("none")) {
                if (strGy.equals("video") || (this.mzz.qdl() == 7 && TextUtils.equals(strGy, Constants.NORMAL))) {
                    return (com.bytedance.sdk.component.adexpress.mml.ud() && this.mzz.mzz() != null && this.mzz.mzz().hd()) ? 11 : 4;
                }
                if (strGy.equals(Constants.NORMAL)) {
                    return 1;
                }
                return (strGy.equals(Reporting.Key.CREATIVE) || "slide".equals(this.mml.ax())) ? 2 : 0;
            }
        }
        return 0;
    }

    public String car() {
        return this.mml.rc();
    }

    public int cx() {
        return this.mml.wd();
    }

    public double dk() {
        return this.mml.hzv();
    }

    public int ekw() {
        return this.mml.mzz();
    }

    public String en() {
        return this.mml.kj();
    }

    public int exc() {
        return this.mml.ygv();
    }

    public double exu() {
        if (this.qdl == 11) {
            try {
                return !com.bytedance.sdk.component.adexpress.mml.ud() ? (int) r0 : Double.parseDouble(this.f16388ud);
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    public String fco() {
        return this.mml.to();
    }

    public String fs() {
        return this.mo;
    }

    public boolean fzn() {
        return this.mml.dps();
    }

    public int gt() {
        return this.mml.xdk();
    }

    public boolean gy() {
        return this.mml.kab();
    }

    public int hkc() {
        return this.mml.mml();
    }

    public int hzv() {
        return this.mml.tvp();
    }

    public double ijp() {
        return this.mml.fco();
    }

    public int irn() {
        return this.mml.blf();
    }

    public String jjk() {
        return this.mml.vu();
    }

    public int jl() {
        return this.mml.ca();
    }

    public int jpc() {
        String strJyq = this.mml.jyq();
        if ("left".equals(strJyq)) {
            return 17;
        }
        if ("center".equals(strJyq)) {
            return 4;
        }
        return "right".equals(strJyq) ? 3 : 2;
    }

    public int jtx() {
        return qdl(this.mml.xmv());
    }

    public String jyq() {
        return this.mml.bch();
    }

    public boolean kab() {
        return this.mml.bx();
    }

    public int kdv() {
        return this.mml.ud();
    }

    public int koa() {
        return qdl(this.mml.ljh());
    }

    public int ljh() {
        return this.mml.cx();
    }

    public int lnr() {
        return (int) this.mml.bjy();
    }

    public String lq() {
        return this.mml.uw();
    }

    public int lte() {
        return this.mml.hkc();
    }

    public int mlb() {
        return this.mml.ekw();
    }

    public int mml() {
        return (int) this.mml.jtx();
    }

    public String mo() {
        return this.qdl == 0 ? !TextUtils.isEmpty(this.f16388ud) ? this.f16388ud : this.lnr.optString(com.bytedance.sdk.component.adexpress.mml.wd.lnr(com.bytedance.sdk.component.adexpress.mml.qdl())) : "";
    }

    public String mrf() {
        return this.mml.ax();
    }

    public float mzz() {
        return this.mml.jl();
    }

    public String nz() {
        return this.mml.zvv();
    }

    public boolean om() {
        return this.mml.jle();
    }

    public boolean oth() {
        return this.mml.om();
    }

    public int qdl() {
        return (int) this.mml.rdp();
    }

    public int qk() {
        return this.mml.jnw();
    }

    public int ra() {
        return this.mml.zpu();
    }

    public int rc() {
        return this.mml.lnr();
    }

    public double rdp() {
        return this.mml.exc();
    }

    public String rq() {
        return this.qdl == 1 ? this.f16388ud : "";
    }

    public boolean sy() {
        return this.mml.kdv();
    }

    public String taz() {
        return this.mml.vc();
    }

    public boolean tid() {
        return this.mml.exu();
    }

    public String to() {
        int i10 = this.qdl;
        return (i10 == 2 || i10 == 13) ? this.f16388ud : "";
    }

    public int tqd() {
        return this.mml.jut();
    }

    public int tvp() {
        int iJpc = jpc();
        if (iJpc == 4) {
            return 17;
        }
        return iJpc == 3 ? GravityCompat.END : GravityCompat.START;
    }

    public int ud() {
        return (int) this.mml.yt();
    }

    public String uw() {
        return this.mml.nts();
    }

    public double vu() {
        return this.mml.jpc();
    }

    public int wak() {
        return this.mml.se();
    }

    public String wc() {
        return this.mml.mrf();
    }

    public int wd() {
        return qdl(this.mml.oth());
    }

    public boolean xi() {
        return this.mml.dps();
    }

    public long xmv() {
        return this.mml.eta();
    }

    public int yh() {
        return this.mml.tdy();
    }

    public float yt() {
        return this.mml.fs();
    }

    public String zlt() {
        return this.mml.iw();
    }

    public int zy() {
        return this.mml.lme();
    }

    public static float[] ud(String str) {
        String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(StringUtils.COMMA);
        return (strArrSplit == null || strArrSplit.length != 4) ? new float[]{0.0f, 0.0f, 0.0f, 0.0f} : new float[]{Float.parseFloat(strArrSplit[0]), Float.parseFloat(strArrSplit[1]), Float.parseFloat(strArrSplit[2]), Float.parseFloat(strArrSplit[3])};
    }

    public void qdl(float f10) {
        this.mml.qdl(f10);
    }

    public static int qdl(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str)) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (str.equals(C4240b4.i.T)) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (str.startsWith("rgba") && (strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(StringUtils.COMMA)) != null) {
            try {
                if (strArrSplit.length == 4) {
                    return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2]));
                }
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return ViewCompat.MEASURED_STATE_MASK;
    }

    public boolean qdl(int i10) {
        mzz mzzVar = this.mzz;
        if (mzzVar == null) {
            return false;
        }
        if (i10 == 1) {
            this.mml = mzzVar.wd();
        } else {
            this.mml = mzzVar.mzz();
        }
        return this.mml != null;
    }
}

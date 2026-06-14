package com.bytedance.sdk.openadsdk.core.lnr;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.fco;
import com.bytedance.sdk.openadsdk.core.lnr.lnr;
import com.bytedance.sdk.openadsdk.core.model.fs;
import com.bytedance.sdk.openadsdk.core.model.jtx;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.tvp;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.gy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ud extends lnr {
    private static int hkc = Integer.MIN_VALUE;
    protected com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo bjy;
    protected int exc;
    protected com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr exu;
    protected PAGNativeAd fs;
    protected com.bytedance.sdk.openadsdk.core.tvp.ud jl;
    protected final int jpc;
    protected Map<String, Object> jtx;
    private boolean lnr;
    protected Context mml;
    protected final ljh mo;
    public jtx mzz;
    private String qdl;
    protected boolean rdp;
    protected qdl rq;
    protected fs to;
    protected WeakReference<View> tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private WeakReference<Activity> f17300ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    protected final String f17301wd;
    protected com.bytedance.sdk.openadsdk.core.mml.qdl yt;

    public interface qdl {
        void qdl(View view, int i10);
    }

    public ud(@NonNull Context context, @NonNull ljh ljhVar, @NonNull String str, int i10) {
        this.rdp = false;
        this.exc = 0;
        this.lnr = false;
        this.mml = context;
        this.mo = ljhVar;
        this.f17301wd = str;
        this.jpc = i10;
    }

    public void lnr(int i10) {
        this.xmv = i10;
    }

    public View mml() {
        WeakReference<Activity> weakReference = this.f17300ud;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.f17300ud.get().findViewById(R.id.content);
    }

    public void mzz(boolean z10) {
        this.rdp = z10;
    }

    public boolean qdl(fs fsVar, Map<String, Object> map) {
        return false;
    }

    public void ud(int i10) {
        this.bqt = i10;
    }

    public static boolean ud(View view) {
        return 520093705 == view.getId() || 520093707 == view.getId() || 520093703 == view.getId() || qdl(view.getContext()) == view.getId() || com.bytedance.sdk.openadsdk.utils.jtx.jut == view.getId() || com.bytedance.sdk.openadsdk.utils.jtx.vxg == view.getId();
    }

    public String mzz() {
        return this.qdl;
    }

    public void qdl(com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo moVar) {
        this.bjy = moVar;
    }

    public void mml(int i10) {
        this.exc = i10;
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.tvp.ud udVar) {
        this.jl = udVar;
    }

    public void qdl(PAGNativeAd pAGNativeAd) {
        this.fs = pAGNativeAd;
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.mml.qdl qdlVar) {
        this.yt = qdlVar;
    }

    public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar) {
        this.exu = lnrVar;
    }

    public void qdl(qdl qdlVar) {
        this.rq = qdlVar;
    }

    public void qdl(Activity activity) {
        if (activity == null) {
            return;
        }
        this.f17300ud = new WeakReference<>(activity);
    }

    public ud(@NonNull Context context, @NonNull ljh ljhVar, @NonNull String str, int i10, boolean z10) {
        this(context, ljhVar, str, i10);
        this.lnr = z10;
    }

    public void qdl(View view) {
        if (view == null) {
            return;
        }
        this.tvp = new WeakReference<>(view);
    }

    public void qdl(Map<String, Object> map) {
        Map<String, Object> map2 = this.jtx;
        if (map2 != null) {
            map2.putAll(map);
            map.putAll(this.jtx);
        }
        this.jtx = map;
    }

    public void qdl(int i10) {
        this.koa = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lnr.lnr
    public void qdl(View view, float f10, float f11, float f12, float f13, SparseArray<lnr.qdl> sparseArray, boolean z10) {
        int i10;
        boolean z11;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
        if (this.mml == null) {
            this.mml = yt.qdl();
        }
        if ((this.lnr || !qdl(view, 1, f10, f11, f12, f13, sparseArray, z10)) && this.mml != null) {
            jtx jtxVar = this.mzz;
            if (jtxVar != null) {
                int i11 = jtxVar.jpc;
                JSONObject jSONObject3 = jtxVar.tvp;
                JSONObject jSONObject4 = jtxVar.exu;
                z11 = jtxVar.rdp;
                i10 = i11;
                jSONObject = jSONObject3;
                jSONObject2 = jSONObject4;
            } else {
                i10 = -1;
                z11 = false;
                jSONObject = null;
                jSONObject2 = null;
            }
            long j10 = this.bch;
            long j11 = this.uw;
            WeakReference<View> weakReference = this.tvp;
            fs fsVarQdl = qdl(f10, f11, f12, f13, sparseArray, j10, j11, weakReference == null ? null : weakReference.get(), mzz(), ax.jpc(this.mml), ax.to(this.mml), ax.tvp(this.mml), i10, jSONObject, jSONObject2);
            this.to = fsVarQdl;
            if (qdl(fsVarQdl, this.jtx)) {
                return;
            }
            if (this.exu != null) {
                if (this.jtx == null) {
                    this.jtx = new HashMap();
                }
                this.jtx.put("duration", Long.valueOf(this.exu.mo()));
            }
            ljh ljhVar = this.mo;
            if (!this.lnr && !z11) {
                qdl qdlVar = this.rq;
                if (qdlVar != null) {
                    qdlVar.qdl(view, -1);
                }
                if (qdl(view, z10)) {
                    boolean zUd = vu.ud(ljhVar);
                    String strQdl = zUd ? this.f17301wd : gy.qdl(this.jpc);
                    if (view != null) {
                        try {
                            if (((Boolean) view.getTag(520093762)).booleanValue()) {
                                fco.qdl(true);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    Activity activityQdl = view != null ? com.bytedance.sdk.component.utils.ud.qdl(view) : null;
                    boolean zQdl = fco.qdl(activityQdl == null ? this.mml : activityQdl, ljhVar, this.jpc, this.fs, this.yt, strQdl, this.bjy, zUd, 0);
                    fco.qdl(false);
                    if (zQdl || ljhVar == null || ljhVar.bo() == null || ljhVar.bo().lnr() != 2) {
                        if (ljhVar != null && !zQdl && TextUtils.isEmpty(ljhVar.od()) && com.bytedance.sdk.openadsdk.mml.ud.qdl(this.f17301wd)) {
                            com.bytedance.sdk.openadsdk.exc.qdl.qdl.wd.qdl(this.mml, this.f17301wd).lnr(ljhVar);
                        }
                        com.bytedance.sdk.openadsdk.mml.lnr.qdl("click", ljhVar, this.to, this.f17301wd, zQdl, this.jtx, z10 ? 1 : 2);
                        return;
                    }
                    return;
                }
                return;
            }
            com.bytedance.sdk.openadsdk.mml.lnr.qdl("click", ljhVar, this.to, this.f17301wd, true, this.jtx, z10 ? 1 : 2);
            com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm = ljhVar.zm();
            if (mmlVarZm == null || ljhVar.uj() || (mmlVarQdl = mmlVarZm.qdl()) == null) {
                return;
            }
            com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.exu;
            mmlVarQdl.wd(lnrVar != null ? lnrVar.mo() : 0L);
        }
    }

    public boolean qdl(View view, boolean z10) {
        return qdl(view, this.mo, z10);
    }

    public static boolean qdl(View view, ljh ljhVar, boolean z10) {
        if (view != null && ljhVar != null) {
            try {
                int i10 = com.bytedance.sdk.component.adexpress.dynamic.qdl.aaj;
                String strValueOf = String.valueOf(view.getTag(i10));
                if (view.getTag(i10) != null && !TextUtils.isEmpty(strValueOf)) {
                    if ("click".equals(strValueOf)) {
                        return z10;
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
            if (ud(view)) {
                return ljhVar.car() != 1 || z10;
            }
            if (ljhVar.sy() == 1 && !z10) {
                return false;
            }
        }
        return true;
    }

    protected fs qdl(float f10, float f11, float f12, float f13, SparseArray<lnr.qdl> sparseArray, long j10, long j11, View view, String str, float f14, int i10, float f15, int i11, JSONObject jSONObject, JSONObject jSONObject2) {
        return new fs.qdl().mo(f10).mzz(f11).mml(f12).lnr(f13).ud(j10).qdl(j11).qdl(ax.qdl(view)).ud(ax.lnr(view)).mml(this.xmv).mzz(this.bqt).mo(this.koa).qdl(sparseArray).ud(tvp.ud().qdl() ? 1 : 2).qdl(str).qdl(f14).lnr(i10).ud(f15).qdl(i11).qdl(jSONObject).ud(jSONObject2).qdl();
    }

    protected boolean qdl(View view, int i10, float f10, float f11, float f12, float f13, SparseArray<lnr.qdl> sparseArray, boolean z10) {
        if (this.jl == null) {
            return false;
        }
        this.jl.qdl(view, i10, new jtx.qdl().mml(f10).lnr(f11).ud(f12).qdl(f13).ud(this.bch).qdl(this.uw).qdl(sparseArray).qdl(z10).qdl());
        return true;
    }

    private static int qdl(Context context) {
        if (hkc == Integer.MIN_VALUE) {
            hkc = com.bytedance.sdk.component.utils.ljh.mzz(context, "btn_native_creative");
        }
        return hkc;
    }

    public void qdl(String str) {
        this.qdl = str;
    }
}

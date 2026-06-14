package com.bytedance.sdk.openadsdk.tvp;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.mzz.jtx;
import com.bytedance.sdk.component.mzz.rq;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.ironsource.X1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ud<T> implements jtx<T> {
    private final jtx<T> lnr;
    private final ljh mml;
    private final long qdl = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final String f17828ud;

    public ud(final ljh ljhVar, String str, jtx<T> jtxVar) {
        this.lnr = jtxVar;
        this.mml = ljhVar;
        this.f17828ud = str;
        if (mml.ud()) {
            com.bytedance.sdk.openadsdk.yt.lnr.qdl(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.tvp.ud.1
                @Override // com.bytedance.sdk.openadsdk.yt.mml
                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                    com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                    qdlVar.ud("load_img");
                    ljh ljhVar2 = ljhVar;
                    if (ljhVar2 != null) {
                        qdlVar.lnr(ljhVar2.kdv(X1.f42014f));
                        qdlVar.mml(gy.lnr(ljhVar.ok()));
                    }
                    qdlVar.qdl(BuildConfig.VERSION_NAME);
                    return qdlVar;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.mzz.jtx
    public void qdl(rq<T> rqVar) {
        jtx<T> jtxVar = this.lnr;
        if (jtxVar != null) {
            jtxVar.qdl(rqVar);
        }
        if (this.mml != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.qdl;
            final int iWd = rqVar.wd() / 1024;
            final int i10 = rqVar.mo() ? 1 : 0;
            com.bytedance.sdk.openadsdk.bjy.lnr.qdl("load_image_success", false, new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.tvp.ud.2
                @Override // com.bytedance.sdk.openadsdk.bjy.ud
                @Nullable
                public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", jElapsedRealtime);
                    jSONObject.put("url", ud.this.f17828ud);
                    jSONObject.put("preload_size", iWd);
                    jSONObject.put("local_cache", i10);
                    jSONObject.put("image_mode", ud.this.mml.vxg());
                    jSONObject.put("use_new_img", mml.ud() ? 1 : 0);
                    return com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().qdl("load_image_success").qdl(ud.this.mml.ok()).ud(jSONObject.toString());
                }
            });
            if (mml.ud()) {
                com.bytedance.sdk.openadsdk.yt.lnr.ud(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.tvp.ud.3
                    @Override // com.bytedance.sdk.openadsdk.yt.mml
                    public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                        com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                        qdlVar.ud("load_img");
                        if (ud.this.mml != null) {
                            qdlVar.lnr(ud.this.mml.kdv(X1.f42014f));
                            qdlVar.mml(gy.lnr(ud.this.mml.ok()));
                        }
                        qdlVar.qdl(BuildConfig.VERSION_NAME);
                        return qdlVar;
                    }
                });
            }
        }
    }

    @Override // com.bytedance.sdk.component.mzz.jtx
    public void qdl(final int i10, final String str, @Nullable final Throwable th2) {
        jtx<T> jtxVar = this.lnr;
        if (jtxVar != null) {
            jtxVar.qdl(i10, str, th2);
        }
        ljh ljhVar = this.mml;
        if (ljhVar != null) {
            if (!TextUtils.isEmpty(gy.qdl(ljhVar))) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.qdl;
                com.bytedance.sdk.openadsdk.bjy.lnr.qdl("load_image_error", false, new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.tvp.ud.4
                    @Override // com.bytedance.sdk.openadsdk.bjy.ud
                    @Nullable
                    public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", jElapsedRealtime);
                        jSONObject.put("url", ud.this.f17828ud);
                        jSONObject.put("error_code", i10);
                        Throwable th3 = th2;
                        if (th3 instanceof NullPointerException) {
                            ApmHelper.reportCustomError("image load fail", "image_load", th3);
                        }
                        jSONObject.put("error_message", str);
                        jSONObject.put("image_mode", ud.this.mml.vxg());
                        jSONObject.put("use_new_img", mml.ud() ? 1 : 0);
                        return com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().qdl("load_image_error").qdl(ud.this.mml.ok()).ud(jSONObject.toString());
                    }
                });
            }
            if (mml.ud()) {
                com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.tvp.ud.5
                    @Override // com.bytedance.sdk.openadsdk.yt.mml
                    public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                        com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                        qdlVar.ud("load_img");
                        if (ud.this.mml != null) {
                            qdlVar.lnr(ud.this.mml.kdv(X1.f42014f));
                            qdlVar.mml(gy.lnr(ud.this.mml.ok()));
                        }
                        qdlVar.qdl(BuildConfig.VERSION_NAME);
                        return qdlVar;
                    }
                });
            }
        }
    }
}

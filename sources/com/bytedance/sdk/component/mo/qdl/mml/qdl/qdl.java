package com.bytedance.sdk.component.mo.qdl.mml.qdl;

import android.text.TextUtils;
import com.appsflyer.AppsFlyerProperties;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class qdl implements com.bytedance.sdk.component.mo.qdl.mml.qdl {
    private int fs;
    private String jpc;
    private byte lnr;
    private byte mml;
    private long mo;
    private long mzz;
    protected JSONObject qdl;
    private String rq;
    private byte to;
    private String tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private ud f16523ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private long f16524wd;

    public qdl(String str, JSONObject jSONObject) {
        this.tvp = str;
        this.qdl = jSONObject;
    }

    public static com.bytedance.sdk.component.mo.qdl.mml.qdl lnr(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("type");
            int iOptInt2 = jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            qdl qdlVar = new qdl();
            qdlVar.qdl((byte) iOptInt);
            qdlVar.ud((byte) iOptInt2);
            qdlVar.qdl(jSONObject.optJSONObject("event"));
            qdlVar.qdl(jSONObject.optString("localId"));
            qdlVar.ud(jSONObject.optString("genTime"));
            qdlVar.qdl(jSONObject.optInt(AppsFlyerProperties.CHANNEL));
            return qdlVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String fs() {
        return this.jpc;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public long jpc() {
        return this.mzz;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public byte mml() {
        return this.lnr;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public String mo() {
        if (TextUtils.isEmpty(this.tvp)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("localId", this.tvp);
            jSONObject.put("event", wd());
            jSONObject.put("genTime", fs());
            jSONObject.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, (int) this.mml);
            jSONObject.put("type", (int) this.lnr);
            jSONObject.put(AppsFlyerProperties.CHANNEL, this.fs);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public byte mzz() {
        return this.mml;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public ud qdl() {
        return this.f16523ud;
    }

    public String rq() {
        return this.rq;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public int to() {
        return this.fs;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public long tvp() {
        return this.mo;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public byte ud() {
        return this.to;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public synchronized JSONObject wd() {
        ud udVar;
        try {
            if (this.qdl == null && (udVar = this.f16523ud) != null) {
                this.qdl = udVar.qdl(rq());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.qdl;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public void qdl(JSONObject jSONObject) {
        this.qdl = jSONObject;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public void ud(String str) {
        this.jpc = str;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public void qdl(byte b10) {
        this.lnr = b10;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public void ud(long j10) {
        this.mo = j10;
    }

    public qdl(String str, ud udVar) {
        this.tvp = str;
        this.f16523ud = udVar;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public void qdl(String str) {
        this.tvp = str;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public void ud(byte b10) {
        this.mml = b10;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public void qdl(long j10) {
        this.mzz = j10;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public void qdl(int i10) {
        this.fs = i10;
    }

    private qdl() {
    }

    public void lnr(byte b10) {
        this.to = b10;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public String lnr() {
        return this.tvp;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public void lnr(long j10) {
        this.f16524wd = j10;
    }
}

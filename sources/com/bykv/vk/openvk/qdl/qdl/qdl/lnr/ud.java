package com.bykv.vk.openvk.qdl.qdl.qdl.lnr;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    private int exu;
    private int fs;
    private String jpc;
    private long lnr;
    private double mml;
    private String mo;
    private String mzz;
    private int qdl;
    private double rq;
    private String to;
    private String tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f15908ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private String f15909wd;
    private float rdp = -1.0f;
    private int bjy = 0;
    private int jtx = 0;
    private int yt = 0;
    private int jl = 0;
    private int exc = 307200;
    private int aaj = 1;

    public int aaj() {
        return this.jtx;
    }

    public int bjy() {
        if (this.exc < 0) {
            this.exc = 307200;
        }
        long j10 = this.exc;
        long j11 = this.lnr;
        if (j10 > j11) {
            this.exc = (int) j11;
        }
        return this.exc;
    }

    public int exc() {
        return this.bjy;
    }

    public String exu() {
        return this.tvp;
    }

    public String fs() {
        return this.jpc;
    }

    public JSONObject jl() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", ud());
            jSONObject.put("cover_url", to());
            jSONObject.put("cover_width", lnr());
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, fs());
            jSONObject.put("file_hash", rdp());
            jSONObject.put("resolution", tvp());
            jSONObject.put("size", mzz());
            jSONObject.put("video_duration", mo());
            jSONObject.put("video_url", rq());
            jSONObject.put("playable_download_url", exu());
            jSONObject.put("if_playable_loading_show", exc());
            jSONObject.put("remove_loading_page_type", aaj());
            jSONObject.put("fallback_endcard_judge", qdl());
            jSONObject.put("video_preload_size", bjy());
            jSONObject.put("reward_video_cached_type", jtx());
            jSONObject.put("execute_cached_type", yt());
            jSONObject.put("endcard_render", mml());
            jSONObject.put("replay_time", oth());
            jSONObject.put("play_speed_ratio", jpc());
            if (wd() > 0.0d) {
                jSONObject.put("start", wd());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public float jpc() {
        return this.rdp;
    }

    public int jtx() {
        return this.yt;
    }

    public boolean jyq() {
        return this.yt == 0;
    }

    public int lnr() {
        return this.f15908ud;
    }

    public int mml() {
        return this.exu;
    }

    public double mo() {
        return this.mml;
    }

    public long mzz() {
        return this.lnr;
    }

    public int oth() {
        return this.aaj;
    }

    public int qdl() {
        return this.fs;
    }

    public String rdp() {
        if (TextUtils.isEmpty(this.to)) {
            this.to = com.bykv.vk.openvk.qdl.qdl.qdl.wd.ud.qdl(this.f15909wd);
        }
        return this.to;
    }

    public String rq() {
        return this.f15909wd;
    }

    public String to() {
        return this.mo;
    }

    public String tvp() {
        return this.mzz;
    }

    public int ud() {
        return this.qdl;
    }

    public double wd() {
        return this.rq;
    }

    public int yt() {
        return this.jl;
    }

    public void jpc(int i10) {
        this.bjy = i10;
    }

    public void lnr(int i10) {
        this.f15908ud = i10;
    }

    public void mml(int i10) {
        this.exu = i10;
    }

    public void mo(String str) {
        this.to = str;
    }

    public void mzz(String str) {
        this.tvp = str;
    }

    public void qdl(int i10) {
        this.fs = i10;
    }

    public void to(int i10) {
        this.aaj = Math.min(4, Math.max(1, i10));
    }

    public void tvp(int i10) {
        this.jtx = i10;
    }

    public void ud(int i10) {
        this.qdl = i10;
    }

    public void wd(int i10) {
        this.jl = i10;
    }

    public void lnr(String str) {
        this.f15909wd = str;
    }

    public void mml(String str) {
        this.jpc = str;
    }

    public void mo(int i10) {
        this.yt = i10;
    }

    public void mzz(int i10) {
        this.exc = i10;
    }

    public void qdl(long j10) {
        this.lnr = j10;
    }

    public void ud(String str) {
        this.mo = str;
    }

    public void qdl(double d10) {
        this.mml = d10;
    }

    public void qdl(String str) {
        this.mzz = str;
    }
}

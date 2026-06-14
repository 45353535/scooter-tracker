package com.bytedance.adsdk.ugeno.qdl;

import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class lnr {
    private String jpc;
    private int lnr;
    private String mml;
    private qdl mo;
    private long mzz;
    private Map<String, TreeMap<Float, String>> qdl;
    private JSONObject to;
    private int tvp = 1;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private long f16215ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private String f16216wd;

    public static class qdl {
        public String qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        public String f16217ud;
    }

    public String jpc() {
        return this.f16216wd;
    }

    public long lnr() {
        return this.f16215ud;
    }

    public int mml() {
        return this.lnr;
    }

    public long mo() {
        return this.mzz;
    }

    public String mzz() {
        return this.mml;
    }

    public JSONObject qdl() {
        return this.to;
    }

    public int to() {
        return this.tvp;
    }

    public String toString() {
        return "AnimationModel{mKeyFramesMap=" + this.qdl + ", mDuration=" + this.f16215ud + ", mPlayCount=" + this.lnr + ", mPlayDirection=" + this.mml + ", mDelay=" + this.mzz + ", mName=" + this.jpc + ", mPlayState=" + this.tvp + ", mTransformOrigin='" + this.mo + "', mTimingFunction='" + this.f16216wd + "'}";
    }

    public String tvp() {
        return this.jpc;
    }

    public Map<String, TreeMap<Float, String>> ud() {
        return this.qdl;
    }

    public qdl wd() {
        return this.mo;
    }

    public void lnr(String str) {
        this.jpc = str;
    }

    public void qdl(JSONObject jSONObject) {
        this.to = jSONObject;
    }

    public void ud(long j10) {
        this.mzz = j10;
    }

    public void qdl(Map<String, TreeMap<Float, String>> map) {
        this.qdl = map;
    }

    public void ud(String str) {
        this.f16216wd = str;
    }

    public void qdl(long j10) {
        this.f16215ud = j10;
    }

    public void ud(int i10) {
        this.tvp = i10;
    }

    public void qdl(int i10) {
        this.lnr = i10;
    }

    public void qdl(String str) {
        this.mml = str;
    }

    public void qdl(qdl qdlVar) {
        this.mo = qdlVar;
    }
}

package com.bytedance.adsdk.ud;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public class wd {
    private ud exc;
    private float exu;
    private float fs;
    private qdl jl;
    private LongSparseArray<com.bytedance.adsdk.ud.lnr.lnr.mzz> jpc;
    private lnr jtx;
    private Map<String, List<com.bytedance.adsdk.ud.lnr.lnr.mzz>> lnr;
    private Map<String, to> mml;
    private List<com.bytedance.adsdk.ud.lnr.mo> mo;
    private Map<String, com.bytedance.adsdk.ud.lnr.lnr> mzz;
    private boolean rdp;
    private float rq;
    private Rect to;
    private List<com.bytedance.adsdk.ud.lnr.lnr.mzz> tvp;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private SparseArray<com.bytedance.adsdk.ud.lnr.mml> f16140wd;
    private final jl qdl = new jl();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final HashSet<String> f16139ud = new HashSet<>();
    private int bjy = 0;
    private String yt = "";

    public static class lnr {
        public String lnr;
        public String mml;
        public String mo;
        public int[] mzz;
        public int qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        public String f16141ud;

        /* JADX INFO: renamed from: wd, reason: collision with root package name */
        public JSONArray f16142wd;
    }

    public static class qdl {
        public Map<String, Object> lnr;
        public int mml;
        public String mo;
        public int mzz;
        public int qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        public Map<String, Object> f16143ud;

        /* JADX INFO: renamed from: wd, reason: collision with root package name */
        public JSONArray f16144wd;
    }

    public static class ud {
        public JSONArray lnr;
        public String qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        public int[][] f16145ud;
    }

    public Map<String, com.bytedance.adsdk.ud.lnr.lnr> bjy() {
        return this.mzz;
    }

    public List<com.bytedance.adsdk.ud.lnr.lnr.mzz> exu() {
        return this.tvp;
    }

    public float fs() {
        return this.exu;
    }

    public lnr jpc() {
        return this.jtx;
    }

    public Map<String, to> jtx() {
        return this.mml;
    }

    public jl lnr() {
        return this.qdl;
    }

    public Rect mml() {
        return this.to;
    }

    public float mo() {
        return this.rq;
    }

    public float mzz() {
        return (long) ((yt() / this.exu) * 1000.0f);
    }

    public void qdl(Rect rect, float f10, float f11, float f12, List<com.bytedance.adsdk.ud.lnr.lnr.mzz> list, LongSparseArray<com.bytedance.adsdk.ud.lnr.lnr.mzz> longSparseArray, Map<String, List<com.bytedance.adsdk.ud.lnr.lnr.mzz>> map, Map<String, to> map2, SparseArray<com.bytedance.adsdk.ud.lnr.mml> sparseArray, Map<String, com.bytedance.adsdk.ud.lnr.lnr> map3, List<com.bytedance.adsdk.ud.lnr.mo> list2, lnr lnrVar, String str, qdl qdlVar, ud udVar) {
        this.to = rect;
        this.rq = f10;
        this.fs = f11;
        this.exu = f12;
        this.tvp = list;
        this.jpc = longSparseArray;
        this.lnr = map;
        this.mml = map2;
        this.f16140wd = sparseArray;
        this.mzz = map3;
        this.mo = list2;
        this.jtx = lnrVar;
        this.yt = str;
        this.jl = qdlVar;
        this.exc = udVar;
    }

    public SparseArray<com.bytedance.adsdk.ud.lnr.mml> rdp() {
        return this.f16140wd;
    }

    public qdl rq() {
        return this.jl;
    }

    public ud to() {
        return this.exc;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator<com.bytedance.adsdk.ud.lnr.lnr.mzz> it = this.tvp.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().qdl("\t"));
        }
        return sb2.toString();
    }

    public String tvp() {
        return this.yt;
    }

    public int ud() {
        return this.bjy;
    }

    public float wd() {
        return this.fs;
    }

    public float yt() {
        return this.fs - this.rq;
    }

    public com.bytedance.adsdk.ud.lnr.mo lnr(String str) {
        int size = this.mo.size();
        for (int i10 = 0; i10 < size; i10++) {
            com.bytedance.adsdk.ud.lnr.mo moVar = this.mo.get(i10);
            if (moVar.qdl(str)) {
                return moVar;
            }
        }
        return null;
    }

    public void ud(boolean z10) {
        this.qdl.qdl(z10);
    }

    public List<com.bytedance.adsdk.ud.lnr.lnr.mzz> ud(String str) {
        return this.lnr.get(str);
    }

    public void qdl(String str) {
        this.f16139ud.add(str);
    }

    public void qdl(boolean z10) {
        this.rdp = z10;
    }

    public void qdl(int i10) {
        this.bjy += i10;
    }

    public boolean qdl() {
        return this.rdp;
    }

    public com.bytedance.adsdk.ud.lnr.lnr.mzz qdl(long j10) {
        return this.jpc.get(j10);
    }

    public float qdl(float f10) {
        return com.bytedance.adsdk.ud.mo.mzz.qdl(this.rq, this.fs, f10);
    }
}

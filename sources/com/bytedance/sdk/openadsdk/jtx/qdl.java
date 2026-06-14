package com.bytedance.sdk.openadsdk.jtx;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.aaj;
import com.google.common.base.Ascii;
import com.ironsource.C4424m2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class qdl implements Comparable<qdl> {
    private int lnr;
    private int mzz;
    private long rdp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final String f17612ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private int f17613wd;
    private final ArrayList<Long> qdl = new ArrayList<>();
    private final ArrayList<Long> mml = new ArrayList<>();
    private final ArrayList<Long> mo = new ArrayList<>();
    private final ArrayList<Long> jpc = new ArrayList<>();
    private final HashMap<String, ud> tvp = new HashMap<>();
    private int to = 0;
    private int rq = 0;
    private final HashMap<String, ud> fs = new HashMap<>();
    private int exu = 0;
    private final ArrayList<String> bjy = new ArrayList<>();

    public qdl(String str) {
        this.f17612ud = str;
    }

    private void ud(@NonNull JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i10;
        int i11;
        int i12;
        int[] iArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int[] iArrFs = com.bytedance.sdk.openadsdk.mo.qdl.qdl().fs();
        if (iArrFs != null) {
            int i13 = 0;
            while (i13 < iArrFs.length) {
                int i14 = iArrFs[i13];
                long j10 = 60000;
                long j11 = jElapsedRealtime - (((long) i14) * 60000);
                Iterator<String> it = this.fs.keySet().iterator();
                long j12 = 0;
                while (it.hasNext()) {
                    long j13 = j10;
                    String next = it.next();
                    Iterator<String> it2 = it;
                    ud udVar = this.fs.get(next);
                    if (udVar != null) {
                        long jQdl = udVar.qdl(j11, jElapsedRealtime);
                        j12 += jQdl;
                        if (jQdl <= 0 && i13 == iArrFs.length - 1) {
                            hashSet.add(next);
                        }
                    }
                    it = it2;
                    j10 = j13;
                }
                if (j12 != 0) {
                    jSONObject.put("lp_stay_t_".concat(String.valueOf(i14)), j12);
                    iArr = iArrFs;
                    long jOptInt = ((long) jSONObject2.optInt("lp_stay_t_".concat(String.valueOf(i14)))) + j12;
                    if (jOptInt != 0) {
                        jSONObject2.put("lp_stay_t_".concat(String.valueOf(i14)), jOptInt);
                    }
                } else {
                    iArr = iArrFs;
                }
                i13++;
                iArrFs = iArr;
            }
        }
        int[] iArrExu = com.bytedance.sdk.openadsdk.mo.qdl.qdl().exu();
        if (iArrExu != null) {
            int i15 = 0;
            while (i15 < iArrExu.length) {
                int i16 = iArrExu[i15];
                long j14 = jElapsedRealtime - (((long) i16) * 60000);
                long j15 = 0;
                int i17 = 0;
                for (String str : this.tvp.keySet()) {
                    HashSet hashSet3 = hashSet;
                    int i18 = i16;
                    ud udVar2 = this.tvp.get(str);
                    if (udVar2 != null) {
                        long jQdl2 = udVar2.qdl(j14, jElapsedRealtime);
                        j15 += jQdl2;
                        if (jQdl2 > 20000) {
                            i17++;
                        }
                        if (jQdl2 <= 0 && i15 == iArrExu.length - 1) {
                            hashSet2.add(str);
                        }
                    }
                    i16 = i18;
                    hashSet = hashSet3;
                }
                HashSet hashSet4 = hashSet;
                int i19 = i16;
                if (j15 != 0) {
                    jSONObject.put("v_stay_t_".concat(String.valueOf(i19)), j15);
                    long jOptInt2 = ((long) jSONObject2.optInt("v_stay_t_".concat(String.valueOf(i19)))) + j15;
                    if (jOptInt2 != 0) {
                        jSONObject2.put("v_stay_t_".concat(String.valueOf(i19)), jOptInt2);
                    }
                }
                if (i17 != 0) {
                    jSONObject.put("v_20s_play_c_".concat(String.valueOf(i19)), i17);
                    int iOptInt = jSONObject2.optInt("v_20s_play_c_".concat(String.valueOf(i19))) + i17;
                    if (iOptInt != 0) {
                        jSONObject2.put("v_20s_play_c_".concat(String.valueOf(i19)), iOptInt);
                    }
                }
                i15++;
                hashSet = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet;
        if (!hashSet5.isEmpty()) {
            Iterator it3 = hashSet5.iterator();
            while (it3.hasNext()) {
                this.fs.remove((String) it3.next());
            }
        }
        if (!hashSet2.isEmpty()) {
            Iterator it4 = hashSet2.iterator();
            while (it4.hasNext()) {
                this.tvp.remove((String) it4.next());
            }
        }
        if (com.bytedance.sdk.openadsdk.mo.qdl.qdl().bjy() && (i12 = this.to) != 0) {
            jSONObject.put("v_stay_t_s", i12);
            int iOptInt2 = jSONObject2.optInt("v_stay_t_s") + this.to;
            if (iOptInt2 != 0) {
                jSONObject2.put("v_stay_t_s", iOptInt2);
            }
        }
        if (com.bytedance.sdk.openadsdk.mo.qdl.qdl().rdp() && (i11 = this.exu) != 0) {
            jSONObject.put("lp_stay_t_s", i11);
            int iOptInt3 = jSONObject2.optInt("lp_stay_t_s") + this.exu;
            if (iOptInt3 != 0) {
                jSONObject2.put("lp_stay_t_s", iOptInt3);
            }
        }
        if (!com.bytedance.sdk.openadsdk.mo.qdl.qdl().yt() || (i10 = this.rq) == 0) {
            return;
        }
        jSONObject.put("v_30p_play_c_s", i10);
        int iOptInt4 = jSONObject2.optInt("v_30p_play_c_s") + this.rq;
        if (iOptInt4 != 0) {
            jSONObject2.put("v_30p_play_c_s", iOptInt4);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void qdl(@NonNull String str, @Nullable String str2) {
        ud udVar;
        ud udVar2;
        ud udVar3;
        ud udVar4;
        ud udVar5;
        ud udVar6;
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1908685858:
                if (str.equals("landingContinue")) {
                    b10 = 0;
                }
                break;
            case -1769688545:
                if (str.equals("landingPause")) {
                    b10 = 1;
                }
                break;
            case -1766371189:
                if (str.equals("landingStart")) {
                    b10 = 2;
                }
                break;
            case -1643912491:
                if (str.equals("feed_over")) {
                    b10 = 3;
                }
                break;
            case -1643892427:
                if (str.equals("feed_play")) {
                    b10 = 4;
                }
                break;
            case 3529469:
                if (str.equals(C4424m2.f43623v)) {
                    b10 = 5;
                }
                break;
            case 94750088:
                if (str.equals("click")) {
                    b10 = 6;
                }
                break;
            case 533457448:
                if (str.equals("feed_continue")) {
                    b10 = 7;
                }
                break;
            case 566194974:
                if (str.equals("feed_break")) {
                    b10 = 8;
                }
                break;
            case 578633749:
                if (str.equals("feed_pause")) {
                    b10 = 9;
                }
                break;
            case 695109002:
                if (str.equals("landingFinish")) {
                    b10 = 10;
                }
                break;
            case 702698279:
                if (str.equals("videoPercent30")) {
                    b10 = Ascii.VT;
                }
                break;
            case 1338624943:
                if (str.equals("videoForceBreak")) {
                    b10 = Ascii.FF;
                }
                break;
            case 1671642405:
                if (str.equals("dislike")) {
                    b10 = 13;
                }
                break;
            case 1912965437:
                if (str.equals("play_error")) {
                    b10 = Ascii.SO;
                }
                break;
        }
        switch (b10) {
            case 0:
                if (!TextUtils.isEmpty(str2) && (udVar = this.fs.get(str2)) != null) {
                    udVar.mml(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 1:
                if (!TextUtils.isEmpty(str2) && (udVar2 = this.fs.get(str2)) != null) {
                    udVar2.lnr(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 2:
                if (!TextUtils.isEmpty(str2) && this.fs.get(str2) == null) {
                    ud udVar7 = new ud();
                    this.fs.put(str2, udVar7);
                    udVar7.qdl(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 3:
            case 8:
            case 12:
            case 14:
                if (!TextUtils.isEmpty(str2) && (udVar3 = this.tvp.get(str2)) != null && udVar3.qdl() != ud.mzz) {
                    udVar3.ud(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.mo.qdl.qdl().bjy()) {
                        this.to = (int) (((long) this.to) + udVar3.qdl(this.rdp, SystemClock.elapsedRealtime()));
                    }
                    break;
                }
                break;
            case 4:
                this.mo.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.mo.qdl.qdl().jpc()) {
                    this.f17613wd++;
                }
                if (!TextUtils.isEmpty(str2) && this.tvp.get(str2) == null) {
                    ud udVar8 = new ud();
                    this.tvp.put(str2, udVar8);
                    udVar8.qdl(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 5:
                this.qdl.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.mo.qdl.qdl().mo()) {
                    this.lnr++;
                }
                break;
            case 6:
                if (!this.bjy.contains(str2)) {
                    if (this.bjy.size() > 50) {
                        this.bjy.subList(0, 25).clear();
                    }
                    this.bjy.add(str2);
                    this.mml.add(Long.valueOf(SystemClock.elapsedRealtime()));
                    if (com.bytedance.sdk.openadsdk.mo.qdl.qdl().wd()) {
                        this.mzz++;
                    }
                    break;
                }
                break;
            case 7:
                if (!TextUtils.isEmpty(str2) && (udVar4 = this.tvp.get(str2)) != null) {
                    udVar4.mml(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 9:
                if (!TextUtils.isEmpty(str2) && (udVar5 = this.tvp.get(str2)) != null) {
                    udVar5.lnr(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 10:
                if (!TextUtils.isEmpty(str2) && (udVar6 = this.fs.get(str2)) != null && udVar6.qdl() != ud.mzz) {
                    udVar6.ud(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.mo.qdl.qdl().rdp()) {
                        this.exu = (int) (((long) this.exu) + udVar6.qdl(this.rdp, SystemClock.elapsedRealtime()));
                    }
                    break;
                }
                break;
            case 11:
                if (com.bytedance.sdk.openadsdk.mo.qdl.qdl().yt()) {
                    this.rq++;
                }
                break;
            case 13:
                this.jpc.add(Long.valueOf(SystemClock.elapsedRealtime()));
                break;
        }
    }

    public JSONObject qdl(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            qdl(jSONObject2, jSONObject);
            ud(jSONObject2, jSONObject);
            return jSONObject2;
        } catch (Throwable th2) {
            aaj.lnr(th2.getMessage(), new Object[0]);
            return jSONObject2;
        }
    }

    public String ud() {
        return this.f17612ud;
    }

    private void qdl(String str, JSONObject jSONObject, ArrayList<Long> arrayList, int[] iArr, long j10, JSONObject jSONObject2) throws JSONException {
        int size = arrayList.size() - 1;
        int i10 = 0;
        for (int i11 : iArr) {
            long j11 = j10 - (((long) i11) * 60000);
            while (size >= 0 && arrayList.get(size).longValue() >= j11) {
                i10++;
                size--;
            }
            if (i10 != 0) {
                jSONObject.put(str + i11, i10);
                int iOptInt = jSONObject2.optInt(str + i11) + i10;
                if (iOptInt != 0) {
                    jSONObject2.put(str + i11, iOptInt);
                }
            }
        }
        while (size >= 0) {
            arrayList.remove(0);
            size--;
        }
    }

    private void qdl(@NonNull JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i10;
        int i11;
        int i12;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        qdl("show_c_", jSONObject, this.qdl, com.bytedance.sdk.openadsdk.mo.qdl.qdl().tvp(), jElapsedRealtime, jSONObject2);
        qdl("click_c_", jSONObject, this.mml, com.bytedance.sdk.openadsdk.mo.qdl.qdl().to(), jElapsedRealtime, jSONObject2);
        qdl("v_play_c_", jSONObject, this.mo, com.bytedance.sdk.openadsdk.mo.qdl.qdl().rq(), jElapsedRealtime, jSONObject2);
        qdl("dislike_c_", jSONObject, this.jpc, com.bytedance.sdk.openadsdk.mo.qdl.qdl().jtx(), jElapsedRealtime, jSONObject2);
        if (com.bytedance.sdk.openadsdk.mo.qdl.qdl().mo() && (i12 = this.lnr) != 0) {
            jSONObject.put("show_c_s", i12);
            int iOptInt = jSONObject2.optInt("show_c_s") + this.lnr;
            if (iOptInt != 0) {
                jSONObject2.put("show_c_s", iOptInt);
            }
        }
        if (com.bytedance.sdk.openadsdk.mo.qdl.qdl().wd() && (i11 = this.mzz) != 0) {
            jSONObject.put("click_c_s", i11);
            int iOptInt2 = jSONObject2.optInt("click_c_s") + this.mzz;
            if (iOptInt2 != 0) {
                jSONObject2.put("click_c_s", iOptInt2);
            }
        }
        if (!com.bytedance.sdk.openadsdk.mo.qdl.qdl().jpc() || (i10 = this.f17613wd) == 0) {
            return;
        }
        jSONObject.put("v_play_c_s", i10);
        int iOptInt3 = jSONObject2.optInt("v_play_c_s") + this.f17613wd;
        if (iOptInt3 != 0) {
            jSONObject2.put("v_play_c_s", iOptInt3);
        }
    }

    public void qdl() {
        this.rdp = SystemClock.elapsedRealtime();
        this.rq = 0;
        this.mzz = 0;
        this.lnr = 0;
        this.exu = 0;
        this.to = 0;
        this.f17613wd = 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
    public int compareTo(qdl qdlVar) {
        return qdlVar.lnr - this.lnr;
    }
}

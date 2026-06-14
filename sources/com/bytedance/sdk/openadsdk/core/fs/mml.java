package com.bytedance.sdk.openadsdk.core.fs;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.fs.ud.lnr;
import com.bytedance.sdk.openadsdk.core.fs.ud.qdl;
import com.bytedance.sdk.openadsdk.core.fs.ud.ud;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mml {
    private boolean aaj;
    private boolean bjy;
    private boolean exc;
    private boolean jl;
    private long jtx;
    private String jyq;
    private String oth;
    private ljh yt;
    private final AtomicBoolean exu = new AtomicBoolean(false);
    private final AtomicBoolean rdp = new AtomicBoolean(false);
    public List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> qdl = new ArrayList();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> f17219ud = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> lnr = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> mml = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> mzz = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> mo = new ArrayList();

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> f17220wd = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> jpc = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> tvp = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> to = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.fs.ud.ud> rq = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.fs.ud.qdl> fs = new ArrayList();

    public void fs(List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list) {
        this.to.addAll(list);
    }

    public void jpc(long j10) {
        if (!qdl(j10, this.tvp, null, this.bjy ? null : new lnr.ud("mute", this.yt, j10)) || this.bjy) {
            return;
        }
        com.bytedance.sdk.openadsdk.mml.lnr.ud(this.yt, this.jyq, "track_mute", (JSONObject) null);
    }

    public void lnr(long j10) {
        if (!qdl(j10, this.mml, null, this.bjy ? null : new lnr.ud("resume", this.yt, j10)) || this.bjy) {
            return;
        }
        com.bytedance.sdk.openadsdk.mml.lnr.ud(this.yt, this.jyq, "track_resume", (JSONObject) null);
    }

    public void mml(long j10) {
        if (!qdl(j10, this.mzz, null, new lnr.ud(this.bjy ? "video_progress" : "complete", this.yt, 1.0f)) || this.bjy) {
            return;
        }
        com.bytedance.sdk.openadsdk.mml.lnr.ud(this.yt, this.jyq, "track_complete", (JSONObject) null);
    }

    public void mo(long j10) {
        if (!qdl(j10, this.f17220wd, null, this.bjy ? null : new lnr.ud("skip", this.yt)) || this.bjy) {
            return;
        }
        com.bytedance.sdk.openadsdk.mml.lnr.ud(this.yt, this.jyq, "track_skip", (JSONObject) null);
    }

    public void mzz(long j10) {
        if (this.rdp.compareAndSet(false, true)) {
            qdl(j10, this.mo, (com.bytedance.sdk.openadsdk.core.fs.qdl.qdl) null);
        }
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.fs.qdl.qdl qdlVar) {
        if (!qdl(-1L, this.qdl, qdlVar, this.bjy ? null : new lnr.ud("error", this.yt, 0.0f)) || this.bjy) {
            return;
        }
        com.bytedance.sdk.openadsdk.mml.lnr.ud(this.yt, this.jyq, "track_error", (JSONObject) null);
    }

    public void rq(List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list) {
        this.tvp.addAll(list);
    }

    public void to(List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list) {
        this.qdl.addAll(list);
    }

    public void tvp(long j10) {
        if (!qdl(j10, this.to, null, this.bjy ? null : new lnr.ud("unmute", this.yt, j10)) || this.bjy) {
            return;
        }
        com.bytedance.sdk.openadsdk.mml.lnr.ud(this.yt, this.jyq, "track_unmute", (JSONObject) null);
    }

    public void ud(long j10) {
        if (!qdl(j10, this.lnr, null, this.bjy ? null : new lnr.ud("pause", this.yt, j10)) || this.bjy) {
            return;
        }
        com.bytedance.sdk.openadsdk.mml.lnr.ud(this.yt, this.jyq, "track_pause", (JSONObject) null);
    }

    public void wd(long j10) {
        if (!qdl(j10, this.jpc, null, new lnr.ud(this.bjy ? "click" : "clickTracking", this.yt)) || this.bjy) {
            return;
        }
        com.bytedance.sdk.openadsdk.mml.lnr.ud(this.yt, this.jyq, "track_video_click", (JSONObject) null);
    }

    public void mzz(List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list) {
        this.mo.addAll(list);
    }

    private String ud() {
        if (this.oth == null) {
            this.oth = UUID.randomUUID().toString();
        }
        return this.oth;
    }

    public void jpc(List<com.bytedance.sdk.openadsdk.core.fs.ud.ud> list) {
        this.rq.addAll(list);
        Collections.sort(this.rq);
    }

    public void lnr(List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list) {
        this.mml.addAll(list);
    }

    public void mml(List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list) {
        this.mzz.addAll(list);
    }

    public void mo(List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list) {
        this.f17220wd.addAll(list);
    }

    public void qdl(long j10) {
        if (this.exu.compareAndSet(false, true)) {
            if (!qdl(j10, this.f17219ud, null, new lnr.ud(this.bjy ? "show_impression" : "impression", this.yt)) || this.bjy) {
                return;
            }
            com.bytedance.sdk.openadsdk.mml.lnr.ud(this.yt, this.jyq, "track_impression", (JSONObject) null);
        }
    }

    public void tvp(List<com.bytedance.sdk.openadsdk.core.fs.ud.qdl> list) {
        this.fs.addAll(list);
        Collections.sort(this.fs);
    }

    public void wd(List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list) {
        this.jpc.addAll(list);
    }

    private JSONArray lnr() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<com.bytedance.sdk.openadsdk.core.fs.ud.ud> it = this.rq.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().ud());
        }
        return jSONArray;
    }

    private JSONArray mml() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<com.bytedance.sdk.openadsdk.core.fs.ud.qdl> it = this.fs.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().ud());
        }
        return jSONArray;
    }

    public void ud(List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list) {
        this.lnr.addAll(list);
    }

    public void qdl(long j10, long j11, mo moVar) {
        lnr.ud udVar;
        if (System.currentTimeMillis() - this.jtx >= 1000 && j10 >= 0 && j11 > 0) {
            this.jtx = System.currentTimeMillis();
            float f10 = j10 / j11;
            List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> listQdl = qdl(j10, f10);
            float f11 = 0.25f;
            if (f10 >= 0.25f && !this.jl) {
                qdl("firstQuartile");
                this.jl = true;
                if (moVar != null) {
                    qdl(moVar, 6);
                }
                if (!this.bjy) {
                    udVar = new lnr.ud("firstQuartile", this.yt, 0.25f);
                    f10 = f11;
                }
                f10 = f11;
                udVar = null;
            } else {
                f11 = 0.5f;
                if (f10 >= 0.5f && !this.exc) {
                    qdl("midpoint");
                    this.exc = true;
                    if (moVar != null) {
                        qdl(moVar, 7);
                    }
                    if (!this.bjy) {
                        udVar = new lnr.ud("midpoint", this.yt, 0.5f);
                        f10 = f11;
                    }
                    f10 = f11;
                    udVar = null;
                } else {
                    f11 = 0.75f;
                    if (f10 >= 0.75f && !this.aaj) {
                        qdl("thirdQuartile");
                        this.aaj = true;
                        if (moVar != null) {
                            qdl(moVar, 8);
                        }
                        if (!this.bjy) {
                            udVar = new lnr.ud("thirdQuartile", this.yt, 0.75f);
                            f10 = f11;
                        }
                        f10 = f11;
                    }
                    udVar = null;
                }
            }
            if (f10 < 0.03f) {
                f10 = 0.0f;
            }
            if (!this.bjy && !listQdl.isEmpty()) {
                com.bytedance.sdk.openadsdk.core.fs.ud.lnr lnrVar = listQdl.get(0);
                if ((lnrVar instanceof com.bytedance.sdk.openadsdk.core.fs.ud.qdl) && ((com.bytedance.sdk.openadsdk.core.fs.ud.qdl) lnrVar).qdl() == 0) {
                    com.bytedance.sdk.openadsdk.mml.lnr.ud(this.yt, this.jyq, "track_start", (JSONObject) null);
                    udVar = new lnr.ud("start", this.yt, f10);
                }
            }
            if (listQdl.isEmpty()) {
                return;
            }
            if (udVar == null) {
                udVar = new lnr.ud("video_progress", this.yt, f10);
            }
            qdl(j10, listQdl, null, udVar);
        }
    }

    private void qdl(final mo moVar, final int i10) {
        com.bytedance.sdk.component.utils.tvp.ud().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fs.mml.1
            @Override // java.lang.Runnable
            public void run() {
                mo moVar2 = moVar;
                if (moVar2 != null) {
                    moVar2.qdl(i10);
                }
            }
        });
    }

    private void qdl(String str) {
        try {
            if (this.bjy) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event", str);
                com.bytedance.sdk.openadsdk.mml.lnr.ud(this.yt, this.jyq, "vast_play_track", jSONObject);
            } else if ("firstQuartile".equals(str)) {
                com.bytedance.sdk.openadsdk.mml.lnr.ud(this.yt, this.jyq, "track_first_quartile", (JSONObject) null);
            } else if ("midpoint".equals(str)) {
                com.bytedance.sdk.openadsdk.mml.lnr.ud(this.yt, this.jyq, "track_midpoint", (JSONObject) null);
            } else if ("thirdQuartile".equals(str)) {
                com.bytedance.sdk.openadsdk.mml.lnr.ud(this.yt, this.jyq, "track_third_quartile", (JSONObject) null);
            }
        } catch (Throwable unused) {
        }
    }

    private boolean qdl(long j10, List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list, com.bytedance.sdk.openadsdk.core.fs.qdl.qdl qdlVar, lnr.ud udVar) {
        com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVarTdy;
        ljh ljhVar = this.yt;
        String strRq = null;
        if (ljhVar != null && (udVarTdy = ljhVar.tdy()) != null) {
            strRq = udVarTdy.rq();
        }
        return com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(this.yt, list, qdlVar, j10, strRq, udVar, ud());
    }

    private boolean qdl(long j10, List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list, com.bytedance.sdk.openadsdk.core.fs.qdl.qdl qdlVar) {
        return qdl(j10, list, qdlVar, null);
    }

    public List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> qdl(long j10, float f10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.rq.size(); i10++) {
            com.bytedance.sdk.openadsdk.core.fs.ud.ud udVar = this.rq.get(i10);
            if (udVar.qdl(f10)) {
                arrayList.add(udVar);
            }
        }
        for (int i11 = 0; i11 < this.fs.size(); i11++) {
            com.bytedance.sdk.openadsdk.core.fs.ud.qdl qdlVar = this.fs.get(i11);
            if (qdlVar.qdl(j10)) {
                arrayList.add(qdlVar);
            }
        }
        return arrayList;
    }

    public void qdl(List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list) {
        this.f17219ud.addAll(list);
    }

    public JSONObject qdl() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorTrackers", com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(this.qdl));
        jSONObject.put("impressionTrackers", com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(this.f17219ud));
        jSONObject.put("pauseTrackers", com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(this.lnr));
        jSONObject.put("resumeTrackers", com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(this.mml));
        jSONObject.put("completeTrackers", com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(this.mzz));
        jSONObject.put("closeTrackers", com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(this.mo));
        jSONObject.put("skipTrackers", com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(this.f17220wd));
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(this.jpc));
        jSONObject.put("muteTrackers", com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(this.tvp));
        jSONObject.put("unMuteTrackers", com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(this.to));
        jSONObject.put("fractionalTrackers", lnr());
        jSONObject.put("absoluteTrackers", mml());
        return jSONObject;
    }

    public void qdl(JSONObject jSONObject) {
        to(com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(jSONObject.optJSONArray("errorTrackers")));
        qdl(com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(jSONObject.optJSONArray("impressionTrackers")));
        ud(com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(jSONObject.optJSONArray("pauseTrackers"), true));
        lnr(com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(jSONObject.optJSONArray("resumeTrackers"), true));
        mml(com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(jSONObject.optJSONArray("completeTrackers")));
        mzz(com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(jSONObject.optJSONArray("closeTrackers")));
        mo(com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(jSONObject.optJSONArray("skipTrackers")));
        wd(com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(jSONObject.optJSONArray("clickTrackers")));
        rq(com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(jSONObject.optJSONArray("muteTrackers"), true));
        fs(com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(jSONObject.optJSONArray("unMuteTrackers"), true));
        jpc(com.bytedance.sdk.openadsdk.core.fs.ud.lnr.ud(jSONObject.optJSONArray("fractionalTrackers")));
        tvp(com.bytedance.sdk.openadsdk.core.fs.ud.lnr.lnr(jSONObject.optJSONArray("absoluteTrackers")));
    }

    public void qdl(ljh ljhVar) {
        this.yt = ljhVar;
        this.jyq = ljhVar.mzz();
        this.bjy = ljhVar.uj();
    }

    public void qdl(String str, long j10) {
        if (TextUtils.isEmpty(str) || j10 < 0) {
            return;
        }
        tvp(Collections.singletonList(new qdl.C0260qdl(str, j10).qdl()));
    }

    public void qdl(String str, float f10) {
        if (TextUtils.isEmpty(str) || f10 < 0.0f) {
            return;
        }
        jpc(Collections.singletonList(new ud.qdl(str, f10).qdl()));
    }

    public void qdl(mml mmlVar) {
        to(mmlVar.qdl);
        qdl(mmlVar.f17219ud);
        ud(mmlVar.lnr);
        lnr(mmlVar.mml);
        mml(mmlVar.mzz);
        mzz(mmlVar.mo);
        mo(mmlVar.f17220wd);
        wd(mmlVar.jpc);
        rq(mmlVar.tvp);
        fs(mmlVar.to);
        jpc(mmlVar.rq);
        tvp(mmlVar.fs);
    }
}

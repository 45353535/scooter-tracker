package com.bytedance.sdk.openadsdk.mml.mzz.qdl;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.bjy;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.exu;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.jpc;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.mml;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.mo;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.mzz;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.rdp;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.to;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.tvp;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.ud;
import com.bytedance.sdk.openadsdk.mml.wd;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    private static final Map<com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl, bjy> qdl = DesugarCollections.synchronizedMap(new WeakHashMap());

    public static void lnr(com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl qdlVar, bjy.qdl qdlVar2) {
        bjy bjyVar;
        if (qdlVar == null || qdlVar2 == null || (bjyVar = qdl.get(qdlVar)) == null) {
            return;
        }
        lnr lnrVarMml = bjyVar.mml();
        ljh ljhVarMzz = bjyVar.mzz();
        if (lnrVarMml == null || ljhVarMzz == null) {
            return;
        }
        long jUd = qdlVar2.ud();
        long jMml = qdlVar2.mml();
        rdp rdpVar = new rdp(qdlVar2.exu());
        rdpVar.qdl(qdlVar2.lnr());
        rdpVar.ud(jMml);
        JSONObject jSONObjectQdl = qdl(ljhVarMzz, bjyVar.ud(), bjyVar.lnr(), lnrVarMml);
        int i10 = lnrVarMml.mzz;
        if (i10 > 0) {
            try {
                jSONObjectQdl.put("play_time", i10);
            } catch (JSONException e10) {
                aaj.qdl("TTAD.VideoEventManager", "", e10);
            }
        }
        com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar3 = new com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl(ljhVarMzz, gy.qdl(ljhVarMzz), jSONObjectQdl, rdpVar);
        qdlVar3.qdl(qdlVar2.rq());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jUd);
            jSONObject.put("percent", qdlVar2.wd());
            qdl(qdlVar3, "play_error", jSONObject);
        } catch (JSONException e11) {
            aaj.qdl("TTAD.VideoEventManager", "", e11);
        }
    }

    public static void mml(com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl qdlVar, bjy.qdl qdlVar2) {
        bjy bjyVar;
        if (qdlVar == null || qdlVar2 == null || (bjyVar = qdl.get(qdlVar)) == null) {
            return;
        }
        lnr lnrVarMml = bjyVar.mml();
        ljh ljhVarMzz = bjyVar.mzz();
        if (lnrVarMml == null || ljhVarMzz == null) {
            return;
        }
        long jUd = qdlVar2.ud();
        long jMml = qdlVar2.mml();
        ud udVar = new ud();
        udVar.qdl(qdlVar2.lnr());
        udVar.ud(jMml);
        udVar.qdl(qdlVar2.mzz());
        udVar.ud(qdlVar2.mo());
        com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar3 = new com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl(ljhVarMzz, gy.qdl(ljhVarMzz), qdl(ljhVarMzz, bjyVar.ud(), bjyVar.lnr(), lnrVarMml), udVar);
        qdlVar3.qdl(qdlVar2.rq());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jUd);
            jSONObject.put("percent", qdlVar2.wd());
            qdl(qdlVar3, "endcard_skip", jSONObject);
        } catch (JSONException e10) {
            aaj.qdl("TTAD.VideoEventManager", "", e10);
        }
        qdl.remove(qdlVar);
    }

    public static void mzz(com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl qdlVar, bjy.qdl qdlVar2) {
        bjy bjyVar;
        if (qdlVar == null || qdlVar2 == null || qdlVar2.to() <= 0 || (bjyVar = qdl.get(qdlVar)) == null) {
            return;
        }
        lnr lnrVarMml = bjyVar.mml();
        ljh ljhVarMzz = bjyVar.mzz();
        if (lnrVarMml == null || ljhVarMzz == null) {
            return;
        }
        long jMml = qdlVar2.mml();
        exu exuVar = new exu();
        exuVar.qdl(qdlVar2.lnr());
        exuVar.ud(jMml);
        exuVar.qdl(qdlVar2.to());
        JSONObject jSONObjectQdl = qdl(ljhVarMzz, bjyVar.ud(), bjyVar.lnr(), lnrVarMml);
        int i10 = lnrVarMml.mzz;
        if (i10 > 0) {
            try {
                jSONObjectQdl.put("play_time", i10);
            } catch (JSONException e10) {
                aaj.qdl("TTAD.VideoEventManager", "", e10);
            }
        }
        com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar3 = new com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl(ljhVarMzz, gy.qdl(ljhVarMzz), jSONObjectQdl, exuVar);
        qdlVar3.qdl(qdlVar2.rq());
        qdl(qdlVar3, "play_buffer");
    }

    public static JSONObject qdl(ljh ljhVar, String str, int i10, lnr lnrVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("session_id", str);
            }
            if (i10 > 0) {
                jSONObject.put("play_type", String.valueOf(i10));
            }
            if (ljhVar != null) {
                com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVarTdy = ljhVar.tdy();
                if (udVarTdy != null) {
                    jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, udVarTdy.tvp());
                    jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Long.valueOf(udVarTdy.mzz()));
                    jSONObject.put("video_url", udVarTdy.rq());
                    jSONObject.put("player_type", lnrVar.jl());
                    jSONObject.put("video_encode_type", lnrVar.rdp() ? 1 : 0);
                }
                if (lnrVar.qdl()) {
                    jSONObject.put("pag_json_data", new JSONObject(lnrVar.lnr().toString()).toString());
                }
                jSONObject.put("dp_creative_type", ljhVar.ikv());
                return jSONObject;
            }
        } catch (JSONException e10) {
            aaj.qdl("TTAD.VideoEventManager", "", e10);
        }
        return jSONObject;
    }

    public static void ud(com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl<tvp> qdlVar) {
        com.bytedance.sdk.openadsdk.bjy.lnr.qdl("load_video_cancel", qdlVar);
    }

    public static void ud(com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl qdlVar, bjy.qdl qdlVar2) {
        bjy bjyVar;
        if (qdlVar == null || qdlVar2 == null || (bjyVar = qdl.get(qdlVar)) == null) {
            return;
        }
        lnr lnrVarMml = bjyVar.mml();
        ljh ljhVarMzz = bjyVar.mzz();
        if (lnrVarMml == null || ljhVarMzz == null) {
            return;
        }
        long jUd = qdlVar2.ud();
        long jMml = qdlVar2.mml();
        if (jMml <= 0 || jUd <= 0) {
            return;
        }
        mzz mzzVar = new mzz();
        mzzVar.qdl(qdlVar2.lnr());
        mzzVar.ud(jMml);
        JSONObject jSONObjectQdl = qdl(ljhVarMzz, bjyVar.ud(), bjyVar.lnr(), lnrVarMml);
        int i10 = lnrVarMml.mzz;
        if (i10 > 0) {
            try {
                jSONObjectQdl.put("play_time", i10);
            } catch (JSONException e10) {
                aaj.qdl("TTAD.VideoEventManager", "", e10);
            }
        }
        com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar3 = new com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl(ljhVarMzz, gy.qdl(ljhVarMzz), jSONObjectQdl, mzzVar);
        qdlVar3.qdl(qdlVar2.rq());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jUd);
            jSONObject.put("percent", qdlVar2.wd());
            qdl(qdlVar3, "feed_continue", jSONObject);
        } catch (JSONException e11) {
            aaj.qdl("TTAD.VideoEventManager", "", e11);
        }
    }

    public static void qdl(com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl<to> qdlVar) {
        com.bytedance.sdk.openadsdk.bjy.lnr.qdl("load_video_error", qdlVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:6|(1:8)(2:10|(10:12|14|29|15|(1:17)|20|23|(1:26)|27|28)(1:13))|9|14|29|15|(0)|20|23|(0)|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        com.bytedance.sdk.component.utils.aaj.qdl("TTAD.VideoEventManager", "", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[Catch: JSONException -> 0x004b, TryCatch #0 {JSONException -> 0x004b, blocks: (B:15:0x0041, B:17:0x0045, B:20:0x004d), top: B:29:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void qdl(com.bytedance.sdk.openadsdk.core.model.ljh r8, com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl r9, com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr r10) {
        /*
            if (r8 == 0) goto L75
            if (r9 == 0) goto L75
            if (r10 != 0) goto L8
            goto L75
        L8:
            java.lang.String r3 = com.bytedance.sdk.openadsdk.utils.uw.qdl()
            boolean r0 = r10.uw()
            r7 = 1
            if (r0 == 0) goto L16
            r0 = 3
        L14:
            r4 = r0
            goto L28
        L16:
            int r0 = r8.lhl()
            com.bykv.vk.openvk.qdl.qdl.qdl.qdl.ud r0 = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(r0)
            boolean r0 = r0.qdl(r10)
            if (r0 == 0) goto L26
            r4 = r7
            goto L28
        L26:
            r0 = 2
            goto L14
        L28:
            com.bytedance.sdk.openadsdk.mml.mzz.ud.bjy r0 = new com.bytedance.sdk.openadsdk.mml.mzz.ud.bjy
            long r1 = android.os.SystemClock.elapsedRealtime()
            r6 = r8
            r5 = r10
            r0.<init>(r1, r3, r4, r5, r6)
            java.util.Map<com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl, com.bytedance.sdk.openadsdk.mml.mzz.ud.bjy> r8 = com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.qdl
            r8.put(r9, r0)
            org.json.JSONObject r8 = qdl(r6, r3, r4, r5)
            java.lang.String r9 = com.bytedance.sdk.openadsdk.utils.gy.qdl(r6)
            r10 = 0
            int r0 = r5.mzz     // Catch: org.json.JSONException -> L4b
            if (r0 <= 0) goto L4d
            java.lang.String r1 = "play_time"
            r8.put(r1, r0)     // Catch: org.json.JSONException -> L4b
            goto L4d
        L4b:
            r0 = move-exception
            goto L57
        L4d:
            java.lang.String r0 = "is_mute"
            boolean r1 = r5.rq()     // Catch: org.json.JSONException -> L4b
            r8.put(r0, r1)     // Catch: org.json.JSONException -> L4b
            goto L5e
        L57:
            java.lang.String r1 = "TTAD.VideoEventManager"
            java.lang.String r2 = ""
            com.bytedance.sdk.component.utils.aaj.qdl(r1, r2, r0)
        L5e:
            com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl r0 = new com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl
            r1 = 0
            r0.<init>(r6, r9, r8, r1)
            int r8 = r5.jl()
            r9 = -1
            if (r8 != r9) goto L6c
            goto L6d
        L6c:
            r7 = r10
        L6d:
            r0.qdl(r7)
            java.lang.String r8 = "play_start"
            qdl(r0, r8)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.qdl(com.bytedance.sdk.openadsdk.core.model.ljh, com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl, com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long lnr(lnr lnrVar) {
        if (lnrVar == null) {
            return 0L;
        }
        com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVarBch = lnrVar.rdp() ? lnrVar.bch() : lnrVar.ljh();
        if (udVarBch != null) {
            return Double.valueOf(udVarBch.mo() * 1000.0d).longValue();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String mml(lnr lnrVar) {
        return new File(lnrVar.mzz(), lnrVar.yt()).getAbsolutePath();
    }

    public static void ud(com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl qdlVar, bjy.qdl qdlVar2, wd wdVar) {
        if (qdlVar == null || qdlVar2 == null) {
            return;
        }
        mzz(qdlVar, qdlVar2);
        bjy bjyVar = qdl.get(qdlVar);
        if (bjyVar == null) {
            return;
        }
        lnr lnrVarMml = bjyVar.mml();
        ljh ljhVarMzz = bjyVar.mzz();
        if (lnrVarMml == null || ljhVarMzz == null) {
            return;
        }
        long jUd = qdlVar2.ud();
        long jMml = qdlVar2.mml();
        mo moVar = new mo();
        moVar.ud(qdlVar2.lnr());
        moVar.qdl(jMml);
        moVar.qdl(qdlVar2.tvp());
        JSONObject jSONObjectQdl = qdl(ljhVarMzz, bjyVar.ud(), bjyVar.lnr(), lnrVarMml);
        int i10 = lnrVarMml.mzz;
        if (i10 > 0) {
            try {
                jSONObjectQdl.put("play_time", i10);
            } catch (JSONException e10) {
                aaj.qdl("TTAD.VideoEventManager", "", e10);
            }
        }
        qdl(qdlVar2, ljhVarMzz, jSONObjectQdl);
        com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar3 = new com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl(ljhVarMzz, gy.qdl(ljhVarMzz), jSONObjectQdl, moVar);
        qdlVar3.qdl(qdlVar2.rq());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jUd);
            jSONObject.put("percent", qdlVar2.wd());
            qdl(qdlVar3, "feed_over", jSONObject, wdVar);
        } catch (JSONException e11) {
            aaj.qdl("TTAD.VideoEventManager", "", e11);
        }
        qdl.remove(qdlVar);
    }

    public static void qdl(Context context, com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl qdlVar, bjy.qdl qdlVar2, wd wdVar) {
        bjy bjyVar;
        if (context == null || qdlVar == null || qdlVar2 == null || (bjyVar = qdl.get(qdlVar)) == null) {
            return;
        }
        lnr lnrVarMml = bjyVar.mml();
        ljh ljhVarMzz = bjyVar.mzz();
        if (lnrVarMml == null || ljhVarMzz == null) {
            return;
        }
        if (!qdlVar2.rq()) {
            qdl(ljhVarMzz, lnrVarMml, qdlVar2);
        }
        jpc jpcVar = new jpc();
        jpcVar.qdl(qdlVar2.fs() ? 1 : 0);
        jpcVar.ud(CacheDirFactory.getICacheDir(ljhVarMzz.lhl()).ud(lnrVarMml));
        jpcVar.qdl(SystemClock.elapsedRealtime() - bjyVar.qdl());
        JSONObject jSONObjectQdl = qdl(ljhVarMzz, bjyVar.ud(), bjyVar.lnr(), lnrVarMml);
        int i10 = lnrVarMml.mzz;
        if (i10 > 0) {
            try {
                jSONObjectQdl.put("play_time", i10);
            } catch (JSONException e10) {
                aaj.qdl("TTAD.VideoEventManager", "", e10);
            }
        }
        com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar3 = new com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl(ljhVarMzz, gy.qdl(ljhVarMzz), jSONObjectQdl, jpcVar);
        qdlVar3.qdl(qdlVar2.rq());
        qdl(qdlVar3, "feed_play", wdVar);
    }

    public static void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl qdlVar, bjy.qdl qdlVar2) {
        bjy bjyVar;
        if (qdlVar == null || qdlVar2 == null || (bjyVar = qdl.get(qdlVar)) == null) {
            return;
        }
        lnr lnrVarMml = bjyVar.mml();
        ljh ljhVarMzz = bjyVar.mzz();
        if (lnrVarMml == null || ljhVarMzz == null) {
            return;
        }
        long jUd = qdlVar2.ud();
        long jMml = qdlVar2.mml();
        if (jMml <= 0 || jUd <= 0) {
            return;
        }
        com.bytedance.sdk.openadsdk.mml.mzz.ud.wd wdVar = new com.bytedance.sdk.openadsdk.mml.mzz.ud.wd();
        wdVar.qdl(qdlVar2.lnr());
        wdVar.ud(jMml);
        JSONObject jSONObjectQdl = qdl(ljhVarMzz, bjyVar.ud(), bjyVar.lnr(), lnrVarMml);
        int i10 = lnrVarMml.mzz;
        if (i10 > 0) {
            try {
                jSONObjectQdl.put("play_time", i10);
            } catch (Throwable th2) {
                aaj.qdl("TTAD.VideoEventManager", "", th2);
            }
        }
        qdl(qdlVar2, ljhVarMzz, jSONObjectQdl);
        com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar3 = new com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl(ljhVarMzz, gy.qdl(ljhVarMzz), jSONObjectQdl, wdVar);
        qdlVar3.qdl(qdlVar2.rq());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jUd);
            jSONObject.put("percent", qdlVar2.wd());
            qdl(qdlVar3, "feed_pause", jSONObject);
        } catch (JSONException e10) {
            aaj.qdl("TTAD.VideoEventManager", "", e10);
        }
    }

    private static void qdl(bjy.qdl qdlVar, ljh ljhVar, JSONObject jSONObject) {
        if (ljhVar != null) {
            try {
                if (ljhVar.eu() != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("speed_type", ljhVar.eu().ud());
                    jSONObject2.put("speed", ljhVar.eu().qdl());
                    jSONObject2.put("speed_duration", qdlVar.qdl());
                    jSONObject.put("pag_json_data", jSONObject2.toString());
                }
            } catch (Throwable th2) {
                aaj.qdl("TTAD.VideoEventManager", "", th2);
            }
        }
    }

    public static void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl qdlVar, bjy.qdl qdlVar2, wd wdVar) {
        if (qdlVar == null || qdlVar2 == null) {
            return;
        }
        mzz(qdlVar, qdlVar2);
        bjy bjyVar = qdl.get(qdlVar);
        if (bjyVar == null) {
            return;
        }
        lnr lnrVarMml = bjyVar.mml();
        ljh ljhVarMzz = bjyVar.mzz();
        if (lnrVarMml == null || ljhVarMzz == null) {
            return;
        }
        long jUd = qdlVar2.ud();
        long jMml = qdlVar2.mml();
        mml mmlVar = new mml();
        mmlVar.ud(qdlVar2.lnr());
        mmlVar.qdl(jMml);
        mmlVar.qdl(qdlVar2.jpc());
        mmlVar.ud(qdlVar2.tvp());
        JSONObject jSONObjectQdl = qdl(ljhVarMzz, bjyVar.ud(), bjyVar.lnr(), lnrVarMml);
        int i10 = lnrVarMml.mzz;
        if (i10 > 0) {
            try {
                jSONObjectQdl.put("play_time", i10);
            } catch (JSONException e10) {
                aaj.qdl("TTAD.VideoEventManager", "", e10);
            }
        }
        qdl(qdlVar2, ljhVarMzz, jSONObjectQdl);
        com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar3 = new com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl(ljhVarMzz, gy.qdl(ljhVarMzz), jSONObjectQdl, mmlVar);
        qdlVar3.qdl(qdlVar2.rq());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jUd);
            jSONObject.put("percent", qdlVar2.wd());
            qdl(qdlVar3, "feed_break", jSONObject, wdVar);
        } catch (JSONException e11) {
            aaj.qdl("TTAD.VideoEventManager", "", e11);
        }
    }

    public static void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl qdlVar, boolean z10, String str) {
        bjy bjyVar;
        if (qdlVar == null || (bjyVar = qdl.get(qdlVar)) == null) {
            return;
        }
        lnr lnrVarMml = bjyVar.mml();
        ljh ljhVarMzz = bjyVar.mzz();
        if (lnrVarMml == null || ljhVarMzz == null) {
            return;
        }
        JSONObject jSONObjectQdl = qdl(ljhVarMzz, bjyVar.ud(), bjyVar.lnr(), lnrVarMml);
        try {
            int i10 = lnrVarMml.mzz;
            if (i10 > 0) {
                jSONObjectQdl.put("play_time", i10);
            }
            jSONObjectQdl.put("is_mute", z10 ? 1 : 0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TypedValues.TransitionType.S_FROM, str);
            jSONObjectQdl.put("pag_json_data", jSONObject);
        } catch (JSONException e10) {
            aaj.qdl("TTAD.VideoEventManager", "", e10);
        }
        qdl(new com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl(ljhVarMzz, gy.qdl(ljhVarMzz), jSONObjectQdl, null), "mute_state_change");
    }

    private static void qdl(com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar, String str) {
        qdl(qdlVar, str, (JSONObject) null, (wd) null);
    }

    private static void qdl(com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar, String str, JSONObject jSONObject) {
        qdl(qdlVar, str, jSONObject, (wd) null);
    }

    private static void qdl(com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar, String str, wd wdVar) {
        qdl(qdlVar, str, (JSONObject) null, wdVar);
    }

    private static void qdl(final com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar, String str, final JSONObject jSONObject, final wd wdVar) {
        if (qdlVar == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (qdlVar.mzz() && !TextUtils.isEmpty(qdlVar.ud())) {
            String strUd = qdlVar.ud();
            strUd.getClass();
            if (strUd.equals("stream") || strUd.equals("embeded_ad")) {
                str = "customer_".concat(String.valueOf(str));
            }
        }
        final String str2 = str;
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), qdlVar.qdl(), qdlVar.ud(), str2, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.1
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                wd wdVar2;
                try {
                    JSONObject jSONObjectLnr = qdlVar.lnr();
                    if (qdlVar.mml() != null) {
                        qdlVar.mml().qdl(jSONObjectLnr);
                    }
                    if (("feed_play".equals(str2) || "feed_over".equals(str2) || "feed_break".equals(str2)) && (wdVar2 = wdVar) != null) {
                        wdVar2.qdl(jSONObjectLnr);
                    }
                    return jSONObjectLnr;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject ud() {
                return jSONObject;
            }
        });
    }

    private static void qdl(final ljh ljhVar, final lnr lnrVar, final bjy.qdl qdlVar) {
        com.bytedance.sdk.openadsdk.bjy.lnr.qdl();
        com.bytedance.sdk.openadsdk.bjy.lnr.qdl("pangle_video_play_state", false, new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.2
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("service_duration", qdl.lnr(lnrVar));
                jSONObject.put("player_duration", qdlVar.mml());
                jSONObject.put("cache_path_type", CacheDirFactory.getCacheType());
                jSONObject.put("url", lnrVar.jtx());
                jSONObject.put("path", qdl.mml(lnrVar));
                jSONObject.put("player_type", lnrVar.jl());
                com.bytedance.sdk.openadsdk.bjy.qdl.mml mmlVarQdl = com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().qdl("pangle_video_play_state");
                ljh ljhVar2 = ljhVar;
                return mmlVarQdl.qdl(ljhVar2 != null ? ljhVar2.vz() : 0).ud(jSONObject.toString());
            }
        });
    }
}

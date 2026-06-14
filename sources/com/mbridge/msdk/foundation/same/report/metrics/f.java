package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.l;
import com.mbridge.msdk.tracker.m;
import com.mbridge.msdk.tracker.network.toolbox.i;
import io.bidmachine.ads.networks.nast.NastAdapter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class f {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[Catch: Exception -> 0x002e, TRY_LEAVE, TryCatch #0 {Exception -> 0x002e, blocks: (B:3:0x001d, B:5:0x0029, B:10:0x0033, B:12:0x003f, B:40:0x00a9, B:42:0x00af, B:49:0x00cb, B:51:0x00d1, B:53:0x00d6, B:56:0x00f9, B:58:0x00ff, B:65:0x012e, B:67:0x0132, B:68:0x0135, B:69:0x0139, B:71:0x013f, B:74:0x0148, B:76:0x0191, B:78:0x01f0, B:80:0x01fa, B:82:0x020d, B:83:0x0216, B:85:0x0229, B:87:0x0238, B:88:0x0245, B:91:0x0251, B:94:0x0280, B:96:0x0286, B:98:0x028c, B:99:0x02aa, B:100:0x02b5, B:102:0x02bf, B:104:0x02c5, B:107:0x02f8, B:109:0x0300, B:111:0x0306, B:112:0x0324, B:113:0x032f, B:115:0x0337, B:117:0x033d, B:118:0x035b, B:119:0x0366, B:121:0x036e, B:123:0x0374, B:124:0x0392, B:125:0x039d, B:128:0x03b2, B:130:0x03bc, B:131:0x03c2, B:132:0x03c7, B:134:0x03cd, B:136:0x03db, B:139:0x03eb, B:141:0x03f1, B:148:0x0439, B:150:0x0443, B:153:0x044f, B:155:0x0455, B:156:0x046e, B:157:0x0472, B:159:0x0478, B:160:0x0491, B:161:0x0494, B:163:0x049e, B:165:0x04ad, B:166:0x04cd, B:167:0x04d6, B:170:0x04e0, B:172:0x04e6, B:178:0x0525, B:182:0x0531, B:184:0x0547, B:186:0x056c, B:188:0x0572, B:190:0x0597, B:192:0x059b, B:194:0x05ab, B:195:0x05b0, B:197:0x05ba, B:198:0x05c3, B:200:0x05c9, B:201:0x05d6, B:203:0x05f4, B:205:0x05fb, B:206:0x0608, B:208:0x0612, B:209:0x061b, B:211:0x0623, B:213:0x062a, B:214:0x0637, B:216:0x0641, B:217:0x064a, B:218:0x0657, B:220:0x065f, B:224:0x066e, B:227:0x067c, B:229:0x06a2, B:231:0x06a8, B:233:0x06ad, B:232:0x06ab, B:234:0x06b4, B:236:0x06bc, B:238:0x06c2, B:240:0x06c7, B:239:0x06c5, B:241:0x06ce, B:244:0x06d8, B:246:0x06e0, B:247:0x06e8, B:249:0x06f4, B:251:0x06fa, B:253:0x06ff, B:255:0x070e, B:257:0x0714, B:259:0x0719, B:263:0x072b, B:267:0x074b, B:269:0x0754, B:270:0x0760, B:266:0x0747, B:258:0x0717, B:252:0x06fd, B:271:0x076d, B:273:0x0779, B:279:0x0788, B:281:0x0794, B:283:0x079e, B:289:0x07b5, B:291:0x07c8, B:293:0x07ce, B:295:0x07d3, B:294:0x07d1, B:290:0x07bf, B:284:0x07a7, B:286:0x07ad, B:305:0x080e, B:296:0x07db, B:298:0x07e9, B:300:0x07fc, B:302:0x0802, B:304:0x0807, B:303:0x0805, B:299:0x07f3, B:189:0x0590, B:185:0x0565, B:173:0x04ff, B:174:0x0503, B:176:0x0509, B:177:0x0522, B:142:0x040c, B:143:0x0412, B:145:0x041a, B:146:0x0433, B:105:0x02e6, B:92:0x0271, B:84:0x0220, B:77:0x01d1, B:43:0x00b7, B:45:0x00bd, B:48:0x00c8, B:46:0x00c2, B:21:0x0063, B:25:0x0077, B:28:0x0082, B:30:0x0088, B:33:0x0093, B:35:0x0099, B:31:0x008d, B:37:0x009f, B:20:0x005a, B:60:0x010d, B:62:0x0128, B:13:0x0044, B:15:0x004a), top: B:312:0x001d, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:3:0x001d, B:5:0x0029, B:10:0x0033, B:12:0x003f, B:40:0x00a9, B:42:0x00af, B:49:0x00cb, B:51:0x00d1, B:53:0x00d6, B:56:0x00f9, B:58:0x00ff, B:65:0x012e, B:67:0x0132, B:68:0x0135, B:69:0x0139, B:71:0x013f, B:74:0x0148, B:76:0x0191, B:78:0x01f0, B:80:0x01fa, B:82:0x020d, B:83:0x0216, B:85:0x0229, B:87:0x0238, B:88:0x0245, B:91:0x0251, B:94:0x0280, B:96:0x0286, B:98:0x028c, B:99:0x02aa, B:100:0x02b5, B:102:0x02bf, B:104:0x02c5, B:107:0x02f8, B:109:0x0300, B:111:0x0306, B:112:0x0324, B:113:0x032f, B:115:0x0337, B:117:0x033d, B:118:0x035b, B:119:0x0366, B:121:0x036e, B:123:0x0374, B:124:0x0392, B:125:0x039d, B:128:0x03b2, B:130:0x03bc, B:131:0x03c2, B:132:0x03c7, B:134:0x03cd, B:136:0x03db, B:139:0x03eb, B:141:0x03f1, B:148:0x0439, B:150:0x0443, B:153:0x044f, B:155:0x0455, B:156:0x046e, B:157:0x0472, B:159:0x0478, B:160:0x0491, B:161:0x0494, B:163:0x049e, B:165:0x04ad, B:166:0x04cd, B:167:0x04d6, B:170:0x04e0, B:172:0x04e6, B:178:0x0525, B:182:0x0531, B:184:0x0547, B:186:0x056c, B:188:0x0572, B:190:0x0597, B:192:0x059b, B:194:0x05ab, B:195:0x05b0, B:197:0x05ba, B:198:0x05c3, B:200:0x05c9, B:201:0x05d6, B:203:0x05f4, B:205:0x05fb, B:206:0x0608, B:208:0x0612, B:209:0x061b, B:211:0x0623, B:213:0x062a, B:214:0x0637, B:216:0x0641, B:217:0x064a, B:218:0x0657, B:220:0x065f, B:224:0x066e, B:227:0x067c, B:229:0x06a2, B:231:0x06a8, B:233:0x06ad, B:232:0x06ab, B:234:0x06b4, B:236:0x06bc, B:238:0x06c2, B:240:0x06c7, B:239:0x06c5, B:241:0x06ce, B:244:0x06d8, B:246:0x06e0, B:247:0x06e8, B:249:0x06f4, B:251:0x06fa, B:253:0x06ff, B:255:0x070e, B:257:0x0714, B:259:0x0719, B:263:0x072b, B:267:0x074b, B:269:0x0754, B:270:0x0760, B:266:0x0747, B:258:0x0717, B:252:0x06fd, B:271:0x076d, B:273:0x0779, B:279:0x0788, B:281:0x0794, B:283:0x079e, B:289:0x07b5, B:291:0x07c8, B:293:0x07ce, B:295:0x07d3, B:294:0x07d1, B:290:0x07bf, B:284:0x07a7, B:286:0x07ad, B:305:0x080e, B:296:0x07db, B:298:0x07e9, B:300:0x07fc, B:302:0x0802, B:304:0x0807, B:303:0x0805, B:299:0x07f3, B:189:0x0590, B:185:0x0565, B:173:0x04ff, B:174:0x0503, B:176:0x0509, B:177:0x0522, B:142:0x040c, B:143:0x0412, B:145:0x041a, B:146:0x0433, B:105:0x02e6, B:92:0x0271, B:84:0x0220, B:77:0x01d1, B:43:0x00b7, B:45:0x00bd, B:48:0x00c8, B:46:0x00c2, B:21:0x0063, B:25:0x0077, B:28:0x0082, B:30:0x0088, B:33:0x0093, B:35:0x0099, B:31:0x008d, B:37:0x009f, B:20:0x005a, B:60:0x010d, B:62:0x0128, B:13:0x0044, B:15:0x004a), top: B:312:0x001d, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6 A[Catch: Exception -> 0x002e, TRY_LEAVE, TryCatch #0 {Exception -> 0x002e, blocks: (B:3:0x001d, B:5:0x0029, B:10:0x0033, B:12:0x003f, B:40:0x00a9, B:42:0x00af, B:49:0x00cb, B:51:0x00d1, B:53:0x00d6, B:56:0x00f9, B:58:0x00ff, B:65:0x012e, B:67:0x0132, B:68:0x0135, B:69:0x0139, B:71:0x013f, B:74:0x0148, B:76:0x0191, B:78:0x01f0, B:80:0x01fa, B:82:0x020d, B:83:0x0216, B:85:0x0229, B:87:0x0238, B:88:0x0245, B:91:0x0251, B:94:0x0280, B:96:0x0286, B:98:0x028c, B:99:0x02aa, B:100:0x02b5, B:102:0x02bf, B:104:0x02c5, B:107:0x02f8, B:109:0x0300, B:111:0x0306, B:112:0x0324, B:113:0x032f, B:115:0x0337, B:117:0x033d, B:118:0x035b, B:119:0x0366, B:121:0x036e, B:123:0x0374, B:124:0x0392, B:125:0x039d, B:128:0x03b2, B:130:0x03bc, B:131:0x03c2, B:132:0x03c7, B:134:0x03cd, B:136:0x03db, B:139:0x03eb, B:141:0x03f1, B:148:0x0439, B:150:0x0443, B:153:0x044f, B:155:0x0455, B:156:0x046e, B:157:0x0472, B:159:0x0478, B:160:0x0491, B:161:0x0494, B:163:0x049e, B:165:0x04ad, B:166:0x04cd, B:167:0x04d6, B:170:0x04e0, B:172:0x04e6, B:178:0x0525, B:182:0x0531, B:184:0x0547, B:186:0x056c, B:188:0x0572, B:190:0x0597, B:192:0x059b, B:194:0x05ab, B:195:0x05b0, B:197:0x05ba, B:198:0x05c3, B:200:0x05c9, B:201:0x05d6, B:203:0x05f4, B:205:0x05fb, B:206:0x0608, B:208:0x0612, B:209:0x061b, B:211:0x0623, B:213:0x062a, B:214:0x0637, B:216:0x0641, B:217:0x064a, B:218:0x0657, B:220:0x065f, B:224:0x066e, B:227:0x067c, B:229:0x06a2, B:231:0x06a8, B:233:0x06ad, B:232:0x06ab, B:234:0x06b4, B:236:0x06bc, B:238:0x06c2, B:240:0x06c7, B:239:0x06c5, B:241:0x06ce, B:244:0x06d8, B:246:0x06e0, B:247:0x06e8, B:249:0x06f4, B:251:0x06fa, B:253:0x06ff, B:255:0x070e, B:257:0x0714, B:259:0x0719, B:263:0x072b, B:267:0x074b, B:269:0x0754, B:270:0x0760, B:266:0x0747, B:258:0x0717, B:252:0x06fd, B:271:0x076d, B:273:0x0779, B:279:0x0788, B:281:0x0794, B:283:0x079e, B:289:0x07b5, B:291:0x07c8, B:293:0x07ce, B:295:0x07d3, B:294:0x07d1, B:290:0x07bf, B:284:0x07a7, B:286:0x07ad, B:305:0x080e, B:296:0x07db, B:298:0x07e9, B:300:0x07fc, B:302:0x0802, B:304:0x0807, B:303:0x0805, B:299:0x07f3, B:189:0x0590, B:185:0x0565, B:173:0x04ff, B:174:0x0503, B:176:0x0509, B:177:0x0522, B:142:0x040c, B:143:0x0412, B:145:0x041a, B:146:0x0433, B:105:0x02e6, B:92:0x0271, B:84:0x0220, B:77:0x01d1, B:43:0x00b7, B:45:0x00bd, B:48:0x00c8, B:46:0x00c2, B:21:0x0063, B:25:0x0077, B:28:0x0082, B:30:0x0088, B:33:0x0093, B:35:0x0099, B:31:0x008d, B:37:0x009f, B:20:0x005a, B:60:0x010d, B:62:0x0128, B:13:0x0044, B:15:0x004a), top: B:312:0x001d, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Map<java.lang.String, java.lang.String> c(java.lang.String r23, com.mbridge.msdk.foundation.same.report.metrics.c r24) {
        /*
            Method dump skipped, instruction units count: 2117
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.report.metrics.f.c(java.lang.String, com.mbridge.msdk.foundation.same.report.metrics.c):java.util.Map");
    }

    private Map<String, String> d(String str, c cVar) {
        return (cVar == null || TextUtils.isEmpty(str)) ? new HashMap() : cVar.c(str);
    }

    private Map<String, String> e(String str, c cVar) {
        e eVar = new e();
        try {
            if (str.equals("2000125")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000126")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000125")));
            } else if (str.equals("2000127")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000154")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000126")));
            } else if (str.equals("2000047") || str.equals("2000048")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000155")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000154")));
            } else if (str.equals("2000146")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000130")));
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return eVar.a();
    }

    public void a(String str, m mVar, c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        Map<String, String> mapE;
        HashMap map = new HashMap();
        if (cVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            cVar.j(str);
            Map<String, String> mapC = c(str, cVar);
            if (mapC != null) {
                map.putAll(mapC);
            }
            Map<String, String> mapA = a(str, cVar.B(), mVar);
            if (mapA != null) {
                map.putAll(mapA);
            }
            if (Arrays.asList(b.f48844d).contains(str) && (mapE = e(str, cVar)) != null) {
                map.putAll(mapE);
            }
            Map<String, String> mapA2 = a(str, cVar);
            if (mapA2 != null) {
                map.putAll(mapA2);
            }
            Map<String, String> mapB = b(str, cVar);
            if (mapB != null) {
                map.putAll(mapB);
            }
            if (!map.containsKey("lrid") || TextUtils.isEmpty(map.get("lrid"))) {
                map.put("lrid", cVar.t());
            }
            if (map.containsKey("lrid")) {
                String str2 = map.get("lrid");
                if (!TextUtils.isEmpty(str2) && str2.contains("label_second")) {
                    map.put("lrid", str2.replace("label_second", ""));
                }
            }
            if (map.containsKey("n_lrid")) {
                String str3 = map.get("n_lrid");
                if (!TextUtils.isEmpty(str3) && str3.contains("label_second")) {
                    map.put("n_lrid", str3.replace("n_lrid", ""));
                }
            }
            Map<String, String> mapD = d(str, cVar);
            if (mapD != null) {
                map.putAll(mapD);
            }
            String str4 = "1";
            if (cVar.j() == null || !cVar.j().equals("1") || !Arrays.asList(b.f48842b).contains(str) || cVar.g() == 296) {
                if (Arrays.asList(b.f48853m).contains(str)) {
                    map.put("use_local_dns", i.b().e() ? "1" : "0");
                    if (!i.b().d()) {
                        str4 = "0";
                    }
                    map.put("local_dns_available", str4);
                }
                com.mbridge.msdk.tracker.e eVarA = a(str, map);
                if (mVar != null && eVarA != null) {
                    mVar.d(eVarA);
                }
                if (aVar != null) {
                    aVar.a();
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void b(String str, m mVar, c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        if (cVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            HashMap map = new HashMap();
            cVar.j(str);
            Map<String, String> mapA = a(str, cVar.B(), mVar);
            if (mapA != null) {
                map.putAll(mapA);
            }
            Map<String, String> mapA2 = a(str, cVar);
            if (mapA2 != null) {
                map.putAll(mapA2);
            }
            Map<String, String> mapB = b(str, cVar);
            if (mapB != null) {
                map.putAll(mapB);
            }
            Map<String, String> mapD = d(str, cVar);
            if (mapD != null) {
                map.putAll(mapD);
            }
            com.mbridge.msdk.tracker.e eVarA = a(str, map);
            if (mVar != null && eVarA != null) {
                mVar.d(eVarA);
            }
            if (aVar != null) {
                aVar.a();
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public Map<String, String> b(String str, c cVar) {
        HashMap map = new HashMap();
        if (cVar == null) {
            return map;
        }
        return cVar.a(cVar.t() + str);
    }

    private com.mbridge.msdk.tracker.e a(String str, Map<String, String> map) {
        if (map == null || TextUtils.isEmpty(str)) {
            return null;
        }
        com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e(str);
        try {
            JSONObject jSONObject = new JSONObject(map);
            Boolean boolA = com.mbridge.msdk.foundation.same.b.b().a();
            if (boolA != null) {
                jSONObject.put("r_v_r", boolA.booleanValue() ? 1 : 0);
            }
            eVar.a(jSONObject);
            eVar.b(0);
            eVar.a(0);
            return eVar;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return eVar;
        }
    }

    private Map<String, String> a(String str, String str2, m mVar) {
        e eVar = new e();
        try {
            g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD == null) {
                gVarD = h.b().a();
            }
            if (!TextUtils.isEmpty(gVarD.l0())) {
                eVar.a("as_rid", gVarD.l0());
            }
            String strJ = gVarD.J();
            JSONArray jSONArrayI = gVarD.I();
            if (jSONArrayI != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= jSONArrayI.length()) {
                        break;
                    }
                    if (str.equals(jSONArrayI.getString(i10))) {
                        strJ = NastAdapter.ADAPTER_SDK_VERSION_NAME;
                        break;
                    }
                    i10++;
                }
            }
            if (!TextUtils.isEmpty(strJ)) {
                eVar.a("log_rate", strJ);
            } else {
                eVar.a("log_rate", -1);
            }
            if (!TextUtils.isEmpty(str2)) {
                l lVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), str2);
                if (lVarD != null && !TextUtils.isEmpty(lVarD.I())) {
                    eVar.a("us_rid", lVarD.I());
                }
                if (lVarD != null && !TextUtils.isEmpty(lVarD.a())) {
                    eVar.a("u_stid", lVarD.a());
                }
                e eVarC = d.b().c(str2);
                if (eVarC != null) {
                    if (mVar != null && mVar.c() != null) {
                        try {
                            mVar.c().put("r_stid", eVarC.b("r_stid"));
                            eVarC.c("r_stid");
                        } catch (JSONException unused) {
                        }
                    }
                    eVar.a(eVarC);
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return eVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:4:0x0007, B:6:0x0020, B:8:0x0026, B:10:0x0036, B:25:0x0057, B:27:0x005d, B:30:0x0068, B:32:0x006e, B:28:0x0062, B:33:0x0072, B:35:0x0078, B:36:0x0080, B:38:0x0086, B:41:0x0091, B:43:0x0097, B:39:0x008b, B:15:0x0041, B:17:0x0045, B:19:0x004c, B:21:0x0050), top: B:49:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:4:0x0007, B:6:0x0020, B:8:0x0026, B:10:0x0036, B:25:0x0057, B:27:0x005d, B:30:0x0068, B:32:0x006e, B:28:0x0062, B:33:0x0072, B:35:0x0078, B:36:0x0080, B:38:0x0086, B:41:0x0091, B:43:0x0097, B:39:0x008b, B:15:0x0041, B:17:0x0045, B:19:0x004c, B:21:0x0050), top: B:49:0x0007, inners: #1 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004e -> B:22:0x0053). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0050 -> B:22:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> a(com.mbridge.msdk.foundation.same.report.metrics.c r4, java.lang.String r5) {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r4 == 0) goto La2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3d
            r1.<init>()     // Catch: java.lang.Exception -> L3d
            java.lang.String r2 = r4.t()     // Catch: java.lang.Exception -> L3d
            r1.append(r2)     // Catch: java.lang.Exception -> L3d
            r1.append(r5)     // Catch: java.lang.Exception -> L3d
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Exception -> L3d
            java.util.Map r1 = r4.w()     // Catch: java.lang.Exception -> L3d
            if (r1 == 0) goto L53
            boolean r2 = r1.containsKey(r5)     // Catch: java.lang.Exception -> L3d
            if (r2 == 0) goto L53
            java.lang.Object r5 = r1.get(r5)     // Catch: java.lang.Exception -> L3d java.lang.NumberFormatException -> L3f
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Exception -> L3d java.lang.NumberFormatException -> L3f
            java.lang.String r1 = "resource_type"
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Exception -> L3d java.lang.NumberFormatException -> L3f
            boolean r1 = r5 instanceof java.lang.String     // Catch: java.lang.Exception -> L3d java.lang.NumberFormatException -> L3f
            if (r1 == 0) goto L41
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L3d java.lang.NumberFormatException -> L3f
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Exception -> L3d java.lang.NumberFormatException -> L3f
            goto L54
        L3d:
            r4 = move-exception
            goto L9b
        L3f:
            r5 = move-exception
            goto L4c
        L41:
            boolean r1 = r5 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L3d java.lang.NumberFormatException -> L3f
            if (r1 == 0) goto L53
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Exception -> L3d java.lang.NumberFormatException -> L3f
            int r5 = r5.intValue()     // Catch: java.lang.Exception -> L3d java.lang.NumberFormatException -> L3f
            goto L54
        L4c:
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Exception -> L3d
            if (r1 == 0) goto L53
            r5.printStackTrace()     // Catch: java.lang.Exception -> L3d
        L53:
            r5 = -1
        L54:
            r1 = 1
            if (r5 != r1) goto L72
            java.util.List r5 = r4.o()     // Catch: java.lang.Exception -> L3d
            if (r5 == 0) goto L62
            java.util.List r4 = r4.o()     // Catch: java.lang.Exception -> L3d
            goto L66
        L62:
            java.util.List r4 = r4.m()     // Catch: java.lang.Exception -> L3d
        L66:
            if (r4 == 0) goto La2
            int r5 = r4.size()     // Catch: java.lang.Exception -> L3d
            if (r5 <= 0) goto La2
            r0.addAll(r4)     // Catch: java.lang.Exception -> L3d
            goto La2
        L72:
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = r4.n()     // Catch: java.lang.Exception -> L3d
            if (r5 == 0) goto L80
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.n()     // Catch: java.lang.Exception -> L3d
            r0.add(r4)     // Catch: java.lang.Exception -> L3d
            goto La2
        L80:
            java.util.List r5 = r4.o()     // Catch: java.lang.Exception -> L3d
            if (r5 == 0) goto L8b
            java.util.List r4 = r4.o()     // Catch: java.lang.Exception -> L3d
            goto L8f
        L8b:
            java.util.List r4 = r4.m()     // Catch: java.lang.Exception -> L3d
        L8f:
            if (r4 == 0) goto La2
            int r5 = r4.size()     // Catch: java.lang.Exception -> L3d
            if (r5 <= 0) goto La2
            r0.addAll(r4)     // Catch: java.lang.Exception -> L3d
            goto La2
        L9b:
            boolean r5 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r5 == 0) goto La2
            r4.printStackTrace()
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.report.metrics.f.a(com.mbridge.msdk.foundation.same.report.metrics.c, java.lang.String):java.util.List");
    }

    public Map<String, String> a(String str, c cVar) {
        HashMap map = new HashMap();
        try {
            if (Arrays.asList(b.f48845e).contains(str)) {
                String strJ = "";
                if (cVar != null) {
                    strJ = cVar.j();
                }
                map.put("auto_load", strJ);
            }
            if (cVar != null) {
                Map<String, Map<String, String>> mapW = cVar.w();
                String str2 = cVar.t() + str;
                if (mapW.containsKey(str2) && mapW.get(str2) != null) {
                    map.putAll(mapW.get(str2));
                }
                try {
                    Map<String, Map<String, String>> mapV = cVar.v();
                    String str3 = cVar.t() + "_" + cVar.q() + "_" + str;
                    if (mapV.containsKey(str3) && mapV.get(str3) != null) {
                        map.putAll(mapV.get(str3));
                        return map;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                e11.printStackTrace();
            }
        }
        return map;
    }
}

package yads;

import android.media.MediaCodecInfo;
import android.util.Base64;
import android.util.Pair;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ij1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f112011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f112012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f112013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f112014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f112015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f112016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f112017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f112018h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f112019i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f112020j;

    static {
        jj1 jj1Var = li2.f113104e;
        f112011a = Pattern.compile("^\\D?(\\d+)$");
        f112012b = new HashMap();
        f112013c = jj1Var.b();
        f112014d = jj1Var.c();
        f112015e = jj1Var.O();
        f112016f = jj1Var.q();
        f112017g = jj1Var.r();
        f112018h = jj1Var.a();
        f112019i = jj1Var.F();
        f112020j = -1;
    }

    public static String a(yv0 yv0Var) {
        Pair pairB;
        if ("audio/eac3-joc".equals(yv0Var.f118398m)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(yv0Var.f118398m) || (pairB = b(yv0Var)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairB.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x041e A[Catch: NumberFormatException -> 0x042e, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x042e, blocks: (B:292:0x03c7, B:294:0x03db, B:305:0x03f7, B:320:0x041e), top: B:497:0x03c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair b(yads.yv0 r31) {
        /*
            Method dump skipped, instruction units count: 2080
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ij1.b(yads.yv0):android.util.Pair");
    }

    public static String a(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            byte[] bArrDecode = Base64.decode("T01YLk1TLkhFVkNEVi5EZWNvZGVy", 0);
            Charset charset = Charsets.UTF_8;
            if (new String(bArrDecode, charset).equals(str)) {
                return new String(Base64.decode("dmlkZW8vaGV2Y2R2", 0), charset);
            }
            if (new String(Base64.decode("T01YLlJUSy52aWRlby5kZWNvZGVy", 0), charset).equals(str) || new String(Base64.decode("T01YLnJlYWx0ZWsudmlkZW8uZGVjb2Rlci50dW5uZWxlZA==", 0), charset).equals(str)) {
                return new String(Base64.decode("dmlkZW8vZHZfaGV2Yw==", 0), charset);
            }
            return null;
        }
        if (str2.equals("audio/alac") && new String(Base64.decode("T01YLmxnZS5hbGFjLmRlY29kZXI=", 0), Charsets.UTF_8).equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && new String(Base64.decode("T01YLmxnZS5mbGFjLmRlY29kZXI=", 0), Charsets.UTF_8).equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && new String(Base64.decode("T01YLmxnZS5hYzMuZGVjb2Rlcg==", 0), Charsets.UTF_8).equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x015b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0134 A[Catch: Exception -> 0x017e, TRY_ENTER, TryCatch #3 {Exception -> 0x017e, blocks: (B:3:0x0008, B:5:0x001a, B:7:0x0024, B:90:0x0153, B:11:0x0031, B:14:0x003c, B:84:0x012c, B:87:0x0134, B:89:0x013a, B:91:0x015b, B:92:0x017c), top: B:103:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList a(yads.cj1 r21, yads.ej1 r22) throws yads.dj1 {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ij1.a(yads.cj1, yads.ej1):java.util.ArrayList");
    }

    public static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = w83.f117341a;
        if (i10 < 21) {
            byte[] bArrDecode = Base64.decode("Q0lQQUFDRGVjb2Rlcg==", 0);
            Charset charset = Charsets.UTF_8;
            if (new String(bArrDecode, charset).equals(str) || new String(Base64.decode("Q0lQTVAzRGVjb2Rlcg==", 0), charset).equals(str) || new String(Base64.decode("Q0lQVm9yYmlzRGVjb2Rlcg==", 0), charset).equals(str) || new String(Base64.decode("Q0lQQU1STkJEZWNvZGVy", 0), charset).equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str)) {
                return false;
            }
        }
        if (i10 < 18) {
            byte[] bArrDecode2 = Base64.decode("T01YLk1USy5BVURJTy5ERUNPREVSLkFBQw==", 0);
            Charset charset2 = Charsets.UTF_8;
            if (new String(bArrDecode2, charset2).equals(str)) {
                String str3 = new String(Base64.decode("YTcw", 0), charset2);
                String str4 = w83.f117342b;
                if (str3.equals(str4) || (new String(Base64.decode("WGlhb21p", 0), charset2).equals(w83.f117343c) && str4.startsWith(new String(Base64.decode("SE0=", 0), charset2)))) {
                    return false;
                }
            }
        }
        if (i10 == 16) {
            byte[] bArrDecode3 = Base64.decode("T01YLnFjb20uYXVkaW8uZGVjb2Rlci5tcDM=", 0);
            Charset charset3 = Charsets.UTF_8;
            if (new String(bArrDecode3, charset3).equals(str)) {
                String str5 = new String(Base64.decode("ZGx4dQ==", 0), charset3);
                String str6 = w83.f117342b;
                if (str5.equals(str6) || new String(Base64.decode("cHJvdG91", 0), charset3).equals(str6) || new String(Base64.decode("dmlsbGU=", 0), charset3).equals(str6) || new String(Base64.decode("dmlsbGVwbHVz", 0), charset3).equals(str6) || new String(Base64.decode("dmlsbGVjMg==", 0), charset3).equals(str6) || str6.startsWith(new String(Base64.decode("Z2Vl", 0), charset3)) || new String(Base64.decode("QzY2MDI=", 0), charset3).equals(str6) || new String(Base64.decode("QzY2MDM=", 0), charset3).equals(str6) || new String(Base64.decode("QzY2MDY=", 0), charset3).equals(str6) || new String(Base64.decode("QzY2MTY=", 0), charset3).equals(str6) || new String(Base64.decode("TDM2aA==", 0), charset3).equals(str6) || new String(Base64.decode("U08tMDJF", 0), charset3).equals(str6)) {
                    return false;
                }
            }
        }
        if (i10 == 16) {
            byte[] bArrDecode4 = Base64.decode("T01YLnFjb20uYXVkaW8uZGVjb2Rlci5hYWM=", 0);
            Charset charset4 = Charsets.UTF_8;
            if (new String(bArrDecode4, charset4).equals(str)) {
                String str7 = new String(Base64.decode("QzE1MDQ=", 0), charset4);
                String str8 = w83.f117342b;
                if (str7.equals(str8) || new String(Base64.decode("QzE1MDU=", 0), charset4).equals(str8) || new String(Base64.decode("QzE2MDQ=", 0), charset4).equals(str8) || new String(Base64.decode("QzE2MDU=", 0), charset4).equals(str8)) {
                    return false;
                }
            }
        }
        if (i10 < 24) {
            byte[] bArrDecode5 = Base64.decode("T01YLlNFQy5hYWMuZGVj", 0);
            Charset charset5 = Charsets.UTF_8;
            if ((new String(bArrDecode5, charset5).equals(str) || new String(Base64.decode("T01YLkV4eW5vcy5BQUMuRGVjb2Rlcg==", 0), charset5).equals(str)) && new String(Base64.decode("c2Ftc3VuZw==", 0), charset5).equals(w83.f117343c)) {
                String str9 = w83.f117342b;
                if (str9.startsWith(new String(Base64.decode("emVyb2ZsdGU=", 0), charset5)) || str9.startsWith(new String(Base64.decode("emVyb2x0ZQ==", 0), charset5)) || str9.startsWith(new String(Base64.decode("emVubHRl", 0), charset5)) || new String(Base64.decode("U0MtMDVH", 0), charset5).equals(str9) || new String(Base64.decode("bWFyaW5lbHRlYXR0", 0), charset5).equals(str9) || new String(Base64.decode("NDA0U0M=", 0), charset5).equals(str9) || new String(Base64.decode("U0MtMDRH", 0), charset5).equals(str9) || new String(Base64.decode("U0NWMzE=", 0), charset5).equals(str9)) {
                    return false;
                }
            }
        }
        if (i10 <= 19) {
            byte[] bArrDecode6 = Base64.decode("T01YLlNFQy52cDguZGVj", 0);
            Charset charset6 = Charsets.UTF_8;
            if (new String(bArrDecode6, charset6).equals(str) && new String(Base64.decode("c2Ftc3VuZw==", 0), charset6).equals(w83.f117343c)) {
                String str10 = w83.f117342b;
                if (str10.startsWith("d2") || str10.startsWith(new String(Base64.decode("c2VycmFubw==", 0), charset6)) || str10.startsWith(new String(Base64.decode("amZsdGU=", 0), charset6)) || str10.startsWith(new String(Base64.decode("c2FudG9z", 0), charset6)) || str10.startsWith(new String(Base64.decode("dDA=", 0), charset6))) {
                    return false;
                }
            }
        }
        if (i10 <= 19) {
            String str11 = w83.f117342b;
            byte[] bArrDecode7 = Base64.decode("amZsdGU=", 0);
            Charset charset7 = Charsets.UTF_8;
            if (str11.startsWith(new String(bArrDecode7, charset7)) && new String(Base64.decode("T01YLnFjb20udmlkZW8uZGVjb2Rlci52cDg=", 0), charset7).equals(str)) {
                return false;
            }
        }
        return (i10 <= 23 && "audio/eac3-joc".equals(str2) && new String(Base64.decode("T01YLk1USy5BVURJTy5ERUNPREVSLkRTUEFDMw==", 0), Charsets.UTF_8).equals(str)) ? false : true;
    }

    public static /* synthetic */ int b(ui1 ui1Var) {
        return ui1Var.f116659a.startsWith(li2.f113104e.K()) ? 1 : 0;
    }

    public static /* synthetic */ int a(ui1 ui1Var) {
        String str = ui1Var.f116659a;
        jj1 jj1Var = li2.f113104e;
        if (str.startsWith(jj1Var.K()) || str.startsWith("c2.android")) {
            return 1;
        }
        return (w83.f117341a >= 26 || !str.equals(jj1Var.G())) ? 0 : -1;
    }

    public static /* synthetic */ int a(yv0 yv0Var, ui1 ui1Var) {
        try {
            return ui1Var.a(yv0Var) ? 1 : 0;
        } catch (dj1 unused) {
            return -1;
        }
    }

    public static /* synthetic */ int a(hj1 hj1Var, Object obj, Object obj2) {
        return hj1Var.a(obj2) - hj1Var.a(obj);
    }

    public static void a(ArrayList arrayList, final hj1 hj1Var) {
        Collections.sort(arrayList, new Comparator() { // from class: yads.m8
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ij1.a(hj1Var, obj, obj2);
            }
        });
    }

    public static synchronized List a(String str, boolean z10, boolean z11) {
        ej1 fj1Var;
        try {
            cj1 cj1Var = new cj1(str, z10, z11);
            HashMap map = f112012b;
            List list = (List) map.get(cj1Var);
            if (list != null) {
                return list;
            }
            int i10 = w83.f117341a;
            if (i10 >= 21) {
                fj1Var = new gj1(z10, z11);
            } else {
                fj1Var = new fj1();
            }
            ArrayList arrayListA = a(cj1Var, fj1Var);
            if (z10 && arrayListA.isEmpty() && 21 <= i10 && i10 <= 23) {
                arrayListA = a(cj1Var, new fj1());
                if (!arrayListA.isEmpty()) {
                    uf1.d("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((ui1) arrayListA.get(0)).f116659a);
                }
            }
            a(str, arrayListA);
            y31 y31VarA = y31.a((Collection) arrayListA);
            map.put(cj1Var, y31VarA);
            return y31VarA;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static ArrayList a(y31 y31Var, final yv0 yv0Var) {
        ArrayList arrayList = new ArrayList(y31Var);
        a(arrayList, new hj1() { // from class: yads.i8
            @Override // yads.hj1
            public final int a(Object obj) {
                return ij1.a(yv0Var, (ui1) obj);
            }
        });
        return arrayList;
    }

    public static int a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        if (f112020j == -1) {
            int iMax = 0;
            List listA = a("video/avc", false, false);
            ui1 ui1Var = listA.isEmpty() ? null : (ui1) listA.get(0);
            if (ui1Var != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = ui1Var.f116662d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i11 = codecProfileLevelArr[iMax].level;
                    if (i11 != 1 && i11 != 2) {
                        switch (i11) {
                            case 8:
                            case 16:
                            case 32:
                                i10 = 101376;
                                break;
                            case 64:
                                i10 = 202752;
                                break;
                            case 128:
                            case 256:
                                i10 = 414720;
                                break;
                            case 512:
                                i10 = 921600;
                                break;
                            case 1024:
                                i10 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i10 = 2097152;
                                break;
                            case 8192:
                                i10 = 2228224;
                                break;
                            case 16384:
                                i10 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i10 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i10 = 35651584;
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                    } else {
                        i10 = 25344;
                    }
                    iMax2 = Math.max(i10, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, w83.f117341a >= 21 ? 345600 : AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH);
            }
            f112020j = iMax;
        }
        return f112020j;
    }

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (w83.f117341a < 26) {
                String str2 = w83.f117342b;
                jj1 jj1Var = li2.f113104e;
                if (str2.equals(jj1Var.N()) && arrayList.size() == 1 && ((ui1) arrayList.get(0)).f116659a.equals(jj1Var.G())) {
                    arrayList.add(ui1.a(jj1Var.L(), "audio/raw", "audio/raw", null, false, true, false, false));
                }
            }
            a(arrayList, new hj1() { // from class: yads.k8
                @Override // yads.hj1
                public final int a(Object obj) {
                    return ij1.a((ui1) obj);
                }
            });
        }
        int i10 = w83.f117341a;
        if (i10 < 21 && arrayList.size() > 1) {
            String str3 = ((ui1) arrayList.get(0)).f116659a;
            jj1 jj1Var2 = li2.f113104e;
            if (jj1Var2.I().equals(str3) || jj1Var2.H().equals(str3) || jj1Var2.J().equals(str3)) {
                a(arrayList, new hj1() { // from class: yads.l8
                    @Override // yads.hj1
                    public final int a(Object obj) {
                        return ij1.b((ui1) obj);
                    }
                });
            }
        }
        if (i10 >= 32 || arrayList.size() <= 1) {
            return;
        }
        if (li2.f113104e.M().equals(((ui1) arrayList.get(0)).f116659a)) {
            arrayList.add((ui1) arrayList.remove(0));
        }
    }

    public static boolean a(MediaCodecInfo mediaCodecInfo, String str) {
        if (w83.f117341a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if ("audio".equals(tr1.c(str))) {
            return true;
        }
        String strA = ci.a(mediaCodecInfo.getName());
        if (strA.startsWith("arc.")) {
            return false;
        }
        byte[] bArrDecode = Base64.decode("b214Lmdvb2dsZS4=", 0);
        Charset charset = Charsets.UTF_8;
        return strA.startsWith(new String(bArrDecode, charset)) || strA.startsWith(new String(Base64.decode("b214LmZmbXBlZy4=", 0), charset)) || (strA.startsWith(new String(Base64.decode("b214LnNlYy4=", 0), charset)) && strA.contains(".sw.")) || strA.equals(new String(Base64.decode("b214LnFjb20udmlkZW8uZGVjb2Rlci5oZXZjc3d2ZGVj", 0), charset)) || strA.startsWith("c2.android.") || strA.startsWith("c2.google.") || !(strA.startsWith(new String(Base64.decode("b214Lg==", 0), charset)) || strA.startsWith("c2."));
    }
}

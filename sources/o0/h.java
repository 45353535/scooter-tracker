package o0;

import com.google.common.base.Ascii;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import p0.c;

/* JADX INFO: loaded from: classes5.dex */
abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c.a f96264a = c.a.a("ty", "d");

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    static l0.c a(p0.c cVar, d0.i iVar) {
        l0.c cVarA;
        String strNextString;
        byte b10 = 1;
        cVar.beginObject();
        int iNextInt = 2;
        while (true) {
            cVarA = null;
            if (!cVar.hasNext()) {
                strNextString = null;
                break;
            }
            int iQ = cVar.q(f96264a);
            if (iQ == 0) {
                strNextString = cVar.nextString();
                break;
            }
            if (iQ != 1) {
                cVar.s();
                cVar.skipValue();
            } else {
                iNextInt = cVar.nextInt();
            }
        }
        if (strNextString == null) {
            return null;
        }
        switch (strNextString.hashCode()) {
            case 3239:
                b10 = !strNextString.equals("el") ? (byte) -1 : (byte) 0;
                break;
            case 3270:
                if (!strNextString.equals("fl")) {
                    b10 = -1;
                }
                break;
            case 3295:
                b10 = !strNextString.equals("gf") ? (byte) -1 : (byte) 2;
                break;
            case 3307:
                b10 = !strNextString.equals("gr") ? (byte) -1 : (byte) 3;
                break;
            case 3308:
                b10 = !strNextString.equals("gs") ? (byte) -1 : (byte) 4;
                break;
            case 3488:
                b10 = !strNextString.equals("mm") ? (byte) -1 : (byte) 5;
                break;
            case 3633:
                b10 = !strNextString.equals(DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT) ? (byte) -1 : (byte) 6;
                break;
            case 3634:
                b10 = !strNextString.equals("rd") ? (byte) -1 : (byte) 7;
                break;
            case 3646:
                b10 = !strNextString.equals("rp") ? (byte) -1 : (byte) 8;
                break;
            case 3669:
                b10 = !strNextString.equals(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH) ? (byte) -1 : (byte) 9;
                break;
            case 3679:
                b10 = !strNextString.equals("sr") ? (byte) -1 : (byte) 10;
                break;
            case 3681:
                b10 = !strNextString.equals("st") ? (byte) -1 : Ascii.VT;
                break;
            case 3705:
                b10 = !strNextString.equals("tm") ? (byte) -1 : Ascii.FF;
                break;
            case 3710:
                b10 = !strNextString.equals("tr") ? (byte) -1 : (byte) 13;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                cVarA = f.a(cVar, iVar, iNextInt);
                break;
            case 1:
                cVarA = i0.a(cVar, iVar);
                break;
            case 2:
                cVarA = p.a(cVar, iVar);
                break;
            case 3:
                cVarA = j0.a(cVar, iVar);
                break;
            case 4:
                cVarA = q.a(cVar, iVar);
                break;
            case 5:
                cVarA = y.a(cVar);
                iVar.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                cVarA = d0.a(cVar, iVar);
                break;
            case 7:
                cVarA = f0.a(cVar, iVar);
                break;
            case 8:
                cVarA = e0.a(cVar, iVar);
                break;
            case 9:
                cVarA = k0.a(cVar, iVar);
                break;
            case 10:
                cVarA = c0.a(cVar, iVar, iNextInt);
                break;
            case 11:
                cVarA = l0.a(cVar, iVar);
                break;
            case 12:
                cVarA = m0.a(cVar, iVar);
                break;
            case 13:
                cVarA = c.g(cVar, iVar);
                break;
            default:
                q0.g.c("Unknown shape type " + strNextString);
                break;
        }
        while (cVar.hasNext()) {
            cVar.skipValue();
        }
        cVar.endObject();
        return cVarA;
    }
}

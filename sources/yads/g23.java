package yads;

import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes4.dex */
public final class g23 implements h23 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final e23 a(yv0 yv0Var) {
        String str = yv0Var.f118398m;
        if (str != null) {
            byte b10 = -1;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        b10 = 0;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        b10 = 1;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        b10 = 2;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        b10 = 3;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        b10 = 4;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        b10 = 5;
                    }
                    break;
                case 930165504:
                    if (str.equals("application/x-mp4-cea-608")) {
                        b10 = 6;
                    }
                    break;
                case 1201784583:
                    if (str.equals(MimeTypes.TEXT_EXOPLAYER_CUES)) {
                        b10 = 7;
                    }
                    break;
                case 1566015601:
                    if (str.equals("application/cea-608")) {
                        b10 = 8;
                    }
                    break;
                case 1566016562:
                    if (str.equals("application/cea-708")) {
                        b10 = 9;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        b10 = 10;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        b10 = Ascii.VT;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    return new ak0(yv0Var.f118400o);
                case 1:
                    return new xa2();
                case 2:
                    return new xt1();
                case 3:
                    return new xl3();
                case 4:
                    return new k73(yv0Var.f118400o);
                case 5:
                    return new n03(yv0Var.f118400o);
                case 6:
                case 8:
                    return new ys(str, yv0Var.E);
                case 7:
                    return new go0();
                case 9:
                    return new ct(yv0Var.E, yv0Var.f118400o);
                case 10:
                    return new b23();
                case 11:
                    return new e73();
            }
        }
        throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
    }

    public final boolean b(yv0 yv0Var) {
        String str = yv0Var.f118398m;
        return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || MimeTypes.TEXT_EXOPLAYER_CUES.equals(str);
    }
}

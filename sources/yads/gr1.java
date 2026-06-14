package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class gr1 implements hr1 {
    public final pw2 a(yv0 yv0Var) {
        String str = yv0Var.f118398m;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new gg();
                case "application/x-icy":
                    return new y01();
                case "application/id3":
                    return new f11(null);
                case "application/x-emsg":
                    return new tl0();
                case "application/x-scte35":
                    return new wz2();
            }
        }
        throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
    }
}

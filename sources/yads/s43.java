package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class s43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f115696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f115697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y43 f115698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f115699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f115700e;

    public s43(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        fi.a((bArr2 == null) ^ (i10 == 0));
        this.f115696a = z10;
        this.f115697b = str;
        this.f115699d = i10;
        this.f115700e = bArr2;
        this.f115698c = new y43(a(str), i11, i12, bArr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(String str) {
        if (str == null) {
            return 1;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    b10 = 0;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    b10 = 1;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    b10 = 2;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    b10 = 3;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 1:
                return 2;
            default:
                uf1.d("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}

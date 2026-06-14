package yads;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class lw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f113239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f113240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f113241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f113242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f113243e;

    public lw1(int i10) {
        this.f113239a = i10;
        byte[] bArr = new byte[Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE];
        this.f113242d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f113240b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f113242d;
            int length = bArr2.length;
            int i13 = this.f113243e + i12;
            if (length < i13) {
                this.f113242d = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f113242d, this.f113243e, i12);
            this.f113243e += i12;
        }
    }

    public final void b(int i10) {
        if (this.f113240b) {
            throw new IllegalStateException();
        }
        boolean z10 = i10 == this.f113239a;
        this.f113240b = z10;
        if (z10) {
            this.f113243e = 3;
            this.f113241c = false;
        }
    }

    public final boolean a(int i10) {
        if (!this.f113240b) {
            return false;
        }
        this.f113243e -= i10;
        this.f113240b = false;
        this.f113241c = true;
        return true;
    }
}

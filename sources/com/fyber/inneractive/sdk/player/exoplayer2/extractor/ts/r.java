package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f22586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22587e;

    public r(int i10) {
        this.f22583a = i10;
        byte[] bArr = new byte[Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE];
        this.f22586d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f22584b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f22586d;
            int length = bArr2.length;
            int i13 = this.f22587e + i12;
            if (length < i13) {
                this.f22586d = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f22586d, this.f22587e, i12);
            this.f22587e += i12;
        }
    }

    public final void b(int i10) {
        if (this.f22584b) {
            throw new IllegalStateException();
        }
        boolean z10 = i10 == this.f22583a;
        this.f22584b = z10;
        if (z10) {
            this.f22587e = 3;
            this.f22585c = false;
        }
    }

    public final boolean a(int i10) {
        if (!this.f22584b) {
            return false;
        }
        this.f22587e -= i10;
        this.f22584b = false;
        this.f22585c = true;
        return true;
    }
}

package yads;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class xq {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wq f117921e = new wq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f117922a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f117923b = new ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f117924c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f117925d = 4096;

    public final synchronized byte[] a(int i10) {
        for (int i11 = 0; i11 < this.f117923b.size(); i11++) {
            byte[] bArr = (byte[]) this.f117923b.get(i11);
            if (bArr.length >= i10) {
                this.f117924c -= bArr.length;
                this.f117923b.remove(i11);
                this.f117922a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f117925d) {
                this.f117922a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f117923b, bArr, f117921e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f117923b.add(iBinarySearch, bArr);
                this.f117924c += bArr.length;
                a();
            }
        }
    }

    public final synchronized void a() {
        while (this.f117924c > this.f117925d) {
            byte[] bArr = (byte[]) this.f117922a.remove(0);
            this.f117923b.remove(bArr);
            this.f117924c -= bArr.length;
        }
    }
}

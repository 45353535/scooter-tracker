package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Comparator f7548e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f7549a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f7550b = new ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7551c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7552d;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public c(int i10) {
        this.f7552d = i10;
    }

    private synchronized void c() {
        while (this.f7551c > this.f7552d) {
            byte[] bArr = (byte[]) this.f7549a.remove(0);
            this.f7550b.remove(bArr);
            this.f7551c -= bArr.length;
        }
    }

    public synchronized byte[] a(int i10) {
        for (int i11 = 0; i11 < this.f7550b.size(); i11++) {
            byte[] bArr = (byte[]) this.f7550b.get(i11);
            if (bArr.length >= i10) {
                this.f7551c -= bArr.length;
                this.f7550b.remove(i11);
                this.f7549a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }

    public synchronized void b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f7552d) {
                this.f7549a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f7550b, bArr, f7548e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f7550b.add(iBinarySearch, bArr);
                this.f7551c += bArr.length;
                c();
            }
        }
    }
}

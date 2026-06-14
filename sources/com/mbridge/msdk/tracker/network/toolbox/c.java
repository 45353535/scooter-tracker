package com.mbridge.msdk.tracker.network.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Comparator<byte[]> f51951e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<byte[]> f51952a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<byte[]> f51953b = new ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f51954c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f51955d;

    class a implements Comparator<byte[]> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public c(int i10) {
        this.f51955d = i10;
    }

    public synchronized byte[] a(int i10) {
        for (int i11 = 0; i11 < this.f51953b.size(); i11++) {
            byte[] bArr = this.f51953b.get(i11);
            if (bArr.length >= i10) {
                this.f51954c -= bArr.length;
                this.f51953b.remove(i11);
                this.f51952a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }

    public synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f51955d) {
                this.f51952a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f51953b, bArr, f51951e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f51953b.add(iBinarySearch, bArr);
                this.f51954c += bArr.length;
                a();
            }
        }
    }

    private synchronized void a() {
        while (this.f51954c > this.f51955d) {
            byte[] bArrRemove = this.f51952a.remove(0);
            this.f51953b.remove(bArrRemove);
            this.f51954c -= bArrRemove.length;
        }
    }
}

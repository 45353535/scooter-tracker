package com.pgl.ssdk;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class ao implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f62101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f62102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f62103c;

    public ao(Context context, int i10, Object[] objArr) {
        this.f62101a = context;
        this.f62102b = i10;
        this.f62103c = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f62102b == 222) {
                ak.a(this.f62101a).a();
            }
            byte[] bArr = (byte[]) com.pgl.ssdk.ces.a.meta(this.f62102b, this.f62101a, this.f62103c);
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            new ap(this.f62101a, this.f62102b).a(1, 2, bArr);
        } catch (Throwable unused) {
        }
    }
}

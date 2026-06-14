package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class z {

    static class a extends z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f51715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f51716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ byte[] f51717c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f51718d;

        a(u uVar, int i10, byte[] bArr, int i11) {
            this.f51715a = uVar;
            this.f51716b = i10;
            this.f51717c = bArr;
            this.f51718d = i11;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public long a() {
            return this.f51716b;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public u b() {
            return this.f51715a;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException {
            dVar.write(this.f51717c, this.f51718d, this.f51716b);
        }
    }

    public static z a(u uVar, byte[] bArr) {
        return a(uVar, bArr, 0, bArr.length);
    }

    public abstract long a() throws IOException;

    public abstract void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException;

    public abstract u b();

    public static z a(u uVar, byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(bArr.length, i10, i11);
        return new a(uVar, i11, bArr, i10);
    }
}

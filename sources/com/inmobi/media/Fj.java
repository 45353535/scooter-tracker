package com.inmobi.media;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes9.dex */
public final class Fj extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Gj f36869a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fj(Gj gj, int i10) {
        super(i10);
        this.f36869a = gj;
    }

    @Override // java.io.ByteArrayOutputStream
    public final synchronized String toString() {
        int i10;
        i10 = ((ByteArrayOutputStream) this).count;
        if (i10 > 0) {
            int i11 = i10 - 1;
            if (((ByteArrayOutputStream) this).buf[i11] == 13) {
                i10 = i11;
            }
        }
        try {
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
        return new String(((ByteArrayOutputStream) this).buf, 0, i10, this.f36869a.f36956b.name());
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5424sg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f78237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f78238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EnumC5399rg f78239d;

    public C5424sg(byte[] bArr) throws InvalidProtocolBufferNanoException {
        C5449tg c5449tgA = C5449tg.a(bArr);
        this.f78236a = c5449tgA.f78298a;
        this.f78237b = c5449tgA.f78300c;
        this.f78238c = c5449tgA.f78299b;
        this.f78239d = a(c5449tgA.f78301d);
    }

    public final byte[] a() {
        C5449tg c5449tg = new C5449tg();
        c5449tg.f78298a = this.f78236a;
        c5449tg.f78300c = this.f78237b;
        c5449tg.f78299b = this.f78238c;
        int iOrdinal = this.f78239d.ordinal();
        int i10 = 1;
        if (iOrdinal != 1) {
            i10 = 2;
            if (iOrdinal != 2) {
                i10 = 0;
            }
        }
        c5449tg.f78301d = i10;
        return MessageNano.toByteArray(c5449tg);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5424sg.class == obj.getClass()) {
            C5424sg c5424sg = (C5424sg) obj;
            if (this.f78237b == c5424sg.f78237b && this.f78238c == c5424sg.f78238c && this.f78236a.equals(c5424sg.f78236a) && this.f78239d == c5424sg.f78239d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f78236a.hashCode() * 31;
        long j10 = this.f78237b;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f78238c;
        return this.f78239d.hashCode() + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ReferrerInfo{installReferrer='" + this.f78236a + "', referrerClickTimestampSeconds=" + this.f78237b + ", installBeginTimestampSeconds=" + this.f78238c + ", source=" + this.f78239d + '}';
    }

    public C5424sg(String str, long j10, long j11, EnumC5399rg enumC5399rg) {
        this.f78236a = str;
        this.f78237b = j10;
        this.f78238c = j11;
        this.f78239d = enumC5399rg;
    }

    public static EnumC5399rg a(int i10) {
        if (i10 == 1) {
            return EnumC5399rg.f78153c;
        }
        if (i10 != 2) {
            return EnumC5399rg.f78152b;
        }
        return EnumC5399rg.f78154d;
    }
}

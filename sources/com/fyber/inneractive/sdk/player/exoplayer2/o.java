package com.fyber.inneractive.sdk.player.exoplayer2;

import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new n();
    public int A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.metadata.b f22791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f22793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f22795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.drm.d f22796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f22797j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f22798k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f22799l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f22800m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f22801n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f22802o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final byte[] f22803p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.video.c f22804q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f22805r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f22806s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f22807t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f22808u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f22809v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f22810w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f22811x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f22812y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f22813z;

    public o(String str, String str2, String str3, String str4, int i10, int i11, int i12, int i13, float f10, int i14, float f11, byte[] bArr, int i15, com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar, int i16, int i17, int i18, int i19, int i20, int i21, String str5, int i22, long j10, List list, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar) {
        this.f22788a = str;
        this.f22792e = str2;
        this.f22793f = str3;
        this.f22790c = str4;
        this.f22789b = i10;
        this.f22794g = i11;
        this.f22797j = i12;
        this.f22798k = i13;
        this.f22799l = f10;
        this.f22800m = i14;
        this.f22801n = f11;
        this.f22803p = bArr;
        this.f22802o = i15;
        this.f22804q = cVar;
        this.f22805r = i16;
        this.f22806s = i17;
        this.f22807t = i18;
        this.f22808u = i19;
        this.f22809v = i20;
        this.f22811x = i21;
        this.f22812y = str5;
        this.f22813z = i22;
        this.f22810w = j10;
        this.f22795h = list == null ? Collections.EMPTY_LIST : list;
        this.f22796i = dVar;
        this.f22791d = bVar;
    }

    public static o a(String str, String str2, int i10, int i11, int i12, List list, int i13, float f10, byte[] bArr, int i14, com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar) {
        return new o(str, null, str2, null, -1, i10, i11, i12, -1.0f, i13, f10, bArr, i14, cVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, dVar, null);
    }

    public final int b() {
        int i10;
        int i11 = this.f22797j;
        if (i11 == -1 || (i10 = this.f22798k) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f22789b == oVar.f22789b && this.f22794g == oVar.f22794g && this.f22797j == oVar.f22797j && this.f22798k == oVar.f22798k && this.f22799l == oVar.f22799l && this.f22800m == oVar.f22800m && this.f22801n == oVar.f22801n && this.f22802o == oVar.f22802o && this.f22805r == oVar.f22805r && this.f22806s == oVar.f22806s && this.f22807t == oVar.f22807t && this.f22808u == oVar.f22808u && this.f22809v == oVar.f22809v && this.f22810w == oVar.f22810w && this.f22811x == oVar.f22811x && z.a(this.f22788a, oVar.f22788a) && z.a(this.f22812y, oVar.f22812y) && this.f22813z == oVar.f22813z && z.a(this.f22792e, oVar.f22792e) && z.a(this.f22793f, oVar.f22793f) && z.a(this.f22790c, oVar.f22790c) && z.a(this.f22796i, oVar.f22796i) && z.a(this.f22791d, oVar.f22791d) && z.a(this.f22804q, oVar.f22804q) && Arrays.equals(this.f22803p, oVar.f22803p) && this.f22795h.size() == oVar.f22795h.size()) {
                for (int i10 = 0; i10 < this.f22795h.size(); i10++) {
                    if (!Arrays.equals((byte[]) this.f22795h.get(i10), (byte[]) oVar.f22795h.get(i10))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.A == 0) {
            String str = this.f22788a;
            int iHashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f22792e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f22793f;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f22790c;
            int iHashCode4 = (((((((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f22789b) * 31) + this.f22797j) * 31) + this.f22798k) * 31) + this.f22805r) * 31) + this.f22806s) * 31;
            String str5 = this.f22812y;
            int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f22813z) * 31;
            com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar = this.f22796i;
            int iHashCode6 = (iHashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar = this.f22791d;
            this.A = iHashCode6 + (bVar != null ? Arrays.hashCode(bVar.f22752a) : 0);
        }
        return this.A;
    }

    public final String toString() {
        return "Format(" + this.f22788a + ", " + this.f22792e + ", " + this.f22793f + ", " + this.f22789b + ", " + this.f22812y + ", [" + this.f22797j + ", " + this.f22798k + ", " + this.f22799l + "], [" + this.f22805r + ", " + this.f22806s + "])";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22788a);
        parcel.writeString(this.f22792e);
        parcel.writeString(this.f22793f);
        parcel.writeString(this.f22790c);
        parcel.writeInt(this.f22789b);
        parcel.writeInt(this.f22794g);
        parcel.writeInt(this.f22797j);
        parcel.writeInt(this.f22798k);
        parcel.writeFloat(this.f22799l);
        parcel.writeInt(this.f22800m);
        parcel.writeFloat(this.f22801n);
        parcel.writeInt(this.f22803p != null ? 1 : 0);
        byte[] bArr = this.f22803p;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f22802o);
        parcel.writeParcelable(this.f22804q, i10);
        parcel.writeInt(this.f22805r);
        parcel.writeInt(this.f22806s);
        parcel.writeInt(this.f22807t);
        parcel.writeInt(this.f22808u);
        parcel.writeInt(this.f22809v);
        parcel.writeInt(this.f22811x);
        parcel.writeString(this.f22812y);
        parcel.writeInt(this.f22813z);
        parcel.writeLong(this.f22810w);
        int size = this.f22795h.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray((byte[]) this.f22795h.get(i11));
        }
        parcel.writeParcelable(this.f22796i, 0);
        parcel.writeParcelable(this.f22791d, 0);
    }

    public static o a(String str, String str2, int i10, int i11, int i12, int i13, List list, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, String str3) {
        return a(str, str2, i10, i11, i12, i13, -1, -1, -1, list, dVar, 0, str3, null);
    }

    public static o a(String str, String str2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, List list, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, int i17, String str3, com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar) {
        return new o(str, null, str2, null, i10, i11, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i12, i13, i14, i15, i16, i17, str3, -1, Long.MAX_VALUE, list, dVar, bVar);
    }

    public static o a(String str, String str2, int i10, String str3, int i11, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, long j10, List list) {
        return new o(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i10, str3, i11, j10, list, dVar, null);
    }

    public static o a(String str, String str2, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar) {
        return new o(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, dVar, null);
    }

    public final MediaFormat a() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f22793f);
        String str = this.f22812y;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        a(mediaFormat, "max-input-size", this.f22794g);
        a(mediaFormat, "width", this.f22797j);
        a(mediaFormat, "height", this.f22798k);
        float f10 = this.f22799l;
        if (f10 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f10);
        }
        a(mediaFormat, "rotation-degrees", this.f22800m);
        a(mediaFormat, "channel-count", this.f22805r);
        a(mediaFormat, "sample-rate", this.f22806s);
        a(mediaFormat, "encoder-delay", this.f22808u);
        a(mediaFormat, "encoder-padding", this.f22809v);
        for (int i10 = 0; i10 < this.f22795h.size(); i10++) {
            mediaFormat.setByteBuffer(m.a("csd-", i10), ByteBuffer.wrap((byte[]) this.f22795h.get(i10)));
        }
        com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar = this.f22804q;
        if (cVar != null) {
            a(mediaFormat, "color-transfer", cVar.f23199c);
            a(mediaFormat, "color-standard", cVar.f23197a);
            a(mediaFormat, "color-range", cVar.f23198b);
            byte[] bArr = cVar.f23200d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public o(Parcel parcel) {
        this.f22788a = parcel.readString();
        this.f22792e = parcel.readString();
        this.f22793f = parcel.readString();
        this.f22790c = parcel.readString();
        this.f22789b = parcel.readInt();
        this.f22794g = parcel.readInt();
        this.f22797j = parcel.readInt();
        this.f22798k = parcel.readInt();
        this.f22799l = parcel.readFloat();
        this.f22800m = parcel.readInt();
        this.f22801n = parcel.readFloat();
        this.f22803p = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f22802o = parcel.readInt();
        this.f22804q = (com.fyber.inneractive.sdk.player.exoplayer2.video.c) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.video.c.class.getClassLoader());
        this.f22805r = parcel.readInt();
        this.f22806s = parcel.readInt();
        this.f22807t = parcel.readInt();
        this.f22808u = parcel.readInt();
        this.f22809v = parcel.readInt();
        this.f22811x = parcel.readInt();
        this.f22812y = parcel.readString();
        this.f22813z = parcel.readInt();
        this.f22810w = parcel.readLong();
        int i10 = parcel.readInt();
        this.f22795h = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f22795h.add(parcel.createByteArray());
        }
        this.f22796i = (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.drm.d.class.getClassLoader());
        this.f22791d = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.b) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.metadata.b.class.getClassLoader());
    }

    public static void a(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }
}

package com.explorestack.protobuf;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes7.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f19127a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f19128b = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f19129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ByteBuffer f19130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f19131e;

    public interface a extends j {
        @Override // com.explorestack.protobuf.j0.j, com.explorestack.protobuf.j0.f
        a mutableCopyWithCapacity(int i10);
    }

    public interface b extends j {
        void addDouble(double d10);

        double getDouble(int i10);

        @Override // com.explorestack.protobuf.j0.j, com.explorestack.protobuf.j0.f
        b mutableCopyWithCapacity(int i10);

        double setDouble(int i10, double d10);
    }

    public interface c {
        int getNumber();
    }

    public interface d {
    }

    public interface e {
        boolean isInRange(int i10);
    }

    public interface f extends j {
        f mutableCopyWithCapacity(int i10);
    }

    public interface g extends j {
        void addInt(int i10);

        int getInt(int i10);

        @Override // com.explorestack.protobuf.j0.j, com.explorestack.protobuf.j0.f
        g mutableCopyWithCapacity(int i10);

        int setInt(int i10, int i11);
    }

    public static class h extends AbstractList {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f19132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a f19133c;

        public interface a {
            Object convert(Object obj);
        }

        public h(List list, a aVar) {
            this.f19132b = list;
            this.f19133c = aVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i10) {
            return this.f19133c.convert(this.f19132b.get(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f19132b.size();
        }
    }

    public interface i extends j {
        void addLong(long j10);

        long getLong(int i10);

        @Override // com.explorestack.protobuf.j0.j, com.explorestack.protobuf.j0.f
        i mutableCopyWithCapacity(int i10);

        long setLong(int i10, long j10);
    }

    public interface j extends List, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        j mutableCopyWithCapacity(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f19129c = bArr;
        f19130d = ByteBuffer.wrap(bArr);
        f19131e = l.l(bArr);
    }

    static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static MessageLite c(Class cls) {
        try {
            Method method = cls.getMethod("getDefaultInstance", null);
            return (MessageLite) method.invoke(method, null);
        } catch (Exception e10) {
            throw new RuntimeException("Failed to get default instance for " + cls, e10);
        }
    }

    public static int d(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int e(byte[] bArr) {
        return f(bArr, 0, bArr.length);
    }

    static int f(byte[] bArr, int i10, int i11) {
        int iL = l(i11, bArr, i10, i11);
        if (iL == 0) {
            return 1;
        }
        return iL;
    }

    public static int g(c cVar) {
        return cVar.getNumber();
    }

    public static int h(List list) {
        Iterator it = list.iterator();
        int iG = 1;
        while (it.hasNext()) {
            iG = (iG * 31) + g((c) it.next());
        }
        return iG;
    }

    public static int i(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean j(byte[] bArr) {
        return x2.s(bArr);
    }

    static Object k(Object obj, Object obj2) {
        return ((MessageLite) obj).toBuilder().mergeFrom((MessageLite) obj2).buildPartial();
    }

    static int l(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String m(byte[] bArr) {
        return new String(bArr, f19127a);
    }
}

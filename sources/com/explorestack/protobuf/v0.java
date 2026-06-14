package com.explorestack.protobuf;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.z2;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class v0 {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19369a;

        static {
            int[] iArr = new int[z2.b.values().length];
            f19369a = iArr;
            try {
                iArr[z2.b.f19483n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19369a[z2.b.f19486q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19369a[z2.b.f19482m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z2.b f19370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f19371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final z2.b f19372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f19373d;

        public b(z2.b bVar, Object obj, z2.b bVar2, Object obj2) {
            this.f19370a = bVar;
            this.f19371b = obj;
            this.f19372c = bVar2;
            this.f19373d = obj2;
        }
    }

    static int a(b bVar, Object obj, Object obj2) {
        return c0.n(bVar.f19370a, 1, obj) + c0.n(bVar.f19372c, 2, obj2);
    }

    static Map.Entry b(l lVar, b bVar, w wVar) {
        Object objC = bVar.f19371b;
        Object objC2 = bVar.f19373d;
        while (true) {
            int iK = lVar.K();
            if (iK == 0) {
                break;
            }
            if (iK == z2.c(1, bVar.f19370a.g())) {
                objC = c(lVar, wVar, bVar.f19370a, objC);
            } else if (iK == z2.c(2, bVar.f19372c.g())) {
                objC2 = c(lVar, wVar, bVar.f19372c, objC2);
            } else if (!lVar.O(iK)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(objC, objC2);
    }

    static Object c(l lVar, w wVar, z2.b bVar, Object obj) {
        int i10 = a.f19369a[bVar.ordinal()];
        if (i10 == 1) {
            MessageLite.Builder builder = ((MessageLite) obj).toBuilder();
            lVar.B(builder, wVar);
            return builder.buildPartial();
        }
        if (i10 == 2) {
            return Integer.valueOf(lVar.t());
        }
        if (i10 != 3) {
            return c0.K(lVar, bVar, true);
        }
        throw new RuntimeException("Groups are not allowed in maps.");
    }

    static void d(n nVar, b bVar, Object obj, Object obj2) {
        c0.O(nVar, bVar.f19370a, 1, obj);
        c0.O(nVar, bVar.f19372c, 2, obj2);
    }
}

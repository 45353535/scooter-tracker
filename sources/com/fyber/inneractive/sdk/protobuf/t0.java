package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class t0 implements c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f23574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z0 f23575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23576c = false;

    public t0(z0 z0Var) {
        this.f23574a = z0Var;
        this.f23575b = (z0) z0Var.dynamicMethod(y0.NEW_MUTABLE_INSTANCE);
    }

    public static void a(z0 z0Var, z0 z0Var2) {
        p2 p2Var = p2.f23544c;
        p2Var.getClass();
        p2Var.a(z0Var.getClass()).a(z0Var, z0Var2);
    }

    public final z0 b() {
        if (this.f23576c) {
            return this.f23575b;
        }
        this.f23575b.makeImmutable();
        this.f23576c = true;
        return this.f23575b;
    }

    public final void c() {
        if (this.f23576c) {
            z0 z0Var = (z0) this.f23575b.dynamicMethod(y0.NEW_MUTABLE_INSTANCE);
            a(z0Var, this.f23575b);
            this.f23575b = z0Var;
            this.f23576c = false;
        }
    }

    public final Object clone() {
        t0 t0VarNewBuilderForType = this.f23574a.newBuilderForType();
        z0 z0VarB = b();
        t0VarNewBuilderForType.c();
        a(t0VarNewBuilderForType.f23575b, z0VarB);
        return t0VarNewBuilderForType;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e2
    public final d2 getDefaultInstanceForType() {
        return this.f23574a;
    }

    public static void a(Iterable iterable, List list) {
        Charset charset = l1.f23521a;
        iterable.getClass();
        if (iterable instanceof q1) {
            List listB = ((q1) iterable).b();
            q1 q1Var = (q1) list;
            int size = list.size();
            for (Object obj : listB) {
                if (obj == null) {
                    String str = "Element at index " + (q1Var.size() - size) + " is null.";
                    for (int size2 = q1Var.size() - 1; size2 >= size; size2--) {
                        q1Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof s) {
                    q1Var.a((s) obj);
                } else {
                    q1Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof n2) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list.add(obj2);
        }
    }

    public final z0 a() {
        z0 z0VarB = b();
        if (z0VarB.isInitialized()) {
            return z0VarB;
        }
        throw new m3();
    }

    public final t0 a(w wVar, h0 h0Var) throws IOException {
        c();
        try {
            p2 p2Var = p2.f23544c;
            z0 z0Var = this.f23575b;
            p2Var.getClass();
            t2 t2VarA = p2Var.a(z0Var.getClass());
            z0 z0Var2 = this.f23575b;
            x xVar = wVar.f23605d;
            if (xVar == null) {
                xVar = new x(wVar);
            }
            t2VarA.a(z0Var2, xVar, h0Var);
            return this;
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof IOException) {
                throw ((IOException) e10.getCause());
            }
            throw e10;
        }
    }
}

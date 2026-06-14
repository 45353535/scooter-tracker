package vg;

import dg.a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.a1;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.y0;
import kotlin.reflect.KClass;
import kotlin.time.b;
import kotlinx.serialization.KSerializer;
import lf.r;
import lf.t;
import lf.v;
import lf.y;
import yg.b0;
import yg.c1;
import yg.d0;
import yg.e3;
import yg.f;
import yg.h;
import yg.h1;
import yg.h3;
import yg.i;
import yg.i1;
import yg.i3;
import yg.k;
import yg.k1;
import yg.k3;
import yg.l;
import yg.l0;
import yg.l3;
import yg.m0;
import yg.n3;
import yg.o3;
import yg.q;
import yg.q3;
import yg.r2;
import yg.r3;
import yg.s3;
import yg.t1;
import yg.t3;
import yg.u1;
import yg.w0;
import yg.w2;
import yg.x0;
import yg.x2;
import yg.y2;
import yg.z1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final KSerializer A(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return m0.f119029a;
    }

    public static final KSerializer B(a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        return x0.f119093a;
    }

    public static final KSerializer C(c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return i1.f118988a;
    }

    public static final KSerializer D(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return x2.f119098a;
    }

    public static final KSerializer E(a1 a1Var) {
        Intrinsics.checkNotNullParameter(a1Var, "<this>");
        return y2.f119104a;
    }

    public static final KSerializer F(b.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return d0.f118945a;
    }

    public static final KSerializer G(r.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return i3.f119002a;
    }

    public static final KSerializer H(t.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return l3.f119026a;
    }

    public static final KSerializer I(v.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return o3.f119040a;
    }

    public static final KSerializer J(y.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return r3.f119058a;
    }

    public static final KSerializer a(KClass kClass, KSerializer elementSerializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new r2(kClass, elementSerializer);
    }

    public static final KSerializer b() {
        return h.f118977c;
    }

    public static final KSerializer c() {
        return k.f119011c;
    }

    public static final KSerializer d() {
        return q.f119048c;
    }

    public static final KSerializer e() {
        return b0.f118938c;
    }

    public static final KSerializer f() {
        return l0.f119020c;
    }

    public static final KSerializer g() {
        return w0.f119090c;
    }

    public static final KSerializer h(KSerializer elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new f(elementSerializer);
    }

    public static final KSerializer i() {
        return h1.f118980c;
    }

    public static final KSerializer j(KSerializer keySerializer, KSerializer valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new k1(keySerializer, valueSerializer);
    }

    public static final KSerializer k(KSerializer keySerializer, KSerializer valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new c1(keySerializer, valueSerializer);
    }

    public static final KSerializer l() {
        return t1.f119074a;
    }

    public static final KSerializer m(KSerializer keySerializer, KSerializer valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new z1(keySerializer, valueSerializer);
    }

    public static final KSerializer n() {
        return w2.f119092c;
    }

    public static final KSerializer o(KSerializer aSerializer, KSerializer bSerializer, KSerializer cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        return new e3(aSerializer, bSerializer, cSerializer);
    }

    public static final KSerializer p() {
        return h3.f118982c;
    }

    public static final KSerializer q() {
        return k3.f119017c;
    }

    public static final KSerializer r() {
        return n3.f119037c;
    }

    public static final KSerializer s() {
        return q3.f119051c;
    }

    public static final KSerializer t(KSerializer kSerializer) {
        Intrinsics.checkNotNullParameter(kSerializer, "<this>");
        return kSerializer.getDescriptor().b() ? kSerializer : new u1(kSerializer);
    }

    public static final KSerializer u(a.C0856a c0856a) {
        Intrinsics.checkNotNullParameter(c0856a, "<this>");
        return t3.f119076a;
    }

    public static final KSerializer v(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "<this>");
        return s3.f119067b;
    }

    public static final KSerializer w(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return i.f118983a;
    }

    public static final KSerializer x(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return l.f119018a;
    }

    public static final KSerializer y(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return yg.r.f119052a;
    }

    public static final KSerializer z(kotlin.jvm.internal.t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        return yg.c0.f118941a;
    }
}

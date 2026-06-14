package yg;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class r2 extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final KClass f119056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SerialDescriptor f119057c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(KClass kClass, KSerializer eSerializer) {
        super(eSerializer, null);
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        this.f119056b = kClass;
        this.f119057c = new d(eSerializer.getDescriptor());
    }

    @Override // yg.w, kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return this.f119057c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ArrayList a() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int b(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void c(ArrayList arrayList, int i10) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Iterator d(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return kotlin.jvm.internal.i.a(objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public int e(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return objArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.w
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(ArrayList arrayList, int i10, Object obj) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.add(i10, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public ArrayList k(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return new ArrayList(ArraysKt.asList(objArr));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Object[] l(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return c2.q(arrayList, this.f119056b);
    }
}

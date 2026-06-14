package yg;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SerialDescriptor f118960b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(KSerializer element) {
        super(element);
        Intrinsics.checkNotNullParameter(element, "element");
        this.f118960b = new e(element.getDescriptor());
    }

    @Override // yg.w, kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return this.f118960b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public ArrayList a() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(ArrayList arrayList, int i10) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
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
    public ArrayList k(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList(list) : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public List l(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList;
    }
}

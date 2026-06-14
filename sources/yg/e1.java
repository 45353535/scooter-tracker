package yg;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SerialDescriptor f118955b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(KSerializer eSerializer) {
        super(eSerializer);
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        this.f118955b = new d1(eSerializer.getDescriptor());
    }

    @Override // yg.w, kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return this.f118955b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet a() {
        return new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(LinkedHashSet linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(LinkedHashSet linkedHashSet, int i10) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.w
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(LinkedHashSet linkedHashSet, int i10, Object obj) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        linkedHashSet.add(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet k(Set set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet(set) : linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Set l(LinkedHashSet linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        return linkedHashSet;
    }
}

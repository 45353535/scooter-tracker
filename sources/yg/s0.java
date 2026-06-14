package yg;

import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SerialDescriptor f119060b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(KSerializer eSerializer) {
        super(eSerializer);
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        this.f119060b = new r0(eSerializer.getDescriptor());
    }

    @Override // yg.w, kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return this.f119060b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public HashSet a() {
        return new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(HashSet hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
        return hashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(HashSet hashSet, int i10) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.w
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(HashSet hashSet, int i10, Object obj) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
        hashSet.add(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public HashSet k(Set set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        HashSet hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet(set) : hashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Set l(HashSet hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
        return hashSet;
    }
}

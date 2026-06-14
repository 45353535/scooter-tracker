package yg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends m1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SerialDescriptor f119049c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(KSerializer kSerializer, KSerializer vSerializer) {
        super(kSerializer, vSerializer, null);
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        this.f119049c = new p0(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // yg.m1, kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return this.f119049c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public HashMap a() {
        return new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(HashMap map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(HashMap map, int i10) {
        Intrinsics.checkNotNullParameter(map, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Iterator d(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int e(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public HashMap k(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        HashMap map2 = map instanceof HashMap ? (HashMap) map : null;
        return map2 == null ? new HashMap(map) : map2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Map l(HashMap map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map;
    }
}

package yg;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends m1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SerialDescriptor f118943c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(KSerializer kSerializer, KSerializer vSerializer) {
        super(kSerializer, vSerializer, null);
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        this.f118943c = new b1(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // yg.m1, kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return this.f118943c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap a() {
        return new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(LinkedHashMap linkedHashMap, int i10) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
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
    public LinkedHashMap k(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap(map) : linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Map l(LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class B3 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final F3 fromModel(@NotNull A3 a32) {
        F3 f32 = new F3();
        f32.f75763a = a(a32.f75490a);
        int size = a32.f75491b.size();
        C3[] c3Arr = new C3[size];
        for (int i10 = 0; i10 < size; i10++) {
            c3Arr[i10] = a((C5586z3) a32.f75491b.get(i10));
        }
        f32.f75764b = c3Arr;
        return f32;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A3 toModel(@NotNull F3 f32) {
        C3 c32 = f32.f75763a;
        if (c32 == null) {
            c32 = new C3();
        }
        C5586z3 c5586z3A = a(c32);
        C3[] c3Arr = f32.f75764b;
        ArrayList arrayList = new ArrayList(c3Arr.length);
        for (C3 c33 : c3Arr) {
            arrayList.add(a(c33));
        }
        return new A3(c5586z3A, arrayList);
    }

    public static C3 a(C5586z3 c5586z3) {
        E3 e32;
        C3 c32 = new C3();
        Map map = c5586z3.f78603a;
        int i10 = 0;
        if (map != null) {
            e32 = new E3();
            int size = map.size();
            D3[] d3Arr = new D3[size];
            for (int i11 = 0; i11 < size; i11++) {
                d3Arr[i11] = new D3();
            }
            e32.f75708a = d3Arr;
            int i12 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                D3 d32 = e32.f75708a[i12];
                d32.f75651a = str;
                d32.f75652b = str2;
                i12++;
            }
        } else {
            e32 = null;
        }
        c32.f75604a = e32;
        int iOrdinal = c5586z3.f78604b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                i10 = 2;
                if (iOrdinal != 2) {
                    i10 = 3;
                    if (iOrdinal != 3) {
                        throw new lf.m();
                    }
                }
            } else {
                i10 = 1;
            }
        }
        c32.f75605b = i10;
        return c32;
    }

    public static C5586z3 a(C3 c32) {
        LinkedHashMap linkedHashMap;
        Y7 y72;
        E3 e32 = c32.f75604a;
        if (e32 != null) {
            D3[] d3Arr = e32.f75708a;
            linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(d3Arr.length), 16));
            for (D3 d32 : d3Arr) {
                Pair pair = TuplesKt.to(d32.f75651a, d32.f75652b);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
        } else {
            linkedHashMap = null;
        }
        int i10 = c32.f75605b;
        if (i10 == 0) {
            y72 = Y7.f76694b;
        } else if (i10 == 1) {
            y72 = Y7.f76695c;
        } else if (i10 == 2) {
            y72 = Y7.f76696d;
        } else if (i10 != 3) {
            y72 = Y7.f76694b;
        } else {
            y72 = Y7.f76697e;
        }
        return new C5586z3(linkedHashMap, y72);
    }
}

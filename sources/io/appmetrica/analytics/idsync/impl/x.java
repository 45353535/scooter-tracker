package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class x implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m fromModel(@NotNull RequestConfig requestConfig) {
        m mVar = new m();
        String type = requestConfig.getType();
        Charset charset = Charsets.UTF_8;
        mVar.f75418a = type.getBytes(charset);
        l lVar = new l();
        lVar.f75416a = w.f75444a[requestConfig.getPreconditions().getNetworkType().ordinal()] != 1 ? 0 : 1;
        mVar.f75419b = lVar;
        mVar.f75420c = requestConfig.getUrl().getBytes(charset);
        Map<String, List<String>> headers = requestConfig.getHeaders();
        ArrayList arrayList = new ArrayList(headers.size());
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            k kVar = new k();
            kVar.f75413a = key.getBytes(Charsets.UTF_8);
            int size = value.size();
            byte[][] bArr = new byte[size][];
            for (int i10 = 0; i10 < size; i10++) {
                bArr[i10] = value.get(i10).getBytes(Charsets.UTF_8);
            }
            kVar.f75414b = bArr;
            arrayList.add(kVar);
        }
        Object[] array = arrayList.toArray(new k[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        mVar.f75421d = (k[]) array;
        mVar.f75422e = requestConfig.getResendIntervalForValidResponse();
        mVar.f75423f = requestConfig.getResendIntervalForInvalidResponse();
        mVar.f75424g = CollectionsKt.toIntArray(requestConfig.getValidResponseCodes());
        return mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.idsync.internal.model.RequestConfig toModel(@org.jetbrains.annotations.NotNull io.appmetrica.analytics.idsync.impl.m r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = new java.lang.String
            byte[] r2 = r0.f75418a
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
            r1.<init>(r2, r3)
            io.appmetrica.analytics.idsync.internal.model.Preconditions r2 = new io.appmetrica.analytics.idsync.internal.model.Preconditions
            io.appmetrica.analytics.idsync.impl.l r4 = r0.f75419b
            if (r4 == 0) goto L1d
            int r4 = r4.f75416a
            r5 = 1
            if (r4 != r5) goto L19
            io.appmetrica.analytics.idsync.internal.model.NetworkType r4 = io.appmetrica.analytics.idsync.internal.model.NetworkType.CELL
            goto L1b
        L19:
            io.appmetrica.analytics.idsync.internal.model.NetworkType r4 = io.appmetrica.analytics.idsync.internal.model.NetworkType.ANY
        L1b:
            if (r4 != 0) goto L1f
        L1d:
            io.appmetrica.analytics.idsync.internal.model.NetworkType r4 = io.appmetrica.analytics.idsync.internal.model.NetworkType.ANY
        L1f:
            r2.<init>(r4)
            r4 = r2
            java.lang.String r2 = new java.lang.String
            byte[] r5 = r0.f75420c
            r2.<init>(r5, r3)
            io.appmetrica.analytics.idsync.impl.k[] r3 = r0.f75421d
            int r5 = r3.length
            int r5 = kotlin.collections.MapsKt.mapCapacity(r5)
            r6 = 16
            int r5 = kotlin.ranges.g.e(r5, r6)
            r6 = r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r5)
            int r5 = r3.length
            r8 = 0
        L3f:
            if (r8 >= r5) goto L79
            r9 = r3[r8]
            java.lang.String r10 = new java.lang.String
            byte[] r11 = r9.f75413a
            java.nio.charset.Charset r12 = kotlin.text.Charsets.UTF_8
            r10.<init>(r11, r12)
            byte[][] r9 = r9.f75414b
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = r9.length
            r11.<init>(r12)
            int r12 = r9.length
            r13 = 0
        L56:
            if (r13 >= r12) goto L67
            r14 = r9[r13]
            java.lang.String r15 = new java.lang.String
            java.nio.charset.Charset r7 = kotlin.text.Charsets.UTF_8
            r15.<init>(r14, r7)
            r11.add(r15)
            int r13 = r13 + 1
            goto L56
        L67:
            kotlin.Pair r7 = kotlin.TuplesKt.to(r10, r11)
            java.lang.Object r9 = r7.getFirst()
            java.lang.Object r7 = r7.getSecond()
            r4.put(r9, r7)
            int r8 = r8 + 1
            goto L3f
        L79:
            long r7 = r0.f75422e
            r3 = r6
            r5 = r7
            long r7 = r0.f75423f
            int[] r0 = r0.f75424g
            java.util.List r9 = kotlin.collections.ArraysKt.toList(r0)
            io.appmetrica.analytics.idsync.internal.model.RequestConfig r0 = new io.appmetrica.analytics.idsync.internal.model.RequestConfig
            r0.<init>(r1, r2, r3, r4, r5, r7, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.idsync.impl.x.toModel(io.appmetrica.analytics.idsync.impl.m):io.appmetrica.analytics.idsync.internal.model.RequestConfig");
    }
}

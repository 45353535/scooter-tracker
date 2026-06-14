package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class Ca extends K2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5593za f75609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5593za f75610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ba f75611d;

    public Ca(int i10, int i11, int i12) {
        this(i10, new C5593za(i11), new C5593za(i12));
    }

    public Ca(int i10, @NonNull C5593za c5593za, @NonNull C5593za c5593za2) {
        super(i10);
        this.f75611d = new Ba();
        this.f75609b = c5593za;
        this.f75610c = c5593za2;
    }

    @Override // io.appmetrica.analytics.impl.K2, io.appmetrica.analytics.impl.Aa
    @NonNull
    public final On a(@Nullable Map<String, String> map) {
        HashMap map2;
        int bytesTruncated;
        int i10 = 0;
        if (map != null) {
            map2 = new HashMap();
            Set<Map.Entry<String, String>> setEntrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) setEntrySet.toArray(new Map.Entry[setEntrySet.size()]);
            Arrays.sort(entryArr, this.f75611d);
            int length = entryArr.length;
            bytesTruncated = 0;
            int i11 = 0;
            boolean z10 = false;
            int i12 = 0;
            while (i10 < length) {
                Map.Entry entry = entryArr[i10];
                On onA = this.f75609b.a((String) entry.getKey());
                On onA2 = this.f75610c.a((String) entry.getValue());
                int utf8BytesLength = StringUtils.getUtf8BytesLength((String) entry.getValue()) + StringUtils.getUtf8BytesLength((String) entry.getKey());
                int utf8BytesLength2 = StringUtils.getUtf8BytesLength((String) onA2.f76209a) + StringUtils.getUtf8BytesLength((String) onA.f76209a);
                if (z10 || utf8BytesLength2 + i12 > this.f76015a) {
                    i11++;
                    bytesTruncated += utf8BytesLength;
                    z10 = true;
                } else {
                    bytesTruncated = onA2.f76210b.getBytesTruncated() + onA.f76210b.getBytesTruncated() + bytesTruncated;
                    int utf8BytesLength3 = StringUtils.getUtf8BytesLength((String) onA2.f76209a) + StringUtils.getUtf8BytesLength((String) onA.f76209a) + i12;
                    map2.put((String) onA.f76209a, (String) onA2.f76209a);
                    i12 = utf8BytesLength3;
                }
                i10++;
            }
            i10 = i11;
        } else {
            map2 = null;
            bytesTruncated = 0;
        }
        return new On(map2, new C5462u4(i10, bytesTruncated));
    }
}

package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.foundation.tools.FastKV;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
class z0 implements FastKV.b<Set<String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final z0 f49102a = new z0();

    private z0() {
    }

    @Override // com.mbridge.msdk.foundation.tools.FastKV.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<String> a(byte[] bArr, int i10, int i11) {
        int i12;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i11 > 0) {
            b0 b0Var = new b0(bArr, i10);
            int i13 = i10 + i11;
            while (true) {
                i12 = b0Var.f48944b;
                if (i12 >= i13) {
                    break;
                }
                linkedHashSet.add(b0Var.e(b0Var.g()));
            }
            if (i12 != i13) {
                throw new IllegalArgumentException("Invalid String set");
            }
        }
        return linkedHashSet;
    }

    @Override // com.mbridge.msdk.foundation.tools.FastKV.b
    public byte[] a(Set<String> set) {
        if (set.isEmpty()) {
            return new byte[0];
        }
        int size = set.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        int iF = 0;
        int i10 = 0;
        for (String str : set) {
            if (str == null) {
                iF += 5;
                iArr[i10] = -1;
            } else {
                int iB = b0.b(str);
                strArr[i10] = str;
                iArr[i10] = iB;
                iF += b0.f(iB) + iB;
            }
            i10++;
        }
        b0 b0Var = new b0(iF);
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = iArr[i11];
            b0Var.h(i12);
            if (i12 >= 0) {
                b0Var.c(strArr[i11]);
            }
        }
        return b0Var.f48943a;
    }

    @Override // com.mbridge.msdk.foundation.tools.FastKV.b
    public String a() {
        return "StringSet";
    }
}

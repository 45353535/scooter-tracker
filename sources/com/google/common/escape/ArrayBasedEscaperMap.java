package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class ArrayBasedEscaperMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[][] f30494b = (char[][]) Array.newInstance((Class<?>) Character.TYPE, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char[][] f30495a;

    private ArrayBasedEscaperMap(char[][] cArr) {
        this.f30495a = cArr;
    }

    static char[][] a(Map map) {
        Preconditions.checkNotNull(map);
        if (map.isEmpty()) {
            return f30494b;
        }
        char[][] cArr = new char[((Character) Collections.max(map.keySet())).charValue() + 1][];
        for (Character ch2 : map.keySet()) {
            cArr[ch2.charValue()] = ((String) map.get(ch2)).toCharArray();
        }
        return cArr;
    }

    public static ArrayBasedEscaperMap create(Map<Character, String> map) {
        return new ArrayBasedEscaperMap(a(map));
    }

    char[][] b() {
        return this.f30495a;
    }
}

package sg.bigo.ads.api.core;

import android.util.SparseArray;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SparseArray<List<Integer>> f102153a;

    static {
        SparseArray<List<Integer>> sparseArray = new SparseArray<>();
        f102153a = sparseArray;
        sparseArray.put(0, Arrays.asList(1, 2, 3));
        sparseArray.put(1, Arrays.asList(1, 2));
        sparseArray.put(2, Collections.singletonList(3));
        sparseArray.put(3, Arrays.asList(1, 2, 3));
        sparseArray.put(20, Arrays.asList(1, 2, 3));
        sparseArray.put(4, Arrays.asList(1, 2, 3));
        sparseArray.put(12, Arrays.asList(1, 2));
        sparseArray.put(15, Arrays.asList(1, 2, 5));
        sparseArray.put(16, Arrays.asList(1, 2, 5));
        sparseArray.put(17, Arrays.asList(1, 2, 5));
        sparseArray.put(18, Arrays.asList(1, 2, 5));
    }

    public static String a(int i10) {
        StringBuilder sb2 = new StringBuilder();
        List<Integer> list = f102153a.get(i10);
        if (list != null) {
            for (Integer num : list) {
                if (sb2.length() > 0) {
                    sb2.append(StringUtils.COMMA);
                }
                sb2.append(num);
            }
        }
        return sb2.toString();
    }

    public static boolean b(int i10) {
        return i10 == 3 || i10 == 4 || i10 == 20;
    }

    public static boolean c(int i10) {
        return i10 == 3 || i10 == 4 || i10 == 12 || i10 == 20;
    }

    public static boolean d(int i10) {
        return i10 == 12;
    }

    public static boolean e(int i10) {
        return i10 != 4;
    }
}

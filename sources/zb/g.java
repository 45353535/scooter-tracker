package zb;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public abstract class g {
    public static <T extends g> T resolveParams(@Nullable T t10, @Nullable T t11) {
        if (t10 == null) {
            return t11;
        }
        if (t11 != null) {
            t10.merge(t11);
        }
        return t10;
    }

    public abstract void merge(g gVar);
}

package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hf1 {
    public static final void a(df1 df1Var, String str, List list) {
        String strJoinToString$default = null;
        if (list != null) {
            List list2 = !list.isEmpty() ? list : null;
            if (list2 != null) {
                strJoinToString$default = CollectionsKt.joinToString$default(list2, StringUtils.COMMA, null, null, 0, null, null, 62, null);
            }
        }
        ((ff1) df1Var).a(str, strJoinToString$default);
    }
}

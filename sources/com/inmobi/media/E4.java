package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class E4 implements InterfaceC4022s4 {
    @Override // com.inmobi.media.InterfaceC4022s4
    public final void a(Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        synchronized (this) {
            try {
                K4 k42 = K4.f37202a;
                Intrinsics.checkNotNullExpressionValue("K4", "access$getTAG$p(...)");
                K4 k43 = K4.f37202a;
                String str = K4.f37207f;
                List<String> skipFields = K4.c().getContextualData().getSkipFields();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(L4.f37255j);
                arrayList.removeAll(skipFields);
                String strJoinToString$default = CollectionsKt.joinToString$default(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null);
                K4.f37207f = strJoinToString$default;
                if (!Intrinsics.areEqual(strJoinToString$default, str)) {
                    k43.f();
                }
                K4.a();
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

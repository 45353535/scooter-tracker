package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f46745a;

    public p(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f46745a = cVar;
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        return (TextUtils.isEmpty(str) || !str.contains("timeStampMill")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.c() : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(String.valueOf(System.currentTimeMillis()));
    }
}

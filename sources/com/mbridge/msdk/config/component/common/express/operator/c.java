package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.ironsource.C4240b4;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f46719a;

    public c(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f46719a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        String strA;
        Object objB;
        Object objA = a(list);
        if (obj instanceof com.mbridge.msdk.config.component.common.express.entities.a) {
            com.mbridge.msdk.config.component.common.express.entities.a aVar = (com.mbridge.msdk.config.component.common.express.entities.a) obj;
            strA = aVar.a();
            objB = aVar.b();
        } else {
            strA = "";
            objB = null;
        }
        if (TextUtils.isEmpty(strA) || !(objB instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        Object objB2 = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) objB).b(strA);
        if (objB2 == null || TextUtils.isEmpty(strA)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) objB2).a(strA, objA);
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(objA);
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        String strTrim = str.trim();
        return strTrim.equals(C4240b4.j.f42668b) ? b(strTrim, obj, list) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private Object a(List<Object> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}

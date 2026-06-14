package com.mbridge.msdk.config.component.common.express.node;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class f extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    d f46708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d f46709b;

    public f(d dVar, d dVar2) {
        this.f46708a = dVar;
        this.f46709b = dVar2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objA;
        String str;
        try {
            objA = this.f46708a.a(dVar, eVar, aVar);
            str = (String) this.f46709b.a(dVar, eVar, aVar);
        } catch (Exception e10) {
            q0.b("IndexAccessNode", "IndexAccessNode error: " + e10.getMessage());
        }
        if (objA != null && !TextUtils.isEmpty(str)) {
            int i10 = Integer.parseInt(str);
            if (objA instanceof Object[]) {
                if (i10 < ((Object[]) objA).length) {
                    return ((Object[]) objA)[i10];
                }
            } else if (objA instanceof int[]) {
                if (i10 < ((int[]) objA).length) {
                    return Integer.valueOf(((int[]) objA)[i10]);
                }
            } else if (objA instanceof long[]) {
                if (i10 < ((long[]) objA).length) {
                    return Long.valueOf(((long[]) objA)[i10]);
                }
            } else if (objA instanceof double[]) {
                if (i10 < ((double[]) objA).length) {
                    return Double.valueOf(((double[]) objA)[i10]);
                }
            } else if (objA instanceof float[]) {
                if (i10 < ((float[]) objA).length) {
                    return Float.valueOf(((float[]) objA)[i10]);
                }
            } else if (objA instanceof boolean[]) {
                if (i10 < ((boolean[]) objA).length) {
                    return Boolean.valueOf(((boolean[]) objA)[i10]);
                }
            } else if (objA instanceof char[]) {
                if (i10 < ((char[]) objA).length) {
                    return Character.valueOf(((char[]) objA)[i10]);
                }
            } else if (objA instanceof byte[]) {
                if (i10 < ((byte[]) objA).length) {
                    return Byte.valueOf(((byte[]) objA)[i10]);
                }
            } else if (objA instanceof short[]) {
                if (i10 < ((short[]) objA).length) {
                    return Short.valueOf(((short[]) objA)[i10]);
                }
            } else if ((objA instanceof List) && i10 < ((List) objA).size()) {
                return ((List) objA).get(i10);
            }
            return null;
        }
        return null;
    }
}

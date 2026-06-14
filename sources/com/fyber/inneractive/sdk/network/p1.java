package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import android.util.Pair;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.common.net.HttpHeaders;
import hh.z;
import java.io.FilterInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class p1 extends i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hh.x f21356a = new hh.x().E().c();

    public static HashMap b(hh.b0 b0Var) {
        HashMap map = new HashMap();
        if (b0Var != null) {
            hh.t tVarR = b0Var.R();
            for (int i10 = 0; i10 < tVarR.size(); i10++) {
                String strE = tVarR.e(i10);
                map.put(strE, Collections.singletonList(tVarR.a(strE)));
            }
        }
        return map;
    }

    @Override // com.fyber.inneractive.sdk.network.h
    public final l a(t0 t0Var, String str, String str2) throws Exception {
        IAlog.a("%s okhttp network stack is in use", "OkHttpExecutorImpl");
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(t0Var.r());
            Pair pairA = a(t0Var.r(), t0Var, arrayList, str, str2);
            Object obj = pairA.second;
            String strV = obj != null ? ((hh.b0) obj).V() : "";
            FilterInputStream filterInputStreamA = a((hh.b0) pairA.second);
            Object obj2 = pairA.second;
            int iQ = obj2 == null ? -1 : ((hh.b0) obj2).q();
            HashMap mapB = b((hh.b0) pairA.second);
            hh.b0 b0Var = (hh.b0) pairA.second;
            o1 o1Var = new o1(i.a(filterInputStreamA, iQ, strV, mapB, b0Var != null ? b0Var.R().a(HttpHeaders.LAST_MODIFIED) : null), (hh.b0) pairA.second);
            Iterator it = ((List) pairA.first).iterator();
            while (it.hasNext()) {
                o1Var.f21333f.add((String) it.next());
            }
            return o1Var;
        } catch (b e10) {
            IAlog.b("%s cannot connect exception: %s", "OkHttpExecutorImpl", e10.getMessage());
            throw e10;
        } catch (Exception e11) {
            IAlog.b("%s exception: %s", "OkHttpExecutorImpl", e11.getMessage());
            throw e11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc A[Catch: all -> 0x0167, Exception -> 0x016a, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x016a, all -> 0x0167, blocks: (B:16:0x00a5, B:18:0x00b1, B:37:0x00e1, B:39:0x00eb, B:51:0x0134, B:29:0x00cc), top: B:79:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1 A[Catch: all -> 0x0167, Exception -> 0x016a, TRY_ENTER, TryCatch #5 {Exception -> 0x016a, all -> 0x0167, blocks: (B:16:0x00a5, B:18:0x00b1, B:37:0x00e1, B:39:0x00eb, B:51:0x0134, B:29:0x00cc), top: B:79:0x00a5 }] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.fyber.inneractive.sdk.network.t0] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair a(java.lang.String r11, com.fyber.inneractive.sdk.network.t0 r12, java.util.ArrayList r13, java.lang.String r14, java.lang.String r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.p1.a(java.lang.String, com.fyber.inneractive.sdk.network.t0, java.util.ArrayList, java.lang.String, java.lang.String):android.util.Pair");
    }

    public static FilterInputStream a(hh.b0 b0Var) {
        if (b0Var == null) {
            return null;
        }
        try {
            if (b0Var.m() == null) {
                return null;
            }
            return i.a(b0Var.m().byteStream(), TextUtils.equals("gzip", b0Var.R().a("content-encoding")));
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(z.a aVar, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        aVar.a(str, str2);
    }
}

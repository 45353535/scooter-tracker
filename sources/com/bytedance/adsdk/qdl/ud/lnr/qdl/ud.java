package com.bytedance.adsdk.qdl.ud.lnr.qdl;

import com.bytedance.adsdk.qdl.ud.ud.qdl.aaj;
import java.util.Deque;

/* JADX INFO: loaded from: classes6.dex */
public class ud extends mo {
    @Override // com.bytedance.adsdk.qdl.ud.lnr.qdl.mo
    public int qdl(String str, int i10, Deque<com.bytedance.adsdk.qdl.ud.ud.qdl> deque, com.bytedance.adsdk.qdl.ud.lnr.qdl qdlVar) {
        if ('\'' != qdl(i10, str)) {
            return qdlVar.qdl(str, i10, deque);
        }
        int i11 = i10 + 1;
        int length = str.length();
        int i12 = i11;
        while (i12 < length && qdl(i12, str) != '\'') {
            i12++;
        }
        if (qdl(i12, str) != '\'') {
            throw new com.bytedance.adsdk.qdl.qdl.qdl("String expression not surrounded by '", str.substring(i10));
        }
        deque.push(new aaj(str.substring(i11, i12)));
        return i12 + 1;
    }
}

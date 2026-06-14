package com.bytedance.adsdk.qdl.ud.lnr.qdl;

import java.util.Deque;

/* JADX INFO: loaded from: classes6.dex */
public class mzz extends mo {
    @Override // com.bytedance.adsdk.qdl.ud.lnr.qdl.mo
    public int qdl(String str, int i10, Deque<com.bytedance.adsdk.qdl.ud.ud.qdl> deque, com.bytedance.adsdk.qdl.ud.lnr.qdl qdlVar) {
        char cQdl;
        int i11 = i10;
        while (true) {
            cQdl = qdl(i11, str);
            if (!com.bytedance.adsdk.qdl.ud.mzz.qdl.ud(cQdl) && !com.bytedance.adsdk.qdl.ud.mzz.qdl.lnr(cQdl)) {
                break;
            }
            i11++;
        }
        if (cQdl != '(') {
            return qdlVar.qdl(str, i10, deque);
        }
        deque.push(new com.bytedance.adsdk.qdl.ud.ud.qdl.to(str.substring(i10, i11)));
        return i11 + 1;
    }
}

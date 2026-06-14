package com.bytedance.adsdk.qdl.ud.lnr.qdl;

import com.bytedance.adsdk.qdl.ud.ud.qdl.jyq;
import java.util.Deque;

/* JADX INFO: loaded from: classes6.dex */
public class mml extends mo {
    @Override // com.bytedance.adsdk.qdl.ud.lnr.qdl.mo
    public int qdl(String str, int i10, Deque<com.bytedance.adsdk.qdl.ud.ud.qdl> deque, com.bytedance.adsdk.qdl.ud.lnr.qdl qdlVar) {
        if ('(' != qdl(i10, str)) {
            return qdlVar.qdl(str, i10, deque);
        }
        deque.push(new jyq(com.bytedance.adsdk.qdl.ud.mml.mml.LEFT_PAREN));
        return i10 + 1;
    }
}

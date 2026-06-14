package com.bytedance.adsdk.qdl.ud.lnr.qdl;

import com.bytedance.adsdk.qdl.ud.ud.qdl.jtx;
import java.util.Deque;

/* JADX INFO: loaded from: classes6.dex */
public class jpc extends mo {
    @Override // com.bytedance.adsdk.qdl.ud.lnr.qdl.mo
    public int qdl(String str, int i10, Deque<com.bytedance.adsdk.qdl.ud.ud.qdl> deque, com.bytedance.adsdk.qdl.ud.lnr.qdl qdlVar) {
        if (!com.bytedance.adsdk.qdl.ud.mzz.qdl.mml(qdl(i10, str))) {
            return qdlVar.qdl(str, i10, deque);
        }
        int i11 = i10 + 1;
        String str2 = new String(new char[]{qdl(i10, str), qdl(i11, str)});
        if (com.bytedance.adsdk.qdl.ud.mml.lnr.qdl(str2) != null) {
            deque.push(new jtx(com.bytedance.adsdk.qdl.ud.mml.lnr.qdl(str2)));
            return i10 + 2;
        }
        String strValueOf = String.valueOf(qdl(i10, str));
        if (com.bytedance.adsdk.qdl.ud.mml.lnr.qdl(strValueOf) != null) {
            deque.push(new jtx(com.bytedance.adsdk.qdl.ud.mml.lnr.qdl(strValueOf)));
            return i11;
        }
        throw new IllegalArgumentException("Unrecognized:" + strValueOf + "examine:" + str.substring(0, i10));
    }
}

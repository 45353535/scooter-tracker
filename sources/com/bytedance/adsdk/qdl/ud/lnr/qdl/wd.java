package com.bytedance.adsdk.qdl.ud.lnr.qdl;

import com.bytedance.adsdk.qdl.ud.ud.qdl.bjy;
import java.util.Deque;

/* JADX INFO: loaded from: classes6.dex */
public class wd extends mo {
    private boolean qdl(String str, int i10, Deque<com.bytedance.adsdk.qdl.ud.ud.qdl> deque) {
        if ('-' != qdl(i10, str)) {
            return com.bytedance.adsdk.qdl.ud.mzz.qdl.lnr(qdl(i10, str));
        }
        if (deque.peek() != null && !com.bytedance.adsdk.qdl.ud.mml.lnr.qdl(deque.peek().qdl())) {
            return false;
        }
        if (com.bytedance.adsdk.qdl.ud.mzz.qdl.lnr(qdl(i10 + 1, str))) {
            return true;
        }
        throw new IllegalArgumentException("Unrecognized - symbol, not a negative number or operator, problem range:" + str.substring(0, i10));
    }

    @Override // com.bytedance.adsdk.qdl.ud.lnr.qdl.mo
    public int qdl(String str, int i10, Deque<com.bytedance.adsdk.qdl.ud.ud.qdl> deque, com.bytedance.adsdk.qdl.ud.lnr.qdl qdlVar) {
        char cQdl;
        if (!qdl(str, i10, deque)) {
            return qdlVar.qdl(str, i10, deque);
        }
        int i11 = qdl(i10, str) == '-' ? i10 + 1 : i10;
        boolean z10 = false;
        while (true) {
            cQdl = qdl(i11, str);
            if (!com.bytedance.adsdk.qdl.ud.mzz.qdl.lnr(cQdl) && (z10 || cQdl != '.')) {
                break;
            }
            i11++;
            if (cQdl == '.') {
                z10 = true;
            }
        }
        if (cQdl != '.') {
            deque.push(new bjy(str.substring(i10, i11)));
            return i11;
        }
        throw new IllegalArgumentException("Illegal negative number format, problem interval:" + str.substring(i10, i11));
    }
}

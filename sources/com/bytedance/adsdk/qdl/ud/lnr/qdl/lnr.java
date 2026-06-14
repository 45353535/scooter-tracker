package com.bytedance.adsdk.qdl.ud.lnr.qdl;

import com.bytedance.adsdk.qdl.ud.ud.qdl.oth;
import java.util.Deque;

/* JADX INFO: loaded from: classes6.dex */
public class lnr extends mo {
    @Override // com.bytedance.adsdk.qdl.ud.lnr.qdl.mo
    public int qdl(String str, int i10, Deque<com.bytedance.adsdk.qdl.ud.ud.qdl> deque, com.bytedance.adsdk.qdl.ud.lnr.qdl qdlVar) {
        char cQdl = qdl(i10, str);
        return (com.bytedance.adsdk.qdl.ud.mzz.qdl.ud(cQdl) || cQdl == '$') ? qdl(str, i10, deque) : qdlVar.qdl(str, i10, deque);
    }

    private int qdl(String str, int i10, Deque<com.bytedance.adsdk.qdl.ud.ud.qdl> deque) {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = i12 + i10;
            char cQdl = qdl(i11, str);
            if (!com.bytedance.adsdk.qdl.ud.mzz.qdl.ud(cQdl) && !com.bytedance.adsdk.qdl.ud.mzz.qdl.lnr(cQdl) && '.' != cQdl && '[' != cQdl && ']' != cQdl && '_' != cQdl && '$' != cQdl) {
                break;
            }
            i12++;
        }
        String strSubstring = str.substring(i10, i11);
        if (com.bytedance.adsdk.qdl.ud.mml.qdl.qdl(strSubstring) != null) {
            deque.push(new com.bytedance.adsdk.qdl.ud.ud.qdl.wd(strSubstring));
            return i11;
        }
        deque.push(new oth(strSubstring));
        return i11;
    }
}

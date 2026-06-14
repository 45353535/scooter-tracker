package com.bytedance.adsdk.qdl.ud.lnr.qdl;

import java.util.Deque;

/* JADX INFO: loaded from: classes6.dex */
public abstract class mo {
    protected char qdl(int i10, String str) {
        if (i10 >= str.length()) {
            return (char) 26;
        }
        return str.charAt(i10);
    }

    public abstract int qdl(String str, int i10, Deque<com.bytedance.adsdk.qdl.ud.ud.qdl> deque, com.bytedance.adsdk.qdl.ud.lnr.qdl qdlVar);

    protected int ud(int i10, String str) {
        while (com.bytedance.adsdk.qdl.ud.mzz.qdl.qdl(qdl(i10, str))) {
            i10++;
        }
        return i10;
    }
}

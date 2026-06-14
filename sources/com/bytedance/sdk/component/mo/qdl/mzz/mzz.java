package com.bytedance.sdk.component.mo.qdl.mzz;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public abstract class mzz implements Comparable<mzz>, Runnable {
    private String lnr;
    private int qdl = 5;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private String f16534ud = UUID.randomUUID().toString() + TokenBuilder.TOKEN_DELIMITER + String.valueOf(System.nanoTime());

    public mzz(String str) {
        this.lnr = str;
    }

    public void qdl(int i10) {
        this.qdl = i10;
    }

    public int qdl() {
        return this.qdl;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
    public int compareTo(mzz mzzVar) {
        if (qdl() < mzzVar.qdl()) {
            return 1;
        }
        return qdl() >= mzzVar.qdl() ? -1 : 0;
    }
}

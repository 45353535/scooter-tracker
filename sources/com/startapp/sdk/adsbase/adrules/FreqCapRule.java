package com.startapp.sdk.adsbase.adrules;

import com.startapp.sdk.internal.s;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class FreqCapRule extends AdRule implements Serializable {
    private static final long serialVersionUID = 1214675798271840648L;
    private int cap;
    private int time;

    public FreqCapRule() {
        super(true);
    }

    @Override // com.startapp.sdk.adsbase.adrules.AdRule
    public final boolean a(List list) {
        int size;
        if (list == null && this.cap > 0) {
            return true;
        }
        if (this.cap <= 0) {
            return false;
        }
        int i10 = this.time;
        if (i10 == 0) {
            return true;
        }
        if (i10 < 0) {
            size = list.size();
        } else {
            Iterator it = list.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                if (System.currentTimeMillis() - ((s) it.next()).f65231a <= TimeUnit.SECONDS.toMillis(this.time)) {
                    i11++;
                }
            }
            size = i11;
        }
        return size < this.cap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FreqCapRule freqCapRule = (FreqCapRule) obj;
            if (this.time == freqCapRule.time && this.cap == freqCapRule.cap) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {Integer.valueOf(this.time), Integer.valueOf(this.cap)};
        WeakHashMap weakHashMap = vi.f65408a;
        return Arrays.deepHashCode(objArr);
    }
}

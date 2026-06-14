package com.applovin.impl;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class uc {
    public static /* synthetic */ String a(CharSequence charSequence, Iterable iterable) {
        if (charSequence == null) {
            throw new NullPointerException("delimiter");
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append(charSequence);
            }
        }
        return sb2.toString();
    }
}

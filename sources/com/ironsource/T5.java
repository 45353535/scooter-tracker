package com.ironsource;

import androidx.lifecycle.ProcessLifecycleOwner;

/* JADX INFO: loaded from: classes8.dex */
public final class T5 implements F7 {
    @Override // com.ironsource.F7
    public boolean a() {
        try {
            ProcessLifecycleOwner.INSTANCE.get();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}

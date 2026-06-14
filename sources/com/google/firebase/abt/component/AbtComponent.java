package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.inject.Provider;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class AbtComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f31722a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f31723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f31724c;

    protected AbtComponent(Context context, Provider provider) {
        this.f31723b = context;
        this.f31724c = provider;
    }

    protected FirebaseABTesting a(String str) {
        return new FirebaseABTesting(this.f31723b, this.f31724c, str);
    }

    public synchronized FirebaseABTesting get(String str) {
        try {
            if (!this.f31722a.containsKey(str)) {
                this.f31722a.put(str, a(str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (FirebaseABTesting) this.f31722a.get(str);
    }
}

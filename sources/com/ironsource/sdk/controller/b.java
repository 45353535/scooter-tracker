package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* JADX INFO: loaded from: classes10.dex */
class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f45002b = "b";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v.r f45003a;

    b(v.r rVar) {
        this.f45003a = rVar;
    }

    synchronized void a(String str, String str2) throws Exception {
        if (this.f45003a == null) {
            Logger.e(f45002b, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = v.r.class.getDeclaredMethod(str, String.class);
        if (declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
            declaredMethod.invoke(this.f45003a, str2);
            return;
        }
        throw new AccessControlException("Trying to access a private function: " + str);
    }

    void b(String str) {
        v.r rVar = this.f45003a;
        if (rVar != null) {
            rVar.d(str);
        }
    }

    void a(String str) {
        v.r rVar = this.f45003a;
        if (rVar != null) {
            rVar.c(str);
        }
    }
}

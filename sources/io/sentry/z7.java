package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v7 f84515a;

    public z7(v7 v7Var) {
        this.f84515a = v7Var;
    }

    public List a(StackTraceElement[] stackTraceElementArr, boolean z10) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z10 || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    io.sentry.protocol.b0 b0Var = new io.sentry.protocol.b0();
                    b0Var.A(b(className));
                    b0Var.E(className);
                    b0Var.z(stackTraceElement.getMethodName());
                    b0Var.y(stackTraceElement.getFileName());
                    if (stackTraceElement.getLineNumber() >= 0) {
                        b0Var.C(Integer.valueOf(stackTraceElement.getLineNumber()));
                    }
                    b0Var.F(Boolean.valueOf(stackTraceElement.isNativeMethod()));
                    arrayList.add(b0Var);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public Boolean b(String str) {
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        Iterator<String> it = this.f84515a.getInAppIncludes().iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator<String> it2 = this.f84515a.getInAppExcludes().iterator();
        while (it2.hasNext()) {
            if (str.startsWith(it2.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }
}

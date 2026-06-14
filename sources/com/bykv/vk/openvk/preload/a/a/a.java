package com.bykv.vk.openvk.preload.a.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends Exception {
    public a(List<Throwable> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Throwable> it = list.iterator();
        while (it.hasNext()) {
            a(it.next(), arrayList);
        }
        setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]));
    }

    private static void a(Throwable th2, List<StackTraceElement> list) {
        while (th2 != null) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            int length = stackTrace.length;
            for (int i10 = 0; i10 < length; i10++) {
                StackTraceElement stackTraceElement = stackTrace[i10];
                if (i10 == 0) {
                    String message = th2.getMessage();
                    StringBuilder sb2 = new StringBuilder("\b\b\b\nCaused by:");
                    if (message == null) {
                        message = "";
                    }
                    sb2.append(message);
                    sb2.append("\n\t");
                    sb2.append(stackTraceElement.getClassName());
                    list.add(new StackTraceElement(sb2.toString(), stackTraceElement.getMethodName(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber()));
                } else {
                    list.add(stackTraceElement);
                }
            }
            th2 = th2.getCause();
        }
    }
}

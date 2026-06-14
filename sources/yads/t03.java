package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t03 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f116008a = SetsKt.setOf((Object[]) new String[]{"com.yandex.mobile.ads", "yads", "com.monetization.ads", "com.yandex.div"});

    public static boolean a(StackTraceElement stackTraceElement, Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((xl0) obj).f117862a == yl0.f118282b) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (StringsKt.g0(stackTraceElement.toString(), ((xl0) it.next()).f117863b, false, 2, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cb, code lost:
    
        r5 = (java.lang.StackTraceElement) kotlin.collections.ArraysKt.getOrNull(r10, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d1, code lost:
    
        if (r5 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d3, code lost:
    
        r5 = r5.getClassName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d7, code lost:
    
        if (r5 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0081, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.lang.StackTraceElement[] r10, java.util.Set r11) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.t03.a(java.lang.StackTraceElement[], java.util.Set):boolean");
    }
}

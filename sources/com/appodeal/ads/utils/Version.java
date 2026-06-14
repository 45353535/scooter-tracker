package com.appodeal.ads.utils;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes6.dex */
public class Version implements Comparable<Version> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f14957a;

    public Version(String str) {
        LinkedList linkedList;
        if (str == null) {
            linkedList = new LinkedList();
        } else {
            LinkedList linkedList2 = new LinkedList();
            for (String str2 : str.split("\\.")) {
                Collections.addAll(linkedList2, str2.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)"));
            }
            ListIterator listIterator = linkedList2.listIterator(linkedList2.size());
            while (listIterator.hasPrevious() && ((String) listIterator.previous()).matches("[0]+")) {
                listIterator.remove();
            }
            linkedList = linkedList2;
        }
        this.f14957a = linkedList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        if (r2 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r1 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
    
        if (r2 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        return 0;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(@androidx.annotation.NonNull com.appodeal.ads.utils.Version r8) {
        /*
            r7 = this;
            java.util.LinkedList r0 = r7.f14957a
            java.util.Iterator r0 = r0.iterator()
            java.util.LinkedList r8 = r8.f14957a
            java.util.Iterator r8 = r8.iterator()
        Lc:
            boolean r1 = r8.hasNext()
            r2 = 0
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r8.next()
            java.lang.String r1 = (java.lang.String) r1
            goto L1b
        L1a:
            r1 = r2
        L1b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L27
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
        L27:
            r3 = -1
            r4 = 1
            if (r2 == 0) goto L5b
            if (r1 == 0) goto L5b
            java.lang.String r5 = "\\d+"
            boolean r6 = r2.matches(r5)
            if (r6 == 0) goto L4c
            boolean r3 = r1.matches(r5)
            if (r3 == 0) goto L4b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r2.compareTo(r1)
            if (r1 != 0) goto L4a
            goto Lc
        L4a:
            return r1
        L4b:
            return r4
        L4c:
            boolean r4 = r1.matches(r5)
            if (r4 == 0) goto L53
            return r3
        L53:
            int r1 = r2.compareTo(r1)
            if (r1 != 0) goto L5a
            goto Lc
        L5a:
            return r1
        L5b:
            if (r2 != 0) goto L60
            if (r1 == 0) goto L60
            return r3
        L60:
            if (r2 == 0) goto L63
            return r4
        L63:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.utils.Version.compareTo(com.appodeal.ads.utils.Version):int");
    }
}

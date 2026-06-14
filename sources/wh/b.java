package wh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f108013a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0113, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x01b5, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005c, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a0, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int c(byte[] r19, int r20) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.b.c(byte[], int):int");
    }

    public static final void d(vh.h hVar, vh.e buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.write(hVar.m(), i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c10);
    }

    public static final char[] f() {
        return f108013a;
    }
}

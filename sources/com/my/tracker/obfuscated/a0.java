package com.my.tracker.obfuscated;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private z f61258a;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f61259a = a() ? 1 : 0;

        /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
        
            r3 = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(java.lang.String.format(java.util.Locale.US, "/proc/%d/mounts", java.lang.Integer.valueOf(android.os.Process.myPid())))));
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
        
            r1 = new java.lang.String[]{"/sbin/.magisk/", "/sbin/.core/mirror", "/sbin/.core/img", "/sbin/.core/db-0/magisk.db"};
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
        
            r4 = r3.readLine();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00cc, code lost:
        
            if (r4 == null) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00ce, code lost:
        
            r5 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
        
            if (r5 >= 4) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00d8, code lost:
        
            if (r4.contains(r1[r5]) == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00da, code lost:
        
            r3.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00de, code lost:
        
            r5 = r5 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00e0, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00e2, code lost:
        
            r3.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00e6, code lost:
        
            r5 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00e8, code lost:
        
            r5 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00eb, code lost:
        
            if (r5 != null) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00ed, code lost:
        
            r5.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00f0, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00f1, code lost:
        
            if (r5 != null) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00f3, code lost:
        
            r5.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00f6, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static boolean a() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 247
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.a0.a.a():boolean");
        }
    }

    private static Point b(Context context) {
        Display display;
        try {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
                return null;
            }
            Point point = new Point();
            display.getRealSize(point);
            return point;
        } catch (Throwable th2) {
            x2.a("DeviceParamsDataProvider: collecting screen size exception: ", th2);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(49:5|(2:117|6)|(50:8|121|9|(1:21)(3:13|115|14)|151|22|(2:24|25)(1:29)|26|145|34|35|135|38|39|143|42|(38:44|127|45|(1:47)(1:50)|51|52|53|58|(1:60)(1:61)|147|62|(33:64|141|65|137|66|133|67|68|69|149|80|81|82|125|85|86|89|129|90|(15:92|123|93|94|119|101|102|139|105|106|131|109|110|113|114)(12:99|119|101|102|139|105|106|131|109|110|113|114)|100|94|119|101|102|139|105|106|131|109|110|113|114)(25:78|149|80|81|82|125|85|86|89|129|90|(0)(0)|100|94|119|101|102|139|105|106|131|109|110|113|114)|79|69|149|80|81|82|125|85|86|89|129|90|(0)(0)|100|94|119|101|102|139|105|106|131|109|110|113|114)(32:56|58|(0)(0)|147|62|(0)(0)|79|69|149|80|81|82|125|85|86|89|129|90|(0)(0)|100|94|119|101|102|139|105|106|131|109|110|113|114)|57|53|58|(0)(0)|147|62|(0)(0)|79|69|149|80|81|82|125|85|86|89|129|90|(0)(0)|100|94|119|101|102|139|105|106|131|109|110|113|114)(43:32|145|34|35|135|38|39|143|42|(0)(0)|57|53|58|(0)(0)|147|62|(0)(0)|79|69|149|80|81|82|125|85|86|89|129|90|(0)(0)|100|94|119|101|102|139|105|106|131|109|110|113|114)|20|33|29|26|145|34|35|135|38|39|143|42|(0)(0)|57|53|58|(0)(0)|147|62|(0)(0)|79|69|149|80|81|82|125|85|86|89|129|90|(0)(0)|100|94|119|101|102|139|105|106|131|109|110|113|114) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0184, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0185, code lost:
    
        com.my.tracker.obfuscated.x2.a("DeviceParamsDataProvider: collecting lang exception: ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0198, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0199, code lost:
    
        com.my.tracker.obfuscated.x2.a("DeviceParamsDataProvider: collecting touchscreen info exception: ", r0);
        r32 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01af, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01b0, code lost:
    
        com.my.tracker.obfuscated.x2.a("DeviceParamsDataProvider: collecting ui mode info exception: ", r0);
        r33 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
    
        com.my.tracker.obfuscated.x2.a("DeviceParamsDataProvider: collecting packageName exception: ", r0);
        r9 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0093, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
    
        com.my.tracker.obfuscated.x2.a("DeviceParamsDataProvider: collecting app lang exception: ", r0);
        r15 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ba, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00fd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00fe, code lost:
    
        r5 = Float.NaN;
        r6 = Float.NaN;
        r14 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x013f, code lost:
    
        com.my.tracker.obfuscated.x2.a("DeviceParamsDataProvider: collecting timezone exception: ", r0);
        r20 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x014d, code lost:
    
        com.my.tracker.obfuscated.x2.a("DeviceParamsDataProvider: collecting isRooted exception: ", r0);
        r27 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x016d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x016e, code lost:
    
        r30 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0 A[Catch: all -> 0x00b9, TRY_LEAVE, TryCatch #14 {all -> 0x00b9, blocks: (B:42:0x009a, B:44:0x00a0), top: B:143:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e3 A[Catch: all -> 0x00fd, TRY_LEAVE, TryCatch #16 {all -> 0x00fd, blocks: (B:62:0x00d9, B:64:0x00e3), top: B:147:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015c A[Catch: all -> 0x016d, TRY_LEAVE, TryCatch #7 {all -> 0x016d, blocks: (B:90:0x0156, B:92:0x015c), top: B:129:0x0156 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0171  */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [int] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.my.tracker.obfuscated.z a(android.content.Context r37) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.a0.a(android.content.Context):com.my.tracker.obfuscated.z");
    }
}

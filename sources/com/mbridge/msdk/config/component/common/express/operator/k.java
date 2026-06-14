package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f46736b = Arrays.asList("mathabs", "mathCeil", "mathFloor", "mathRound", "mathPow", "mathSqrt", "mathAtan2", "randomNumber");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f46737a;

    public k(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f46737a = cVar;
    }

    private Object a(double d10) {
        return (Double.isNaN(d10) || Double.isInfinite(d10)) ? Double.valueOf(d10) : d10 == Math.floor(d10) ? Integer.valueOf((int) d10) : Double.valueOf(b(d10));
    }

    private double b(double d10) {
        return new BigDecimal(d10).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:116)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:71)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088 A[Catch: Exception -> 0x0091, TryCatch #4 {Exception -> 0x0091, blocks: (B:43:0x0080, B:44:0x0084, B:73:0x00db, B:74:0x00de, B:78:0x00e7, B:80:0x00fc, B:83:0x0103, B:84:0x0110, B:86:0x0115, B:89:0x0124, B:90:0x0131, B:92:0x0136, B:94:0x0144, B:96:0x0151, B:98:0x015e, B:46:0x0088, B:51:0x0094, B:54:0x009e, B:57:0x00a8, B:60:0x00b2, B:63:0x00bc, B:66:0x00c6, B:69:0x00d0), top: B:110:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094 A[Catch: Exception -> 0x0091, TryCatch #4 {Exception -> 0x0091, blocks: (B:43:0x0080, B:44:0x0084, B:73:0x00db, B:74:0x00de, B:78:0x00e7, B:80:0x00fc, B:83:0x0103, B:84:0x0110, B:86:0x0115, B:89:0x0124, B:90:0x0131, B:92:0x0136, B:94:0x0144, B:96:0x0151, B:98:0x015e, B:46:0x0088, B:51:0x0094, B:54:0x009e, B:57:0x00a8, B:60:0x00b2, B:63:0x00bc, B:66:0x00c6, B:69:0x00d0), top: B:110:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e A[Catch: Exception -> 0x0091, TryCatch #4 {Exception -> 0x0091, blocks: (B:43:0x0080, B:44:0x0084, B:73:0x00db, B:74:0x00de, B:78:0x00e7, B:80:0x00fc, B:83:0x0103, B:84:0x0110, B:86:0x0115, B:89:0x0124, B:90:0x0131, B:92:0x0136, B:94:0x0144, B:96:0x0151, B:98:0x015e, B:46:0x0088, B:51:0x0094, B:54:0x009e, B:57:0x00a8, B:60:0x00b2, B:63:0x00bc, B:66:0x00c6, B:69:0x00d0), top: B:110:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8 A[Catch: Exception -> 0x0091, TryCatch #4 {Exception -> 0x0091, blocks: (B:43:0x0080, B:44:0x0084, B:73:0x00db, B:74:0x00de, B:78:0x00e7, B:80:0x00fc, B:83:0x0103, B:84:0x0110, B:86:0x0115, B:89:0x0124, B:90:0x0131, B:92:0x0136, B:94:0x0144, B:96:0x0151, B:98:0x015e, B:46:0x0088, B:51:0x0094, B:54:0x009e, B:57:0x00a8, B:60:0x00b2, B:63:0x00bc, B:66:0x00c6, B:69:0x00d0), top: B:110:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2 A[Catch: Exception -> 0x0091, TryCatch #4 {Exception -> 0x0091, blocks: (B:43:0x0080, B:44:0x0084, B:73:0x00db, B:74:0x00de, B:78:0x00e7, B:80:0x00fc, B:83:0x0103, B:84:0x0110, B:86:0x0115, B:89:0x0124, B:90:0x0131, B:92:0x0136, B:94:0x0144, B:96:0x0151, B:98:0x015e, B:46:0x0088, B:51:0x0094, B:54:0x009e, B:57:0x00a8, B:60:0x00b2, B:63:0x00bc, B:66:0x00c6, B:69:0x00d0), top: B:110:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bc A[Catch: Exception -> 0x0091, TryCatch #4 {Exception -> 0x0091, blocks: (B:43:0x0080, B:44:0x0084, B:73:0x00db, B:74:0x00de, B:78:0x00e7, B:80:0x00fc, B:83:0x0103, B:84:0x0110, B:86:0x0115, B:89:0x0124, B:90:0x0131, B:92:0x0136, B:94:0x0144, B:96:0x0151, B:98:0x015e, B:46:0x0088, B:51:0x0094, B:54:0x009e, B:57:0x00a8, B:60:0x00b2, B:63:0x00bc, B:66:0x00c6, B:69:0x00d0), top: B:110:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c6 A[Catch: Exception -> 0x0091, TryCatch #4 {Exception -> 0x0091, blocks: (B:43:0x0080, B:44:0x0084, B:73:0x00db, B:74:0x00de, B:78:0x00e7, B:80:0x00fc, B:83:0x0103, B:84:0x0110, B:86:0x0115, B:89:0x0124, B:90:0x0131, B:92:0x0136, B:94:0x0144, B:96:0x0151, B:98:0x015e, B:46:0x0088, B:51:0x0094, B:54:0x009e, B:57:0x00a8, B:60:0x00b2, B:63:0x00bc, B:66:0x00c6, B:69:0x00d0), top: B:110:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0 A[Catch: Exception -> 0x0091, TryCatch #4 {Exception -> 0x0091, blocks: (B:43:0x0080, B:44:0x0084, B:73:0x00db, B:74:0x00de, B:78:0x00e7, B:80:0x00fc, B:83:0x0103, B:84:0x0110, B:86:0x0115, B:89:0x0124, B:90:0x0131, B:92:0x0136, B:94:0x0144, B:96:0x0151, B:98:0x015e, B:46:0x0088, B:51:0x0094, B:54:0x009e, B:57:0x00a8, B:60:0x00b2, B:63:0x00bc, B:66:0x00c6, B:69:0x00d0), top: B:110:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00de A[Catch: Exception -> 0x0091, TryCatch #4 {Exception -> 0x0091, blocks: (B:43:0x0080, B:44:0x0084, B:73:0x00db, B:74:0x00de, B:78:0x00e7, B:80:0x00fc, B:83:0x0103, B:84:0x0110, B:86:0x0115, B:89:0x0124, B:90:0x0131, B:92:0x0136, B:94:0x0144, B:96:0x0151, B:98:0x015e, B:46:0x0088, B:51:0x0094, B:54:0x009e, B:57:0x00a8, B:60:0x00b2, B:63:0x00bc, B:66:0x00c6, B:69:0x00d0), top: B:110:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0115 A[Catch: Exception -> 0x0091, TryCatch #4 {Exception -> 0x0091, blocks: (B:43:0x0080, B:44:0x0084, B:73:0x00db, B:74:0x00de, B:78:0x00e7, B:80:0x00fc, B:83:0x0103, B:84:0x0110, B:86:0x0115, B:89:0x0124, B:90:0x0131, B:92:0x0136, B:94:0x0144, B:96:0x0151, B:98:0x015e, B:46:0x0088, B:51:0x0094, B:54:0x009e, B:57:0x00a8, B:60:0x00b2, B:63:0x00bc, B:66:0x00c6, B:69:0x00d0), top: B:110:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0136 A[Catch: Exception -> 0x0091, TryCatch #4 {Exception -> 0x0091, blocks: (B:43:0x0080, B:44:0x0084, B:73:0x00db, B:74:0x00de, B:78:0x00e7, B:80:0x00fc, B:83:0x0103, B:84:0x0110, B:86:0x0115, B:89:0x0124, B:90:0x0131, B:92:0x0136, B:94:0x0144, B:96:0x0151, B:98:0x015e, B:46:0x0088, B:51:0x0094, B:54:0x009e, B:57:0x00a8, B:60:0x00b2, B:63:0x00bc, B:66:0x00c6, B:69:0x00d0), top: B:110:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0144 A[Catch: Exception -> 0x0091, TryCatch #4 {Exception -> 0x0091, blocks: (B:43:0x0080, B:44:0x0084, B:73:0x00db, B:74:0x00de, B:78:0x00e7, B:80:0x00fc, B:83:0x0103, B:84:0x0110, B:86:0x0115, B:89:0x0124, B:90:0x0131, B:92:0x0136, B:94:0x0144, B:96:0x0151, B:98:0x015e, B:46:0x0088, B:51:0x0094, B:54:0x009e, B:57:0x00a8, B:60:0x00b2, B:63:0x00bc, B:66:0x00c6, B:69:0x00d0), top: B:110:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0151 A[Catch: Exception -> 0x0091, TryCatch #4 {Exception -> 0x0091, blocks: (B:43:0x0080, B:44:0x0084, B:73:0x00db, B:74:0x00de, B:78:0x00e7, B:80:0x00fc, B:83:0x0103, B:84:0x0110, B:86:0x0115, B:89:0x0124, B:90:0x0131, B:92:0x0136, B:94:0x0144, B:96:0x0151, B:98:0x015e, B:46:0x0088, B:51:0x0094, B:54:0x009e, B:57:0x00a8, B:60:0x00b2, B:63:0x00bc, B:66:0x00c6, B:69:0x00d0), top: B:110:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015e A[Catch: Exception -> 0x0091, TRY_LEAVE, TryCatch #4 {Exception -> 0x0091, blocks: (B:43:0x0080, B:44:0x0084, B:73:0x00db, B:74:0x00de, B:78:0x00e7, B:80:0x00fc, B:83:0x0103, B:84:0x0110, B:86:0x0115, B:89:0x0124, B:90:0x0131, B:92:0x0136, B:94:0x0144, B:96:0x0151, B:98:0x015e, B:46:0x0088, B:51:0x0094, B:54:0x009e, B:57:0x00a8, B:60:0x00b2, B:63:0x00bc, B:66:0x00c6, B:69:0x00d0), top: B:110:0x0080 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(java.lang.String r12, java.lang.Object r13, java.util.List<java.lang.Object> r14) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.k.b(java.lang.String, java.lang.Object, java.util.List):com.mbridge.msdk.config.component.common.express.operator.parts.a");
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        Iterator<String> it = f46736b.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return b(str, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }
}

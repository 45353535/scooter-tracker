package com.appsflyer.internal;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class AFa1jSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    public static final Map AFInAppEventType;
    private static long afDebugLog;
    private static int afErrorLog;
    private static byte[] afErrorLogForExcManagerOnly;
    private static int afInfoLog;
    private static int afRDLog;
    private static int afWarnLog;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static byte[] f15585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static byte[] f15586e;
    private static long force;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Object f15587i;
    public static final Map unregisterClient;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static long f15588v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static Object f15589w;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[PHI: r0 r2 r7 r8 r9
  0x0028: PHI (r0v4 byte[]) = (r0v3 byte[]), (r0v12 byte[]) binds: [B:9:0x0026, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r2v1 byte[]) = (r2v0 byte[]), (r2v9 byte[]) binds: [B:9:0x0026, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r7v2 int) = (r7v1 int), (r7v11 int) binds: [B:9:0x0026, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r8v2 int) = (r8v1 int), (r8v15 int) binds: [B:9:0x0026, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r9v2 int) = (r9v1 int), (r9v11 int) binds: [B:9:0x0026, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a A[PHI: r0 r2 r7 r8 r9
  0x001a: PHI (r0v11 byte[]) = (r0v3 byte[]), (r0v12 byte[]) binds: [B:9:0x0026, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x001a: PHI (r2v8 byte[]) = (r2v0 byte[]), (r2v9 byte[]) binds: [B:9:0x0026, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x001a: PHI (r7v10 int) = (r7v1 int), (r7v11 int) binds: [B:9:0x0026, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x001a: PHI (r8v14 int) = (r8v1 int), (r8v15 int) binds: [B:9:0x0026, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x001a: PHI (r9v10 int) = (r9v1 int), (r9v11 int) binds: [B:9:0x0026, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r7, short r8, int r9) {
        /*
            int r0 = com.appsflyer.internal.AFa1jSDK.$13
            int r0 = r0 + 57
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1jSDK.$12 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L1c
            int r7 = 13 - r7
            int r9 = r9 + 4
            int r8 = r8 + 68
            byte[] r0 = com.appsflyer.internal.AFa1jSDK.$$a
            byte[] r2 = new byte[r8]
            if (r0 != 0) goto L1a
            goto L28
        L1a:
            r3 = r1
            goto L2e
        L1c:
            int r7 = 119 - r7
            int r9 = r9 + 4
            int r8 = r8 + 1
            byte[] r0 = com.appsflyer.internal.AFa1jSDK.$$a
            byte[] r2 = new byte[r8]
            if (r0 != 0) goto L1a
        L28:
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L45
        L2e:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r2[r3] = r5
            int r9 = r9 + 1
            if (r4 != r8) goto L3d
            java.lang.String r7 = new java.lang.String
            r7.<init>(r2, r1)
            return r7
        L3d:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r2
            r2 = r0
            r0 = r6
        L45:
            int r7 = r7 + r8
            int r7 = r7 + (-3)
            int r8 = com.appsflyer.internal.AFa1jSDK.$12
            int r8 = r8 + 47
            int r8 = r8 % 128
            com.appsflyer.internal.AFa1jSDK.$13 = r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1jSDK.$$c(short, short, int):java.lang.String");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    static {
        /*
            Method dump skipped, instruction units count: 7682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1jSDK.<clinit>():void");
    }

    private AFa1jSDK() {
    }

    public static Object AFAdRevenueData(int i10, char c10, int i11) throws Throwable {
        int i12 = $10;
        int i13 = (i12 & 115) + (i12 | 115);
        int i14 = i13 % 128;
        $11 = i14;
        if (i13 % 2 == 0) {
            throw null;
        }
        Object obj = f15589w;
        $10 = (((i14 | 113) << 1) - (i14 ^ 113)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i10), Character.valueOf(c10), Integer.valueOf(i11)};
            byte[] bArr = $$a;
            byte b10 = bArr[84];
            byte b11 = bArr[488];
            Class<?> cls = Class.forName($$c(b10, b11, (short) ((b11 ^ Ascii.DC2) | (b11 & Ascii.DC2))), true, (ClassLoader) f15587i);
            byte b12 = bArr[4];
            byte b13 = bArr[49];
            int i15 = $$b;
            String str$$c = $$c(b12, b13, (short) ((i15 & 1097) | (i15 ^ 1097)));
            Class<?> cls2 = Integer.TYPE;
            Object objInvoke = cls.getMethod(str$$c, cls2, Character.TYPE, cls2).invoke(obj, objArr);
            int i16 = $11;
            $10 = (((i16 | 81) << 1) - (i16 ^ 81)) % 128;
            return objInvoke;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static int getMediationNetwork(int i10) throws Throwable {
        int i11 = $11;
        int i12 = (i11 & 117) + (i11 | 117);
        int i13 = i12 % 128;
        $10 = i13;
        if (i12 % 2 != 0) {
            throw null;
        }
        Object obj = f15589w;
        $11 = (i13 + 101) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i10)};
            byte[] bArr = $$a;
            byte b10 = bArr[84];
            byte b11 = bArr[488];
            Class<?> cls = Class.forName($$c(b10, b11, (short) ((b11 ^ Ascii.DC2) | (b11 & Ascii.DC2))), true, (ClassLoader) f15587i);
            byte b12 = bArr[4];
            byte b13 = bArr[14];
            int iIntValue = ((Integer) cls.getMethod($$c(b12, b13, (short) (b13 | SignedBytes.MAX_POWER_OF_TWO)), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i14 = $10 + 77;
            $11 = i14 % 128;
            if (i14 % 2 != 0) {
                return iIntValue;
            }
            throw null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static int getMonetizationNetwork(Object obj) throws Throwable {
        int i10 = $11;
        int i11 = (i10 & 7) + (i10 | 7);
        int i12 = i11 % 128;
        $10 = i12;
        if (i11 % 2 != 0) {
            throw null;
        }
        Object obj2 = f15589w;
        $11 = ((i12 & 71) + (i12 | 71)) % 128;
        try {
            Object[] objArr = {obj};
            byte[] bArr = $$a;
            byte b10 = bArr[84];
            byte b11 = bArr[488];
            int iIntValue = ((Integer) Class.forName($$c(b10, b11, (short) (b11 | Ascii.DC2)), true, (ClassLoader) f15587i).getMethod($$c(bArr[62], bArr[12], (short) 1152), Object.class).invoke(obj2, objArr)).intValue();
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i13 = ~iCurrentTimeMillis;
            int i14 = ~((i13 & (-1521606923)) | ((-1521606923) ^ i13));
            int i15 = ~iCurrentTimeMillis;
            int i16 = 1550969792 + (((i14 & (-864216280)) | ((-864216280) ^ i14)) * (-933)) + (((~((i15 & (-864216280)) | ((-864216280) ^ i15))) | 553780437) * 933);
            int i17 = ((i16 | 693843616) << 1) - (693843616 ^ i16);
            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
            int i18 = (~(((-214422119) & iCurrentTimeMillis2) | ((-214422119) ^ iCurrentTimeMillis2))) | 134664224;
            int i19 = ~iCurrentTimeMillis2;
            int i20 = (i19 ^ 689370536) | (i19 & 689370536);
            int i21 = ~(i20 | 214422118);
            int i22 = 1698234858 + (((i18 & i21) | (i18 ^ i21)) * 886);
            int i23 = ~((i19 & 214422118) | (i19 ^ 214422118));
            int i24 = ((i23 & 689370536) | (689370536 ^ i23)) * (-1772);
            int i25 = ((i22 | i24) << 1) - (i24 ^ i22);
            int i26 = -(-((~i20) * 886));
            if (i17 > (i25 & i26) + (i25 | i26)) {
                int i27 = 0 / 0;
            }
            return iIntValue;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    static void init$0() {
        $11 = ($10 + 85) % 128;
        byte[] bArr = new byte[1171];
        System.arraycopy("\bâ\u001cã\u0010ù\u0011\u0000ýþÍ<\u000eò\u0012û\u0004ý\u0013¾\u0018/\u0000\u0006\u0006ö\u0002\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001eÓ5óô\n\u000b\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0001\u0012Õ&\u0006ü\u0011Ô(\f\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\u0001\u0012Ò!\u0005\b\u0000â(\f8\u0000\u0016ðÑ8\u0000\u0016ðÑú\u0018îÐ>\tÂ\u001b&\u0006üú\u0018îÐ>\tÂIü\u0006÷\b\fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ô\n\u0017í\b\t\u0001\u0010ì\u001eú\u000eôî\tí\u000bú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\f\u0006\u0007õî\u0006ð\u000b5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u00057\u0004Ñ5Î\u00025Ú+\u0006\u0005\u0001\u0000\u0006Ø+Ï\u0001\u0012á\u0016\u0011ÿ\t\u0000ô\u0005ú\u0018îÐCú\u0012½*\u0000ý\u0001\u0012ß\u0014\u0016÷ú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000föÿ\u0006å2ú\u0003\u0010ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b(É?éô\n\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b\u001eÓ5óô\n\u000b\u0003\u0001\u0012Ü\u001b\u0002\bû\u0016ø\t\u0002ã\u001a\u0012\u0006û\u0006üû\u0001\nöÿ\u0006õ\u0012á\u0016ÿ\u0006î\"\u0001\u0010î\u0007ï\u000bþú\u000eô\u0001\u0012Õ\u0001ú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006\tøø\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u0006õ\u0006ã$\u0016\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0004\nü\u0012ô\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nÜ(\u0005\b\u0002â$\u0001öÿ\u000f\u0001\u0012Ý\u001a\u0016ÿÔ,\t\u0001\nú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nØ,\t\u0001\n\u0001\u0012â\u0019\u0014îú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000fþÖ:þôß4\u0003ò\u001bú\u0018îÐ>\tÂ\u0018,\u0006\u0007õÿ\u0004\rü\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010ú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010þò\u0012\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ô\u0016÷ç \r\u0004ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\u0001\u0012Ò/\u0001\u0006\u0002\u0002ú\f\tã(úøî\u000bë\u000b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001eÓ<ìô\nÜH5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\f\u00001\u0002\u0005\u0001Øý7Ð\u0005\u00007×-Ô1Îî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸\u0001\u0012Ò5\u0000\u0003ö\fø\u0019Ó-ÿÈ\u0001\u0002\t\u000f/ø\u0004\bþ&ñ\u0016\u0014ò\f\nóâ \u0016ð".getBytes("ISO-8859-1"), 0, bArr, 0, 1171);
        $$a = bArr;
        $$b = 34;
        int i10 = $10 + 115;
        $11 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    private static void getMonetizationNetwork(int i10, int i11) {
        int i12 = $10;
        int i13 = (i12 & 55) + (i12 | 55);
        $11 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }
}

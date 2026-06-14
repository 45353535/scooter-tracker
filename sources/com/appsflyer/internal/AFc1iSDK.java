package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class AFc1iSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int areAllFieldsValid = 1;
    private static int getMediationNetwork;
    private static long getMonetizationNetwork;
    private static int getRevenue;
    private final Map<String, Object> AFAdRevenueData;
    private final Context getCurrencyIso4217Code;

    @VisibleForTesting
    public static class AFa1zSDK {
        static byte[] AFAdRevenueData(@NonNull byte[] bArr) throws Exception {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                bArr[i10] = (byte) (bArr[i10] ^ ((i10 % 2) + 42));
            }
            return bArr;
        }

        @NonNull
        static byte[] getMonetizationNetwork(@NonNull String str) throws Exception {
            return str.getBytes(Charset.defaultCharset());
        }
    }

    static {
        AFAdRevenueData();
        PointF.length(0.0f, 0.0f);
        ExpandableListView.getPackedPositionChild(0L);
        ViewConfiguration.getZoomControlsTimeout();
        ViewConfiguration.getScrollDefaultDelay();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        ImageFormat.getBitsPerPixel(0);
        ViewConfiguration.getFadingEdgeLength();
        SystemClock.currentThreadTimeMillis();
        KeyEvent.getModifierMetaStateMask();
        ViewConfiguration.getTouchSlop();
        ViewConfiguration.getScrollBarSize();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        ViewConfiguration.getScrollFriction();
        Process.myPid();
        View.resolveSizeAndState(0, 0, 0);
        ExpandableListView.getPackedPositionChild(0L);
        ViewConfiguration.getFadingEdgeLength();
        ViewConfiguration.getTapTimeout();
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        int i10 = areAllFieldsValid + 19;
        getRevenue = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @WorkerThread
    public AFc1iSDK(Map<String, Object> map, Context context) {
        this.AFAdRevenueData = map;
        this.getCurrencyIso4217Code = context;
        put(getMediationNetwork(), getMonetizationNetwork());
    }

    static void AFAdRevenueData() {
        getMediationNetwork = -33994396;
        getMonetizationNetwork = 8254201675162375375L;
    }

    private static void a(String str, int i10, int i11, int i12, boolean z10, Object[] objArr) {
        Object charArray = str;
        if (str != null) {
            int i13 = $10 + 15;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1cSDK aFk1cSDK = new AFk1cSDK();
        char[] cArr2 = new char[i11];
        aFk1cSDK.getMonetizationNetwork = 0;
        while (true) {
            int i14 = aFk1cSDK.getMonetizationNetwork;
            if (i14 >= i11) {
                break;
            }
            $10 = ($11 + 45) % 128;
            char c10 = cArr[i14];
            aFk1cSDK.AFAdRevenueData = c10;
            char c11 = (char) (c10 + i12);
            cArr2[i14] = c11;
            cArr2[i14] = (char) (c11 - ((int) (((long) getMediationNetwork) ^ (-1147347204026316506L))));
            aFk1cSDK.getMonetizationNetwork = i14 + 1;
        }
        if (i10 > 0) {
            $10 = ($11 + 43) % 128;
            aFk1cSDK.getCurrencyIso4217Code = i10;
            char[] cArr3 = new char[i11];
            System.arraycopy(cArr2, 0, cArr3, 0, i11);
            int i15 = aFk1cSDK.getCurrencyIso4217Code;
            System.arraycopy(cArr3, 0, cArr2, i11 - i15, i15);
            int i16 = aFk1cSDK.getCurrencyIso4217Code;
            System.arraycopy(cArr3, i16, cArr2, 0, i11 - i16);
        }
        if (z10) {
            char[] cArr4 = new char[i11];
            aFk1cSDK.getMonetizationNetwork = 0;
            while (true) {
                int i17 = aFk1cSDK.getMonetizationNetwork;
                if (i17 >= i11) {
                    break;
                }
                cArr4[i17] = cArr2[(i11 - i17) - 1];
                aFk1cSDK.getMonetizationNetwork = i17 + 1;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void b(String str, int i10, Object[] objArr) {
        char[] charArray;
        int i11 = $10;
        $11 = (i11 + 27) % 128;
        Object obj = str;
        if (str != null) {
            int i12 = i11 + 97;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 74 / 0;
                charArray = str.toCharArray();
            } else {
                charArray = str.toCharArray();
            }
            $11 = ($10 + 9) % 128;
            obj = charArray;
        }
        AFk1gSDK aFk1gSDK = new AFk1gSDK();
        char[] currencyIso4217Code = AFk1gSDK.getCurrencyIso4217Code(getMonetizationNetwork ^ 7975055078221964256L, (char[]) obj, i10);
        aFk1gSDK.getCurrencyIso4217Code = 4;
        while (true) {
            int i14 = aFk1gSDK.getCurrencyIso4217Code;
            if (i14 >= currencyIso4217Code.length) {
                objArr[0] = new String(currencyIso4217Code, 4, currencyIso4217Code.length - 4);
                return;
            }
            $11 = ($10 + 23) % 128;
            aFk1gSDK.getMediationNetwork = i14 - 4;
            currencyIso4217Code[i14] = (char) (((long) (currencyIso4217Code[i14] ^ currencyIso4217Code[i14 % 4])) ^ (((long) r3) * (getMonetizationNetwork ^ 7975055078221964256L)));
            aFk1gSDK.getCurrencyIso4217Code = i14 + 1;
        }
    }

    @VisibleForTesting
    private static StringBuilder getCurrencyIso4217Code(@NonNull String... strArr) throws Exception {
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        for (int i10 = 0; i10 < 3; i10++) {
            arrayList.add(Integer.valueOf(strArr[i10].length()));
        }
        Collections.sort(arrayList);
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < iIntValue; i11++) {
            Integer numValueOf = null;
            for (int i12 = 0; i12 < 3; i12++) {
                getRevenue = (areAllFieldsValid + 57) % 128;
                int iCharAt = strArr[i12].charAt(i11);
                if (numValueOf == null) {
                    int i13 = areAllFieldsValid + 69;
                    getRevenue = i13 % 128;
                    if (i13 % 2 != 0) {
                        throw null;
                    }
                } else {
                    iCharAt ^= numValueOf.intValue();
                }
                numValueOf = Integer.valueOf(iCharAt);
            }
            sb2.append(Integer.toHexString(numValueOf.intValue()));
        }
        return sb2;
    }

    @NonNull
    private String getMediationNetwork() {
        try {
            String string = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.AFAdRevenueData;
            Object[] objArr = new Object[1];
            a("\n\ufff7\u0003\u0006\ufff7￼\ufff5\n\uffff\u0003\ufffb\t", ExpandableListView.getPackedPositionGroup(0L) + 4, 11 - ExpandableListView.getPackedPositionChild(0L), TextUtils.getCapsMode("", 0, 0) + 172, false, objArr);
            String string2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.AFAdRevenueData;
            Object[] objArr2 = new Object[1];
            a("\ufffa\u000b\ufffb�\u0007", 3 - View.MeasureSpec.makeMeasureSpec(0, 0), 5 - Color.blue(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 169, true, objArr2);
            String string3 = map2.get(((String) objArr2[0]).intern()).toString();
            if (string3 == null) {
                Object[] objArr3 = new Object[1];
                a("\u0003\u0002\ufff8\u0002\ufff5\u0006\ufff6\u0013", TextUtils.indexOf("", "") + 2, 8 - (ViewConfiguration.getTapTimeout() >> 16), 142 - Drawable.resolveOpacity(0, 0), true, objArr3);
                string3 = ((String) objArr3[0]).intern();
            }
            StringBuilder sb2 = new StringBuilder(string2);
            sb2.reverse();
            StringBuilder currencyIso4217Code = getCurrencyIso4217Code(string, string3, sb2.toString());
            int length = currencyIso4217Code.length();
            if (length > 4) {
                int i10 = areAllFieldsValid + 97;
                getRevenue = i10 % 128;
                int i11 = i10 % 2;
                currencyIso4217Code.delete(4, length);
            } else {
                while (length < 4) {
                    getRevenue = (areAllFieldsValid + 89) % 128;
                    length++;
                    currencyIso4217Code.append('1');
                }
            }
            Object[] objArr4 = new Object[1];
            b("퍵ƅ哆鈷팞뛏㫾", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr4);
            currencyIso4217Code.insert(0, ((String) objArr4[0]).intern());
            return currencyIso4217Code.toString();
        } catch (Exception e10) {
            Object[] objArr5 = new Object[1];
            b("쬇\udc3a\uf4e9ꃕ쬧歲髒蔬\u17ed俣뾸ꋹ爆경퍙羱嵚鄵\uf01e᭰맗\uf642ᗂ㣆蓎\uda93䪂햘\ue706㿃湈\uf100쉈ᰌ茍蹄⺌䅐ꂮꮘ৬ꖘ쑧䢔", -((byte) KeyEvent.getModifierMetaStateMask()), objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e10);
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            b("╨鳵다턗┎⮻\udcd3\uf4f6鈴ེ吏팹鱵\uec3c镗\u0e60댽퇢똟檸埿뛊叁䤏檢騎ಅꑋॹ罂⡕肋ⰸ峎앆ￃ샰ƙ\ue6bf\uda0a\ue780\ue557艱㥐먊쩒", -((byte) KeyEvent.getModifierMetaStateMask()), objArr6);
            sb3.append(((String) objArr6[0]).intern());
            sb3.append(e10);
            AFLogger.afRDLog(sb3.toString());
            Object[] objArr7 = new Object[1];
            b("쁃w\uf497꜍쀨뜽骯芹᳆鎥뾴", Drawable.resolveOpacity(0, 0) + 1, objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0397 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0398  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String getMonetizationNetwork() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 921
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1iSDK.getMonetizationNetwork():java.lang.String");
    }
}

package com.adjust.sdk.sig;

import android.content.Context;
import android.util.Log;
import com.adjust.sdk.purchase.ADJPConstants;
import com.google.common.base.Ascii;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.security.InvalidKeyException;
import java.security.UnrecoverableKeyException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f7207a;

    public static void a(Set set, Map map, Map map2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (map.containsKey(str)) {
                map2.put(str, (String) map.get(str));
            }
        }
    }

    public static void a(Context context, c cVar, a aVar, Map map, String str, String str2) throws Exception {
        byte[] bArrA;
        if (f7207a) {
            Log.e("SignerInstance", "sign: library received error. It has locked down");
            return;
        }
        if (map == null || map.size() == 0 || str == null || str2 == null) {
            Log.e("SignerInstance", "sign: One or more parameters are null");
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        boolean zEquals = "sandbox".equals(map.get(ADJPConstants.KEY_ENVIRONMENT));
        if (zEquals) {
            Log.v("SignerInstance", "Signing all the parameters begin: " + simpleDateFormat.format(new Date(System.currentTimeMillis())));
        }
        map.put("activity_kind", str);
        map.put("client_sdk", str2);
        int i10 = 2;
        while (true) {
            if (i10 <= 0) {
                bArrA = null;
                break;
            }
            try {
                cVar.b(context);
                bArrA = cVar.a(context, map.toString().getBytes("UTF-8"));
                break;
            } catch (b e10) {
                Log.e("SignerInstance", "sign: Api is less than JellyBean-4-18");
                f7207a = true;
                map.remove("activity_kind");
                map.remove("client_sdk");
                throw e10;
            } catch (InvalidKeyException e11) {
                e = e11;
            } catch (UnrecoverableKeyException e12) {
                e = e12;
            } catch (Exception e13) {
                Log.e("SignerInstance", "sign: Received an Exception: " + e13.getMessage(), e13);
                map.remove("activity_kind");
                map.remove("client_sdk");
                throw e13;
            }
            Log.e("SignerInstance", "sign: Received a retriable exception: " + e.getMessage(), e);
            Log.e("SignerInstance", "sign: Attempting retry #" + i10);
            i10 += -1;
            cVar.a(context);
        }
        if (i10 == 0) {
            f7207a = true;
            map.remove("activity_kind");
            map.remove("client_sdk");
            return;
        }
        if (zEquals) {
            Log.v("SignerInstance", "Calling native begin: " + simpleDateFormat.format(new Date(System.currentTimeMillis())));
        }
        byte[] bArrA2 = ((NativeLibHelper) aVar).a(context, map, bArrA, cVar.f7206a);
        if (zEquals) {
            Log.v("SignerInstance", "Calling native end  : " + simpleDateFormat.format(new Date(System.currentTimeMillis())));
        }
        if (bArrA2 == null) {
            Log.e("SignerInstance", "sign: Returned an null signature. Exiting...");
            map.remove("activity_kind");
            map.remove("client_sdk");
            return;
        }
        int length = bArrA2.length;
        char[] cArr = e.f7208a;
        char[] cArr2 = new char[length * 2];
        for (int i11 = 0; i11 < length; i11++) {
            byte b10 = bArrA2[i11];
            int i12 = i11 * 2;
            char[] cArr3 = e.f7208a;
            cArr2[i12] = cArr3[(b10 & 255) >>> 4];
            cArr2[i12 + 1] = cArr3[b10 & Ascii.SI];
        }
        map.put(InAppPurchaseMetaData.KEY_SIGNATURE, new String(cArr2));
        map.remove("activity_kind");
        map.remove("client_sdk");
        if (zEquals) {
            Log.v("SignerInstance", "Signing all the parameters end  : " + simpleDateFormat.format(new Date(System.currentTimeMillis())));
        }
    }
}

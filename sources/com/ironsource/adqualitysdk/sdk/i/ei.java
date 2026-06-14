package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class ei extends ef {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1985 = 50;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1986 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1987;

    public ei(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6447(String str, int i10, boolean z10, int i11, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f730) {
            try {
                char[] cArr2 = new char[i10];
                b.f728 = 0;
                while (true) {
                    int i13 = b.f728;
                    if (i13 >= i10) {
                        break;
                    }
                    b.f729 = cArr[i13];
                    cArr2[b.f728] = (char) (b.f729 + i12);
                    int i14 = b.f728;
                    cArr2[i14] = (char) (cArr2[i14] - f1985);
                    b.f728 = i14 + 1;
                }
                if (i11 > 0) {
                    b.f731 = i11;
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr2, 0, cArr3, 0, i10);
                    int i15 = b.f731;
                    System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                    int i16 = b.f731;
                    System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i10];
                    b.f728 = 0;
                    while (true) {
                        int i17 = b.f728;
                        if (i17 >= i10) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i10 - i17) - 1];
                        b.f728 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo6401(du duVar, cq cqVar) {
        int i10 = f1986 + 47;
        f1987 = i10 % 128;
        try {
        } catch (Exception e10) {
            String strM5971 = cqVar.m5971();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6447("\r\u000f\u0002\u0010\u0010\u0006\f\u000bﾽ￢\u000f\u000f\f\u000fﾽ\u0002\u0013\ufffe\t\u0012\ufffe\u0011\u0006\u000b\u0004ﾽ\u0010\u0012\uffff\u0010\u0000\u000f\u0006\r\u0011ﾽ\u0004\u0002\u0011ﾽ\u0002\u0015", 42 - TextUtils.getOffsetAfter("", 0), false, 8 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 149).intern());
            sb2.append(this);
            sb2.append(m6435());
            co.m5911(strM5971, sb2.toString(), e10);
        }
        if (i10 % 2 != 0) {
            m6440().m6434(duVar, cqVar);
            boolean z10 = m6441().m6434(duVar, cqVar).m6377() instanceof JSONObject;
            throw null;
        }
        dr drVarM6434 = m6440().m6434(duVar, cqVar);
        Object objM6377 = m6441().m6434(duVar, cqVar).m6377();
        if (objM6377 instanceof JSONObject) {
            return new dr(((JSONObject) objM6377).opt((String) drVarM6434.m6377()));
        }
        if (objM6377 instanceof JSONArray) {
            dr drVar = new dr(((JSONArray) objM6377).opt(drVarM6434.m6378().intValue()));
            int i11 = f1986 + 43;
            f1987 = i11 % 128;
            if (i11 % 2 == 0) {
                return drVar;
            }
            throw null;
        }
        if (objM6377 instanceof Map) {
            return new dr(((Map) objM6377).get(drVarM6434.m6377()));
        }
        if (objM6377 instanceof List) {
            return new dr(((List) objM6377).get(drVarM6434.m6378().intValue()));
        }
        if (objM6377.getClass().isArray()) {
            return new dr(((Object[]) objM6377)[drVarM6434.m6378().intValue()]);
        }
        String strM59712 = cqVar.m5971();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m6447("\r\u000f\u0002\u0010\u0010\u0006\f\u000bﾽ￢\u000f\u000f\f\u000fﾽ\u0002\u0013\ufffe\t\u0012\ufffe\u0011\u0006\u000b\u0004ﾽ\u0010\u0012\uffff\u0010\u0000\u000f\u0006\r\u0011ﾽ\u0004\u0002\u0011ﾽ\u0002\u0015", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 42, false, 9 - View.MeasureSpec.getMode(0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 149).intern());
        sb3.append(this);
        sb3.append(m6435());
        sb3.append(m6447("\u0012ￄ\u0019\u0012\u0017\u0019\u0014\u0014\u0013\u0016\u0018\t\bￄ\u0013\u0006\u000e\t\u0007\u0018ￄ\uffdeￄ\u0018\u0016\u001d\r\u0012\u000bￄ\u0018\u0013ￄ\u0019\u0017\tￄ\uffff\u0001ￄ\u0013", 41 - (Process.myTid() >> 22), false, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 20, (ViewConfiguration.getLongPressTimeout() >> 16) + 142).intern());
        sb3.append(objM6377);
        co.m5911(strM59712, sb3.toString(), null);
        return new dr(null);
    }
}

package com.bytedance.adsdk.qdl;

import android.text.TextUtils;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes6.dex */
public class jtx {
    public static Object qdl(com.bytedance.adsdk.qdl.ud.qdl.qdl qdlVar) {
        tvp tvpVarQdl;
        if (qdlVar == null || (tvpVarQdl = qdl(qdlVar.qdl())) == null) {
            return null;
        }
        return tvpVarQdl.qdl(null, qdlVar.ud());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static tvp qdl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1919300188:
                if (str.equals("toNumber")) {
                    b10 = 0;
                }
                break;
            case -1776922004:
                if (str.equals("toString")) {
                    b10 = 1;
                }
                break;
            case -1368121510:
                if (str.equals("formatDecimal")) {
                    b10 = 2;
                }
                break;
            case -652088201:
                if (str.equals("modArray")) {
                    b10 = 3;
                }
                break;
            case 3143097:
                if (str.equals("find")) {
                    b10 = 4;
                }
                break;
            case 3530753:
                if (str.equals("size")) {
                    b10 = 5;
                }
                break;
            case 94642797:
                if (str.equals("chunk")) {
                    b10 = 6;
                }
                break;
            case 96955127:
                if (str.equals("exist")) {
                    b10 = 7;
                }
                break;
            case 109648666:
                if (str.equals("split")) {
                    b10 = 8;
                }
                break;
            case 515198113:
                if (str.equals("decodeUrl")) {
                    b10 = 9;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    b10 = 10;
                }
                break;
            case 1508134777:
                if (str.equals("encodeUrl")) {
                    b10 = Ascii.VT;
                }
                break;
            case 2056988195:
                if (str.equals("isDigit")) {
                    b10 = Ascii.FF;
                }
                break;
        }
        switch (b10) {
        }
        return null;
    }
}

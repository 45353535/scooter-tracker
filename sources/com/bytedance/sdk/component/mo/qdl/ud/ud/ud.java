package com.bytedance.sdk.component.mo.qdl.ud.ud;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.mo.qdl.jpc;
import com.bytedance.sdk.component.mo.qdl.mml;
import com.bytedance.sdk.component.mo.qdl.mo;
import com.bytedance.sdk.component.mo.qdl.qdl.qdl.wd;
import com.ironsource.sdk.controller.f;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    public static mo qdl;

    private static String mml() {
        return wd.f16548ud + "/ad_log_event/";
    }

    public static void ud() {
        if (jpc.wd().mo() == null) {
            return;
        }
        try {
            mo moVarQdl = qdl(jpc.wd().mo());
            if (moVarQdl != null) {
                moVarQdl.qdl(Uri.parse(mml() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    public String lnr() {
        return "ad_log_event";
    }

    public int qdl(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public int qdl(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public Cursor qdl(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public Uri qdl(Uri uri, ContentValues contentValues) {
        return null;
    }

    public static mo qdl(Context context) {
        try {
            if (qdl == null) {
                qdl = jpc.wd().jtx().rq();
            }
        } catch (Exception unused) {
        }
        return qdl;
    }

    public static void qdl() {
        if (jpc.wd().mo() == null) {
            return;
        }
        try {
            mo moVarQdl = qdl(jpc.wd().mo());
            if (moVarQdl != null) {
                moVarQdl.qdl(Uri.parse(mml() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void qdl(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar) {
        if (qdlVar == null) {
            return;
        }
        try {
            mo moVarQdl = qdl(jpc.wd().mo());
            if (moVarQdl != null) {
                moVarQdl.qdl(Uri.parse(mml() + "adLogDispatch?event=" + com.bytedance.sdk.component.mo.qdl.qdl.qdl.mo.qdl(qdlVar.mo())));
            }
        } catch (Throwable th2) {
            th2.toString();
        }
    }

    public static void qdl(String str, List<String> list, boolean z10, int i10, String str2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb2.append(com.bytedance.sdk.component.mo.qdl.qdl.qdl.mo.qdl(it.next()));
                sb2.append(StringUtils.COMMA);
            }
            String str3 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(com.bytedance.sdk.component.mo.qdl.qdl.qdl.mo.qdl(sb2.toString())) + "&replace=" + String.valueOf(z10) + "&urlType=" + String.valueOf(i10) + "&adId=" + str2;
            mo moVarQdl = qdl(jpc.wd().mo());
            if (moVarQdl != null) {
                moVarQdl.qdl(Uri.parse(mml() + "trackAdUrl" + str3));
            }
        } catch (Throwable unused) {
        }
    }

    public static void qdl(String str, boolean z10) {
        if (jpc.wd().jtx().mo() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        try {
            mo moVarQdl = qdl(jpc.wd().mo());
            if (moVarQdl != null) {
                moVarQdl.qdl(Uri.parse(mml() + "trackAdFailed?did=" + String.valueOf(str) + "&triggerOnInit=" + z10));
            }
        } catch (Throwable unused) {
        }
    }

    public String qdl(Uri uri) {
        int i10;
        com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVarLnr;
        String str = uri.getPath().split("/")[2];
        str.getClass();
        i10 = 0;
        switch (str) {
            case "trackAdFailed":
                com.bytedance.sdk.component.mo.qdl.mo.qdl.qdl().qdl(uri.getQueryParameter("did"), uri.getBooleanQueryParameter("triggerOnInit", false));
                break;
            case "adLogStart":
                jpc.wd().tvp();
                break;
            case "adLogStop":
                jpc.wd().rq();
                break;
            case "adLogDispatch":
                String queryParameter = uri.getQueryParameter("event");
                if (!TextUtils.isEmpty(queryParameter) && (qdlVarLnr = com.bytedance.sdk.component.mo.qdl.mml.qdl.qdl.lnr(com.bytedance.sdk.component.mo.qdl.qdl.qdl.mo.ud(queryParameter))) != null) {
                    mml.qdl.qdl(qdlVarLnr);
                    break;
                }
                break;
            case "trackAdUrl":
                try {
                    String queryParameter2 = uri.getQueryParameter("did");
                    boolean zBooleanValue = Boolean.valueOf(uri.getQueryParameter("replace")).booleanValue();
                    String queryParameter3 = uri.getQueryParameter("track");
                    String queryParameter4 = uri.getQueryParameter("urlType");
                    String queryParameter5 = uri.getQueryParameter(f.b.f45109c);
                    String[] strArrSplit = com.bytedance.sdk.component.mo.qdl.qdl.qdl.mo.ud(queryParameter3).split(StringUtils.COMMA);
                    if (strArrSplit.length > 0) {
                        ArrayList arrayList = new ArrayList();
                        for (String str2 : strArrSplit) {
                            String strUd = com.bytedance.sdk.component.mo.qdl.qdl.qdl.mo.ud(str2);
                            if (!TextUtils.isEmpty(strUd)) {
                                arrayList.add(strUd);
                            }
                        }
                        try {
                            if (!TextUtils.isEmpty(queryParameter4)) {
                                i10 = Integer.parseInt(queryParameter4);
                            }
                            break;
                        } catch (Exception unused) {
                        }
                        com.bytedance.sdk.component.mo.qdl.mo.qdl.qdl().qdl(queryParameter2, arrayList, zBooleanValue, null, i10, queryParameter5);
                    }
                    break;
                } catch (Throwable unused2) {
                    return null;
                }
                break;
        }
        return null;
    }
}

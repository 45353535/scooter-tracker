package com.taurusx.tax.o;

import android.net.Uri;
import com.ironsource.C4240b4;
import java.net.URL;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class j0 {
    public static URL c(String str) {
        if (str != null && str.length() != 0 && str.contains("://")) {
            try {
                return new URL("http" + str.substring(str.indexOf("://")));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public static String w(String str) {
        URL urlC = c(str);
        if (urlC == null) {
            return "";
        }
        try {
            return urlC.getQuery();
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static Map<String, String> y(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        URL urlC = c(str);
        if (urlC != null) {
            try {
                String query = urlC.getQuery();
                if (query != null) {
                    if (query.contains("url=")) {
                        int iIndexOf = query.indexOf("url=");
                        linkedHashMap.put("url", URLDecoder.decode(query.substring(iIndexOf + 4), "UTF-8"));
                        query = query.substring(0, iIndexOf);
                    }
                    if (query.length() > 0) {
                        for (String str2 : query.split(C4240b4.j.f42670c)) {
                            int iIndexOf2 = str2.indexOf(C4240b4.j.f42668b);
                            if (iIndexOf2 > 0 && iIndexOf2 < str2.length() - 1) {
                                linkedHashMap.put(URLDecoder.decode(str2.substring(0, iIndexOf2), "UTF-8"), URLDecoder.decode(str2.substring(iIndexOf2 + 1), "UTF-8"));
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return linkedHashMap;
    }

    public static String z(String str) {
        return str.contains("?") ? str.substring(0, str.indexOf("?")) : str;
    }

    public static int z(Uri uri, String str) {
        if (uri != null && str != null && str.length() != 0) {
            try {
                String queryParameter = uri.getQueryParameter(str);
                if (queryParameter != null && queryParameter.length() != 0) {
                    return Integer.parseInt(queryParameter);
                }
                return 0;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return 0;
    }

    public static String w(Uri uri, String str) {
        String queryParameter;
        return (uri == null || str == null || str.length() == 0 || (queryParameter = uri.getQueryParameter(str)) == null) ? "" : queryParameter;
    }
}

package com.startapp.sdk.internal;

import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b3 {
    public static a3 a(String str) {
        try {
            try {
                ArrayList arrayListA = jb.a(new JsonReader(new StringReader(str)));
                String str2 = (String) arrayListA.get(0);
                if (str2 == null) {
                    throw new IllegalArgumentException(str);
                }
                String str3 = (String) arrayListA.get(1);
                if (str3 == null) {
                    throw new IllegalArgumentException(str);
                }
                List list = (List) arrayListA.get(2);
                if (list == null) {
                    throw new IllegalArgumentException(str);
                }
                int size = list.size();
                String[] strArr = new String[size];
                Class[] clsArr = new Class[size];
                Object[] objArr = new Object[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Map map = (Map) list.get(i10);
                    if (map == null) {
                        throw new IllegalArgumentException(str);
                    }
                    if (map.size() != 1) {
                        throw new IllegalArgumentException(str);
                    }
                    Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                    String str4 = (String) entry.getKey();
                    if (str4 == null) {
                        throw new IllegalArgumentException(str);
                    }
                    try {
                        Class clsA = d3.a(str4);
                        Object objA = d3.a(clsA, entry.getValue());
                        strArr[i10] = str4;
                        clsArr[i10] = clsA;
                        objArr[i10] = objA;
                    } catch (ClassCastException e10) {
                        throw new IllegalArgumentException(str, e10);
                    } catch (ClassNotFoundException e11) {
                        throw new IllegalArgumentException(str, e11);
                    } catch (IllegalAccessException e12) {
                        throw new IllegalArgumentException(str, e12);
                    } catch (InstantiationException e13) {
                        throw new IllegalArgumentException(str, e13);
                    } catch (NoSuchMethodException e14) {
                        throw new IllegalArgumentException(str, e14);
                    } catch (InvocationTargetException e15) {
                        throw new IllegalArgumentException(str, e15);
                    }
                }
                List list2 = (List) arrayListA.get(3);
                if (list2 == null) {
                    throw new IllegalArgumentException(str);
                }
                String[] strArr2 = new String[list2.size()];
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str5 = (String) list2.get(i11);
                    if (str5 == null) {
                        throw new IllegalArgumentException(str);
                    }
                    strArr2[i11] = str5;
                }
                return new a3(str2, str3, strArr, clsArr, objArr, strArr2);
            } catch (IOException e16) {
                throw new IllegalArgumentException(str, e16);
            }
        } catch (ClassCastException e17) {
            throw new IllegalArgumentException(str, e17);
        }
    }
}

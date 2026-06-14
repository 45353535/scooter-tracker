package yads;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f111177a = new ConcurrentHashMap();

    public static final df1 a(Context context) {
        return a(context, "YadPreferenceFile");
    }

    public static final df1 a(Context context, String str) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = f111177a;
        Object ff1Var = concurrentHashMap.get(str);
        if (ff1Var == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (ff1Var = new ff1(context, str, new bw2())))) != null) {
            ff1Var = objPutIfAbsent;
        }
        return (df1) ff1Var;
    }
}

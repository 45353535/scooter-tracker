package l6;

import android.os.Bundle;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f94052b = "query_info_type";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f94053c = "requester_type_5";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f94054d = "UnityScar";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f94055a;

    public a(String str) {
        this.f94055a = f94054d + str;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(f94052b, f94053c);
        return bundle;
    }

    public String b() {
        return this.f94055a;
    }
}

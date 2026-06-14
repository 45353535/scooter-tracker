package com.my.target;

import com.my.target.common.models.ImageData;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageData f59307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f59308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f59309c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f59310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f59311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f59312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f59313d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f59314e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f59315f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f59316g;

        public a(String str, String str2, String str3, String str4, String str5, String str6, boolean z10) {
            this.f59310a = str;
            this.f59311b = str2;
            this.f59312c = str3;
            this.f59313d = str4;
            this.f59314e = str5;
            this.f59315f = str6;
            this.f59316g = z10;
        }

        public static a a(String str, String str2, String str3, String str4, String str5, String str6, boolean z10) {
            return new a(str, str2, str3, str4, str5, str6, z10);
        }
    }

    public c(ImageData imageData, String str) {
        this.f59307a = imageData;
        this.f59308b = str;
    }

    public static c a(ImageData imageData, String str) {
        return new c(imageData, str);
    }

    public String b() {
        return this.f59308b;
    }

    public ImageData c() {
        return this.f59307a;
    }

    public List a() {
        return this.f59309c;
    }

    public void a(List list) {
        this.f59309c = list;
    }
}

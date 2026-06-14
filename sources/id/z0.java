package id;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f74677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f74678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f74679c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f74680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f74681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f74682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Bitmap f74683d;

        public a(b type, String title, String data) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(data, "data");
            this.f74680a = type;
            this.f74681b = title;
            this.f74682c = data;
        }

        public final String a() {
            return this.f74682c;
        }

        public final Bitmap b() {
            return this.f74683d;
        }

        public final String c() {
            return this.f74681b;
        }

        public final b d() {
            return this.f74680a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f74680a == aVar.f74680a && Intrinsics.areEqual(this.f74681b, aVar.f74681b) && Intrinsics.areEqual(this.f74682c, aVar.f74682c);
        }

        public int hashCode() {
            return (((this.f74680a.hashCode() * 31) + this.f74681b.hashCode()) * 31) + this.f74682c.hashCode();
        }

        public String toString() {
            return "Action(type=" + this.f74680a + ", title=" + this.f74681b + ", data=" + this.f74682c + ')';
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(b type, String title, String data, Bitmap bitmap) {
            this(type, title, data);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(data, "data");
            this.f74683d = bitmap;
        }
    }

    public enum b {
        REDIRECT,
        COPY_TO_CLIPBOARD
    }

    public z0(String title, String subtitle, List actions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f74677a = title;
        this.f74678b = subtitle;
        this.f74679c = actions;
    }

    public final List a() {
        return this.f74679c;
    }

    public final String b() {
        return this.f74678b;
    }

    public final String c() {
        return this.f74677a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return Intrinsics.areEqual(this.f74677a, z0Var.f74677a) && Intrinsics.areEqual(this.f74678b, z0Var.f74678b) && Intrinsics.areEqual(this.f74679c, z0Var.f74679c);
    }

    public int hashCode() {
        return (((this.f74677a.hashCode() * 31) + this.f74678b.hashCode()) * 31) + this.f74679c.hashCode();
    }

    public String toString() {
        return "PrivacySheetParams(title=" + this.f74677a + ", subtitle=" + this.f74678b + ", actions=" + this.f74679c + ')';
    }
}

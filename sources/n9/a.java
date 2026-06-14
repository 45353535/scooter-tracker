package n9;

import android.view.View;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f95161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f95163c;

    /* JADX INFO: renamed from: n9.a$a, reason: collision with other inner class name */
    public static final class C1093a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f95164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f95165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f95166c;

        public C1093a(View view, int i10) {
            this.f95164a = view;
            this.f95165b = i10;
        }

        public a a() {
            return new a(this.f95164a, this.f95165b, this.f95166c);
        }

        public C1093a b(String str) {
            this.f95166c = str;
            return this;
        }
    }

    public a(View view, int i10, String str) {
        this.f95161a = view;
        this.f95162b = i10;
        this.f95163c = str;
    }
}

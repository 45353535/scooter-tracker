package vb;

import android.util.SparseArray;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public interface l0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f106236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f106237c;

        public a(String str, int i10, byte[] bArr) {
            this.f106235a = str;
            this.f106236b = i10;
            this.f106237c = bArr;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f106238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f106239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f106240c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f106241d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f106242e;

        public b(int i10, String str, int i11, List list, byte[] bArr) {
            this.f106238a = i10;
            this.f106239b = str;
            this.f106240c = i11;
            this.f106241d = list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list);
            this.f106242e = bArr;
        }

        public int a() {
            int i10 = this.f106240c;
            if (i10 != 2) {
                return i10 != 3 ? 0 : 512;
            }
            return 2048;
        }
    }

    public interface c {
        l0 a(int i10, b bVar);

        SparseArray createInitialPayloadReaders();
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f106243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f106244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f106245c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f106246d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f106247e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        private void d() {
            if (this.f106246d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i10 = this.f106246d;
            this.f106246d = i10 == Integer.MIN_VALUE ? this.f106244b : i10 + this.f106245c;
            this.f106247e = this.f106243a + this.f106246d;
        }

        public String b() {
            d();
            return this.f106247e;
        }

        public int c() {
            d();
            return this.f106246d;
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f106243a = str;
            this.f106244b = i11;
            this.f106245c = i12;
            this.f106246d = Integer.MIN_VALUE;
            this.f106247e = "";
        }
    }

    void a(q9.d0 d0Var, int i10);

    void b(q9.j0 j0Var, oa.t tVar, d dVar);

    void seek();
}

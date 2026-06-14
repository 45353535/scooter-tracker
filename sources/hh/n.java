package hh;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f73722a = a.f73724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f73723b = new a.C0911a();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f73724a = new a();

        /* JADX INFO: renamed from: hh.n$a$a, reason: collision with other inner class name */
        private static final class C0911a implements n {
            @Override // hh.n
            public List a(u url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return CollectionsKt.emptyList();
            }

            @Override // hh.n
            public void b(u url, List cookies) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(cookies, "cookies");
            }
        }

        private a() {
        }
    }

    List a(u uVar);

    void b(u uVar, List list);
}
